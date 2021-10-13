
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ShipmentInformationType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "commodityTypeCode",
    "shipmentSplitMethod",
    "shipmentPriority",
    "isShipmentLineAllocatable",
    "routeTemplate",
    "isDirectShipment",
    "isUrgentShipment",
    "shipmentConsolidationClass",
    "mitccCode",
    "mitccSequence",
    "bookingMitccCode",
    "incotermsBuyerSellerRelationship",
    "incotermsShippingLocation",
    "incotermsShippingLocationType",
    "isApRatingDeferred",
    "isArRatingDeferred",
    "isShippingOriginProfileRefreshed",
    "isShippingDestinationProfileRefreshed",
    "itemFamilyGroup",
    "profitCenterType",
    "shipmentEntryTypeId",
    "shipmentEntryVersionId",
    "planId",
    "holdShipment",
    "shipmentType",
    "rateId"
})
@Generated("jsonschema2pojo")
public class ShipmentInformationType {

    /**
     * Specifies the type of commodity for transport purposes, according to the user-selected coding scheme.
     * 
     */
    @JsonProperty("commodityTypeCode")
    @JsonPropertyDescription("Specifies the type of commodity for transport purposes, according to the user-selected coding scheme.")
    private List<CodeType> commodityTypeCode = new ArrayList<CodeType>();
    /**
     * ShipmentSplitMethodCode
     * <p>
     * 
     * 
     */
    @JsonProperty("shipmentSplitMethod")
    private ShipmentSplitMethodCode shipmentSplitMethod;
    /**
     * Indicates the priority of the shipment; the lower the number the higher the priority.
     * 
     */
    @JsonProperty("shipmentPriority")
    @JsonPropertyDescription("Indicates the priority of the shipment; the lower the number the higher the priority.")
    private Integer shipmentPriority;
    /**
     * Indicates whether or not a shipment line is allocatable.
     * 
     */
    @JsonProperty("isShipmentLineAllocatable")
    @JsonPropertyDescription("Indicates whether or not a shipment line is allocatable.")
    private Boolean isShipmentLineAllocatable;
    /**
     * This identifies the route template for the order which includes service level, equipment types and stops for the route.
     * 
     */
    @JsonProperty("routeTemplate")
    @JsonPropertyDescription("This identifies the route template for the order which includes service level, equipment types and stops for the route.")
    private String routeTemplate;
    /**
     * This element indicates whether the shipment is to be shipped directly to the customer.
     * 
     */
    @JsonProperty("isDirectShipment")
    @JsonPropertyDescription("This element indicates whether the shipment is to be shipped directly to the customer.")
    private Boolean isDirectShipment;
    /**
     * This element indicates whether the shipment is urgent.
     * 
     */
    @JsonProperty("isUrgentShipment")
    @JsonPropertyDescription("This element indicates whether the shipment is urgent.")
    private Boolean isUrgentShipment;
    /**
     * This is the shipment consolidation class.
     * 
     */
    @JsonProperty("shipmentConsolidationClass")
    @JsonPropertyDescription("This is the shipment consolidation class.")
    private String shipmentConsolidationClass;
    /**
     * This is the load merge in transit consolidation class.
     * 
     */
    @JsonProperty("mitccCode")
    @JsonPropertyDescription("This is the load merge in transit consolidation class.")
    private String mitccCode;
    /**
     * This is the load merge in transit consolidation class sequence number.
     * 
     */
    @JsonProperty("mitccSequence")
    @JsonPropertyDescription("This is the load merge in transit consolidation class sequence number.")
    private Integer mitccSequence;
    /**
     * This is the booking merge in transit consolidation class.
     * 
     */
    @JsonProperty("bookingMitccCode")
    @JsonPropertyDescription("This is the booking merge in transit consolidation class.")
    private String bookingMitccCode;
    /**
     * IncotermsBuyerSellerRelationshipEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("incotermsBuyerSellerRelationship")
    private IncotermsBuyerSellerRelationshipEnumerationType incotermsBuyerSellerRelationship;
    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("incotermsShippingLocation")
    private PartyIdentificationType incotermsShippingLocation;
    /**
     * IncotermsShippingLocationTypeEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("incotermsShippingLocationType")
    private IncotermsShippingLocationTypeEnumerationType incotermsShippingLocationType;
    /**
     * This flag indicates whether the accounts payable rating is deferred.
     * 
     */
    @JsonProperty("isApRatingDeferred")
    @JsonPropertyDescription("This flag indicates whether the accounts payable rating is deferred.")
    private Boolean isApRatingDeferred;
    /**
     * This flag indicates whether the accounts receivable rating is deferred.
     * 
     */
    @JsonProperty("isArRatingDeferred")
    @JsonPropertyDescription("This flag indicates whether the accounts receivable rating is deferred.")
    private Boolean isArRatingDeferred;
    /**
     * This flag indicates whether the origin shipping location profile is refreshed.
     * 
     */
    @JsonProperty("isShippingOriginProfileRefreshed")
    @JsonPropertyDescription("This flag indicates whether the origin shipping location profile is refreshed.")
    private Boolean isShippingOriginProfileRefreshed;
    /**
     * Indicates whether the destination shipping location profile is refreshed.
     * 
     */
    @JsonProperty("isShippingDestinationProfileRefreshed")
    @JsonPropertyDescription("Indicates whether the destination shipping location profile is refreshed.")
    private Boolean isShippingDestinationProfileRefreshed;
    /**
     * This is the item group code.
     * 
     */
    @JsonProperty("itemFamilyGroup")
    @JsonPropertyDescription("This is the item group code.")
    private String itemFamilyGroup;
    /**
     * The profit center type.
     * 
     */
    @JsonProperty("profitCenterType")
    @JsonPropertyDescription("The profit center type.")
    private String profitCenterType;
    /**
     * The shipment entry type ID.
     * 
     */
    @JsonProperty("shipmentEntryTypeId")
    @JsonPropertyDescription("The shipment entry type ID.")
    private String shipmentEntryTypeId;
    /**
     * The shipment entry version ID.
     * 
     */
    @JsonProperty("shipmentEntryVersionId")
    @JsonPropertyDescription("The shipment entry version ID.")
    private String shipmentEntryVersionId;
    /**
     * The plan ID.
     * 
     */
    @JsonProperty("planId")
    @JsonPropertyDescription("The plan ID.")
    private String planId;
    /**
     * Indicates whether the shipment is on hold or is to be placed on hold later.
     * 
     */
    @JsonProperty("holdShipment")
    @JsonPropertyDescription("Indicates whether the shipment is on hold or is to be placed on hold later.")
    private Boolean holdShipment;
    /**
     * The type of shipment.
     * 
     */
    @JsonProperty("shipmentType")
    @JsonPropertyDescription("The type of shipment.")
    private String shipmentType;
    /**
     * The service rate identifier.
     * 
     */
    @JsonProperty("rateId")
    @JsonPropertyDescription("The service rate identifier.")
    private String rateId;

