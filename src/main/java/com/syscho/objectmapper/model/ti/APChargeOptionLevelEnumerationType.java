
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * APChargeOptionLevelEnumerationType
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum APChargeOptionLevelEnumerationType {

    OAL_NULL("OAL_NULL"),
    OAL_DO_NOT_APPLY("OAL_DO_NOT_APPLY"),
    OAL_RATE("OAL_RATE"),
    OAL_RATE_ROUTE("OAL_RATE_ROUTE");
    private final String value;
    private final static Map<String, APChargeOptionLevelEnumerationType> CONSTANTS = new HashMap<String, APChargeOptionLevelEnumerationType>();

    static {
        for (APChargeOptionLevelEnumerationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    APChargeOptionLevelEnumerationType(String value) {
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
    public static APChargeOptionLevelEnumerationType fromValue(String value) {
        APChargeOptionLevelEnumerationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
