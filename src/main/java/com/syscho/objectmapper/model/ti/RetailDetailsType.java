
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RetailDetailsType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "storeFormat",
    "demandChannel",
    "salesAreaSize",
    "buildingAreaSize",
    "demography",
    "categoryCode",
    "competition",
    "remodelDate",
    "deliveryStartDate",
    "driveUpServiceStartDate",
    "parkingCapacity"
})
@Generated("jsonschema2pojo")
public class RetailDetailsType {

    /**
     * Store Format e.g. Convenience, Fuel Station, Traditional.
     * 
     */
    @JsonProperty("storeFormat")
    @JsonPropertyDescription("Store Format e.g. Convenience, Fuel Station, Traditional.")
    private String storeFormat;
    /**
     * Channel for this store e.g. Omni, Traditional.
     * 
     */
    @JsonProperty("demandChannel")
    @JsonPropertyDescription("Channel for this store e.g. Omni, Traditional.")
    private String demandChannel;
    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("salesAreaSize")
    private QuantityType salesAreaSize;
    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("buildingAreaSize")
    private QuantityType buildingAreaSize;
    /**
     * The core demographic for this store e.g. College, Early, Professional, Established, Professional, Retired.
     * 
     */
    @JsonProperty("demography")
    @JsonPropertyDescription("The core demographic for this store e.g. College, Early, Professional, Established, Professional, Retired.")
    private String demography;
    /**
     * Various category flags for this store, e.g. IS_RURAL, IS_FLAGSHIP.
     * 
     */
    @JsonProperty("categoryCode")
    @JsonPropertyDescription("Various category flags for this store, e.g. IS_RURAL, IS_FLAGSHIP.")
    private List<RetailCategoryCode> categoryCode = new ArrayList<RetailCategoryCode>();
    /**
     * Information regarding competitive locations.
     * 
     */
    @JsonProperty("competition")
    @JsonPropertyDescription("Information regarding competitive locations.")
    private List<CompetitionType> competition = new ArrayList<CompetitionType>();
    /**
     * The date when this store was remodelled.
     * 
     */
    @JsonProperty("remodelDate")
    @JsonPropertyDescription("The date when this store was remodelled.")
    private List<String> remodelDate = new ArrayList<String>();
    /**
     * The date when the location started delivering orders to the customer address.
     * 
     */
    @JsonProperty("deliveryStartDate")
    @JsonPropertyDescription("The date when the location started delivering orders to the customer address.")
    private String deliveryStartDate;
    /**
     * The date when the location started drive up service for the customers to pick up the online orders.
     * 
     */
    @JsonProperty("driveUpServiceStartDate")
    @JsonPropertyDescription("The date when the location started drive up service for the customers to pick up the online orders.")
    private String driveUpServiceStartDate;
    /**
     * The capacity of the parking space at location.
     * 
     */
    @JsonProperty("parkingCapacity")
    @JsonPropertyDescription("The capacity of the parking space at location.")
    private Double parkingCapacity;

    /**
     * Store Format e.g. Convenience, Fuel Station, Traditional.
     * 
     */
    @JsonProperty("storeFormat")
    public String getStoreFormat() {
        return storeFormat;
    }

    /**
     * Store Format e.g. Convenience, Fuel Station, Traditional.
     * 
     */
    @JsonProperty("storeFormat")
    public void setStoreFormat(String storeFormat) {
        this.storeFormat = storeFormat;
    }

    public RetailDetailsType withStoreFormat(String storeFormat) {
        this.storeFormat = storeFormat;
        return this;
    }

    /**
     * Channel for this store e.g. Omni, Traditional.
     * 
     */
    @JsonProperty("demandChannel")
    public String getDemandChannel() {
        return demandChannel;
    }

    /**
     * Channel for this store e.g. Omni, Traditional.
     * 
     */
    @JsonProperty("demandChannel")
    public void setDemandChannel(String demandChannel) {
        this.demandChannel = demandChannel;
    }