    /**
     * Specifies the type of commodity for transport purposes, according to the user-selected coding scheme.
     * 
     */
    @JsonProperty("commodityTypeCode")
    public List<CodeType> getCommodityTypeCode() {
        return commodityTypeCode;
    }

    /**
     * Specifies the type of commodity for transport purposes, according to the user-selected coding scheme.
     * 
     */
    @JsonProperty("commodityTypeCode")
    public void setCommodityTypeCode(List<CodeType> commodityTypeCode) {
        this.commodityTypeCode = commodityTypeCode;
    }

    public ShipmentInformationType withCommodityTypeCode(List<CodeType> commodityTypeCode) {
        this.commodityTypeCode = commodityTypeCode;
        return this;
    }

    /**
     * ShipmentSplitMethodCode
     * <p>
     * 
     * 
     */
    @JsonProperty("shipmentSplitMethod")
    public ShipmentSplitMethodCode getShipmentSplitMethod() {
        return shipmentSplitMethod;
    }

    /**
     * ShipmentSplitMethodCode
     * <p>
     * 
     * 
     */
    @JsonProperty("shipmentSplitMethod")
    public void setShipmentSplitMethod(ShipmentSplitMethodCode shipmentSplitMethod) {
        this.shipmentSplitMethod = shipmentSplitMethod;
    }

    public ShipmentInformationType withShipmentSplitMethod(ShipmentSplitMethodCode shipmentSplitMethod) {
        this.shipmentSplitMethod = shipmentSplitMethod;
        return this;
    }

    /**
     * Indicates the priority of the shipment; the lower the number the higher the priority.
     * 
     */
    @JsonProperty("shipmentPriority")
    public Integer getShipmentPriority() {
        return shipmentPriority;
    }

    /**
     * Indicates the priority of the shipment; the lower the number the higher the priority.
     * 
     */
    @JsonProperty("shipmentPriority")
    public void setShipmentPriority(Integer shipmentPriority) {
        this.shipmentPriority = shipmentPriority;
    }

    public ShipmentInformationType withShipmentPriority(Integer shipmentPriority) {
        this.shipmentPriority = shipmentPriority;
        return this;
    }

