
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * RetailCategoryCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum RetailCategoryCode {

    IS_IN_MALL("IS_IN_MALL"),
    IS_IN_AIRPORT("IS_IN_AIRPORT"),
    IS_URBAN("IS_URBAN"),
    IS_SUBURBAN("IS_SUBURBAN"),
    IS_RURAL("IS_RURAL"),
    IS_INTERNATIONAL("IS_INTERNATIONAL"),
    IS_FLAGSHIP("IS_FLAGSHIP"),
    IS_NEAR_PLACE_OF_INTEREST("IS_NEAR_PLACE_OF_INTEREST"),
    IS_PARKING_AVAILABLE("IS_PARKING_AVAILABLE"),
    HAS_LIQUOR_LICENSE("HAS_LIQUOR_LICENSE"),
    IS_NOT_DC("IS_NOT_DC"),
    IS_STORE_COMPARABLE("IS_STORE_COMPARABLE");
    private final String value;
    private final static Map<String, RetailCategoryCode> CONSTANTS = new HashMap<String, RetailCategoryCode>();

    static {
        for (RetailCategoryCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    RetailCategoryCode(String value) {
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
    public static RetailCategoryCode fromValue(String value) {
        RetailCategoryCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
