
package com.syscho.objectmapper.model.ti;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;


/**
 * AdditionalLogisticUnitIdentificationType
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
public class AdditionalLogisticUnitIdentificationType {

    /**
     * AdditionalLogisticUnitIdentificationTypeCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("typeCode")
    private AdditionalLogisticUnitIdentificationTypeCode typeCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private String value;

    /**
     * AdditionalLogisticUnitIdentificationTypeCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("typeCode")
    public AdditionalLogisticUnitIdentificationTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * AdditionalLogisticUnitIdentificationTypeCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("typeCode")
    public void setTypeCode(AdditionalLogisticUnitIdentificationTypeCode typeCode) {
        this.typeCode = typeCode;
    }

    public AdditionalLogisticUnitIdentificationType withTypeCode(AdditionalLogisticUnitIdentificationTypeCode typeCode) {
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

    public AdditionalLogisticUnitIdentificationType withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdditionalLogisticUnitIdentificationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof AdditionalLogisticUnitIdentificationType) == false) {
            return false;
        }
        AdditionalLogisticUnitIdentificationType rhs = ((AdditionalLogisticUnitIdentificationType) other);
        return (((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value)))&&((this.typeCode == rhs.typeCode)||((this.typeCode!= null)&&this.typeCode.equals(rhs.typeCode))));
    }

}
