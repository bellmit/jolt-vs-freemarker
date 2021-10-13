
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * MeasurementTypeCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum MeasurementTypeCode {

    DECLARED_NET_WEIGHT("DECLARED_NET_WEIGHT"),
    GROSS_VOLUME("GROSS_VOLUME"),
    NET_VOLUME("NET_VOLUME"),
    TARE_WEIGHT("TARE_WEIGHT"),
    TOTAL_GROSS_WEIGHT("TOTAL_GROSS_WEIGHT"),
    UNIT_GROSS_WEIGHT("UNIT_GROSS_WEIGHT"),
    UNIT_NET_WEIGHT("UNIT_NET_WEIGHT"),
    PACKAGES("PACKAGES"),
    PALLETS("PALLETS"),
    WEIGHT("WEIGHT"),
    VOLUME("VOLUME"),
    LENGTH("LENGTH"),
    AREA("AREA"),
    LAYER("LAYER"),
    CASE("CASE"),
    PIECES("PIECES"),
    TIME("TIME"),
    CURRENCY("CURRENCY"),
    UNITS_OF_SHIPMENT("UNITS_OF_SHIPMENT");
    private final String value;
    private final static Map<String, MeasurementTypeCode> CONSTANTS = new HashMap<String, MeasurementTypeCode>();

    static {
        for (MeasurementTypeCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MeasurementTypeCode(String value) {
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
    public static MeasurementTypeCode fromValue(String value) {
        MeasurementTypeCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
