
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DeliveryTermsType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "incotermsCode",
    "deliveryTermsLocation"
})
@Generated("jsonschema2pojo")
public class DeliveryTermsType {

    /**
     * IncotermsCode
     * <p>
     * 
     * 
     */
    @JsonProperty("incotermsCode")
    private IncotermsCode incotermsCode;
    /**
     * LogisticLocationType
     * <p>
     * 
     * 
     */
    @JsonProperty("deliveryTermsLocation")
    private LogisticLocationType deliveryTermsLocation;

    /**
     * IncotermsCode
     * <p>
     * 
     * 
     */
    @JsonProperty("incotermsCode")
    public IncotermsCode getIncotermsCode() {
        return incotermsCode;
    }

    /**
     * IncotermsCode
     * <p>
     * 
     * 
     */
    @JsonProperty("incotermsCode")
    public void setIncotermsCode(IncotermsCode incotermsCode) {
        this.incotermsCode = incotermsCode;
    }

    public DeliveryTermsType withIncotermsCode(IncotermsCode incotermsCode) {
        this.incotermsCode = incotermsCode;
        return this;
    }

    /**
     * LogisticLocationType
     * <p>
     * 
     * 
     */
    @JsonProperty("deliveryTermsLocation")
    public LogisticLocationType getDeliveryTermsLocation() {
        return deliveryTermsLocation;
    }

    /**
     * LogisticLocationType
     * <p>
     * 
     * 
     */
    @JsonProperty("deliveryTermsLocation")
    public void setDeliveryTermsLocation(LogisticLocationType deliveryTermsLocation) {
        this.deliveryTermsLocation = deliveryTermsLocation;
    }

    public DeliveryTermsType withDeliveryTermsLocation(LogisticLocationType deliveryTermsLocation) {
        this.deliveryTermsLocation = deliveryTermsLocation;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DeliveryTermsType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("incotermsCode");
        sb.append('=');
        sb.append(((this.incotermsCode == null)?"<null>":this.incotermsCode));
        sb.append(',');
        sb.append("deliveryTermsLocation");
        sb.append('=');
        sb.append(((this.deliveryTermsLocation == null)?"<null>":this.deliveryTermsLocation));
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
        result = ((result* 31)+((this.incotermsCode == null)? 0 :this.incotermsCode.hashCode()));
        result = ((result* 31)+((this.deliveryTermsLocation == null)? 0 :this.deliveryTermsLocation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryTermsType) == false) {
            return false;
        }
        DeliveryTermsType rhs = ((DeliveryTermsType) other);
        return (((this.incotermsCode == rhs.incotermsCode)||((this.incotermsCode!= null)&&this.incotermsCode.equals(rhs.incotermsCode)))&&((this.deliveryTermsLocation == rhs.deliveryTermsLocation)||((this.deliveryTermsLocation!= null)&&this.deliveryTermsLocation.equals(rhs.deliveryTermsLocation))));
    }

}
