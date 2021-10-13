
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * ItemValidationTypeEnumerationType
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum ItemValidationTypeEnumerationType {

    VI_NULL("VI_NULL"),
    VI_OPT_NO_VLDT("VI_OPT_NO_VLDT"),
    VI_OPT_VLDT("VI_OPT_VLDT"),
    VI_MDY_VLDT("VI_MDY_VLDT");
    private final String value;
    private final static Map<String, ItemValidationTypeEnumerationType> CONSTANTS = new HashMap<String, ItemValidationTypeEnumerationType>();

    static {
        for (ItemValidationTypeEnumerationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ItemValidationTypeEnumerationType(String value) {
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
    public static ItemValidationTypeEnumerationType fromValue(String value) {
        ItemValidationTypeEnumerationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
