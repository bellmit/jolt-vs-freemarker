
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * DespatchAdviceRestrictionCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum DespatchAdviceRestrictionCode {

    NO_RESTRICTION("NO_RESTRICTION"),
    SUPPRESS_ALL("SUPPRESS_ALL"),
    LOCATION_SPECIFIC("LOCATION_SPECIFIC");
    private final String value;
    private final static Map<String, DespatchAdviceRestrictionCode> CONSTANTS = new HashMap<String, DespatchAdviceRestrictionCode>();

    static {
        for (DespatchAdviceRestrictionCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DespatchAdviceRestrictionCode(String value) {
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
    public static DespatchAdviceRestrictionCode fromValue(String value) {
        DespatchAdviceRestrictionCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