    public RetailDetailsType withDemandChannel(String demandChannel) {
        this.demandChannel = demandChannel;
        return this;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("salesAreaSize")
    public QuantityType getSalesAreaSize() {
        return salesAreaSize;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("salesAreaSize")
    public void setSalesAreaSize(QuantityType salesAreaSize) {
        this.salesAreaSize = salesAreaSize;
    }

    public RetailDetailsType withSalesAreaSize(QuantityType salesAreaSize) {
        this.salesAreaSize = salesAreaSize;
        return this;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("buildingAreaSize")
    public QuantityType getBuildingAreaSize() {
        return buildingAreaSize;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("buildingAreaSize")
    public void setBuildingAreaSize(QuantityType buildingAreaSize) {
        this.buildingAreaSize = buildingAreaSize;
    }

    public RetailDetailsType withBuildingAreaSize(QuantityType buildingAreaSize) {
        this.buildingAreaSize = buildingAreaSize;
        return this;
    }

    /**
     * The core demographic for this store e.g. College, Early, Professional, Established, Professional, Retired.
     * 
     */
    @JsonProperty("demography")
    public String getDemography() {
        return demography;
    }

    /**
     * The core demographic for this store e.g. College, Early, Professional, Established, Professional, Retired.
     * 
     */
    @JsonProperty("demography")
    public void setDemography(String demography) {
        this.demography = demography;
    }

    public RetailDetailsType withDemography(String demography) {
        this.demography = demography;
        return this;
    }

    /**
     * Various category flags for this store, e.g. IS_RURAL, IS_FLAGSHIP.
     * 
     */
    @JsonProperty("categoryCode")
    public List<RetailCategoryCode> getCategoryCode() {
        return categoryCode;
    }

    /**
     * Various category flags for this store, e.g. IS_RURAL, IS_FLAGSHIP.
     * 
     */
    @JsonProperty("categoryCode")
    public void setCategoryCode(List<RetailCategoryCode> categoryCode) {
        this.categoryCode = categoryCode;
    }

    public RetailDetailsType withCategoryCode(List<RetailCategoryCode> categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    /**
     * Information regarding competitive locations.
     * 
     */
    @JsonProperty("competition")
    public List<CompetitionType> getCompetition() {
        return competition;
    }

    /**
     * Information regarding competitive locations.
     * 
     */
    @JsonProperty("competition")
    public void setCompetition(List<CompetitionType> competition) {
        this.competition = competition;
    }

    public RetailDetailsType withCompetition(List<CompetitionType> competition) {
        this.competition = competition;
        return this;
    }

    /**
     * The date when this store was remodelled.
     * 
     */
    @JsonProperty("remodelDate")
    public List<String> getRemodelDate() {
        return remodelDate;
    }

    /**
     * The date when this store was remodelled.
     * 
     */
    @JsonProperty("remodelDate")
    public void setRemodelDate(List<String> remodelDate) {
        this.remodelDate = remodelDate;
    }

    public RetailDetailsType withRemodelDate(List<String> remodelDate) {
        this.remodelDate = remodelDate;
        return this;
    }

    /**
     * The date when the location started delivering orders to the customer address.
     * 
     */
    @JsonProperty("deliveryStartDate")
    public String getDeliveryStartDate() {
        return deliveryStartDate;
    }

    /**
     * The date when the location started delivering orders to the customer address.
     * 
     */
    @JsonProperty("deliveryStartDate")
    public void setDeliveryStartDate(String deliveryStartDate) {
        this.deliveryStartDate = deliveryStartDate;
    }

    public RetailDetailsType withDeliveryStartDate(String deliveryStartDate) {
        this.deliveryStartDate = deliveryStartDate;
        return this;
    }

    /**
     * The date when the location started drive up service for the customers to pick up the online orders.
     * 
     */
    @JsonProperty("driveUpServiceStartDate")
    public String getDriveUpServiceStartDate() {
        return driveUpServiceStartDate;
    }

    /**
     * The date when the location started drive up service for the customers to pick up the online orders.
     * 
     */
    @JsonProperty("driveUpServiceStartDate")
    public void setDriveUpServiceStartDate(String driveUpServiceStartDate) {
        this.driveUpServiceStartDate = driveUpServiceStartDate;
    }

    public RetailDetailsType withDriveUpServiceStartDate(String driveUpServiceStartDate) {
        this.driveUpServiceStartDate = driveUpServiceStartDate;
        return this;
    }

    /**
     * The capacity of the parking space at location.
     * 
     */
    @JsonProperty("parkingCapacity")
    public Double getParkingCapacity() {
        return parkingCapacity;
    }

    /**
     * The capacity of the parking space at location.
     * 
     */
    @JsonProperty("parkingCapacity")
    public void setParkingCapacity(Double parkingCapacity) {
        this.parkingCapacity = parkingCapacity;
    }

    public RetailDetailsType withParkingCapacity(Double parkingCapacity) {
        this.parkingCapacity = parkingCapacity;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RetailDetailsType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("storeFormat");
        sb.append('=');
        sb.append(((this.storeFormat == null)?"<null>":this.storeFormat));
        sb.append(',');
        sb.append("demandChannel");
        sb.append('=');
        sb.append(((this.demandChannel == null)?"<null>":this.demandChannel));
        sb.append(',');
        sb.append("salesAreaSize");
        sb.append('=');
        sb.append(((this.salesAreaSize == null)?"<null>":this.salesAreaSize));
        sb.append(',');
        sb.append("buildingAreaSize");
        sb.append('=');
        sb.append(((this.buildingAreaSize == null)?"<null>":this.buildingAreaSize));
        sb.append(',');
        sb.append("demography");
        sb.append('=');
        sb.append(((this.demography == null)?"<null>":this.demography));
        sb.append(',');
        sb.append("categoryCode");
        sb.append('=');
        sb.append(((this.categoryCode == null)?"<null>":this.categoryCode));
        sb.append(',');
        sb.append("competition");
        sb.append('=');
        sb.append(((this.competition == null)?"<null>":this.competition));
        sb.append(',');
        sb.append("remodelDate");
        sb.append('=');
        sb.append(((this.remodelDate == null)?"<null>":this.remodelDate));
        sb.append(',');
        sb.append("deliveryStartDate");
        sb.append('=');
        sb.append(((this.deliveryStartDate == null)?"<null>":this.deliveryStartDate));
        sb.append(',');
        sb.append("driveUpServiceStartDate");
        sb.append('=');
        sb.append(((this.driveUpServiceStartDate == null)?"<null>":this.driveUpServiceStartDate));
        sb.append(',');
        sb.append("parkingCapacity");
        sb.append('=');
        sb.append(((this.parkingCapacity == null)?"<null>":this.parkingCapacity));
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
        result = ((result* 31)+((this.demandChannel == null)? 0 :this.demandChannel.hashCode()));
        result = ((result* 31)+((this.salesAreaSize == null)? 0 :this.salesAreaSize.hashCode()));
        result = ((result* 31)+((this.buildingAreaSize == null)? 0 :this.buildingAreaSize.hashCode()));
        result = ((result* 31)+((this.demography == null)? 0 :this.demography.hashCode()));
        result = ((result* 31)+((this.remodelDate == null)? 0 :this.remodelDate.hashCode()));
        result = ((result* 31)+((this.deliveryStartDate == null)? 0 :this.deliveryStartDate.hashCode()));
        result = ((result* 31)+((this.parkingCapacity == null)? 0 :this.parkingCapacity.hashCode()));
        result = ((result* 31)+((this.storeFormat == null)? 0 :this.storeFormat.hashCode()));
        result = ((result* 31)+((this.driveUpServiceStartDate == null)? 0 :this.driveUpServiceStartDate.hashCode()));
        result = ((result* 31)+((this.competition == null)? 0 :this.competition.hashCode()));
        result = ((result* 31)+((this.categoryCode == null)? 0 :this.categoryCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RetailDetailsType) == false) {
            return false;
        }
        RetailDetailsType rhs = ((RetailDetailsType) other);
        return ((((((((((((this.demandChannel == rhs.demandChannel)||((this.demandChannel!= null)&&this.demandChannel.equals(rhs.demandChannel)))&&((this.salesAreaSize == rhs.salesAreaSize)||((this.salesAreaSize!= null)&&this.salesAreaSize.equals(rhs.salesAreaSize))))&&((this.buildingAreaSize == rhs.buildingAreaSize)||((this.buildingAreaSize!= null)&&this.buildingAreaSize.equals(rhs.buildingAreaSize))))&&((this.demography == rhs.demography)||((this.demography!= null)&&this.demography.equals(rhs.demography))))&&((this.remodelDate == rhs.remodelDate)||((this.remodelDate!= null)&&this.remodelDate.equals(rhs.remodelDate))))&&((this.deliveryStartDate == rhs.deliveryStartDate)||((this.deliveryStartDate!= null)&&this.deliveryStartDate.equals(rhs.deliveryStartDate))))&&((this.parkingCapacity == rhs.parkingCapacity)||((this.parkingCapacity!= null)&&this.parkingCapacity.equals(rhs.parkingCapacity))))&&((this.storeFormat == rhs.storeFormat)||((this.storeFormat!= null)&&this.storeFormat.equals(rhs.storeFormat))))&&((this.driveUpServiceStartDate == rhs.driveUpServiceStartDate)||((this.driveUpServiceStartDate!= null)&&this.driveUpServiceStartDate.equals(rhs.driveUpServiceStartDate))))&&((this.competition == rhs.competition)||((this.competition!= null)&&this.competition.equals(rhs.competition))))&&((this.categoryCode == rhs.categoryCode)||((this.categoryCode!= null)&&this.categoryCode.equals(rhs.categoryCode))));
    }

}
