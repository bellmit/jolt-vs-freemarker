
package com.syscho.objectmapper.model.ti;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;


/**
 * ShipmentThroughPointLocationTypeEnumerationType
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum ShipmentThroughPointLocationTypeEnumerationType {

    STPT_NULL("STPT_NULL"),
    STPT_HUB("STPT_HUB"),
    STPT_DC("STPT_DC");
    private final String value;
    private final static Map<String, ShipmentThroughPointLocationTypeEnumerationType> CONSTANTS = new HashMap<String, ShipmentThroughPointLocationTypeEnumerationType>();

    static {
        for (ShipmentThroughPointLocationTypeEnumerationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ShipmentThroughPointLocationTypeEnumerationType(String value) {
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
    public static ShipmentThroughPointLocationTypeEnumerationType fromValue(String value) {
        ShipmentThroughPointLocationTypeEnumerationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
