
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * CarrierStatusCodeEnumerationType
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum CarrierStatusCodeEnumerationType {

    SV_NULL("SV_NULL"),
    SV_POD_OR_DELVY_NOTIFICATION_NOT_REQUIRED("SV_POD_OR_DELVY_NOTIFICATION_NOT_REQUIRED"),
    SV_POD_OR_DELVY_NOTIFICATION_REQUIRED("SV_POD_OR_DELVY_NOTIFICATION_REQUIRED"),
    SV_POD_REQUIRED("SV_POD_REQUIRED");
    private final String value;
    private final static Map<String, CarrierStatusCodeEnumerationType> CONSTANTS = new HashMap<String, CarrierStatusCodeEnumerationType>();

    static {
        for (CarrierStatusCodeEnumerationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CarrierStatusCodeEnumerationType(String value) {
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
    public static CarrierStatusCodeEnumerationType fromValue(String value) {
        CarrierStatusCodeEnumerationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
