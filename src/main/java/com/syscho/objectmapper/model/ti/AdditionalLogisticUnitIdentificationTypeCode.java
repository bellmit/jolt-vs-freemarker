
package com.syscho.objectmapper.model.ti;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;


/**
 * AdditionalLogisticUnitIdentificationTypeCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum AdditionalLogisticUnitIdentificationTypeCode {

    GOODS_RECEIVER_ASSIGNED("GOODS_RECEIVER_ASSIGNED"),
    LOGISTICS_SERVICE_PROVIDER_ASSIGNED("LOGISTICS_SERVICE_PROVIDER_ASSIGNED"),
    SHIPPER_ASSIGNED("SHIPPER_ASSIGNED"),
    SSCC("SSCC");
    private final String value;
    private final static Map<String, AdditionalLogisticUnitIdentificationTypeCode> CONSTANTS = new HashMap<String, AdditionalLogisticUnitIdentificationTypeCode>();

    static {
        for (AdditionalLogisticUnitIdentificationTypeCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AdditionalLogisticUnitIdentificationTypeCode(String value) {
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
    public static AdditionalLogisticUnitIdentificationTypeCode fromValue(String value) {
        AdditionalLogisticUnitIdentificationTypeCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
