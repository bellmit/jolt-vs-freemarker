
package com.syscho.objectmapper.model.ti;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;


/**
 * AdditionalShipmentIdentificationTypeCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum AdditionalShipmentIdentificationTypeCode {

    GOODS_RECEIVER_ASSIGNED("GOODS_RECEIVER_ASSIGNED"),
    LOGISTICS_SERVICE_PROVIDER_ASSIGNED("LOGISTICS_SERVICE_PROVIDER_ASSIGNED"),
    SHIPPER_ASSIGNED("SHIPPER_ASSIGNED"),
    GSIN("GSIN");
    private final String value;
    private final static Map<String, AdditionalShipmentIdentificationTypeCode> CONSTANTS = new HashMap<String, AdditionalShipmentIdentificationTypeCode>();

    static {
        for (AdditionalShipmentIdentificationTypeCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AdditionalShipmentIdentificationTypeCode(String value) {
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
    public static AdditionalShipmentIdentificationTypeCode fromValue(String value) {
        AdditionalShipmentIdentificationTypeCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
