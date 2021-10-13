
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * DayOfTheWeekEnumerationType
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum DayOfTheWeekEnumerationType {

    FRIDAY("FRIDAY"),
    MONDAY("MONDAY"),
    SATURDAY("SATURDAY"),
    SUNDAY("SUNDAY"),
    THURSDAY("THURSDAY"),
    TUESDAY("TUESDAY"),
    WEDNESDAY("WEDNESDAY");
    private final String value;
    private final static Map<String, DayOfTheWeekEnumerationType> CONSTANTS = new HashMap<String, DayOfTheWeekEnumerationType>();

    static {
        for (DayOfTheWeekEnumerationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DayOfTheWeekEnumerationType(String value) {
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
    public static DayOfTheWeekEnumerationType fromValue(String value) {
        DayOfTheWeekEnumerationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
