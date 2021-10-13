
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * ARChargeOptionLevelEnumerationType
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum ARChargeOptionLevelEnumerationType {

    OAL_NULL("OAL_NULL"),
    OAL_DO_NOT_APPLY("OAL_DO_NOT_APPLY"),
    OAL_RATE("OAL_RATE"),
    OAL_RATE_ROUTE("OAL_RATE_ROUTE");
    private final String value;
    private final static Map<String, ARChargeOptionLevelEnumerationType> CONSTANTS = new HashMap<String, ARChargeOptionLevelEnumerationType>();

    static {
        for (ARChargeOptionLevelEnumerationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ARChargeOptionLevelEnumerationType(String value) {
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
    public static ARChargeOptionLevelEnumerationType fromValue(String value) {
        ARChargeOptionLevelEnumerationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
