
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * CargoTypeCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum CargoTypeCode {

    _1("1"),
    _10("10"),
    _11("11"),
    _12("12"),
    _13("13"),
    _14("14"),
    _15("15"),
    _16("16"),
    _17("17"),
    _18("18"),
    _19("19"),
    _2("2"),
    _20("20"),
    _21("21"),
    _22("22"),
    _23("23"),
    _3("3"),
    _4("4"),
    _5("5"),
    _6("6"),
    _7("7"),
    _8("8"),
    _9("9");
    private final String value;
    private final static Map<String, CargoTypeCode> CONSTANTS = new HashMap<String, CargoTypeCode>();

    static {
        for (CargoTypeCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CargoTypeCode(String value) {
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
    public static CargoTypeCode fromValue(String value) {
        CargoTypeCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
