
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * LogisticEventTypeCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum LogisticEventTypeCode {

    CUSTOMS_ARRIVAL("CUSTOMS_ARRIVAL"),
    CUSTOMS_DEPARTURE("CUSTOMS_DEPARTURE"),
    TERMINAL_ARRIVAL("TERMINAL_ARRIVAL"),
    TERMINAL_DEPARTURE("TERMINAL_DEPARTURE"),
    TRANSFER_POINT_ARRIVAL("TRANSFER_POINT_ARRIVAL"),
    TRANSFER_POINT_DEPARTURE("TRANSFER_POINT_DEPARTURE"),
    LOADING("LOADING"),
    UNLOADING("UNLOADING");
    private final String value;
    private final static Map<String, LogisticEventTypeCode> CONSTANTS = new HashMap<String, LogisticEventTypeCode>();

    static {
        for (LogisticEventTypeCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    LogisticEventTypeCode(String value) {
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
    public static LogisticEventTypeCode fromValue(String value) {
        LogisticEventTypeCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
