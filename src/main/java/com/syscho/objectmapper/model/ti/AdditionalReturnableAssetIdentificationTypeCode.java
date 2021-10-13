
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * AdditionalReturnableAssetIdentificationTypeCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum AdditionalReturnableAssetIdentificationTypeCode {

    INDUSTRY_ASSIGNED("INDUSTRY_ASSIGNED"),
    OWNER_ASSIGNED("OWNER_ASSIGNED"),
    GRAI("GRAI");
    private final String value;
    private final static Map<String, AdditionalReturnableAssetIdentificationTypeCode> CONSTANTS = new HashMap<String, AdditionalReturnableAssetIdentificationTypeCode>();

    static {
        for (AdditionalReturnableAssetIdentificationTypeCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AdditionalReturnableAssetIdentificationTypeCode(String value) {
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
    public static AdditionalReturnableAssetIdentificationTypeCode fromValue(String value) {
        AdditionalReturnableAssetIdentificationTypeCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
