
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * DocumentStatusEnumerationType
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum DocumentStatusEnumerationType {

    ADDITIONAL_TRANSMISSION("ADDITIONAL_TRANSMISSION"),
    COPY("COPY"),
    ORIGINAL("ORIGINAL");
    private final String value;
    private final static Map<String, DocumentStatusEnumerationType> CONSTANTS = new HashMap<String, DocumentStatusEnumerationType>();

    static {
        for (DocumentStatusEnumerationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DocumentStatusEnumerationType(String value) {
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
    public static DocumentStatusEnumerationType fromValue(String value) {
        DocumentStatusEnumerationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
