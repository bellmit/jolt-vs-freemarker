
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * IncotermsCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum IncotermsCode {

    CFR("CFR"),
    CIF("CIF"),
    CIP("CIP"),
    CPT("CPT"),
    DAF("DAF"),
    DDP("DDP"),
    DDU("DDU"),
    DEQ("DEQ"),
    DES("DES"),
    EXW("EXW"),
    FAS("FAS"),
    FCA("FCA"),
    FOB("FOB");
    private final String value;
    private final static Map<String, IncotermsCode> CONSTANTS = new HashMap<String, IncotermsCode>();

    static {
        for (IncotermsCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    IncotermsCode(String value) {
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
    public static IncotermsCode fromValue(String value) {
        IncotermsCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