    /**
     * Indicates whether or not a shipment line is allocatable.
     * 
     */
    @JsonProperty("isShipmentLineAllocatable")
    public Boolean getIsShipmentLineAllocatable() {
        return isShipmentLineAllocatable;
    }

    /**
     * Indicates whether or not a shipment line is allocatable.
     * 
     */
    @JsonProperty("isShipmentLineAllocatable")
    public void setIsShipmentLineAllocatable(Boolean isShipmentLineAllocatable) {
        this.isShipmentLineAllocatable = isShipmentLineAllocatable;
    }

    public ShipmentInformationType withIsShipmentLineAllocatable(Boolean isShipmentLineAllocatable) {
        this.isShipmentLineAllocatable = isShipmentLineAllocatable;
        return this;
    }

    /**
     * This identifies the route template for the order which includes service level, equipment types and stops for the route.
     * 
     */
    @JsonProperty("routeTemplate")
    public String getRouteTemplate() {
        return routeTemplate;
    }

    /**
     * This identifies the route template for the order which includes service level, equipment types and stops for the route.
     * 
     */
    @JsonProperty("routeTemplate")
    public void setRouteTemplate(String routeTemplate) {
        this.routeTemplate = routeTemplate;
    }

    public ShipmentInformationType withRouteTemplate(String routeTemplate) {
        this.routeTemplate = routeTemplate;
        return this;
    }

    /**
     * This element indicates whether the shipment is to be shipped directly to the customer.
     * 
     */
    @JsonProperty("isDirectShipment")
    public Boolean getIsDirectShipment() {
        return isDirectShipment;
    }

    /**
     * This element indicates whether the shipment is to be shipped directly to the customer.
     * 
     */
    @JsonProperty("isDirectShipment")
    public void setIsDirectShipment(Boolean isDirectShipment) {
        this.isDirectShipment = isDirectShipment;
    }

    public ShipmentInformationType withIsDirectShipment(Boolean isDirectShipment) {
        this.isDirectShipment = isDirectShipment;
        return this;
    }

    /**
     * This element indicates whether the shipment is urgent.
     * 
     */
    @JsonProperty("isUrgentShipment")
    public Boolean getIsUrgentShipment() {
        return isUrgentShipment;
    }

    /**
     * This element indicates whether the shipment is urgent.
     * 
     */
    @JsonProperty("isUrgentShipment")
    public void setIsUrgentShipment(Boolean isUrgentShipment) {
        this.isUrgentShipment = isUrgentShipment;
    }

    public ShipmentInformationType withIsUrgentShipment(Boolean isUrgentShipment) {
        this.isUrgentShipment = isUrgentShipment;
        return this;
    }

    /**
     * This is the shipment consolidation class.
     * 
     */
    @JsonProperty("shipmentConsolidationClass")
    public String getShipmentConsolidationClass() {
        return shipmentConsolidationClass;
    }

    /**
     * This is the shipment consolidation class.
     * 
     */
    @JsonProperty("shipmentConsolidationClass")
    public void setShipmentConsolidationClass(String shipmentConsolidationClass) {
        this.shipmentConsolidationClass = shipmentConsolidationClass;
    }

    public ShipmentInformationType withShipmentConsolidationClass(String shipmentConsolidationClass) {
        this.shipmentConsolidationClass = shipmentConsolidationClass;
        return this;
    }

    /**
     * This is the load merge in transit consolidation class.
     * 
     */
    @JsonProperty("mitccCode")
    public String getMitccCode() {
        return mitccCode;
    }

    /**
     * This is the load merge in transit consolidation class.
     * 
     */
    @JsonProperty("mitccCode")
    public void setMitccCode(String mitccCode) {
        this.mitccCode = mitccCode;
    }

    public ShipmentInformationType withMitccCode(String mitccCode) {
        this.mitccCode = mitccCode;
        return this;
    }

    /**
     * This is the load merge in transit consolidation class sequence number.
     * 
     */
    @JsonProperty("mitccSequence")
    public Integer getMitccSequence() {
        return mitccSequence;
    }

    /**
     * This is the load merge in transit consolidation class sequence number.
     * 
     */
    @JsonProperty("mitccSequence")
    public void setMitccSequence(Integer mitccSequence) {
        this.mitccSequence = mitccSequence;
    }

    public ShipmentInformationType withMitccSequence(Integer mitccSequence) {
        this.mitccSequence = mitccSequence;
        return this;
    }

    /**
     * This is the booking merge in transit consolidation class.
     * 
     */
    @JsonProperty("bookingMitccCode")
    public String getBookingMitccCode() {
        return bookingMitccCode;
    }

