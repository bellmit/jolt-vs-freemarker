
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CarrierDetailsType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "serviceDetails",
    "insuranceExpiryDate",
    "statusVerificationCode",
    "voucherCurrencyType",
    "costCenter",
    "tenderResponseTime",
    "isNonLiveLoadUnloadAllowed",
    "minimumPickUpTime",
    "extensions",
    "avpList"
})
@Generated("jsonschema2pojo")
public class CarrierDetailsType {

    /**
     * Service Details for Carrier. One Carrier can have multiple serviceDetails. This section can be repetitive.
     * 
     */
    @JsonProperty("serviceDetails")
    @JsonPropertyDescription("Service Details for Carrier. One Carrier can have multiple serviceDetails. This section can be repetitive.")
    private List<ServiceDetails> serviceDetails = new ArrayList<ServiceDetails>();
    /**
     * The date when the carrier's insurance expires.
     * 
     */
    @JsonProperty("insuranceExpiryDate")
    @JsonPropertyDescription("The date when the carrier's insurance expires.")
    private String insuranceExpiryDate;
    /**
     * CarrierStatusCodeEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("statusVerificationCode")
    private CarrierStatusCodeEnumerationType statusVerificationCode;
    /**
     * APVoucherCurrencyEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("voucherCurrencyType")
    private APVoucherCurrencyEnumerationType voucherCurrencyType;
    /**
     * The G/L cost center to be charged when transactions occur between the company and the carrier.
     * 
     */
    @JsonProperty("costCenter")
    @JsonPropertyDescription("The G/L cost center to be charged when transactions occur between the company and the carrier.")
    private String costCenter;
    /**
     * The maximum number of hours the carrier can take to respond to the tender offers.
     * 
     */
    @JsonProperty("tenderResponseTime")
    @JsonPropertyDescription("The maximum number of hours the carrier can take to respond to the tender offers.")
    private Double tenderResponseTime;
    /**
     * Indicates whether non-live loading and unloading is allowed for this carrier.
     * 
     */
    @JsonProperty("isNonLiveLoadUnloadAllowed")
    @JsonPropertyDescription("Indicates whether non-live loading and unloading is allowed for this carrier.")
    private Boolean isNonLiveLoadUnloadAllowed;
    /**
     * The minimum number of hours notice that the carrier needs in order to pick up a shipment or load. May be present for add and change operations.
     * 
     */
    @JsonProperty("minimumPickUpTime")
    @JsonPropertyDescription("The minimum number of hours notice that the carrier needs in order to pick up a shipment or load. May be present for add and change operations.")
    private Double minimumPickUpTime;
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
     * Service Details for Carrier. One Carrier can have multiple serviceDetails. This section can be repetitive.
     * 
     */
    @JsonProperty("serviceDetails")
    public List<ServiceDetails> getServiceDetails() {
        return serviceDetails;
    }

    /**
     * Service Details for Carrier. One Carrier can have multiple serviceDetails. This section can be repetitive.
     * 
     */
    @JsonProperty("serviceDetails")
    public void setServiceDetails(List<ServiceDetails> serviceDetails) {
        this.serviceDetails = serviceDetails;
    }

    public CarrierDetailsType withServiceDetails(List<ServiceDetails> serviceDetails) {
        this.serviceDetails = serviceDetails;
        return this;
    }

    /**
     * The date when the carrier's insurance expires.
     * 
     */
    @JsonProperty("insuranceExpiryDate")
    public String getInsuranceExpiryDate() {
        return insuranceExpiryDate;
    }

    /**
     * The date when the carrier's insurance expires.
     * 
     */
    @JsonProperty("insuranceExpiryDate")
    public void setInsuranceExpiryDate(String insuranceExpiryDate) {
        this.insuranceExpiryDate = insuranceExpiryDate;
    }

    public CarrierDetailsType withInsuranceExpiryDate(String insuranceExpiryDate) {
        this.insuranceExpiryDate = insuranceExpiryDate;
        return this;
    }

