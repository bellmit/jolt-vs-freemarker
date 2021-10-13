
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * SurchargeBasedVoucherCurrencyEnumerationType
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum SurchargeBasedVoucherCurrencyEnumerationType {

    VC_NULL("VC_NULL"),
    VC_TFF_RATING_CNCY("VC_TFF_RATING_CNCY"),
    VC_TFF_PAYMENT_CNCY("VC_TFF_PAYMENT_CNCY"),
    VC_CUSTOMER_CNCY("VC_CUSTOMER_CNCY"),
    VC_CLEAR("VC_CLEAR");
    private final String value;
    private final static Map<String, SurchargeBasedVoucherCurrencyEnumerationType> CONSTANTS = new HashMap<String, SurchargeBasedVoucherCurrencyEnumerationType>();

    static {
        for (SurchargeBasedVoucherCurrencyEnumerationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SurchargeBasedVoucherCurrencyEnumerationType(String value) {
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
    public static SurchargeBasedVoucherCurrencyEnumerationType fromValue(String value) {
        SurchargeBasedVoucherCurrencyEnumerationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