    /**
     * This is the booking merge in transit consolidation class.
     * 
     */
    @JsonProperty("bookingMitccCode")
    public void setBookingMitccCode(String bookingMitccCode) {
        this.bookingMitccCode = bookingMitccCode;
    }

    public ShipmentInformationType withBookingMitccCode(String bookingMitccCode) {
        this.bookingMitccCode = bookingMitccCode;
        return this;
    }

    /**
     * IncotermsBuyerSellerRelationshipEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("incotermsBuyerSellerRelationship")
    public IncotermsBuyerSellerRelationshipEnumerationType getIncotermsBuyerSellerRelationship() {
        return incotermsBuyerSellerRelationship;
    }

    /**
     * IncotermsBuyerSellerRelationshipEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("incotermsBuyerSellerRelationship")
    public void setIncotermsBuyerSellerRelationship(IncotermsBuyerSellerRelationshipEnumerationType incotermsBuyerSellerRelationship) {
        this.incotermsBuyerSellerRelationship = incotermsBuyerSellerRelationship;
    }

    public ShipmentInformationType withIncotermsBuyerSellerRelationship(IncotermsBuyerSellerRelationshipEnumerationType incotermsBuyerSellerRelationship) {
        this.incotermsBuyerSellerRelationship = incotermsBuyerSellerRelationship;
        return this;
    }

    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("incotermsShippingLocation")
    public PartyIdentificationType getIncotermsShippingLocation() {
        return incotermsShippingLocation;
    }

    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("incotermsShippingLocation")
    public void setIncotermsShippingLocation(PartyIdentificationType incotermsShippingLocation) {
        this.incotermsShippingLocation = incotermsShippingLocation;
    }

    public ShipmentInformationType withIncotermsShippingLocation(PartyIdentificationType incotermsShippingLocation) {
        this.incotermsShippingLocation = incotermsShippingLocation;
        return this;
    }

    /**
     * IncotermsShippingLocationTypeEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("incotermsShippingLocationType")
    public IncotermsShippingLocationTypeEnumerationType getIncotermsShippingLocationType() {
        return incotermsShippingLocationType;
    }

    /**
     * IncotermsShippingLocationTypeEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("incotermsShippingLocationType")
    public void setIncotermsShippingLocationType(IncotermsShippingLocationTypeEnumerationType incotermsShippingLocationType) {
        this.incotermsShippingLocationType = incotermsShippingLocationType;
    }

    public ShipmentInformationType withIncotermsShippingLocationType(IncotermsShippingLocationTypeEnumerationType incotermsShippingLocationType) {
        this.incotermsShippingLocationType = incotermsShippingLocationType;
        return this;
    }

    /**
     * This flag indicates whether the accounts payable rating is deferred.
     * 
     */
    @JsonProperty("isApRatingDeferred")
    public Boolean getIsApRatingDeferred() {
        return isApRatingDeferred;
    }

    /**
     * This flag indicates whether the accounts payable rating is deferred.
     * 
     */
    @JsonProperty("isApRatingDeferred")
    public void setIsApRatingDeferred(Boolean isApRatingDeferred) {
        this.isApRatingDeferred = isApRatingDeferred;
    }

    public ShipmentInformationType withIsApRatingDeferred(Boolean isApRatingDeferred) {
        this.isApRatingDeferred = isApRatingDeferred;
        return this;
    }

    /**
     * This flag indicates whether the accounts receivable rating is deferred.
     * 
     */
    @JsonProperty("isArRatingDeferred")
    public Boolean getIsArRatingDeferred() {
        return isArRatingDeferred;
    }

    /**
     * This flag indicates whether the accounts receivable rating is deferred.
     * 
     */
    @JsonProperty("isArRatingDeferred")
    public void setIsArRatingDeferred(Boolean isArRatingDeferred) {
        this.isArRatingDeferred = isArRatingDeferred;
    }

    public ShipmentInformationType withIsArRatingDeferred(Boolean isArRatingDeferred) {
        this.isArRatingDeferred = isArRatingDeferred;
        return this;
    }

    /**
     * This flag indicates whether the origin shipping location profile is refreshed.
     * 
     */
    @JsonProperty("isShippingOriginProfileRefreshed")
    public Boolean getIsShippingOriginProfileRefreshed() {
        return isShippingOriginProfileRefreshed;
    }

    /**
     * This flag indicates whether the origin shipping location profile is refreshed.
     * 
     */
    @JsonProperty("isShippingOriginProfileRefreshed")
    public void setIsShippingOriginProfileRefreshed(Boolean isShippingOriginProfileRefreshed) {
        this.isShippingOriginProfileRefreshed = isShippingOriginProfileRefreshed;
    }

