package com.syscho.objectmapper.freemarker;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.syscho.objectmapper.freemarker.config.FreeMarkerConfig;
import com.syscho.objectmapper.model.DataHub;
import com.syscho.objectmapper.model.InputJsonPojo;
import com.syscho.objectmapper.model.ti.TransportInstructionType;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class FreeMakerJsonTransformMain {

    public static void main(String[] args) throws IOException, TemplateException {
        transform();
        simpleTransformation();
    }


    private static void simpleTransformation() {
        InputJsonPojo inputJsonPojo = DataHub.getObjectFromFilePath("input/input1.json", InputJsonPojo.class);

        try {
            Configuration cfg = FreeMarkerConfig.getConfig();
            Template template = cfg.getTemplate("freemarker/output.ftl");
            Map<String, Object> data = new HashMap<>();
            data.put("input", inputJsonPojo);
            data.put("shipment", inputJsonPojo.getShipment());
            Writer out = new StringWriter();
            template.process(data, out);
            out.flush();

        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        }
    }

    public static void transform() throws IOException, TemplateException {
        ObjectMapper mapper = new ObjectMapper();

        Configuration cfg = FreeMarkerConfig.getConfig();
        cfg.setClassForTemplateLoading(FreeMakerJsonTransformMain.class, "\\");
        Template template = cfg.getTemplate("freemarker/shipment-3.ftl");
        TransportInstructionType transportInstructionType = DataHub.getObjectFromFilePath("data/ti.json", TransportInstructionType.class);

        Map<String, Object> data = new HashMap<>();
        data.put("ti", transportInstructionType);
        Writer out = new StringWriter();
        template.process(data, out);
        out.flush();
        JsonNode jsonNode = mapper.readTree(out.toString());
        System.out.println(jsonNode);
    }

}
