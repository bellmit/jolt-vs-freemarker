
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * APVoucherCurrencyEnumerationType
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum APVoucherCurrencyEnumerationType {

    AP_VCHRCNCY_TFF_NULL("AP_VCHRCNCY_TFF_NULL"),
    AP_VCHRCNCY_TFF_CARRIER("AP_VCHRCNCY_TFF_CARRIER"),
    AP_VCHRCNCY_TFF_PAYMENT("AP_VCHRCNCY_TFF_PAYMENT"),
    AP_VCHRCNCY_TFF_RATING("AP_VCHRCNCY_TFF_RATING");
    private final String value;
    private final static Map<String, APVoucherCurrencyEnumerationType> CONSTANTS = new HashMap<String, APVoucherCurrencyEnumerationType>();

    static {
        for (APVoucherCurrencyEnumerationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    APVoucherCurrencyEnumerationType(String value) {
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
    public static APVoucherCurrencyEnumerationType fromValue(String value) {
        APVoucherCurrencyEnumerationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