    public ShipmentInformationType withIsShippingOriginProfileRefreshed(Boolean isShippingOriginProfileRefreshed) {
        this.isShippingOriginProfileRefreshed = isShippingOriginProfileRefreshed;
        return this;
    }

    /**
     * Indicates whether the destination shipping location profile is refreshed.
     * 
     */
    @JsonProperty("isShippingDestinationProfileRefreshed")
    public Boolean getIsShippingDestinationProfileRefreshed() {
        return isShippingDestinationProfileRefreshed;
    }

    /**
     * Indicates whether the destination shipping location profile is refreshed.
     * 
     */
    @JsonProperty("isShippingDestinationProfileRefreshed")
    public void setIsShippingDestinationProfileRefreshed(Boolean isShippingDestinationProfileRefreshed) {
        this.isShippingDestinationProfileRefreshed = isShippingDestinationProfileRefreshed;
    }

    public ShipmentInformationType withIsShippingDestinationProfileRefreshed(Boolean isShippingDestinationProfileRefreshed) {
        this.isShippingDestinationProfileRefreshed = isShippingDestinationProfileRefreshed;
        return this;
    }

    /**
     * This is the item group code.
     * 
     */
    @JsonProperty("itemFamilyGroup")
    public String getItemFamilyGroup() {
        return itemFamilyGroup;
    }

    /**
     * This is the item group code.
     * 
     */
    @JsonProperty("itemFamilyGroup")
    public void setItemFamilyGroup(String itemFamilyGroup) {
        this.itemFamilyGroup = itemFamilyGroup;
    }

    public ShipmentInformationType withItemFamilyGroup(String itemFamilyGroup) {
        this.itemFamilyGroup = itemFamilyGroup;
        return this;
    }

    /**
     * The profit center type.
     * 
     */
    @JsonProperty("profitCenterType")
    public String getProfitCenterType() {
        return profitCenterType;
    }

    /**
     * The profit center type.
     * 
     */
    @JsonProperty("profitCenterType")
    public void setProfitCenterType(String profitCenterType) {
        this.profitCenterType = profitCenterType;
    }

    public ShipmentInformationType withProfitCenterType(String profitCenterType) {
        this.profitCenterType = profitCenterType;
        return this;
    }

    /**
     * The shipment entry type ID.
     * 
     */
    @JsonProperty("shipmentEntryTypeId")
    public String getShipmentEntryTypeId() {
        return shipmentEntryTypeId;
    }

    /**
     * The shipment entry type ID.
     * 
     */
    @JsonProperty("shipmentEntryTypeId")
    public void setShipmentEntryTypeId(String shipmentEntryTypeId) {
        this.shipmentEntryTypeId = shipmentEntryTypeId;
    }

    public ShipmentInformationType withShipmentEntryTypeId(String shipmentEntryTypeId) {
        this.shipmentEntryTypeId = shipmentEntryTypeId;
        return this;
    }

    /**
     * The shipment entry version ID.
     * 
     */
    @JsonProperty("shipmentEntryVersionId")
    public String getShipmentEntryVersionId() {
        return shipmentEntryVersionId;
    }

    /**
     * The shipment entry version ID.
     * 
     */
    @JsonProperty("shipmentEntryVersionId")
    public void setShipmentEntryVersionId(String shipmentEntryVersionId) {
        this.shipmentEntryVersionId = shipmentEntryVersionId;
    }

    public ShipmentInformationType withShipmentEntryVersionId(String shipmentEntryVersionId) {
        this.shipmentEntryVersionId = shipmentEntryVersionId;
        return this;
    }

    /**
     * The plan ID.
     * 
     */
    @JsonProperty("planId")
    public String getPlanId() {
        return planId;
    }

    /**
     * The plan ID.
     * 
     */
    @JsonProperty("planId")
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public ShipmentInformationType withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * Indicates whether the shipment is on hold or is to be placed on hold later.
     * 
     */
    @JsonProperty("holdShipment")
    public Boolean getHoldShipment() {
        return holdShipment;
    }

    /**
     * Indicates whether the shipment is on hold or is to be placed on hold later.
     * 
     */
    @JsonProperty("holdShipment")
    public void setHoldShipment(Boolean holdShipment) {
        this.holdShipment = holdShipment;
    }

    public ShipmentInformationType withHoldShipment(Boolean holdShipment) {
        this.holdShipment = holdShipment;
        return this;
    }

    /**
     * The type of shipment.
     * 
     */
    @JsonProperty("shipmentType")
    public String getShipmentType() {
        return shipmentType;
    }

