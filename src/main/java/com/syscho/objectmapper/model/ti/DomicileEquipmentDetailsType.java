
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DomicileEquipmentDetailsType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transportEquipmentTypeCode",
    "domicileEquipmentInformation"
})
@Generated("jsonschema2pojo")
public class DomicileEquipmentDetailsType {

    /**
     * CodeType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportEquipmentTypeCode")
    private CodeType transportEquipmentTypeCode;
    /**
     * DomicileEquipmentInformationType
     * <p>
     * 
     * 
     */
    @JsonProperty("domicileEquipmentInformation")
    private DomicileEquipmentInformationType domicileEquipmentInformation;

    /**
     * CodeType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportEquipmentTypeCode")
    public CodeType getTransportEquipmentTypeCode() {
        return transportEquipmentTypeCode;
    }

    /**
     * CodeType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportEquipmentTypeCode")
    public void setTransportEquipmentTypeCode(CodeType transportEquipmentTypeCode) {
        this.transportEquipmentTypeCode = transportEquipmentTypeCode;
    }

    public DomicileEquipmentDetailsType withTransportEquipmentTypeCode(CodeType transportEquipmentTypeCode) {
        this.transportEquipmentTypeCode = transportEquipmentTypeCode;
        return this;
    }

    /**
     * DomicileEquipmentInformationType
     * <p>
     * 
     * 
     */
    @JsonProperty("domicileEquipmentInformation")
    public DomicileEquipmentInformationType getDomicileEquipmentInformation() {
        return domicileEquipmentInformation;
    }

    /**
     * DomicileEquipmentInformationType
     * <p>
     * 
     * 
     */
    @JsonProperty("domicileEquipmentInformation")
    public void setDomicileEquipmentInformation(DomicileEquipmentInformationType domicileEquipmentInformation) {
        this.domicileEquipmentInformation = domicileEquipmentInformation;
    }

    public DomicileEquipmentDetailsType withDomicileEquipmentInformation(DomicileEquipmentInformationType domicileEquipmentInformation) {
        this.domicileEquipmentInformation = domicileEquipmentInformation;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DomicileEquipmentDetailsType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("transportEquipmentTypeCode");
        sb.append('=');
        sb.append(((this.transportEquipmentTypeCode == null)?"<null>":this.transportEquipmentTypeCode));
        sb.append(',');
        sb.append("domicileEquipmentInformation");
        sb.append('=');
        sb.append(((this.domicileEquipmentInformation == null)?"<null>":this.domicileEquipmentInformation));
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
        result = ((result* 31)+((this.domicileEquipmentInformation == null)? 0 :this.domicileEquipmentInformation.hashCode()));
        result = ((result* 31)+((this.transportEquipmentTypeCode == null)? 0 :this.transportEquipmentTypeCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomicileEquipmentDetailsType) == false) {
            return false;
        }
        DomicileEquipmentDetailsType rhs = ((DomicileEquipmentDetailsType) other);
        return (((this.domicileEquipmentInformation == rhs.domicileEquipmentInformation)||((this.domicileEquipmentInformation!= null)&&this.domicileEquipmentInformation.equals(rhs.domicileEquipmentInformation)))&&((this.transportEquipmentTypeCode == rhs.transportEquipmentTypeCode)||((this.transportEquipmentTypeCode!= null)&&this.transportEquipmentTypeCode.equals(rhs.transportEquipmentTypeCode))));
    }

}
