
package com.syscho.objectmapper.model.ti;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PlanningDetailsType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "calendarId",
    "shippingCalendarId",
    "arrivalCalendarId",
    "borrowingPercentage",
    "beginFreezeDate",
    "lastOnHandPostDate",
    "weatherArea",
    "isInventoryProjectionRequired",
    "extensions",
    "avpList"
})
@Generated("jsonschema2pojo")
public class PlanningDetailsType {

    /**
     * Working Calendar Identifier.
     * 
     */
    @JsonProperty("calendarId")
    @JsonPropertyDescription("Working Calendar Identifier.")
    private String calendarId;
    /**
     * The defined working periods that govern shipping activity at this location.
     * 
     */
    @JsonProperty("shippingCalendarId")
    @JsonPropertyDescription("The defined working periods that govern shipping activity at this location.")
    private String shippingCalendarId;
    /**
     * The defined working periods that govern arrivals at this location.
     * 
     */
    @JsonProperty("arrivalCalendarId")
    @JsonPropertyDescription("The defined working periods that govern arrivals at this location.")
    private String arrivalCalendarId;
    /**
     * Represents the rate that would be paid if money were borrowed to purchase additional inventory.  90 percent should be put as 90.
     * 
     */
    @JsonProperty("borrowingPercentage")
    @JsonPropertyDescription("Represents the rate that would be paid if money were borrowed to purchase additional inventory.  90 percent should be put as 90.")
    private Double borrowingPercentage;
    /**
     * "The beginning date of the freeze period. Valid values include any value less than or equal to Loc:OHPost.ESP(DT) and FulfillmentMaster Planning, Fulfillment/Production, and Fulfillment/Distribution use this value as the beginning date for the freeze period whose duration is specified in SKUPlanningParam:MfgFrzDur or SKUPlanningParam:DRPFrzDur. If FrzStart is blank, the system uses the value in Loc:OHPost instead. If that is also blank, the system uses SKU:OHPost if it has a value. If not, it uses the current system date.For ESP(DT), the freeze period starts at the planning period start date."
     * 
     */
    @JsonProperty("beginFreezeDate")
    @JsonPropertyDescription("\"The beginning date of the freeze period. Valid values include any value less than or equal to Loc:OHPost.ESP(DT) and FulfillmentMaster Planning, Fulfillment/Production, and Fulfillment/Distribution use this value as the beginning date for the freeze period whose duration is specified in SKUPlanningParam:MfgFrzDur or SKUPlanningParam:DRPFrzDur. If FrzStart is blank, the system uses the value in Loc:OHPost instead. If that is also blank, the system uses SKU:OHPost if it has a value. If not, it uses the current system date.For ESP(DT), the freeze period starts at the planning period start date.\"")
    private OffsetDateTime beginFreezeDate;
    /**
     * The last time current on hand was posted for this location.
     * 
     */
    @JsonProperty("lastOnHandPostDate")
    @JsonPropertyDescription("The last time current on hand was posted for this location.")
    private OffsetDateTime lastOnHandPostDate;
    /**
     * A unique identifier of an area which is impacted by weather.
     * 
     */
    @JsonProperty("weatherArea")
    @JsonPropertyDescription("A unique identifier of an area which is impacted by weather.")
    private String weatherArea;
    /**
     * Determines whether inventory projection calculations should be performed for this location.
     * 
     */
    @JsonProperty("isInventoryProjectionRequired")
    @JsonPropertyDescription("Determines whether inventory projection calculations should be performed for this location.")
    private Boolean isInventoryProjectionRequired;
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
     * Working Calendar Identifier.
     * 
     */
    @JsonProperty("calendarId")
    public String getCalendarId() {
        return calendarId;
    }

