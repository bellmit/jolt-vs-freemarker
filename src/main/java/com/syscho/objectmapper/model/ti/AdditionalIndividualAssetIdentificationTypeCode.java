
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * AdditionalIndividualAssetIdentificationTypeCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum AdditionalIndividualAssetIdentificationTypeCode {

    INDUSTRY_ASSIGNED("INDUSTRY_ASSIGNED"),
    OWNER_ASSIGNED("OWNER_ASSIGNED"),
    GIAI("GIAI");
    private final String value;
    private final static Map<String, AdditionalIndividualAssetIdentificationTypeCode> CONSTANTS = new HashMap<String, AdditionalIndividualAssetIdentificationTypeCode>();

    static {
        for (AdditionalIndividualAssetIdentificationTypeCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AdditionalIndividualAssetIdentificationTypeCode(String value) {
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
    public static AdditionalIndividualAssetIdentificationTypeCode fromValue(String value) {
        AdditionalIndividualAssetIdentificationTypeCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
