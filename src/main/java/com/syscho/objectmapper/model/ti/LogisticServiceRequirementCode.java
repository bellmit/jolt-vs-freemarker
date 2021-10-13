
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * LogisticServiceRequirementCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum LogisticServiceRequirementCode {

    _2("2"),
    _3("3"),
    _4("4");
    private final String value;
    private final static Map<String, LogisticServiceRequirementCode> CONSTANTS = new HashMap<String, LogisticServiceRequirementCode>();

    static {
        for (LogisticServiceRequirementCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    LogisticServiceRequirementCode(String value) {
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
    public static LogisticServiceRequirementCode fromValue(String value) {
        LogisticServiceRequirementCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
