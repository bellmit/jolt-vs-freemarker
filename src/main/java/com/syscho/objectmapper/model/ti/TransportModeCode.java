
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * TransportModeCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum TransportModeCode {

    _00("00"),
    _10("10"),
    _100("100"),
    _20("20"),
    _30("30"),
    _40("40"),
    _50("50"),
    _60("60"),
    _70("70"),
    _80("80");
    private final String value;
    private final static Map<String, TransportModeCode> CONSTANTS = new HashMap<String, TransportModeCode>();

    static {
        for (TransportModeCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TransportModeCode(String value) {
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
    public static TransportModeCode fromValue(String value) {
        TransportModeCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
