
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ReturnableAssetIdentificationType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "primaryId",
    "additionalReturnableAssetId"
})
@Generated("jsonschema2pojo")
public class ReturnableAssetIdentificationType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primaryId")
    private String primaryId;
    /**
     * The additional identification Key used to identify returnable assets.
     * 
     */
    @JsonProperty("additionalReturnableAssetId")
    @JsonPropertyDescription("The additional identification Key used to identify returnable assets.")
    private List<AdditionalReturnableAssetIdentificationType> additionalReturnableAssetId = new ArrayList<AdditionalReturnableAssetIdentificationType>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primaryId")
    public String getPrimaryId() {
        return primaryId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primaryId")
    public void setPrimaryId(String primaryId) {
        this.primaryId = primaryId;
    }

    public ReturnableAssetIdentificationType withPrimaryId(String primaryId) {
        this.primaryId = primaryId;
        return this;
    }

    /**
     * The additional identification Key used to identify returnable assets.
     * 
     */
    @JsonProperty("additionalReturnableAssetId")
    public List<AdditionalReturnableAssetIdentificationType> getAdditionalReturnableAssetId() {
        return additionalReturnableAssetId;
    }

    /**
     * The additional identification Key used to identify returnable assets.
     * 
     */
    @JsonProperty("additionalReturnableAssetId")
    public void setAdditionalReturnableAssetId(List<AdditionalReturnableAssetIdentificationType> additionalReturnableAssetId) {
        this.additionalReturnableAssetId = additionalReturnableAssetId;
    }

    public ReturnableAssetIdentificationType withAdditionalReturnableAssetId(List<AdditionalReturnableAssetIdentificationType> additionalReturnableAssetId) {
        this.additionalReturnableAssetId = additionalReturnableAssetId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReturnableAssetIdentificationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("primaryId");
        sb.append('=');
        sb.append(((this.primaryId == null)?"<null>":this.primaryId));
        sb.append(',');
        sb.append("additionalReturnableAssetId");
        sb.append('=');
        sb.append(((this.additionalReturnableAssetId == null)?"<null>":this.additionalReturnableAssetId));
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
        result = ((result* 31)+((this.primaryId == null)? 0 :this.primaryId.hashCode()));
        result = ((result* 31)+((this.additionalReturnableAssetId == null)? 0 :this.additionalReturnableAssetId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReturnableAssetIdentificationType) == false) {
            return false;
        }
        ReturnableAssetIdentificationType rhs = ((ReturnableAssetIdentificationType) other);
        return (((this.primaryId == rhs.primaryId)||((this.primaryId!= null)&&this.primaryId.equals(rhs.primaryId)))&&((this.additionalReturnableAssetId == rhs.additionalReturnableAssetId)||((this.additionalReturnableAssetId!= null)&&this.additionalReturnableAssetId.equals(rhs.additionalReturnableAssetId))));
    }

}
