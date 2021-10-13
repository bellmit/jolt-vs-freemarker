
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * ShipmentSplitMethodCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum ShipmentSplitMethodCode {

    NO_SPLIT("NO_SPLIT"),
    CONTINUOUS("CONTINUOUS"),
    PIECES("PIECES"),
    PALLETS("PALLETS"),
    DETAIL_LEVEL("DETAIL_LEVEL");
    private final String value;
    private final static Map<String, ShipmentSplitMethodCode> CONSTANTS = new HashMap<String, ShipmentSplitMethodCode>();

    static {
        for (ShipmentSplitMethodCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ShipmentSplitMethodCode(String value) {
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
    public static ShipmentSplitMethodCode fromValue(String value) {
        ShipmentSplitMethodCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
