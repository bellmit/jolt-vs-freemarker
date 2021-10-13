
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * ItemLevelDetailEnumerationType
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum ItemLevelDetailEnumerationType {

    ILD_NULL("ILD_NULL"),
    ILD_NOT_ACTIVE("ILD_NOT_ACTIVE"),
    ILD_OPTIONAL("ILD_OPTIONAL"),
    ILD_MANDATORY("ILD_MANDATORY"),
    ILD_SUMMARY_MANDATORY("ILD_SUMMARY_MANDATORY");
    private final String value;
    private final static Map<String, ItemLevelDetailEnumerationType> CONSTANTS = new HashMap<String, ItemLevelDetailEnumerationType>();

    static {
        for (ItemLevelDetailEnumerationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ItemLevelDetailEnumerationType(String value) {
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
    public static ItemLevelDetailEnumerationType fromValue(String value) {
        ItemLevelDetailEnumerationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
