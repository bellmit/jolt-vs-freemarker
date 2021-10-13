
package com.syscho.objectmapper.model.ti;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;


/**
 * TransportPaymentMethodCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum TransportPaymentMethodCode {

    AA("AA"),
    AB("AB"),
    AC("AC"),
    AD("AD"),
    CA("CA"),
    CC("CC"),
    CF("CF"),
    DF("DF"),
    MX("MX"),
    NC("NC"),
    PC("PC"),
    PO("PO"),
    PP("PP"),
    PU("PU"),
    RC("RC"),
    RF("RF"),
    RS("RS"),
    TP("TP"),
    WD("WD"),
    WE("WE");
    private final String value;
    private final static Map<String, TransportPaymentMethodCode> CONSTANTS = new HashMap<String, TransportPaymentMethodCode>();

    static {
        for (TransportPaymentMethodCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TransportPaymentMethodCode(String value) {
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
    public static TransportPaymentMethodCode fromValue(String value) {
        TransportPaymentMethodCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
