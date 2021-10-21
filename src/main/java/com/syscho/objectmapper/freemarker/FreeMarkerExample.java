package com.syscho.objectmapper.freemarker;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.syscho.objectmapper.freemarker.config.FreeMarkerConfig;
import com.syscho.objectmapper.model.Contact;
import com.syscho.objectmapper.model.DataHub;
import com.syscho.objectmapper.model.Note;
import freemarker.template.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Freemarker examples for Json to Json transformation
 */
public class FreeMarkerExample {

    /**
     * The Object mapper.
     */
    static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException       the io exception
     * @throws TemplateException the template exception
     */
    public static void main(String[] args) throws IOException, TemplateException {
        transform();
    }

    /**
     * Use the freemarker template to create a new json result based on input (Map,List,Object,Primitive )
     *
     * @throws IOException       the io exception
     * @throws TemplateException the template exception
     */
    public static void transform() throws IOException, TemplateException {
        Configuration cfg = FreeMarkerConfig.getConfig();
        cfg.setClassForTemplateLoading(FreeMarkerExample.class, "\\");

        List<Note> notes = DataHub.getObjectFromFilePath("data/jolt/note.json", List.class);
        Map<String, String> map = DataHub.getObjectFromFilePath("data/jolt/map.json", Map.class);
        Contact contact = DataHub.getObjectFromFilePath("data/jolt/contact.json", Contact.class);

        Template template = cfg.getTemplate("freemarker/basic.ftl");
        Map<String, Object> data = buildDataSet(notes, map, contact);

        Writer out = new StringWriter();
        template.process(data, out);
        out.flush();
        System.out.println(out);
        JsonNode jsonNode = objectMapper.readTree(out.toString());
        System.out.println(jsonNode);
    }

    private static Map<String, Object> buildDataSet(List<Note> notes, Map<String, String> map, Contact contact) {
        Map<String, Object> data = new HashMap<>();
        data.put("list", notes);
        data.put("map", map);
        data.put("contact", contact);
        data.put("booleanCheckList", false);
        data.put("numberField", 34);
        data.put("loggedIn", false);
        data.put("indexOf", new IndexOfMethod());
        data.put("homeContact", contact);
        data.put("officeContact", contact);
        return data;
    }
}


/**
 * The type Index of method.
 */
class IndexOfMethod implements TemplateMethodModel {

    public TemplateModel exec(List args) throws TemplateModelException {
        if (args.size() < 2) {
            throw new TemplateModelException("Wrong arguments");
        }
        return new SimpleNumber(
                ((String) args.get(1)).indexOf((String) args.get(0)));
    }
}


