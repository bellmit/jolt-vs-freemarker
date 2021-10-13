
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * AllowPickUpEnumerationType
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum AllowPickUpEnumerationType {

    P_NULL("P_NULL"),
    P_ALLOWED("P_ALLOWED"),
    P_CONDITIONAL("P_CONDITIONAL"),
    P_NOT_ALLOWED("P_NOT_ALLOWED");
    private final String value;
    private final static Map<String, AllowPickUpEnumerationType> CONSTANTS = new HashMap<String, AllowPickUpEnumerationType>();

    static {
        for (AllowPickUpEnumerationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AllowPickUpEnumerationType(String value) {
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
    public static AllowPickUpEnumerationType fromValue(String value) {
        AllowPickUpEnumerationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
