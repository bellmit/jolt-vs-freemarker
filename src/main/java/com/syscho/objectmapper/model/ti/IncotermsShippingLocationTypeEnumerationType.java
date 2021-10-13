
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * IncotermsShippingLocationTypeEnumerationType
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum IncotermsShippingLocationTypeEnumerationType {

    SPT_NULL("SPT_NULL"),
    SPT_LA("SPT_LA"),
    SPT_CONSIGNEE("SPT_CONSIGNEE"),
    SPT_HUB("SPT_HUB"),
    SPT_DC("SPT_DC");
    private final String value;
    private final static Map<String, IncotermsShippingLocationTypeEnumerationType> CONSTANTS = new HashMap<String, IncotermsShippingLocationTypeEnumerationType>();

    static {
        for (IncotermsShippingLocationTypeEnumerationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    IncotermsShippingLocationTypeEnumerationType(String value) {
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
    public static IncotermsShippingLocationTypeEnumerationType fromValue(String value) {
        IncotermsShippingLocationTypeEnumerationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
