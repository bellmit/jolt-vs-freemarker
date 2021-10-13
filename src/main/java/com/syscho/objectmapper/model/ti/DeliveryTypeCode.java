
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * DeliveryTypeCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum DeliveryTypeCode {

    PURCHASE_ORDER("PURCHASE_ORDER"),
    TRANSFER_ORDER("TRANSFER_ORDER"),
    CUSTOMER_ORDER("CUSTOMER_ORDER");
    private final String value;
    private final static Map<String, DeliveryTypeCode> CONSTANTS = new HashMap<String, DeliveryTypeCode>();

    static {
        for (DeliveryTypeCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DeliveryTypeCode(String value) {
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
    public static DeliveryTypeCode fromValue(String value) {
        DeliveryTypeCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
