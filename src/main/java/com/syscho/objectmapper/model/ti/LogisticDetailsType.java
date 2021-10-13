
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LogisticDetailsType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "maximumShipmentWeight",
    "maximumShipmentVolume",
    "carrier",
    "earlyDeliveryTolerance",
    "lateDeliveryTolerance",
    "allowDropOffCode",
    "allowPickUpCode",
    "isShipmentDeconsolidationAllowed",
    "isPartialShipmentAllowed",
    "isPartialAllocationAllowed",
    "isCarrierChangable",
    "isSplitCaseAllowed",
    "distanceOverrideCode",
    "storageAreaSize",
    "extensions",
    "avpList"
})
@Generated("jsonschema2pojo")
public class LogisticDetailsType {

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumShipmentWeight")
    private MeasurementType maximumShipmentWeight;
    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumShipmentVolume")
    private MeasurementType maximumShipmentVolume;
    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("carrier")
    private PartyIdentificationType carrier;
    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("earlyDeliveryTolerance")
    private TimeMeasurementType earlyDeliveryTolerance;
    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("lateDeliveryTolerance")
    private TimeMeasurementType lateDeliveryTolerance;
    /**
     * AllowDropOffEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("allowDropOffCode")
    private AllowDropOffEnumerationType allowDropOffCode;
    /**
     * AllowPickUpEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("allowPickUpCode")
    private AllowPickUpEnumerationType allowPickUpCode;
    /**
     * Indicates if the Hub can be used as a location to deconsolidate shipments.
     * 
     */
    @JsonProperty("isShipmentDeconsolidationAllowed")
    @JsonPropertyDescription("Indicates if the Hub can be used as a location to deconsolidate shipments.")
    private Boolean isShipmentDeconsolidationAllowed;
    /**
     * Back Order Flag.
     * 
     */
    @JsonProperty("isPartialShipmentAllowed")
    @JsonPropertyDescription("Back Order Flag.")
    private Boolean isPartialShipmentAllowed;
    /**
     * Partial Allocation Flag.
     * 
     */
    @JsonProperty("isPartialAllocationAllowed")
    @JsonPropertyDescription("Partial Allocation Flag.")
    private Boolean isPartialAllocationAllowed;
    /**
     * Flag to indicate if Carrier can be changed.
     * 
     */
    @JsonProperty("isCarrierChangable")
    @JsonPropertyDescription("Flag to indicate if Carrier can be changed.")
    private Boolean isCarrierChangable;
    /**
     * Split Case Flag.
     * 
     */
    @JsonProperty("isSplitCaseAllowed")
    @JsonPropertyDescription("Split Case Flag.")
    private Boolean isSplitCaseAllowed;
    /**
     * Indicates whether to convert or delete the distance override when updating the shipping location's address.
     * 
     */
    @JsonProperty("distanceOverrideCode")
    @JsonPropertyDescription("Indicates whether to convert or delete the distance override when updating the shipping location's address.")
    private String distanceOverrideCode;
    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("storageAreaSize")
    private QuantityType storageAreaSize;
    /**
     * NoCustomExtensionsType
     * <p>
     * 
     * 
     */
    @JsonProperty("extensions")
    private NoCustomExtensionsType extensions;
    /**
     * Deprecated, use 'extensions' instead. The placeholder for non-standard data.
     * 
     */
    @JsonProperty("avpList")
    @JsonPropertyDescription("Deprecated, use 'extensions' instead. The placeholder for non-standard data.")
    private List<EcomStringAttributeValuePairListType> avpList = new ArrayList<EcomStringAttributeValuePairListType>();

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumShipmentWeight")
    public MeasurementType getMaximumShipmentWeight() {
        return maximumShipmentWeight;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumShipmentWeight")
    public void setMaximumShipmentWeight(MeasurementType maximumShipmentWeight) {
        this.maximumShipmentWeight = maximumShipmentWeight;
    }

    public LogisticDetailsType withMaximumShipmentWeight(MeasurementType maximumShipmentWeight) {
        this.maximumShipmentWeight = maximumShipmentWeight;
        return this;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumShipmentVolume")
    public MeasurementType getMaximumShipmentVolume() {
        return maximumShipmentVolume;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumShipmentVolume")
    public void setMaximumShipmentVolume(MeasurementType maximumShipmentVolume) {
        this.maximumShipmentVolume = maximumShipmentVolume;
    }

    public LogisticDetailsType withMaximumShipmentVolume(MeasurementType maximumShipmentVolume) {
        this.maximumShipmentVolume = maximumShipmentVolume;
        return this;
    }

    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("carrier")
    public PartyIdentificationType getCarrier() {
        return carrier;
    }

    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("carrier")
    public void setCarrier(PartyIdentificationType carrier) {
        this.carrier = carrier;
    }

    public LogisticDetailsType withCarrier(PartyIdentificationType carrier) {
        this.carrier = carrier;
        return this;
    }

    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("earlyDeliveryTolerance")
    public TimeMeasurementType getEarlyDeliveryTolerance() {
        return earlyDeliveryTolerance;
    }

    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("earlyDeliveryTolerance")
    public void setEarlyDeliveryTolerance(TimeMeasurementType earlyDeliveryTolerance) {
        this.earlyDeliveryTolerance = earlyDeliveryTolerance;
    }

    public LogisticDetailsType withEarlyDeliveryTolerance(TimeMeasurementType earlyDeliveryTolerance) {
        this.earlyDeliveryTolerance = earlyDeliveryTolerance;
        return this;
    }

    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("lateDeliveryTolerance")
    public TimeMeasurementType getLateDeliveryTolerance() {
        return lateDeliveryTolerance;
    }

    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("lateDeliveryTolerance")
    public void setLateDeliveryTolerance(TimeMeasurementType lateDeliveryTolerance) {
        this.lateDeliveryTolerance = lateDeliveryTolerance;
    }

    public LogisticDetailsType withLateDeliveryTolerance(TimeMeasurementType lateDeliveryTolerance) {
        this.lateDeliveryTolerance = lateDeliveryTolerance;
        return this;
    }

    /**
     * AllowDropOffEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("allowDropOffCode")
    public AllowDropOffEnumerationType getAllowDropOffCode() {
        return allowDropOffCode;
    }

    /**
     * AllowDropOffEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("allowDropOffCode")
    public void setAllowDropOffCode(AllowDropOffEnumerationType allowDropOffCode) {
        this.allowDropOffCode = allowDropOffCode;
    }

    public LogisticDetailsType withAllowDropOffCode(AllowDropOffEnumerationType allowDropOffCode) {
        this.allowDropOffCode = allowDropOffCode;
        return this;
    }

    /**
     * AllowPickUpEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("allowPickUpCode")
    public AllowPickUpEnumerationType getAllowPickUpCode() {
        return allowPickUpCode;
    }

    /**
     * AllowPickUpEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("allowPickUpCode")
    public void setAllowPickUpCode(AllowPickUpEnumerationType allowPickUpCode) {
        this.allowPickUpCode = allowPickUpCode;
    }

    public LogisticDetailsType withAllowPickUpCode(AllowPickUpEnumerationType allowPickUpCode) {
        this.allowPickUpCode = allowPickUpCode;
        return this;
    }

    /**
     * Indicates if the Hub can be used as a location to deconsolidate shipments.
     * 
     */
    @JsonProperty("isShipmentDeconsolidationAllowed")
    public Boolean getIsShipmentDeconsolidationAllowed() {
        return isShipmentDeconsolidationAllowed;
    }

    /**
     * Indicates if the Hub can be used as a location to deconsolidate shipments.
     * 
     */
    @JsonProperty("isShipmentDeconsolidationAllowed")
    public void setIsShipmentDeconsolidationAllowed(Boolean isShipmentDeconsolidationAllowed) {
        this.isShipmentDeconsolidationAllowed = isShipmentDeconsolidationAllowed;
    }

    public LogisticDetailsType withIsShipmentDeconsolidationAllowed(Boolean isShipmentDeconsolidationAllowed) {
        this.isShipmentDeconsolidationAllowed = isShipmentDeconsolidationAllowed;
        return this;
    }

    /**
     * Back Order Flag.
     * 
     */
    @JsonProperty("isPartialShipmentAllowed")
    public Boolean getIsPartialShipmentAllowed() {
        return isPartialShipmentAllowed;
    }

    /**
     * Back Order Flag.
     * 
     */
    @JsonProperty("isPartialShipmentAllowed")
    public void setIsPartialShipmentAllowed(Boolean isPartialShipmentAllowed) {
        this.isPartialShipmentAllowed = isPartialShipmentAllowed;
    }

    public LogisticDetailsType withIsPartialShipmentAllowed(Boolean isPartialShipmentAllowed) {
        this.isPartialShipmentAllowed = isPartialShipmentAllowed;
        return this;
    }

    /**
     * Partial Allocation Flag.
     * 
     */
    @JsonProperty("isPartialAllocationAllowed")
    public Boolean getIsPartialAllocationAllowed() {
        return isPartialAllocationAllowed;
    }

    /**
     * Partial Allocation Flag.
     * 
     */
    @JsonProperty("isPartialAllocationAllowed")
    public void setIsPartialAllocationAllowed(Boolean isPartialAllocationAllowed) {
        this.isPartialAllocationAllowed = isPartialAllocationAllowed;
    }

    public LogisticDetailsType withIsPartialAllocationAllowed(Boolean isPartialAllocationAllowed) {
        this.isPartialAllocationAllowed = isPartialAllocationAllowed;
        return this;
    }

    /**
     * Flag to indicate if Carrier can be changed.
     * 
     */
    @JsonProperty("isCarrierChangable")
    public Boolean getIsCarrierChangable() {
        return isCarrierChangable;
    }

    /**
     * Flag to indicate if Carrier can be changed.
     * 
     */
    @JsonProperty("isCarrierChangable")
    public void setIsCarrierChangable(Boolean isCarrierChangable) {
        this.isCarrierChangable = isCarrierChangable;
    }

    public LogisticDetailsType withIsCarrierChangable(Boolean isCarrierChangable) {
        this.isCarrierChangable = isCarrierChangable;
        return this;
    }

    /**
     * Split Case Flag.
     * 
     */
    @JsonProperty("isSplitCaseAllowed")
    public Boolean getIsSplitCaseAllowed() {
        return isSplitCaseAllowed;
    }

    /**
     * Split Case Flag.
     * 
     */
    @JsonProperty("isSplitCaseAllowed")
    public void setIsSplitCaseAllowed(Boolean isSplitCaseAllowed) {
        this.isSplitCaseAllowed = isSplitCaseAllowed;
    }

    public LogisticDetailsType withIsSplitCaseAllowed(Boolean isSplitCaseAllowed) {
        this.isSplitCaseAllowed = isSplitCaseAllowed;
        return this;
    }

    /**
     * Indicates whether to convert or delete the distance override when updating the shipping location's address.
     * 
     */
    @JsonProperty("distanceOverrideCode")
    public String getDistanceOverrideCode() {
        return distanceOverrideCode;
    }

    /**
     * Indicates whether to convert or delete the distance override when updating the shipping location's address.
     * 
     */
    @JsonProperty("distanceOverrideCode")
    public void setDistanceOverrideCode(String distanceOverrideCode) {
        this.distanceOverrideCode = distanceOverrideCode;
    }

    public LogisticDetailsType withDistanceOverrideCode(String distanceOverrideCode) {
        this.distanceOverrideCode = distanceOverrideCode;
        return this;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("storageAreaSize")
    public QuantityType getStorageAreaSize() {
        return storageAreaSize;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("storageAreaSize")
    public void setStorageAreaSize(QuantityType storageAreaSize) {
        this.storageAreaSize = storageAreaSize;
    }

    public LogisticDetailsType withStorageAreaSize(QuantityType storageAreaSize) {
        this.storageAreaSize = storageAreaSize;
        return this;
    }

    /**
     * NoCustomExtensionsType
     * <p>
     * 
     * 
     */
    @JsonProperty("extensions")
    public NoCustomExtensionsType getExtensions() {
        return extensions;
    }

    /**
     * NoCustomExtensionsType
     * <p>
     * 
     * 
     */
    @JsonProperty("extensions")
    public void setExtensions(NoCustomExtensionsType extensions) {
        this.extensions = extensions;
    }

    public LogisticDetailsType withExtensions(NoCustomExtensionsType extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Deprecated, use 'extensions' instead. The placeholder for non-standard data.
     * 
     */
    @JsonProperty("avpList")
    public List<EcomStringAttributeValuePairListType> getAvpList() {
        return avpList;
    }

    /**
     * Deprecated, use 'extensions' instead. The placeholder for non-standard data.
     * 
     */
    @JsonProperty("avpList")
    public void setAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
    }

    public LogisticDetailsType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LogisticDetailsType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maximumShipmentWeight");
        sb.append('=');
        sb.append(((this.maximumShipmentWeight == null)?"<null>":this.maximumShipmentWeight));
        sb.append(',');
        sb.append("maximumShipmentVolume");
        sb.append('=');
        sb.append(((this.maximumShipmentVolume == null)?"<null>":this.maximumShipmentVolume));
        sb.append(',');
        sb.append("carrier");
        sb.append('=');
        sb.append(((this.carrier == null)?"<null>":this.carrier));
        sb.append(',');
        sb.append("earlyDeliveryTolerance");
        sb.append('=');
        sb.append(((this.earlyDeliveryTolerance == null)?"<null>":this.earlyDeliveryTolerance));
        sb.append(',');
        sb.append("lateDeliveryTolerance");
        sb.append('=');
        sb.append(((this.lateDeliveryTolerance == null)?"<null>":this.lateDeliveryTolerance));
        sb.append(',');
        sb.append("allowDropOffCode");
        sb.append('=');
        sb.append(((this.allowDropOffCode == null)?"<null>":this.allowDropOffCode));
        sb.append(',');
        sb.append("allowPickUpCode");
        sb.append('=');
        sb.append(((this.allowPickUpCode == null)?"<null>":this.allowPickUpCode));
        sb.append(',');
        sb.append("isShipmentDeconsolidationAllowed");
        sb.append('=');
        sb.append(((this.isShipmentDeconsolidationAllowed == null)?"<null>":this.isShipmentDeconsolidationAllowed));
        sb.append(',');
        sb.append("isPartialShipmentAllowed");
        sb.append('=');
        sb.append(((this.isPartialShipmentAllowed == null)?"<null>":this.isPartialShipmentAllowed));
        sb.append(',');
        sb.append("isPartialAllocationAllowed");
        sb.append('=');
        sb.append(((this.isPartialAllocationAllowed == null)?"<null>":this.isPartialAllocationAllowed));
        sb.append(',');
        sb.append("isCarrierChangable");
        sb.append('=');
        sb.append(((this.isCarrierChangable == null)?"<null>":this.isCarrierChangable));
        sb.append(',');
        sb.append("isSplitCaseAllowed");
        sb.append('=');
        sb.append(((this.isSplitCaseAllowed == null)?"<null>":this.isSplitCaseAllowed));
        sb.append(',');
        sb.append("distanceOverrideCode");
        sb.append('=');
        sb.append(((this.distanceOverrideCode == null)?"<null>":this.distanceOverrideCode));
        sb.append(',');
        sb.append("storageAreaSize");
        sb.append('=');
        sb.append(((this.storageAreaSize == null)?"<null>":this.storageAreaSize));
        sb.append(',');
        sb.append("extensions");
        sb.append('=');
        sb.append(((this.extensions == null)?"<null>":this.extensions));
        sb.append(',');
        sb.append("avpList");
        sb.append('=');
        sb.append(((this.avpList == null)?"<null>":this.avpList));
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
        result = ((result* 31)+((this.allowDropOffCode == null)? 0 :this.allowDropOffCode.hashCode()));
        result = ((result* 31)+((this.isPartialShipmentAllowed == null)? 0 :this.isPartialShipmentAllowed.hashCode()));
        result = ((result* 31)+((this.allowPickUpCode == null)? 0 :this.allowPickUpCode.hashCode()));
        result = ((result* 31)+((this.isShipmentDeconsolidationAllowed == null)? 0 :this.isShipmentDeconsolidationAllowed.hashCode()));
        result = ((result* 31)+((this.isCarrierChangable == null)? 0 :this.isCarrierChangable.hashCode()));
        result = ((result* 31)+((this.lateDeliveryTolerance == null)? 0 :this.lateDeliveryTolerance.hashCode()));
        result = ((result* 31)+((this.isSplitCaseAllowed == null)? 0 :this.isSplitCaseAllowed.hashCode()));
        result = ((result* 31)+((this.carrier == null)? 0 :this.carrier.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.maximumShipmentVolume == null)? 0 :this.maximumShipmentVolume.hashCode()));
        result = ((result* 31)+((this.storageAreaSize == null)? 0 :this.storageAreaSize.hashCode()));
        result = ((result* 31)+((this.earlyDeliveryTolerance == null)? 0 :this.earlyDeliveryTolerance.hashCode()));
        result = ((result* 31)+((this.distanceOverrideCode == null)? 0 :this.distanceOverrideCode.hashCode()));
        result = ((result* 31)+((this.isPartialAllocationAllowed == null)? 0 :this.isPartialAllocationAllowed.hashCode()));
        result = ((result* 31)+((this.maximumShipmentWeight == null)? 0 :this.maximumShipmentWeight.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LogisticDetailsType) == false) {
            return false;
        }
        LogisticDetailsType rhs = ((LogisticDetailsType) other);
        return (((((((((((((((((this.allowDropOffCode == rhs.allowDropOffCode)||((this.allowDropOffCode!= null)&&this.allowDropOffCode.equals(rhs.allowDropOffCode)))&&((this.isPartialShipmentAllowed == rhs.isPartialShipmentAllowed)||((this.isPartialShipmentAllowed!= null)&&this.isPartialShipmentAllowed.equals(rhs.isPartialShipmentAllowed))))&&((this.allowPickUpCode == rhs.allowPickUpCode)||((this.allowPickUpCode!= null)&&this.allowPickUpCode.equals(rhs.allowPickUpCode))))&&((this.isShipmentDeconsolidationAllowed == rhs.isShipmentDeconsolidationAllowed)||((this.isShipmentDeconsolidationAllowed!= null)&&this.isShipmentDeconsolidationAllowed.equals(rhs.isShipmentDeconsolidationAllowed))))&&((this.isCarrierChangable == rhs.isCarrierChangable)||((this.isCarrierChangable!= null)&&this.isCarrierChangable.equals(rhs.isCarrierChangable))))&&((this.lateDeliveryTolerance == rhs.lateDeliveryTolerance)||((this.lateDeliveryTolerance!= null)&&this.lateDeliveryTolerance.equals(rhs.lateDeliveryTolerance))))&&((this.isSplitCaseAllowed == rhs.isSplitCaseAllowed)||((this.isSplitCaseAllowed!= null)&&this.isSplitCaseAllowed.equals(rhs.isSplitCaseAllowed))))&&((this.carrier == rhs.carrier)||((this.carrier!= null)&&this.carrier.equals(rhs.carrier))))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.maximumShipmentVolume == rhs.maximumShipmentVolume)||((this.maximumShipmentVolume!= null)&&this.maximumShipmentVolume.equals(rhs.maximumShipmentVolume))))&&((this.storageAreaSize == rhs.storageAreaSize)||((this.storageAreaSize!= null)&&this.storageAreaSize.equals(rhs.storageAreaSize))))&&((this.earlyDeliveryTolerance == rhs.earlyDeliveryTolerance)||((this.earlyDeliveryTolerance!= null)&&this.earlyDeliveryTolerance.equals(rhs.earlyDeliveryTolerance))))&&((this.distanceOverrideCode == rhs.distanceOverrideCode)||((this.distanceOverrideCode!= null)&&this.distanceOverrideCode.equals(rhs.distanceOverrideCode))))&&((this.isPartialAllocationAllowed == rhs.isPartialAllocationAllowed)||((this.isPartialAllocationAllowed!= null)&&this.isPartialAllocationAllowed.equals(rhs.isPartialAllocationAllowed))))&&((this.maximumShipmentWeight == rhs.maximumShipmentWeight)||((this.maximumShipmentWeight!= null)&&this.maximumShipmentWeight.equals(rhs.maximumShipmentWeight))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
