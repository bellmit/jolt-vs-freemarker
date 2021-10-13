
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * LoadStatusCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum LoadStatusCode {

    OPEN("OPEN"),
    PLANNED("PLANNED"),
    TENDERED("TENDERED"),
    TENDER_ACCEPTED("TENDER_ACCEPTED"),
    CANCELLED("CANCELLED"),
    TENDER_REJECTED("TENDER_REJECTED"),
    IN_TRANSIT("IN_TRANSIT"),
    COMPLETED("COMPLETED"),
    CLOSED("CLOSED"),
    CONFIRMING("CONFIRMING"),
    PICKED_UP("PICKED_UP"),
    PROCESSING("PROCESSING"),
    FREE("FREE"),
    PACKED("PACKED"),
    LOCKED("LOCKED"),
    PARTIALLY_DELIVERED("PARTIALLY_DELIVERED"),
    DELIVERED("DELIVERED");
    private final String value;
    private final static Map<String, LoadStatusCode> CONSTANTS = new HashMap<String, LoadStatusCode>();

    static {
        for (LoadStatusCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    LoadStatusCode(String value) {
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
    public static LoadStatusCode fromValue(String value) {
        LoadStatusCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
