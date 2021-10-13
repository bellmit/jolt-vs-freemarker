
package com.syscho.objectmapper.model.ti;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * CommunicationChannelCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum CommunicationChannelCode {

    EMAIL("EMAIL"),
    SOCIAL_MEDIA("SOCIAL_MEDIA"),
    TELEFAX("TELEFAX"),
    TELEPHONE("TELEPHONE"),
    WEBSITE("WEBSITE"),
    PAGER("PAGER"),
    IPADDRESS("IPADDRESS");
    private final String value;
    private final static Map<String, CommunicationChannelCode> CONSTANTS = new HashMap<String, CommunicationChannelCode>();

    static {
        for (CommunicationChannelCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CommunicationChannelCode(String value) {
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
    public static CommunicationChannelCode fromValue(String value) {
        CommunicationChannelCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
