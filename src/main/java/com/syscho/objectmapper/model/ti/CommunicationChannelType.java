
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CommunicationChannelType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "communicationChannelCode",
    "communicationValue",
    "communicationChannelName"
})
@Generated("jsonschema2pojo")
public class CommunicationChannelType {

    /**
     * CommunicationChannelCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("communicationChannelCode")
    private CommunicationChannelCode communicationChannelCode;
    /**
     * Text identifying the endpoint for the communication channel, for example a telephone number or an e-mail address.
     * (Required)
     * 
     */
    @JsonProperty("communicationValue")
    @JsonPropertyDescription("Text identifying the endpoint for the communication channel, for example a telephone number or an e-mail address.")
    private String communicationValue;
    /**
     * The name of a specific communication channel for example Facebook, Twitter, etc.
     * 
     */
    @JsonProperty("communicationChannelName")
    @JsonPropertyDescription("The name of a specific communication channel for example Facebook, Twitter, etc.")
    private String communicationChannelName;

    /**
     * CommunicationChannelCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("communicationChannelCode")
    public CommunicationChannelCode getCommunicationChannelCode() {
        return communicationChannelCode;
    }

    /**
     * CommunicationChannelCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("communicationChannelCode")
    public void setCommunicationChannelCode(CommunicationChannelCode communicationChannelCode) {
        this.communicationChannelCode = communicationChannelCode;
    }

    public CommunicationChannelType withCommunicationChannelCode(CommunicationChannelCode communicationChannelCode) {
        this.communicationChannelCode = communicationChannelCode;
        return this;
    }

    /**
     * Text identifying the endpoint for the communication channel, for example a telephone number or an e-mail address.
     * (Required)
     * 
     */
    @JsonProperty("communicationValue")
    public String getCommunicationValue() {
        return communicationValue;
    }

    /**
     * Text identifying the endpoint for the communication channel, for example a telephone number or an e-mail address.
     * (Required)
     * 
     */
    @JsonProperty("communicationValue")
    public void setCommunicationValue(String communicationValue) {
        this.communicationValue = communicationValue;
    }

    public CommunicationChannelType withCommunicationValue(String communicationValue) {
        this.communicationValue = communicationValue;
        return this;
    }

    /**
     * The name of a specific communication channel for example Facebook, Twitter, etc.
     * 
     */
    @JsonProperty("communicationChannelName")
    public String getCommunicationChannelName() {
        return communicationChannelName;
    }

    /**
     * The name of a specific communication channel for example Facebook, Twitter, etc.
     * 
     */
    @JsonProperty("communicationChannelName")
    public void setCommunicationChannelName(String communicationChannelName) {
        this.communicationChannelName = communicationChannelName;
    }

    public CommunicationChannelType withCommunicationChannelName(String communicationChannelName) {
        this.communicationChannelName = communicationChannelName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommunicationChannelType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("communicationChannelCode");
        sb.append('=');
        sb.append(((this.communicationChannelCode == null)?"<null>":this.communicationChannelCode));
        sb.append(',');
        sb.append("communicationValue");
        sb.append('=');
        sb.append(((this.communicationValue == null)?"<null>":this.communicationValue));
        sb.append(',');
        sb.append("communicationChannelName");
        sb.append('=');
        sb.append(((this.communicationChannelName == null)?"<null>":this.communicationChannelName));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.communicationChannelName == null)? 0 :this.communicationChannelName.hashCode()));
        result = ((result* 31)+((this.communicationChannelCode == null)? 0 :this.communicationChannelCode.hashCode()));
        result = ((result* 31)+((this.communicationValue == null)? 0 :this.communicationValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommunicationChannelType) == false) {
            return false;
        }
        CommunicationChannelType rhs = ((CommunicationChannelType) other);
        return ((((this.communicationChannelName == rhs.communicationChannelName)||((this.communicationChannelName!= null)&&this.communicationChannelName.equals(rhs.communicationChannelName)))&&((this.communicationChannelCode == rhs.communicationChannelCode)||((this.communicationChannelCode!= null)&&this.communicationChannelCode.equals(rhs.communicationChannelCode))))&&((this.communicationValue == rhs.communicationValue)||((this.communicationValue!= null)&&this.communicationValue.equals(rhs.communicationValue))));
    }

}