    /**
     * Working Calendar Identifier.
     * 
     */
    @JsonProperty("calendarId")
    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public PlanningDetailsType withCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }

    /**
     * The defined working periods that govern shipping activity at this location.
     * 
     */
    @JsonProperty("shippingCalendarId")
    public String getShippingCalendarId() {
        return shippingCalendarId;
    }

    /**
     * The defined working periods that govern shipping activity at this location.
     * 
     */
    @JsonProperty("shippingCalendarId")
    public void setShippingCalendarId(String shippingCalendarId) {
        this.shippingCalendarId = shippingCalendarId;
    }

    public PlanningDetailsType withShippingCalendarId(String shippingCalendarId) {
        this.shippingCalendarId = shippingCalendarId;
        return this;
    }

    /**
     * The defined working periods that govern arrivals at this location.
     * 
     */
    @JsonProperty("arrivalCalendarId")
    public String getArrivalCalendarId() {
        return arrivalCalendarId;
    }

    /**
     * The defined working periods that govern arrivals at this location.
     * 
     */
    @JsonProperty("arrivalCalendarId")
    public void setArrivalCalendarId(String arrivalCalendarId) {
        this.arrivalCalendarId = arrivalCalendarId;
    }

    public PlanningDetailsType withArrivalCalendarId(String arrivalCalendarId) {
        this.arrivalCalendarId = arrivalCalendarId;
        return this;
    }

    /**
     * Represents the rate that would be paid if money were borrowed to purchase additional inventory.  90 percent should be put as 90.
     * 
     */
    @JsonProperty("borrowingPercentage")
    public Double getBorrowingPercentage() {
        return borrowingPercentage;
    }

    /**
     * Represents the rate that would be paid if money were borrowed to purchase additional inventory.  90 percent should be put as 90.
     * 
     */
    @JsonProperty("borrowingPercentage")
    public void setBorrowingPercentage(Double borrowingPercentage) {
        this.borrowingPercentage = borrowingPercentage;
    }

    public PlanningDetailsType withBorrowingPercentage(Double borrowingPercentage) {
        this.borrowingPercentage = borrowingPercentage;
        return this;
    }

    /**
     * "The beginning date of the freeze period. Valid values include any value less than or equal to Loc:OHPost.ESP(DT) and FulfillmentMaster Planning, Fulfillment/Production, and Fulfillment/Distribution use this value as the beginning date for the freeze period whose duration is specified in SKUPlanningParam:MfgFrzDur or SKUPlanningParam:DRPFrzDur. If FrzStart is blank, the system uses the value in Loc:OHPost instead. If that is also blank, the system uses SKU:OHPost if it has a value. If not, it uses the current system date.For ESP(DT), the freeze period starts at the planning period start date."
     * 
     */
    @JsonProperty("beginFreezeDate")
    public OffsetDateTime getBeginFreezeDate() {
        return beginFreezeDate;
    }

    /**
     * "The beginning date of the freeze period. Valid values include any value less than or equal to Loc:OHPost.ESP(DT) and FulfillmentMaster Planning, Fulfillment/Production, and Fulfillment/Distribution use this value as the beginning date for the freeze period whose duration is specified in SKUPlanningParam:MfgFrzDur or SKUPlanningParam:DRPFrzDur. If FrzStart is blank, the system uses the value in Loc:OHPost instead. If that is also blank, the system uses SKU:OHPost if it has a value. If not, it uses the current system date.For ESP(DT), the freeze period starts at the planning period start date."
     * 
     */
    @JsonProperty("beginFreezeDate")
    public void setBeginFreezeDate(OffsetDateTime beginFreezeDate) {
        this.beginFreezeDate = beginFreezeDate;
    }

    public PlanningDetailsType withBeginFreezeDate(OffsetDateTime beginFreezeDate) {
        this.beginFreezeDate = beginFreezeDate;
        return this;
    }

    /**
     * The last time current on hand was posted for this location.
     * 
     */
    @JsonProperty("lastOnHandPostDate")
    public OffsetDateTime getLastOnHandPostDate() {
        return lastOnHandPostDate;
    }

    /**
     * The last time current on hand was posted for this location.
     * 
     */
    @JsonProperty("lastOnHandPostDate")
    public void setLastOnHandPostDate(OffsetDateTime lastOnHandPostDate) {
        this.lastOnHandPostDate = lastOnHandPostDate;
    }

    public PlanningDetailsType withLastOnHandPostDate(OffsetDateTime lastOnHandPostDate) {
        this.lastOnHandPostDate = lastOnHandPostDate;
        return this;
    }

    /**
     * A unique identifier of an area which is impacted by weather.
     * 
     */
    @JsonProperty("weatherArea")
    public String getWeatherArea() {
        return weatherArea;
    }

    /**
     * A unique identifier of an area which is impacted by weather.
     * 
     */
    @JsonProperty("weatherArea")
    public void setWeatherArea(String weatherArea) {
        this.weatherArea = weatherArea;
    }

    public PlanningDetailsType withWeatherArea(String weatherArea) {
        this.weatherArea = weatherArea;
        return this;
    }

    /**
     * Determines whether inventory projection calculations should be performed for this location.
     * 
     */
    @JsonProperty("isInventoryProjectionRequired")
    public Boolean getIsInventoryProjectionRequired() {
        return isInventoryProjectionRequired;
    }

    /**
     * Determines whether inventory projection calculations should be performed for this location.
     * 
     */
    @JsonProperty("isInventoryProjectionRequired")
    public void setIsInventoryProjectionRequired(Boolean isInventoryProjectionRequired) {
        this.isInventoryProjectionRequired = isInventoryProjectionRequired;
    }

    public PlanningDetailsType withIsInventoryProjectionRequired(Boolean isInventoryProjectionRequired) {
        this.isInventoryProjectionRequired = isInventoryProjectionRequired;
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

    public PlanningDetailsType withExtensions(NoCustomExtensionsType extensions) {
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

    public PlanningDetailsType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PlanningDetailsType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("calendarId");
        sb.append('=');
        sb.append(((this.calendarId == null)?"<null>":this.calendarId));
        sb.append(',');
        sb.append("shippingCalendarId");
        sb.append('=');
        sb.append(((this.shippingCalendarId == null)?"<null>":this.shippingCalendarId));
        sb.append(',');
        sb.append("arrivalCalendarId");
        sb.append('=');
        sb.append(((this.arrivalCalendarId == null)?"<null>":this.arrivalCalendarId));
        sb.append(',');
        sb.append("borrowingPercentage");
        sb.append('=');
        sb.append(((this.borrowingPercentage == null)?"<null>":this.borrowingPercentage));
        sb.append(',');
        sb.append("beginFreezeDate");
        sb.append('=');
        sb.append(((this.beginFreezeDate == null)?"<null>":this.beginFreezeDate));
        sb.append(',');
        sb.append("lastOnHandPostDate");
        sb.append('=');
        sb.append(((this.lastOnHandPostDate == null)?"<null>":this.lastOnHandPostDate));
        sb.append(',');
        sb.append("weatherArea");
        sb.append('=');
        sb.append(((this.weatherArea == null)?"<null>":this.weatherArea));
        sb.append(',');
        sb.append("isInventoryProjectionRequired");
        sb.append('=');
        sb.append(((this.isInventoryProjectionRequired == null)?"<null>":this.isInventoryProjectionRequired));
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
        result = ((result* 31)+((this.borrowingPercentage == null)? 0 :this.borrowingPercentage.hashCode()));
        result = ((result* 31)+((this.lastOnHandPostDate == null)? 0 :this.lastOnHandPostDate.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.calendarId == null)? 0 :this.calendarId.hashCode()));
        result = ((result* 31)+((this.weatherArea == null)? 0 :this.weatherArea.hashCode()));
        result = ((result* 31)+((this.isInventoryProjectionRequired == null)? 0 :this.isInventoryProjectionRequired.hashCode()));
        result = ((result* 31)+((this.shippingCalendarId == null)? 0 :this.shippingCalendarId.hashCode()));
        result = ((result* 31)+((this.arrivalCalendarId == null)? 0 :this.arrivalCalendarId.hashCode()));
        result = ((result* 31)+((this.beginFreezeDate == null)? 0 :this.beginFreezeDate.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PlanningDetailsType) == false) {
            return false;
        }
        PlanningDetailsType rhs = ((PlanningDetailsType) other);
        return (((((((((((this.borrowingPercentage == rhs.borrowingPercentage)||((this.borrowingPercentage!= null)&&this.borrowingPercentage.equals(rhs.borrowingPercentage)))&&((this.lastOnHandPostDate == rhs.lastOnHandPostDate)||((this.lastOnHandPostDate!= null)&&this.lastOnHandPostDate.equals(rhs.lastOnHandPostDate))))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.calendarId == rhs.calendarId)||((this.calendarId!= null)&&this.calendarId.equals(rhs.calendarId))))&&((this.weatherArea == rhs.weatherArea)||((this.weatherArea!= null)&&this.weatherArea.equals(rhs.weatherArea))))&&((this.isInventoryProjectionRequired == rhs.isInventoryProjectionRequired)||((this.isInventoryProjectionRequired!= null)&&this.isInventoryProjectionRequired.equals(rhs.isInventoryProjectionRequired))))&&((this.shippingCalendarId == rhs.shippingCalendarId)||((this.shippingCalendarId!= null)&&this.shippingCalendarId.equals(rhs.shippingCalendarId))))&&((this.arrivalCalendarId == rhs.arrivalCalendarId)||((this.arrivalCalendarId!= null)&&this.arrivalCalendarId.equals(rhs.arrivalCalendarId))))&&((this.beginFreezeDate == rhs.beginFreezeDate)||((this.beginFreezeDate!= null)&&this.beginFreezeDate.equals(rhs.beginFreezeDate))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