    /**
     * CarrierStatusCodeEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("statusVerificationCode")
    public CarrierStatusCodeEnumerationType getStatusVerificationCode() {
        return statusVerificationCode;
    }

    /**
     * CarrierStatusCodeEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("statusVerificationCode")
    public void setStatusVerificationCode(CarrierStatusCodeEnumerationType statusVerificationCode) {
        this.statusVerificationCode = statusVerificationCode;
    }

    public CarrierDetailsType withStatusVerificationCode(CarrierStatusCodeEnumerationType statusVerificationCode) {
        this.statusVerificationCode = statusVerificationCode;
        return this;
    }

    /**
     * APVoucherCurrencyEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("voucherCurrencyType")
    public APVoucherCurrencyEnumerationType getVoucherCurrencyType() {
        return voucherCurrencyType;
    }

    /**
     * APVoucherCurrencyEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("voucherCurrencyType")
    public void setVoucherCurrencyType(APVoucherCurrencyEnumerationType voucherCurrencyType) {
        this.voucherCurrencyType = voucherCurrencyType;
    }

    public CarrierDetailsType withVoucherCurrencyType(APVoucherCurrencyEnumerationType voucherCurrencyType) {
        this.voucherCurrencyType = voucherCurrencyType;
        return this;
    }

    /**
     * The G/L cost center to be charged when transactions occur between the company and the carrier.
     * 
     */
    @JsonProperty("costCenter")
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * The G/L cost center to be charged when transactions occur between the company and the carrier.
     * 
     */
    @JsonProperty("costCenter")
    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public CarrierDetailsType withCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * The maximum number of hours the carrier can take to respond to the tender offers.
     * 
     */
    @JsonProperty("tenderResponseTime")
    public Double getTenderResponseTime() {
        return tenderResponseTime;
    }

    /**
     * The maximum number of hours the carrier can take to respond to the tender offers.
     * 
     */
    @JsonProperty("tenderResponseTime")
    public void setTenderResponseTime(Double tenderResponseTime) {
        this.tenderResponseTime = tenderResponseTime;
    }

    public CarrierDetailsType withTenderResponseTime(Double tenderResponseTime) {
        this.tenderResponseTime = tenderResponseTime;
        return this;
    }

    /**
     * Indicates whether non-live loading and unloading is allowed for this carrier.
     * 
     */
    @JsonProperty("isNonLiveLoadUnloadAllowed")
    public Boolean getIsNonLiveLoadUnloadAllowed() {
        return isNonLiveLoadUnloadAllowed;
    }

    /**
     * Indicates whether non-live loading and unloading is allowed for this carrier.
     * 
     */
    @JsonProperty("isNonLiveLoadUnloadAllowed")
    public void setIsNonLiveLoadUnloadAllowed(Boolean isNonLiveLoadUnloadAllowed) {
        this.isNonLiveLoadUnloadAllowed = isNonLiveLoadUnloadAllowed;
    }

    public CarrierDetailsType withIsNonLiveLoadUnloadAllowed(Boolean isNonLiveLoadUnloadAllowed) {
        this.isNonLiveLoadUnloadAllowed = isNonLiveLoadUnloadAllowed;
        return this;
    }

    /**
     * The minimum number of hours notice that the carrier needs in order to pick up a shipment or load. May be present for add and change operations.
     * 
     */
    @JsonProperty("minimumPickUpTime")
    public Double getMinimumPickUpTime() {
        return minimumPickUpTime;
    }

    /**
     * The minimum number of hours notice that the carrier needs in order to pick up a shipment or load. May be present for add and change operations.
     * 
     */
    @JsonProperty("minimumPickUpTime")
    public void setMinimumPickUpTime(Double minimumPickUpTime) {
        this.minimumPickUpTime = minimumPickUpTime;
    }

