
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * IndividualAssetIdentificationType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "primaryId",
    "additionalIndividualAssetId"
})
@Generated("jsonschema2pojo")
public class IndividualAssetIdentificationType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primaryId")
    private String primaryId;
    /**
     * Identifier of the asset, specified in addition to the GIAI.
     * 
     */
    @JsonProperty("additionalIndividualAssetId")
    @JsonPropertyDescription("Identifier of the asset, specified in addition to the GIAI.")
    private List<AdditionalIndividualAssetIdentificationType> additionalIndividualAssetId = new ArrayList<AdditionalIndividualAssetIdentificationType>();

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

    public IndividualAssetIdentificationType withPrimaryId(String primaryId) {
        this.primaryId = primaryId;
        return this;
    }

    /**
     * Identifier of the asset, specified in addition to the GIAI.
     * 
     */
    @JsonProperty("additionalIndividualAssetId")
    public List<AdditionalIndividualAssetIdentificationType> getAdditionalIndividualAssetId() {
        return additionalIndividualAssetId;
    }

    /**
     * Identifier of the asset, specified in addition to the GIAI.
     * 
     */
    @JsonProperty("additionalIndividualAssetId")
    public void setAdditionalIndividualAssetId(List<AdditionalIndividualAssetIdentificationType> additionalIndividualAssetId) {
        this.additionalIndividualAssetId = additionalIndividualAssetId;
    }

    public IndividualAssetIdentificationType withAdditionalIndividualAssetId(List<AdditionalIndividualAssetIdentificationType> additionalIndividualAssetId) {
        this.additionalIndividualAssetId = additionalIndividualAssetId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IndividualAssetIdentificationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("primaryId");
        sb.append('=');
        sb.append(((this.primaryId == null)?"<null>":this.primaryId));
        sb.append(',');
        sb.append("additionalIndividualAssetId");
        sb.append('=');
        sb.append(((this.additionalIndividualAssetId == null)?"<null>":this.additionalIndividualAssetId));
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
        result = ((result* 31)+((this.additionalIndividualAssetId == null)? 0 :this.additionalIndividualAssetId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IndividualAssetIdentificationType) == false) {
            return false;
        }
        IndividualAssetIdentificationType rhs = ((IndividualAssetIdentificationType) other);
        return (((this.primaryId == rhs.primaryId)||((this.primaryId!= null)&&this.primaryId.equals(rhs.primaryId)))&&((this.additionalIndividualAssetId == rhs.additionalIndividualAssetId)||((this.additionalIndividualAssetId!= null)&&this.additionalIndividualAssetId.equals(rhs.additionalIndividualAssetId))));
    }

}
