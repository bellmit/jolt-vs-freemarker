
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * TemperatureMeasurementUnitCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum TemperatureMeasurementUnitCode {

    CEL("CEL"),
    FAH("FAH"),
    KEL("KEL");
    private final String value;
    private final static Map<String, TemperatureMeasurementUnitCode> CONSTANTS = new HashMap<String, TemperatureMeasurementUnitCode>();

    static {
        for (TemperatureMeasurementUnitCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TemperatureMeasurementUnitCode(String value) {
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
    public static TemperatureMeasurementUnitCode fromValue(String value) {
        TemperatureMeasurementUnitCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