    public CarrierDetailsType withMinimumPickUpTime(Double minimumPickUpTime) {
        this.minimumPickUpTime = minimumPickUpTime;
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

    public CarrierDetailsType withExtensions(NoCustomExtensionsType extensions) {
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

    public CarrierDetailsType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CarrierDetailsType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("serviceDetails");
        sb.append('=');
        sb.append(((this.serviceDetails == null)?"<null>":this.serviceDetails));
        sb.append(',');
        sb.append("insuranceExpiryDate");
        sb.append('=');
        sb.append(((this.insuranceExpiryDate == null)?"<null>":this.insuranceExpiryDate));
        sb.append(',');
        sb.append("statusVerificationCode");
        sb.append('=');
        sb.append(((this.statusVerificationCode == null)?"<null>":this.statusVerificationCode));
        sb.append(',');
        sb.append("voucherCurrencyType");
        sb.append('=');
        sb.append(((this.voucherCurrencyType == null)?"<null>":this.voucherCurrencyType));
        sb.append(',');
        sb.append("costCenter");
        sb.append('=');
        sb.append(((this.costCenter == null)?"<null>":this.costCenter));
        sb.append(',');
        sb.append("tenderResponseTime");
        sb.append('=');
        sb.append(((this.tenderResponseTime == null)?"<null>":this.tenderResponseTime));
        sb.append(',');
        sb.append("isNonLiveLoadUnloadAllowed");
        sb.append('=');
        sb.append(((this.isNonLiveLoadUnloadAllowed == null)?"<null>":this.isNonLiveLoadUnloadAllowed));
        sb.append(',');
        sb.append("minimumPickUpTime");
        sb.append('=');
        sb.append(((this.minimumPickUpTime == null)?"<null>":this.minimumPickUpTime));
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
        result = ((result* 31)+((this.voucherCurrencyType == null)? 0 :this.voucherCurrencyType.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.minimumPickUpTime == null)? 0 :this.minimumPickUpTime.hashCode()));
        result = ((result* 31)+((this.statusVerificationCode == null)? 0 :this.statusVerificationCode.hashCode()));
        result = ((result* 31)+((this.costCenter == null)? 0 :this.costCenter.hashCode()));
        result = ((result* 31)+((this.serviceDetails == null)? 0 :this.serviceDetails.hashCode()));
        result = ((result* 31)+((this.isNonLiveLoadUnloadAllowed == null)? 0 :this.isNonLiveLoadUnloadAllowed.hashCode()));
        result = ((result* 31)+((this.insuranceExpiryDate == null)? 0 :this.insuranceExpiryDate.hashCode()));
        result = ((result* 31)+((this.tenderResponseTime == null)? 0 :this.tenderResponseTime.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CarrierDetailsType) == false) {
            return false;
        }
        CarrierDetailsType rhs = ((CarrierDetailsType) other);
        return (((((((((((this.voucherCurrencyType == rhs.voucherCurrencyType)||((this.voucherCurrencyType!= null)&&this.voucherCurrencyType.equals(rhs.voucherCurrencyType)))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.minimumPickUpTime == rhs.minimumPickUpTime)||((this.minimumPickUpTime!= null)&&this.minimumPickUpTime.equals(rhs.minimumPickUpTime))))&&((this.statusVerificationCode == rhs.statusVerificationCode)||((this.statusVerificationCode!= null)&&this.statusVerificationCode.equals(rhs.statusVerificationCode))))&&((this.costCenter == rhs.costCenter)||((this.costCenter!= null)&&this.costCenter.equals(rhs.costCenter))))&&((this.serviceDetails == rhs.serviceDetails)||((this.serviceDetails!= null)&&this.serviceDetails.equals(rhs.serviceDetails))))&&((this.isNonLiveLoadUnloadAllowed == rhs.isNonLiveLoadUnloadAllowed)||((this.isNonLiveLoadUnloadAllowed!= null)&&this.isNonLiveLoadUnloadAllowed.equals(rhs.isNonLiveLoadUnloadAllowed))))&&((this.insuranceExpiryDate == rhs.insuranceExpiryDate)||((this.insuranceExpiryDate!= null)&&this.insuranceExpiryDate.equals(rhs.insuranceExpiryDate))))&&((this.tenderResponseTime == rhs.tenderResponseTime)||((this.tenderResponseTime!= null)&&this.tenderResponseTime.equals(rhs.tenderResponseTime))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
