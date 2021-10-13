
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * TransportInstructionFunctionEnumerationType
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum TransportInstructionFunctionEnumerationType {

    CONSIGNMENT("CONSIGNMENT"),
    SHIPMENT("SHIPMENT");
    private final String value;
    private final static Map<String, TransportInstructionFunctionEnumerationType> CONSTANTS = new HashMap<String, TransportInstructionFunctionEnumerationType>();

    static {
        for (TransportInstructionFunctionEnumerationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TransportInstructionFunctionEnumerationType(String value) {
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
    public static TransportInstructionFunctionEnumerationType fromValue(String value) {
        TransportInstructionFunctionEnumerationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
