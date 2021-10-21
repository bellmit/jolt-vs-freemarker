package com.syscho.objectmapper;

import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;
import com.syscho.objectmapper.freemarker.config.FreeMarkerConfig;
import com.syscho.objectmapper.model.DataHub;
import com.syscho.objectmapper.model.ti.TransportInstructionType;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.openjdk.jmh.annotations.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * The type Jolt vs freemarker main.
 * Class to Compare JOLT and Freemarker Performance
 */
@BenchmarkMode({Mode.AverageTime, Mode.Throughput, Mode.SampleTime})
@Fork(value = 1)
@Warmup(iterations = 1)
@Measurement(iterations = 1)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class JoltVsFreemarkerMain {

    private final static String FREE_MARKER_TEMPLATE = "freemarker/shipment/shipment-3.ftl";

    private final static String JOLT_TEMPLATE = "/jolt/shipment-spec.json";

    private final static String JSON_INPUT = "data/ti.json";

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws TemplateException the template exception
     * @throws IOException       the io exception
     */
    public static void main(String[] args) throws TemplateException, IOException {
        transformJolt();
        transformFreeMarker();
    }

    /**
     * Transform Json to Json Using Freemarker Template
     *
     * @throws TemplateException the template exception
     * @throws IOException       the io exception
     */
    @Benchmark
    public static void transformFreeMarker() throws TemplateException, IOException {
        Configuration cfg = FreeMarkerConfig.getConfig();
        cfg.setClassForTemplateLoading(JoltVsFreemarkerMain.class, "\\");
        Template template = cfg.getTemplate(FREE_MARKER_TEMPLATE);
        TransportInstructionType transportInstructionType = DataHub.getObjectFromFilePath(JSON_INPUT, TransportInstructionType.class);
        Map<String, Object> data = new HashMap<>();
        data.put("ti", transportInstructionType);
        Writer out = new StringWriter();
        template.process(data, out);
        out.flush();

        System.out.println("********* FREEMARKER*************");
        System.out.println(out);
        System.out.println("*********************************");

    }

    /**
     * Transform Json to Json Using JOLT Template
     */
    @Benchmark
    public static void transformJolt() {
        List<Object> specs = JsonUtils.classpathToList(JOLT_TEMPLATE);
        Chainr chainr = Chainr.fromSpec(specs);
        Object inputJSON = JsonUtils.classpathToObject("/" + JSON_INPUT);
        Object transformedOutput = chainr.transform(inputJSON);
        System.out.println("********* JOLT *************");
        System.out.println(JsonUtils.toPrettyJsonString(transformedOutput));
        System.out.println("*********************************");
    }

}


