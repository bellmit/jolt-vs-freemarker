
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TransportManagementReferenceNumberType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "referenceNumberName",
    "referenceNumberValue"
})
@Generated("jsonschema2pojo")
public class TransportManagementReferenceNumberType {

    /**
     * Qualifier type for the reference number value.
     * (Required)
     * 
     */
    @JsonProperty("referenceNumberName")
    @JsonPropertyDescription("Qualifier type for the reference number value.")
    private String referenceNumberName;
    /**
     * The value of the reference number or code.
     * (Required)
     * 
     */
    @JsonProperty("referenceNumberValue")
    @JsonPropertyDescription("The value of the reference number or code.")
    private String referenceNumberValue;

    /**
     * Qualifier type for the reference number value.
     * (Required)
     * 
     */
    @JsonProperty("referenceNumberName")
    public String getReferenceNumberName() {
        return referenceNumberName;
    }

    /**
     * Qualifier type for the reference number value.
     * (Required)
     * 
     */
    @JsonProperty("referenceNumberName")
    public void setReferenceNumberName(String referenceNumberName) {
        this.referenceNumberName = referenceNumberName;
    }

    public TransportManagementReferenceNumberType withReferenceNumberName(String referenceNumberName) {
        this.referenceNumberName = referenceNumberName;
        return this;
    }

    /**
     * The value of the reference number or code.
     * (Required)
     * 
     */
    @JsonProperty("referenceNumberValue")
    public String getReferenceNumberValue() {
        return referenceNumberValue;
    }

    /**
     * The value of the reference number or code.
     * (Required)
     * 
     */
    @JsonProperty("referenceNumberValue")
    public void setReferenceNumberValue(String referenceNumberValue) {
        this.referenceNumberValue = referenceNumberValue;
    }

    public TransportManagementReferenceNumberType withReferenceNumberValue(String referenceNumberValue) {
        this.referenceNumberValue = referenceNumberValue;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportManagementReferenceNumberType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("referenceNumberName");
        sb.append('=');
        sb.append(((this.referenceNumberName == null)?"<null>":this.referenceNumberName));
        sb.append(',');
        sb.append("referenceNumberValue");
        sb.append('=');
        sb.append(((this.referenceNumberValue == null)?"<null>":this.referenceNumberValue));
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
        result = ((result* 31)+((this.referenceNumberName == null)? 0 :this.referenceNumberName.hashCode()));
        result = ((result* 31)+((this.referenceNumberValue == null)? 0 :this.referenceNumberValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportManagementReferenceNumberType) == false) {
            return false;
        }
        TransportManagementReferenceNumberType rhs = ((TransportManagementReferenceNumberType) other);
        return (((this.referenceNumberName == rhs.referenceNumberName)||((this.referenceNumberName!= null)&&this.referenceNumberName.equals(rhs.referenceNumberName)))&&((this.referenceNumberValue == rhs.referenceNumberValue)||((this.referenceNumberValue!= null)&&this.referenceNumberValue.equals(rhs.referenceNumberValue))));
    }

}
