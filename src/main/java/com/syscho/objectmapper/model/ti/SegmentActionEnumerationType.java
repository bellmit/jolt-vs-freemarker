
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * SegmentActionEnumerationType
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum SegmentActionEnumerationType {

    ADD("ADD"),
    CHANGE("CHANGE"),
    DELETE("DELETE"),
    NO_ACTION("NO_ACTION"),
    MYADD("MYADD");
    private final String value;
    private final static Map<String, SegmentActionEnumerationType> CONSTANTS = new HashMap<String, SegmentActionEnumerationType>();

    static {
        for (SegmentActionEnumerationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SegmentActionEnumerationType(String value) {
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
    public static SegmentActionEnumerationType fromValue(String value) {
        SegmentActionEnumerationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
