
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PackageTotalType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "packageTypeCode",
    "totalPackageQuantity",
    "totalGrossVolume",
    "totalGrossWeight",
    "actionCode"
})
@Generated("jsonschema2pojo")
public class PackageTotalType {

    /**
     * PackageTypeCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("packageTypeCode")
    private PackageTypeCode packageTypeCode;
    /**
     * The total number of units of this package type.
     * (Required)
     * 
     */
    @JsonProperty("totalPackageQuantity")
    @JsonPropertyDescription("The total number of units of this package type.")
    private Integer totalPackageQuantity;
    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalGrossVolume")
    private MeasurementType totalGrossVolume;
    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalGrossWeight")
    private MeasurementType totalGrossWeight;
    /**
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("actionCode")
    private SegmentActionEnumerationType actionCode;

    /**
     * PackageTypeCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("packageTypeCode")
    public PackageTypeCode getPackageTypeCode() {
        return packageTypeCode;
    }

    /**
     * PackageTypeCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("packageTypeCode")
    public void setPackageTypeCode(PackageTypeCode packageTypeCode) {
        this.packageTypeCode = packageTypeCode;
    }

    public PackageTotalType withPackageTypeCode(PackageTypeCode packageTypeCode) {
        this.packageTypeCode = packageTypeCode;
        return this;
    }

    /**
     * The total number of units of this package type.
     * (Required)
     * 
     */
    @JsonProperty("totalPackageQuantity")
    public Integer getTotalPackageQuantity() {
        return totalPackageQuantity;
    }

    /**
     * The total number of units of this package type.
     * (Required)
     * 
     */
    @JsonProperty("totalPackageQuantity")
    public void setTotalPackageQuantity(Integer totalPackageQuantity) {
        this.totalPackageQuantity = totalPackageQuantity;
    }

    public PackageTotalType withTotalPackageQuantity(Integer totalPackageQuantity) {
        this.totalPackageQuantity = totalPackageQuantity;
        return this;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalGrossVolume")
    public MeasurementType getTotalGrossVolume() {
        return totalGrossVolume;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalGrossVolume")
    public void setTotalGrossVolume(MeasurementType totalGrossVolume) {
        this.totalGrossVolume = totalGrossVolume;
    }

    public PackageTotalType withTotalGrossVolume(MeasurementType totalGrossVolume) {
        this.totalGrossVolume = totalGrossVolume;
        return this;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalGrossWeight")
    public MeasurementType getTotalGrossWeight() {
        return totalGrossWeight;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalGrossWeight")
    public void setTotalGrossWeight(MeasurementType totalGrossWeight) {
        this.totalGrossWeight = totalGrossWeight;
    }

    public PackageTotalType withTotalGrossWeight(MeasurementType totalGrossWeight) {
        this.totalGrossWeight = totalGrossWeight;
        return this;
    }

    /**
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("actionCode")
    public SegmentActionEnumerationType getActionCode() {
        return actionCode;
    }

    /**
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("actionCode")
    public void setActionCode(SegmentActionEnumerationType actionCode) {
        this.actionCode = actionCode;
    }

    public PackageTotalType withActionCode(SegmentActionEnumerationType actionCode) {
        this.actionCode = actionCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PackageTotalType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("packageTypeCode");
        sb.append('=');
        sb.append(((this.packageTypeCode == null)?"<null>":this.packageTypeCode));
        sb.append(',');
        sb.append("totalPackageQuantity");
        sb.append('=');
        sb.append(((this.totalPackageQuantity == null)?"<null>":this.totalPackageQuantity));
        sb.append(',');
        sb.append("totalGrossVolume");
        sb.append('=');
        sb.append(((this.totalGrossVolume == null)?"<null>":this.totalGrossVolume));
        sb.append(',');
        sb.append("totalGrossWeight");
        sb.append('=');
        sb.append(((this.totalGrossWeight == null)?"<null>":this.totalGrossWeight));
        sb.append(',');
        sb.append("actionCode");
        sb.append('=');
        sb.append(((this.actionCode == null)?"<null>":this.actionCode));
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
        result = ((result* 31)+((this.totalGrossVolume == null)? 0 :this.totalGrossVolume.hashCode()));
        result = ((result* 31)+((this.totalGrossWeight == null)? 0 :this.totalGrossWeight.hashCode()));
        result = ((result* 31)+((this.actionCode == null)? 0 :this.actionCode.hashCode()));
        result = ((result* 31)+((this.totalPackageQuantity == null)? 0 :this.totalPackageQuantity.hashCode()));
        result = ((result* 31)+((this.packageTypeCode == null)? 0 :this.packageTypeCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PackageTotalType) == false) {
            return false;
        }
        PackageTotalType rhs = ((PackageTotalType) other);
        return ((((((this.totalGrossVolume == rhs.totalGrossVolume)||((this.totalGrossVolume!= null)&&this.totalGrossVolume.equals(rhs.totalGrossVolume)))&&((this.totalGrossWeight == rhs.totalGrossWeight)||((this.totalGrossWeight!= null)&&this.totalGrossWeight.equals(rhs.totalGrossWeight))))&&((this.actionCode == rhs.actionCode)||((this.actionCode!= null)&&this.actionCode.equals(rhs.actionCode))))&&((this.totalPackageQuantity == rhs.totalPackageQuantity)||((this.totalPackageQuantity!= null)&&this.totalPackageQuantity.equals(rhs.totalPackageQuantity))))&&((this.packageTypeCode == rhs.packageTypeCode)||((this.packageTypeCode!= null)&&this.packageTypeCode.equals(rhs.packageTypeCode))));
    }

}