    /**
     * The type of shipment.
     * 
     */
    @JsonProperty("shipmentType")
    public void setShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
    }

    public ShipmentInformationType withShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
        return this;
    }

    /**
     * The service rate identifier.
     * 
     */
    @JsonProperty("rateId")
    public String getRateId() {
        return rateId;
    }

    /**
     * The service rate identifier.
     * 
     */
    @JsonProperty("rateId")
    public void setRateId(String rateId) {
        this.rateId = rateId;
    }

    public ShipmentInformationType withRateId(String rateId) {
        this.rateId = rateId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ShipmentInformationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("commodityTypeCode");
        sb.append('=');
        sb.append(((this.commodityTypeCode == null)?"<null>":this.commodityTypeCode));
        sb.append(',');
        sb.append("shipmentSplitMethod");
        sb.append('=');
        sb.append(((this.shipmentSplitMethod == null)?"<null>":this.shipmentSplitMethod));
        sb.append(',');
        sb.append("shipmentPriority");
        sb.append('=');
        sb.append(((this.shipmentPriority == null)?"<null>":this.shipmentPriority));
        sb.append(',');
        sb.append("isShipmentLineAllocatable");
        sb.append('=');
        sb.append(((this.isShipmentLineAllocatable == null)?"<null>":this.isShipmentLineAllocatable));
        sb.append(',');
        sb.append("routeTemplate");
        sb.append('=');
        sb.append(((this.routeTemplate == null)?"<null>":this.routeTemplate));
        sb.append(',');
        sb.append("isDirectShipment");
        sb.append('=');
        sb.append(((this.isDirectShipment == null)?"<null>":this.isDirectShipment));
        sb.append(',');
        sb.append("isUrgentShipment");
        sb.append('=');
        sb.append(((this.isUrgentShipment == null)?"<null>":this.isUrgentShipment));
        sb.append(',');
        sb.append("shipmentConsolidationClass");
        sb.append('=');
        sb.append(((this.shipmentConsolidationClass == null)?"<null>":this.shipmentConsolidationClass));
        sb.append(',');
        sb.append("mitccCode");
        sb.append('=');
        sb.append(((this.mitccCode == null)?"<null>":this.mitccCode));
        sb.append(',');
        sb.append("mitccSequence");
        sb.append('=');
        sb.append(((this.mitccSequence == null)?"<null>":this.mitccSequence));
        sb.append(',');
        sb.append("bookingMitccCode");
        sb.append('=');
        sb.append(((this.bookingMitccCode == null)?"<null>":this.bookingMitccCode));
        sb.append(',');
        sb.append("incotermsBuyerSellerRelationship");
        sb.append('=');
        sb.append(((this.incotermsBuyerSellerRelationship == null)?"<null>":this.incotermsBuyerSellerRelationship));
        sb.append(',');
        sb.append("incotermsShippingLocation");
        sb.append('=');
        sb.append(((this.incotermsShippingLocation == null)?"<null>":this.incotermsShippingLocation));
        sb.append(',');
        sb.append("incotermsShippingLocationType");
        sb.append('=');
        sb.append(((this.incotermsShippingLocationType == null)?"<null>":this.incotermsShippingLocationType));
        sb.append(',');
        sb.append("isApRatingDeferred");
        sb.append('=');
        sb.append(((this.isApRatingDeferred == null)?"<null>":this.isApRatingDeferred));
        sb.append(',');
        sb.append("isArRatingDeferred");
        sb.append('=');
        sb.append(((this.isArRatingDeferred == null)?"<null>":this.isArRatingDeferred));
        sb.append(',');
        sb.append("isShippingOriginProfileRefreshed");
        sb.append('=');
        sb.append(((this.isShippingOriginProfileRefreshed == null)?"<null>":this.isShippingOriginProfileRefreshed));
        sb.append(',');
        sb.append("isShippingDestinationProfileRefreshed");
        sb.append('=');
        sb.append(((this.isShippingDestinationProfileRefreshed == null)?"<null>":this.isShippingDestinationProfileRefreshed));
        sb.append(',');
        sb.append("itemFamilyGroup");
        sb.append('=');
        sb.append(((this.itemFamilyGroup == null)?"<null>":this.itemFamilyGroup));
        sb.append(',');
        sb.append("profitCenterType");
        sb.append('=');
        sb.append(((this.profitCenterType == null)?"<null>":this.profitCenterType));
        sb.append(',');
        sb.append("shipmentEntryTypeId");
        sb.append('=');
        sb.append(((this.shipmentEntryTypeId == null)?"<null>":this.shipmentEntryTypeId));
        sb.append(',');
        sb.append("shipmentEntryVersionId");
        sb.append('=');
        sb.append(((this.shipmentEntryVersionId == null)?"<null>":this.shipmentEntryVersionId));
        sb.append(',');
        sb.append("planId");
        sb.append('=');
        sb.append(((this.planId == null)?"<null>":this.planId));
        sb.append(',');
        sb.append("holdShipment");
        sb.append('=');
        sb.append(((this.holdShipment == null)?"<null>":this.holdShipment));
        sb.append(',');
        sb.append("shipmentType");
        sb.append('=');
        sb.append(((this.shipmentType == null)?"<null>":this.shipmentType));
        sb.append(',');
        sb.append("rateId");
        sb.append('=');
        sb.append(((this.rateId == null)?"<null>":this.rateId));
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
        result = ((result* 31)+((this.isShippingOriginProfileRefreshed == null)? 0 :this.isShippingOriginProfileRefreshed.hashCode()));
        result = ((result* 31)+((this.shipmentEntryTypeId == null)? 0 :this.shipmentEntryTypeId.hashCode()));
        result = ((result* 31)+((this.isApRatingDeferred == null)? 0 :this.isApRatingDeferred.hashCode()));
        result = ((result* 31)+((this.rateId == null)? 0 :this.rateId.hashCode()));
        result = ((result* 31)+((this.itemFamilyGroup == null)? 0 :this.itemFamilyGroup.hashCode()));
        result = ((result* 31)+((this.shipmentType == null)? 0 :this.shipmentType.hashCode()));
        result = ((result* 31)+((this.mitccCode == null)? 0 :this.mitccCode.hashCode()));
        result = ((result* 31)+((this.shipmentConsolidationClass == null)? 0 :this.shipmentConsolidationClass.hashCode()));
        result = ((result* 31)+((this.shipmentPriority == null)? 0 :this.shipmentPriority.hashCode()));
        result = ((result* 31)+((this.isArRatingDeferred == null)? 0 :this.isArRatingDeferred.hashCode()));
        result = ((result* 31)+((this.planId == null)? 0 :this.planId.hashCode()));
        result = ((result* 31)+((this.incotermsShippingLocation == null)? 0 :this.incotermsShippingLocation.hashCode()));
        result = ((result* 31)+((this.isShippingDestinationProfileRefreshed == null)? 0 :this.isShippingDestinationProfileRefreshed.hashCode()));
        result = ((result* 31)+((this.routeTemplate == null)? 0 :this.routeTemplate.hashCode()));
        result = ((result* 31)+((this.shipmentSplitMethod == null)? 0 :this.shipmentSplitMethod.hashCode()));
        result = ((result* 31)+((this.profitCenterType == null)? 0 :this.profitCenterType.hashCode()));
        result = ((result* 31)+((this.holdShipment == null)? 0 :this.holdShipment.hashCode()));
        result = ((result* 31)+((this.mitccSequence == null)? 0 :this.mitccSequence.hashCode()));
        result = ((result* 31)+((this.shipmentEntryVersionId == null)? 0 :this.shipmentEntryVersionId.hashCode()));
        result = ((result* 31)+((this.incotermsBuyerSellerRelationship == null)? 0 :this.incotermsBuyerSellerRelationship.hashCode()));
        result = ((result* 31)+((this.bookingMitccCode == null)? 0 :this.bookingMitccCode.hashCode()));
        result = ((result* 31)+((this.isDirectShipment == null)? 0 :this.isDirectShipment.hashCode()));
        result = ((result* 31)+((this.incotermsShippingLocationType == null)? 0 :this.incotermsShippingLocationType.hashCode()));
        result = ((result* 31)+((this.commodityTypeCode == null)? 0 :this.commodityTypeCode.hashCode()));
        result = ((result* 31)+((this.isShipmentLineAllocatable == null)? 0 :this.isShipmentLineAllocatable.hashCode()));
        result = ((result* 31)+((this.isUrgentShipment == null)? 0 :this.isUrgentShipment.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShipmentInformationType) == false) {
            return false;
        }
        ShipmentInformationType rhs = ((ShipmentInformationType) other);
        return (((((((((((((((((((((((((((this.isShippingOriginProfileRefreshed == rhs.isShippingOriginProfileRefreshed)||((this.isShippingOriginProfileRefreshed!= null)&&this.isShippingOriginProfileRefreshed.equals(rhs.isShippingOriginProfileRefreshed)))&&((this.shipmentEntryTypeId == rhs.shipmentEntryTypeId)||((this.shipmentEntryTypeId!= null)&&this.shipmentEntryTypeId.equals(rhs.shipmentEntryTypeId))))&&((this.isApRatingDeferred == rhs.isApRatingDeferred)||((this.isApRatingDeferred!= null)&&this.isApRatingDeferred.equals(rhs.isApRatingDeferred))))&&((this.rateId == rhs.rateId)||((this.rateId!= null)&&this.rateId.equals(rhs.rateId))))&&((this.itemFamilyGroup == rhs.itemFamilyGroup)||((this.itemFamilyGroup!= null)&&this.itemFamilyGroup.equals(rhs.itemFamilyGroup))))&&((this.shipmentType == rhs.shipmentType)||((this.shipmentType!= null)&&this.shipmentType.equals(rhs.shipmentType))))&&((this.mitccCode == rhs.mitccCode)||((this.mitccCode!= null)&&this.mitccCode.equals(rhs.mitccCode))))&&((this.shipmentConsolidationClass == rhs.shipmentConsolidationClass)||((this.shipmentConsolidationClass!= null)&&this.shipmentConsolidationClass.equals(rhs.shipmentConsolidationClass))))&&((this.shipmentPriority == rhs.shipmentPriority)||((this.shipmentPriority!= null)&&this.shipmentPriority.equals(rhs.shipmentPriority))))&&((this.isArRatingDeferred == rhs.isArRatingDeferred)||((this.isArRatingDeferred!= null)&&this.isArRatingDeferred.equals(rhs.isArRatingDeferred))))&&((this.planId == rhs.planId)||((this.planId!= null)&&this.planId.equals(rhs.planId))))&&((this.incotermsShippingLocation == rhs.incotermsShippingLocation)||((this.incotermsShippingLocation!= null)&&this.incotermsShippingLocation.equals(rhs.incotermsShippingLocation))))&&((this.isShippingDestinationProfileRefreshed == rhs.isShippingDestinationProfileRefreshed)||((this.isShippingDestinationProfileRefreshed!= null)&&this.isShippingDestinationProfileRefreshed.equals(rhs.isShippingDestinationProfileRefreshed))))&&((this.routeTemplate == rhs.routeTemplate)||((this.routeTemplate!= null)&&this.routeTemplate.equals(rhs.routeTemplate))))&&((this.shipmentSplitMethod == rhs.shipmentSplitMethod)||((this.shipmentSplitMethod!= null)&&this.shipmentSplitMethod.equals(rhs.shipmentSplitMethod))))&&((this.profitCenterType == rhs.profitCenterType)||((this.profitCenterType!= null)&&this.profitCenterType.equals(rhs.profitCenterType))))&&((this.holdShipment == rhs.holdShipment)||((this.holdShipment!= null)&&this.holdShipment.equals(rhs.holdShipment))))&&((this.mitccSequence == rhs.mitccSequence)||((this.mitccSequence!= null)&&this.mitccSequence.equals(rhs.mitccSequence))))&&((this.shipmentEntryVersionId == rhs.shipmentEntryVersionId)||((this.shipmentEntryVersionId!= null)&&this.shipmentEntryVersionId.equals(rhs.shipmentEntryVersionId))))&&((this.incotermsBuyerSellerRelationship == rhs.incotermsBuyerSellerRelationship)||((this.incotermsBuyerSellerRelationship!= null)&&this.incotermsBuyerSellerRelationship.equals(rhs.incotermsBuyerSellerRelationship))))&&((this.bookingMitccCode == rhs.bookingMitccCode)||((this.bookingMitccCode!= null)&&this.bookingMitccCode.equals(rhs.bookingMitccCode))))&&((this.isDirectShipment == rhs.isDirectShipment)||((this.isDirectShipment!= null)&&this.isDirectShipment.equals(rhs.isDirectShipment))))&&((this.incotermsShippingLocationType == rhs.incotermsShippingLocationType)||((this.incotermsShippingLocationType!= null)&&this.incotermsShippingLocationType.equals(rhs.incotermsShippingLocationType))))&&((this.commodityTypeCode == rhs.commodityTypeCode)||((this.commodityTypeCode!= null)&&this.commodityTypeCode.equals(rhs.commodityTypeCode))))&&((this.isShipmentLineAllocatable == rhs.isShipmentLineAllocatable)||((this.isShipmentLineAllocatable!= null)&&this.isShipmentLineAllocatable.equals(rhs.isShipmentLineAllocatable))))&&((this.isUrgentShipment == rhs.isUrgentShipment)||((this.isUrgentShipment!= null)&&this.isUrgentShipment.equals(rhs.isUrgentShipment))));
    }

}
