package com.syscho.objectmapper.jolt;

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

@BenchmarkMode({Mode.AverageTime, Mode.Throughput, Mode.SampleTime})
@Fork(value = 1)
@Warmup(iterations = 1)
@Measurement(iterations = 1)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class JoltVsFreemarkerMain {

    final static String FREE_MARKER_TEMPLATE = "freemarker/shipment-3.ftl";
    final static String JOLT_TEMPLATE = "/jolt/shipment-spec.json";
    final static String JSON_INPUT = "data/ti.json";

    public static void main(String[] args) throws TemplateException, IOException {
        transformJolt();
        transformFreeMarker();
    }

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
    }

    @Benchmark
    public static void transformJolt() {
        List<Object> specs = JsonUtils.classpathToList(JOLT_TEMPLATE);
        Chainr chainr = Chainr.fromSpec(specs);
        Object inputJSON = JsonUtils.classpathToObject("/" + JSON_INPUT);
        Object transformedOutput = chainr.transform(inputJSON);
        JsonUtils.toPrettyJsonString(transformedOutput);
    }

}


