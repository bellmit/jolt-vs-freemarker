
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * SplitMethodEnumerationType
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum SplitMethodEnumerationType {

    TRLRSPLITMTHD_NONE("TRLRSPLITMTHD_NONE"),
    TRLRSPLITMTHD_CONTINUOUS("TRLRSPLITMTHD_CONTINUOUS"),
    TRLRSPLITMTHD_PIECES("TRLRSPLITMTHD_PIECES"),
    TRLRSPLITMTHD_PALLETS("TRLRSPLITMTHD_PALLETS"),
    TRLRSPLITMTHD_UNITS("TRLRSPLITMTHD_UNITS");
    private final String value;
    private final static Map<String, SplitMethodEnumerationType> CONSTANTS = new HashMap<String, SplitMethodEnumerationType>();

    static {
        for (SplitMethodEnumerationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SplitMethodEnumerationType(String value) {
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
    public static SplitMethodEnumerationType fromValue(String value) {
        SplitMethodEnumerationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
