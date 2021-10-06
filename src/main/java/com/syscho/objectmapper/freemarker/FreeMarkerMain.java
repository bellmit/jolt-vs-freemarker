package com.syscho.objectmapper.freemarker;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.syscho.objectmapper.model.DataHub;
import com.syscho.objectmapper.model.InputJsonPojo;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.Version;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class FreeMarkerMain {


    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        InputJsonPojo inputJsonPojo = DataHub.getObjectFromFilePath("input/input1.json", InputJsonPojo.class);
        Configuration cfg = new Configuration(new Version("2.3.23"));
        cfg.setClassForTemplateLoading(FreeMarkerMain.class, "\\");
        cfg.setDefaultEncoding("UTF-8");
        try {
            Template template = cfg.getTemplate("output/output.ftl");
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
}
