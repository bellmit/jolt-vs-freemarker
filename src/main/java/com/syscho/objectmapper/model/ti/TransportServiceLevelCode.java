
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * TransportServiceLevelCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum TransportServiceLevelCode {

    AUTHORIZED_RETURN_SERVICE("AUTHORIZED_RETURN_SERVICE"),
    CONSIGNEE_BILLING_SERVICE("CONSIGNEE_BILLING_SERVICE"),
    DELIVERY_CONFIRMATION("DELIVERY_CONFIRMATION"),
    EXPEDITED_SERVICE("EXPEDITED_SERVICE"),
    EXPEDITED_SERVICE_WORLDWIDE("EXPEDITED_SERVICE_WORLDWIDE"),
    EXPRESS_SERVICE("EXPRESS_SERVICE"),
    EXPRESS_SERVICE_PLUS("EXPRESS_SERVICE_PLUS"),
    GROUND("GROUND"),
    GROUND_CX_EXPRESS_SERVICE("GROUND_CX_EXPRESS_SERVICE"),
    MULTIWEIGHT("MULTIWEIGHT"),
    MUTUALLY_DEFINED("MUTUALLY_DEFINED"),
    NEXT_DAY_AIR("NEXT_DAY_AIR"),
    NEXT_DAY_PM("NEXT_DAY_PM"),
    NEXT_MORNING("NEXT_MORNING"),
    PRIMARY_SERVICE_AREA_NEXT_DAY_BY_1030("PRIMARY_SERVICE_AREA_NEXT_DAY_BY_1030"),
    PRIMARY_SERVICE_AREA_NEXT_DAY_BY_1700("PRIMARY_SERVICE_AREA_NEXT_DAY_BY_1700"),
    RETURN_SERVICE("RETURN_SERVICE"),
    SAME_DAY("SAME_DAY"),
    SATURDAY("SATURDAY"),
    SATURDAY_PICKUP("SATURDAY_PICKUP"),
    SECOND_DAY_AIR("SECOND_DAY_AIR"),
    SECOND_MORNING("SECOND_MORNING"),
    STANDARD_GROUND_HUNDRED_WEIGHT("STANDARD_GROUND_HUNDRED_WEIGHT"),
    STANDARD_SERVICE("STANDARD_SERVICE"),
    THREE_DAY_SERVICE("THREE_DAY_SERVICE");
    private final String value;
    private final static Map<String, TransportServiceLevelCode> CONSTANTS = new HashMap<String, TransportServiceLevelCode>();

    static {
        for (TransportServiceLevelCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TransportServiceLevelCode(String value) {
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
    public static TransportServiceLevelCode fromValue(String value) {
        TransportServiceLevelCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
