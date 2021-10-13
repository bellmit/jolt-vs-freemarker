
package com.syscho.objectmapper.model.ti;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;


/**
 * TransportServiceCategoryCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum TransportServiceCategoryCode {

    _10("10"),
    _100("100"),
    _20("20"),
    _30("30"),
    _40("40"),
    _50("50"),
    _60("60"),
    _70("70"),
    _80("80"),
    _2("2"),
    _3("3"),
    _4("4"),
    _110("110"),
    _120("120"),
    _130("130");
    private final String value;
    private final static Map<String, TransportServiceCategoryCode> CONSTANTS = new HashMap<String, TransportServiceCategoryCode>();

    static {
        for (TransportServiceCategoryCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TransportServiceCategoryCode(String value) {
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
    public static TransportServiceCategoryCode fromValue(String value) {
        TransportServiceCategoryCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
