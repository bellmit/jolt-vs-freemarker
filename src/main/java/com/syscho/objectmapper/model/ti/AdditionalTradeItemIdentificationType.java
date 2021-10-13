
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AdditionalTradeItemIdentificationType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "typeCode",
    "value"
})
@Generated("jsonschema2pojo")
public class AdditionalTradeItemIdentificationType {

    /**
     * AdditionalTradeItemIdentificationTypeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("typeCode")
    private AdditionalTradeItemIdentificationTypeCode typeCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private String value;

    /**
     * AdditionalTradeItemIdentificationTypeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("typeCode")
    public AdditionalTradeItemIdentificationTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * AdditionalTradeItemIdentificationTypeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("typeCode")
    public void setTypeCode(AdditionalTradeItemIdentificationTypeCode typeCode) {
        this.typeCode = typeCode;
    }

    public AdditionalTradeItemIdentificationType withTypeCode(AdditionalTradeItemIdentificationTypeCode typeCode) {
        this.typeCode = typeCode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public AdditionalTradeItemIdentificationType withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdditionalTradeItemIdentificationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("typeCode");
        sb.append('=');
        sb.append(((this.typeCode == null)?"<null>":this.typeCode));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.typeCode == null)? 0 :this.typeCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdditionalTradeItemIdentificationType) == false) {
            return false;
        }
        AdditionalTradeItemIdentificationType rhs = ((AdditionalTradeItemIdentificationType) other);
        return (((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value)))&&((this.typeCode == rhs.typeCode)||((this.typeCode!= null)&&this.typeCode.equals(rhs.typeCode))));
    }

}
