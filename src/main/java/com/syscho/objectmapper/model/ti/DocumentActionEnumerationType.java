
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * DocumentActionEnumerationType
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum DocumentActionEnumerationType {

    ADD("ADD"),
    CHANGE_BY_REFRESH("CHANGE_BY_REFRESH"),
    DELETE("DELETE"),
    PARTIAL_CHANGE("PARTIAL_CHANGE"),
    CANCEL("CANCEL"),
    DEMO("DEMO"),
    TEST("test");
    private final String value;
    private final static Map<String, DocumentActionEnumerationType> CONSTANTS = new HashMap<String, DocumentActionEnumerationType>();

    static {
        for (DocumentActionEnumerationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DocumentActionEnumerationType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DocumentActionEnumerationType fromValue(String value) {
        DocumentActionEnumerationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
