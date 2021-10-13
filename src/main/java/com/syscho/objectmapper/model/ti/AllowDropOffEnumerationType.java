
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * AllowDropOffEnumerationType
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum AllowDropOffEnumerationType {

    D_NULL("D_NULL"),
    D_ALLOWED("D_ALLOWED"),
    D_CONDITIONAL("D_CONDITIONAL"),
    D_NOT_ALLOWED("D_NOT_ALLOWED");
    private final String value;
    private final static Map<String, AllowDropOffEnumerationType> CONSTANTS = new HashMap<String, AllowDropOffEnumerationType>();

    static {
        for (AllowDropOffEnumerationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AllowDropOffEnumerationType(String value) {
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
    public static AllowDropOffEnumerationType fromValue(String value) {
        AllowDropOffEnumerationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
