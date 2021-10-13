
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TransportInstructionTransportEquipmentType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transportEquipmentTypeCode",
    "returnableAssetId",
    "assetId"
})
@Generated("jsonschema2pojo")
public class TransportInstructionTransportEquipmentType {

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
     * Information used to identify a returnable asset.
     * 
     */
    @JsonProperty("returnableAssetId")
    @JsonPropertyDescription("Information used to identify a returnable asset.")
    private List<ReturnableAssetIdentificationType> returnableAssetId = new ArrayList<ReturnableAssetIdentificationType>();
    /**
     * Information used to identify an asset.
     * 
     */
    @JsonProperty("assetId")
    @JsonPropertyDescription("Information used to identify an asset.")
    private List<IndividualAssetIdentificationType> assetId = new ArrayList<IndividualAssetIdentificationType>();

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

    public TransportInstructionTransportEquipmentType withTransportEquipmentTypeCode(CodeType transportEquipmentTypeCode) {
        this.transportEquipmentTypeCode = transportEquipmentTypeCode;
        return this;
    }

    /**
     * Information used to identify a returnable asset.
     * 
     */
    @JsonProperty("returnableAssetId")
    public List<ReturnableAssetIdentificationType> getReturnableAssetId() {
        return returnableAssetId;
    }

    /**
     * Information used to identify a returnable asset.
     * 
     */
    @JsonProperty("returnableAssetId")
    public void setReturnableAssetId(List<ReturnableAssetIdentificationType> returnableAssetId) {
        this.returnableAssetId = returnableAssetId;
    }

    public TransportInstructionTransportEquipmentType withReturnableAssetId(List<ReturnableAssetIdentificationType> returnableAssetId) {
        this.returnableAssetId = returnableAssetId;
        return this;
    }

    /**
     * Information used to identify an asset.
     * 
     */
    @JsonProperty("assetId")
    public List<IndividualAssetIdentificationType> getAssetId() {
        return assetId;
    }

    /**
     * Information used to identify an asset.
     * 
     */
    @JsonProperty("assetId")
    public void setAssetId(List<IndividualAssetIdentificationType> assetId) {
        this.assetId = assetId;
    }

    public TransportInstructionTransportEquipmentType withAssetId(List<IndividualAssetIdentificationType> assetId) {
        this.assetId = assetId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportInstructionTransportEquipmentType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("transportEquipmentTypeCode");
        sb.append('=');
        sb.append(((this.transportEquipmentTypeCode == null)?"<null>":this.transportEquipmentTypeCode));
        sb.append(',');
        sb.append("returnableAssetId");
        sb.append('=');
        sb.append(((this.returnableAssetId == null)?"<null>":this.returnableAssetId));
        sb.append(',');
        sb.append("assetId");
        sb.append('=');
        sb.append(((this.assetId == null)?"<null>":this.assetId));
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
        result = ((result* 31)+((this.returnableAssetId == null)? 0 :this.returnableAssetId.hashCode()));
        result = ((result* 31)+((this.transportEquipmentTypeCode == null)? 0 :this.transportEquipmentTypeCode.hashCode()));
        result = ((result* 31)+((this.assetId == null)? 0 :this.assetId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportInstructionTransportEquipmentType) == false) {
            return false;
        }
        TransportInstructionTransportEquipmentType rhs = ((TransportInstructionTransportEquipmentType) other);
        return ((((this.returnableAssetId == rhs.returnableAssetId)||((this.returnableAssetId!= null)&&this.returnableAssetId.equals(rhs.returnableAssetId)))&&((this.transportEquipmentTypeCode == rhs.transportEquipmentTypeCode)||((this.transportEquipmentTypeCode!= null)&&this.transportEquipmentTypeCode.equals(rhs.transportEquipmentTypeCode))))&&((this.assetId == rhs.assetId)||((this.assetId!= null)&&this.assetId.equals(rhs.assetId))));
    }

}
