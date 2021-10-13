
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * QuantitySpecificationTypeCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum QuantitySpecificationTypeCode {

    IN_TRANSIT("IN_TRANSIT"),
    ON_HAND("ON_HAND"),
    ON_HOLD("ON_HOLD"),
    PRODUCED("PRODUCED"),
    RECEIVED("RECEIVED"),
    TO_BE_DELIVERED("TO_BE_DELIVERED"),
    TO_BE_DESPATCHED("TO_BE_DESPATCHED"),
    TO_BE_PRODUCED("TO_BE_PRODUCED");
    private final String value;
    private final static Map<String, QuantitySpecificationTypeCode> CONSTANTS = new HashMap<String, QuantitySpecificationTypeCode>();

    static {
        for (QuantitySpecificationTypeCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    QuantitySpecificationTypeCode(String value) {
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
    public static QuantitySpecificationTypeCode fromValue(String value) {
        QuantitySpecificationTypeCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
