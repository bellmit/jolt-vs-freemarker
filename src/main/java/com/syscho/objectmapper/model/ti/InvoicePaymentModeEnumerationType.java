
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * InvoicePaymentModeEnumerationType
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum InvoicePaymentModeEnumerationType {

    FIPM_NULL("FIPM_NULL"),
    FIPM_AUTO_PAY("FIPM_AUTO_PAY"),
    FIPM_AUDITILD_NOT_ACTIVE("FIPM_AUDITILD_NOT_ACTIVE");
    private final String value;
    private final static Map<String, InvoicePaymentModeEnumerationType> CONSTANTS = new HashMap<String, InvoicePaymentModeEnumerationType>();

    static {
        for (InvoicePaymentModeEnumerationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    InvoicePaymentModeEnumerationType(String value) {
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
    public static InvoicePaymentModeEnumerationType fromValue(String value) {
        InvoicePaymentModeEnumerationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
