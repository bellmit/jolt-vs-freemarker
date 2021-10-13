
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * ParcelPackageCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum ParcelPackageCode {

    EBX("EBX"),
    ELT("ELT"),
    OUR("OUR"),
    EPK("EPK"),
    ETB("ETB");
    private final String value;
    private final static Map<String, ParcelPackageCode> CONSTANTS = new HashMap<String, ParcelPackageCode>();

    static {
        for (ParcelPackageCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ParcelPackageCode(String value) {
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
    public static ParcelPackageCode fromValue(String value) {
        ParcelPackageCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
