
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * AdditionalConsignmentIdentificationTypeCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum AdditionalConsignmentIdentificationTypeCode {

    CARRIER_ASSIGNED("CARRIER_ASSIGNED"),
    CONSIGNEE_ASSIGNED("CONSIGNEE_ASSIGNED"),
    CONSIGNOR_ASSIGNED("CONSIGNOR_ASSIGNED"),
    FREIGHT_FORWARDER_ASSIGNED("FREIGHT_FORWARDER_ASSIGNED"),
    GINC("GINC");
    private final String value;
    private final static Map<String, AdditionalConsignmentIdentificationTypeCode> CONSTANTS = new HashMap<String, AdditionalConsignmentIdentificationTypeCode>();

    static {
        for (AdditionalConsignmentIdentificationTypeCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AdditionalConsignmentIdentificationTypeCode(String value) {
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
    public static AdditionalConsignmentIdentificationTypeCode fromValue(String value) {
        AdditionalConsignmentIdentificationTypeCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
