
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * TimeMeasurementUnitCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum TimeMeasurementUnitCode {

    ANN("ANN"),
    B_98("B98"),
    C_26("C26"),
    C_47("C47"),
    DAY("DAY"),
    H_70("H70"),
    HUR("HUR"),
    MIN("MIN"),
    MON("MON"),
    QAN("QAN"),
    SEC("SEC"),
    WEE("WEE"),
    _15_M("15M");
    private final String value;
    private final static Map<String, TimeMeasurementUnitCode> CONSTANTS = new HashMap<String, TimeMeasurementUnitCode>();

    static {
        for (TimeMeasurementUnitCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TimeMeasurementUnitCode(String value) {
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
    public static TimeMeasurementUnitCode fromValue(String value) {
        TimeMeasurementUnitCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
