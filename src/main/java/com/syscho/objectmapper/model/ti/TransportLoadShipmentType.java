
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TransportLoadShipmentType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "primaryId",
    "additionalShipmentId",
    "actionCode",
    "parentShipmentID",
    "receiver",
    "shipper",
    "shipTo",
    "shipFrom",
    "logisticServiceRequirementCode",
    "transportServiceCategoryType",
    "transportCargoCharacteristics",
    "plannedDelivery",
    "plannedDespatch",
    "transportReference",
    "tmReferenceNumber",
    "commodityTypeCode",
    "shipmentLegId",
    "isMultiLegShipment",
    "isCrossDockLeg",
    "shipmentItem",
    "extensions",
    "avpList"
})
@Generated("jsonschema2pojo")
public class TransportLoadShipmentType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primaryId")
    private String primaryId;
    /**
     * Additional identification key used to identify a shipment.
     * 
     */
    @JsonProperty("additionalShipmentId")
    @JsonPropertyDescription("Additional identification key used to identify a shipment.")
    private List<AdditionalShipmentIdentificationType> additionalShipmentId = new ArrayList<AdditionalShipmentIdentificationType>();
    /**
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("actionCode")
    private SegmentActionEnumerationType actionCode;
    /**
     * ShipmentIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("parentShipmentID")
    private ShipmentIdentificationType parentShipmentID;
    /**
     * TransactionalPartyType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("receiver")
    private TransactionalPartyType receiver;
    /**
     * TransactionalPartyType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("shipper")
    private TransactionalPartyType shipper;
    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipTo")
    private TransactionalPartyType shipTo;
    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipFrom")
    private TransactionalPartyType shipFrom;
    /**
     * LogisticServiceRequirementCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("logisticServiceRequirementCode")
    private LogisticServiceRequirementCode logisticServiceRequirementCode;
    /**
     * TransportServiceCategoryCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportServiceCategoryType")
    private TransportServiceCategoryCode transportServiceCategoryType;
    /**
     * TransportCargoCharacteristicsType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportCargoCharacteristics")
    private TransportCargoCharacteristicsType transportCargoCharacteristics;
    /**
     * LogisticEventType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("plannedDelivery")
    private LogisticEventType plannedDelivery;
    /**
     * LogisticEventType
     * <p>
     * 
     * 
     */
    @JsonProperty("plannedDespatch")
    private LogisticEventType plannedDespatch;
    /**
     * Reference to associated information in support of related business processes. E.g. a purchase order, a bank account number.
     * 
     */
    @JsonProperty("transportReference")
    @JsonPropertyDescription("Reference to associated information in support of related business processes. E.g. a purchase order, a bank account number.")
    private List<TransportLoadTransportReferenceType> transportReference = new ArrayList<TransportLoadTransportReferenceType>();
    /**
     * Used to hold TM reference fields.
     * 
     */
    @JsonProperty("tmReferenceNumber")
    @JsonPropertyDescription("Used to hold TM reference fields.")
    private List<TransportManagementReferenceNumberType> tmReferenceNumber = new ArrayList<TransportManagementReferenceNumberType>();
    /**
     * Code of material or product that is traded as defined in transportation manager.
     * 
     */
    @JsonProperty("commodityTypeCode")
    @JsonPropertyDescription("Code of material or product that is traded as defined in transportation manager.")
    private List<CodeType> commodityTypeCode = new ArrayList<CodeType>();
    /**
     * Shipment leg identifier.
     * 
     */
    @JsonProperty("shipmentLegId")
    @JsonPropertyDescription("Shipment leg identifier.")
    private String shipmentLegId;
    /**
     * Boolean value for multi leg shipment. Whenever number of shipment legs is >1 Shipment value is TRUE else it is FALSE.
     * 
     */
    @JsonProperty("isMultiLegShipment")
    @JsonPropertyDescription("Boolean value for multi leg shipment. Whenever number of shipment legs is >1 Shipment value is TRUE else it is FALSE.")
    private Boolean isMultiLegShipment;
    /**
     * Boolean value for Cross Dock leg. Is the leg cross docked in the respective warehouse.
     * 
     */
    @JsonProperty("isCrossDockLeg")
    @JsonPropertyDescription("Boolean value for Cross Dock leg. Is the leg cross docked in the respective warehouse.")
    private Boolean isCrossDockLeg;
    /**
     * Information about shipment Items.
     * 
     */
    @JsonProperty("shipmentItem")
    @JsonPropertyDescription("Information about shipment Items.")
    private List<TransportLoadShipmentItemType> shipmentItem = new ArrayList<TransportLoadShipmentItemType>();
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

    public TransportLoadShipmentType withPrimaryId(String primaryId) {
        this.primaryId = primaryId;
        return this;
    }

    /**
     * Additional identification key used to identify a shipment.
     * 
     */
    @JsonProperty("additionalShipmentId")
    public List<AdditionalShipmentIdentificationType> getAdditionalShipmentId() {
        return additionalShipmentId;
    }

    /**
     * Additional identification key used to identify a shipment.
     * 
     */
    @JsonProperty("additionalShipmentId")
    public void setAdditionalShipmentId(List<AdditionalShipmentIdentificationType> additionalShipmentId) {
        this.additionalShipmentId = additionalShipmentId;
    }

    public TransportLoadShipmentType withAdditionalShipmentId(List<AdditionalShipmentIdentificationType> additionalShipmentId) {
        this.additionalShipmentId = additionalShipmentId;
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

    public TransportLoadShipmentType withActionCode(SegmentActionEnumerationType actionCode) {
        this.actionCode = actionCode;
        return this;
    }

    /**
     * ShipmentIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("parentShipmentID")
    public ShipmentIdentificationType getParentShipmentID() {
        return parentShipmentID;
    }

    /**
     * ShipmentIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("parentShipmentID")
    public void setParentShipmentID(ShipmentIdentificationType parentShipmentID) {
        this.parentShipmentID = parentShipmentID;
    }

    public TransportLoadShipmentType withParentShipmentID(ShipmentIdentificationType parentShipmentID) {
        this.parentShipmentID = parentShipmentID;
        return this;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("receiver")
    public TransactionalPartyType getReceiver() {
        return receiver;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("receiver")
    public void setReceiver(TransactionalPartyType receiver) {
        this.receiver = receiver;
    }

    public TransportLoadShipmentType withReceiver(TransactionalPartyType receiver) {
        this.receiver = receiver;
        return this;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("shipper")
    public TransactionalPartyType getShipper() {
        return shipper;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("shipper")
    public void setShipper(TransactionalPartyType shipper) {
        this.shipper = shipper;
    }

    public TransportLoadShipmentType withShipper(TransactionalPartyType shipper) {
        this.shipper = shipper;
        return this;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipTo")
    public TransactionalPartyType getShipTo() {
        return shipTo;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipTo")
    public void setShipTo(TransactionalPartyType shipTo) {
        this.shipTo = shipTo;
    }

    public TransportLoadShipmentType withShipTo(TransactionalPartyType shipTo) {
        this.shipTo = shipTo;
        return this;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipFrom")
    public TransactionalPartyType getShipFrom() {
        return shipFrom;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipFrom")
    public void setShipFrom(TransactionalPartyType shipFrom) {
        this.shipFrom = shipFrom;
    }

    public TransportLoadShipmentType withShipFrom(TransactionalPartyType shipFrom) {
        this.shipFrom = shipFrom;
        return this;
    }

    /**
     * LogisticServiceRequirementCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("logisticServiceRequirementCode")
    public LogisticServiceRequirementCode getLogisticServiceRequirementCode() {
        return logisticServiceRequirementCode;
    }

    /**
     * LogisticServiceRequirementCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("logisticServiceRequirementCode")
    public void setLogisticServiceRequirementCode(LogisticServiceRequirementCode logisticServiceRequirementCode) {
        this.logisticServiceRequirementCode = logisticServiceRequirementCode;
    }

    public TransportLoadShipmentType withLogisticServiceRequirementCode(LogisticServiceRequirementCode logisticServiceRequirementCode) {
        this.logisticServiceRequirementCode = logisticServiceRequirementCode;
        return this;
    }

    /**
     * TransportServiceCategoryCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportServiceCategoryType")
    public TransportServiceCategoryCode getTransportServiceCategoryType() {
        return transportServiceCategoryType;
    }

    /**
     * TransportServiceCategoryCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportServiceCategoryType")
    public void setTransportServiceCategoryType(TransportServiceCategoryCode transportServiceCategoryType) {
        this.transportServiceCategoryType = transportServiceCategoryType;
    }

    public TransportLoadShipmentType withTransportServiceCategoryType(TransportServiceCategoryCode transportServiceCategoryType) {
        this.transportServiceCategoryType = transportServiceCategoryType;
        return this;
    }

    /**
     * TransportCargoCharacteristicsType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportCargoCharacteristics")
    public TransportCargoCharacteristicsType getTransportCargoCharacteristics() {
        return transportCargoCharacteristics;
    }

    /**
     * TransportCargoCharacteristicsType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportCargoCharacteristics")
    public void setTransportCargoCharacteristics(TransportCargoCharacteristicsType transportCargoCharacteristics) {
        this.transportCargoCharacteristics = transportCargoCharacteristics;
    }

    public TransportLoadShipmentType withTransportCargoCharacteristics(TransportCargoCharacteristicsType transportCargoCharacteristics) {
        this.transportCargoCharacteristics = transportCargoCharacteristics;
        return this;
    }

    /**
     * LogisticEventType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("plannedDelivery")
    public LogisticEventType getPlannedDelivery() {
        return plannedDelivery;
    }

    /**
     * LogisticEventType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("plannedDelivery")
    public void setPlannedDelivery(LogisticEventType plannedDelivery) {
        this.plannedDelivery = plannedDelivery;
    }

    public TransportLoadShipmentType withPlannedDelivery(LogisticEventType plannedDelivery) {
        this.plannedDelivery = plannedDelivery;
        return this;
    }

    /**
     * LogisticEventType
     * <p>
     * 
     * 
     */
    @JsonProperty("plannedDespatch")
    public LogisticEventType getPlannedDespatch() {
        return plannedDespatch;
    }

    /**
     * LogisticEventType
     * <p>
     * 
     * 
     */
    @JsonProperty("plannedDespatch")
    public void setPlannedDespatch(LogisticEventType plannedDespatch) {
        this.plannedDespatch = plannedDespatch;
    }

    public TransportLoadShipmentType withPlannedDespatch(LogisticEventType plannedDespatch) {
        this.plannedDespatch = plannedDespatch;
        return this;
    }

    /**
     * Reference to associated information in support of related business processes. E.g. a purchase order, a bank account number.
     * 
     */
    @JsonProperty("transportReference")
    public List<TransportLoadTransportReferenceType> getTransportReference() {
        return transportReference;
    }

    /**
     * Reference to associated information in support of related business processes. E.g. a purchase order, a bank account number.
     * 
     */
    @JsonProperty("transportReference")
    public void setTransportReference(List<TransportLoadTransportReferenceType> transportReference) {
        this.transportReference = transportReference;
    }

    public TransportLoadShipmentType withTransportReference(List<TransportLoadTransportReferenceType> transportReference) {
        this.transportReference = transportReference;
        return this;
    }

    /**
     * Used to hold TM reference fields.
     * 
     */
    @JsonProperty("tmReferenceNumber")
    public List<TransportManagementReferenceNumberType> getTmReferenceNumber() {
        return tmReferenceNumber;
    }

    /**
     * Used to hold TM reference fields.
     * 
     */
    @JsonProperty("tmReferenceNumber")
    public void setTmReferenceNumber(List<TransportManagementReferenceNumberType> tmReferenceNumber) {
        this.tmReferenceNumber = tmReferenceNumber;
    }

    public TransportLoadShipmentType withTmReferenceNumber(List<TransportManagementReferenceNumberType> tmReferenceNumber) {
        this.tmReferenceNumber = tmReferenceNumber;
        return this;
    }

    /**
     * Code of material or product that is traded as defined in transportation manager.
     * 
     */
    @JsonProperty("commodityTypeCode")
    public List<CodeType> getCommodityTypeCode() {
        return commodityTypeCode;
    }

    /**
     * Code of material or product that is traded as defined in transportation manager.
     * 
     */
    @JsonProperty("commodityTypeCode")
    public void setCommodityTypeCode(List<CodeType> commodityTypeCode) {
        this.commodityTypeCode = commodityTypeCode;
    }

    public TransportLoadShipmentType withCommodityTypeCode(List<CodeType> commodityTypeCode) {
        this.commodityTypeCode = commodityTypeCode;
        return this;
    }

    /**
     * Shipment leg identifier.
     * 
     */
    @JsonProperty("shipmentLegId")
    public String getShipmentLegId() {
        return shipmentLegId;
    }

    /**
     * Shipment leg identifier.
     * 
     */
    @JsonProperty("shipmentLegId")
    public void setShipmentLegId(String shipmentLegId) {
        this.shipmentLegId = shipmentLegId;
    }

    public TransportLoadShipmentType withShipmentLegId(String shipmentLegId) {
        this.shipmentLegId = shipmentLegId;
        return this;
    }

    /**
     * Boolean value for multi leg shipment. Whenever number of shipment legs is >1 Shipment value is TRUE else it is FALSE.
     * 
     */
    @JsonProperty("isMultiLegShipment")
    public Boolean getIsMultiLegShipment() {
        return isMultiLegShipment;
    }

    /**
     * Boolean value for multi leg shipment. Whenever number of shipment legs is >1 Shipment value is TRUE else it is FALSE.
     * 
     */
    @JsonProperty("isMultiLegShipment")
    public void setIsMultiLegShipment(Boolean isMultiLegShipment) {
        this.isMultiLegShipment = isMultiLegShipment;
    }

    public TransportLoadShipmentType withIsMultiLegShipment(Boolean isMultiLegShipment) {
        this.isMultiLegShipment = isMultiLegShipment;
        return this;
    }

    /**
     * Boolean value for Cross Dock leg. Is the leg cross docked in the respective warehouse.
     * 
     */
    @JsonProperty("isCrossDockLeg")
    public Boolean getIsCrossDockLeg() {
        return isCrossDockLeg;
    }

    /**
     * Boolean value for Cross Dock leg. Is the leg cross docked in the respective warehouse.
     * 
     */
    @JsonProperty("isCrossDockLeg")
    public void setIsCrossDockLeg(Boolean isCrossDockLeg) {
        this.isCrossDockLeg = isCrossDockLeg;
    }

    public TransportLoadShipmentType withIsCrossDockLeg(Boolean isCrossDockLeg) {
        this.isCrossDockLeg = isCrossDockLeg;
        return this;
    }

    /**
     * Information about shipment Items.
     * 
     */
    @JsonProperty("shipmentItem")
    public List<TransportLoadShipmentItemType> getShipmentItem() {
        return shipmentItem;
    }

    /**
     * Information about shipment Items.
     * 
     */
    @JsonProperty("shipmentItem")
    public void setShipmentItem(List<TransportLoadShipmentItemType> shipmentItem) {
        this.shipmentItem = shipmentItem;
    }

    public TransportLoadShipmentType withShipmentItem(List<TransportLoadShipmentItemType> shipmentItem) {
        this.shipmentItem = shipmentItem;
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

    public TransportLoadShipmentType withExtensions(NoCustomExtensionsType extensions) {
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

    public TransportLoadShipmentType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportLoadShipmentType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("primaryId");
        sb.append('=');
        sb.append(((this.primaryId == null)?"<null>":this.primaryId));
        sb.append(',');
        sb.append("additionalShipmentId");
        sb.append('=');
        sb.append(((this.additionalShipmentId == null)?"<null>":this.additionalShipmentId));
        sb.append(',');
        sb.append("actionCode");
        sb.append('=');
        sb.append(((this.actionCode == null)?"<null>":this.actionCode));
        sb.append(',');
        sb.append("parentShipmentID");
        sb.append('=');
        sb.append(((this.parentShipmentID == null)?"<null>":this.parentShipmentID));
        sb.append(',');
        sb.append("receiver");
        sb.append('=');
        sb.append(((this.receiver == null)?"<null>":this.receiver));
        sb.append(',');
        sb.append("shipper");
        sb.append('=');
        sb.append(((this.shipper == null)?"<null>":this.shipper));
        sb.append(',');
        sb.append("shipTo");
        sb.append('=');
        sb.append(((this.shipTo == null)?"<null>":this.shipTo));
        sb.append(',');
        sb.append("shipFrom");
        sb.append('=');
        sb.append(((this.shipFrom == null)?"<null>":this.shipFrom));
        sb.append(',');
        sb.append("logisticServiceRequirementCode");
        sb.append('=');
        sb.append(((this.logisticServiceRequirementCode == null)?"<null>":this.logisticServiceRequirementCode));
        sb.append(',');
        sb.append("transportServiceCategoryType");
        sb.append('=');
        sb.append(((this.transportServiceCategoryType == null)?"<null>":this.transportServiceCategoryType));
        sb.append(',');
        sb.append("transportCargoCharacteristics");
        sb.append('=');
        sb.append(((this.transportCargoCharacteristics == null)?"<null>":this.transportCargoCharacteristics));
        sb.append(',');
        sb.append("plannedDelivery");
        sb.append('=');
        sb.append(((this.plannedDelivery == null)?"<null>":this.plannedDelivery));
        sb.append(',');
        sb.append("plannedDespatch");
        sb.append('=');
        sb.append(((this.plannedDespatch == null)?"<null>":this.plannedDespatch));
        sb.append(',');
        sb.append("transportReference");
        sb.append('=');
        sb.append(((this.transportReference == null)?"<null>":this.transportReference));
        sb.append(',');
        sb.append("tmReferenceNumber");
        sb.append('=');
        sb.append(((this.tmReferenceNumber == null)?"<null>":this.tmReferenceNumber));
        sb.append(',');
        sb.append("commodityTypeCode");
        sb.append('=');
        sb.append(((this.commodityTypeCode == null)?"<null>":this.commodityTypeCode));
        sb.append(',');
        sb.append("shipmentLegId");
        sb.append('=');
        sb.append(((this.shipmentLegId == null)?"<null>":this.shipmentLegId));
        sb.append(',');
        sb.append("isMultiLegShipment");
        sb.append('=');
        sb.append(((this.isMultiLegShipment == null)?"<null>":this.isMultiLegShipment));
        sb.append(',');
        sb.append("isCrossDockLeg");
        sb.append('=');
        sb.append(((this.isCrossDockLeg == null)?"<null>":this.isCrossDockLeg));
        sb.append(',');
        sb.append("shipmentItem");
        sb.append('=');
        sb.append(((this.shipmentItem == null)?"<null>":this.shipmentItem));
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
        result = ((result* 31)+((this.shipper == null)? 0 :this.shipper.hashCode()));
        result = ((result* 31)+((this.shipFrom == null)? 0 :this.shipFrom.hashCode()));
        result = ((result* 31)+((this.shipmentLegId == null)? 0 :this.shipmentLegId.hashCode()));
        result = ((result* 31)+((this.transportCargoCharacteristics == null)? 0 :this.transportCargoCharacteristics.hashCode()));
        result = ((result* 31)+((this.receiver == null)? 0 :this.receiver.hashCode()));
        result = ((result* 31)+((this.plannedDespatch == null)? 0 :this.plannedDespatch.hashCode()));
        result = ((result* 31)+((this.parentShipmentID == null)? 0 :this.parentShipmentID.hashCode()));
        result = ((result* 31)+((this.isMultiLegShipment == null)? 0 :this.isMultiLegShipment.hashCode()));
        result = ((result* 31)+((this.additionalShipmentId == null)? 0 :this.additionalShipmentId.hashCode()));
        result = ((result* 31)+((this.plannedDelivery == null)? 0 :this.plannedDelivery.hashCode()));
        result = ((result* 31)+((this.primaryId == null)? 0 :this.primaryId.hashCode()));
        result = ((result* 31)+((this.logisticServiceRequirementCode == null)? 0 :this.logisticServiceRequirementCode.hashCode()));
        result = ((result* 31)+((this.transportServiceCategoryType == null)? 0 :this.transportServiceCategoryType.hashCode()));
        result = ((result* 31)+((this.transportReference == null)? 0 :this.transportReference.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.isCrossDockLeg == null)? 0 :this.isCrossDockLeg.hashCode()));
        result = ((result* 31)+((this.actionCode == null)? 0 :this.actionCode.hashCode()));
        result = ((result* 31)+((this.commodityTypeCode == null)? 0 :this.commodityTypeCode.hashCode()));
        result = ((result* 31)+((this.shipmentItem == null)? 0 :this.shipmentItem.hashCode()));
        result = ((result* 31)+((this.tmReferenceNumber == null)? 0 :this.tmReferenceNumber.hashCode()));
        result = ((result* 31)+((this.shipTo == null)? 0 :this.shipTo.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportLoadShipmentType) == false) {
            return false;
        }
        TransportLoadShipmentType rhs = ((TransportLoadShipmentType) other);
        return (((((((((((((((((((((((this.shipper == rhs.shipper)||((this.shipper!= null)&&this.shipper.equals(rhs.shipper)))&&((this.shipFrom == rhs.shipFrom)||((this.shipFrom!= null)&&this.shipFrom.equals(rhs.shipFrom))))&&((this.shipmentLegId == rhs.shipmentLegId)||((this.shipmentLegId!= null)&&this.shipmentLegId.equals(rhs.shipmentLegId))))&&((this.transportCargoCharacteristics == rhs.transportCargoCharacteristics)||((this.transportCargoCharacteristics!= null)&&this.transportCargoCharacteristics.equals(rhs.transportCargoCharacteristics))))&&((this.receiver == rhs.receiver)||((this.receiver!= null)&&this.receiver.equals(rhs.receiver))))&&((this.plannedDespatch == rhs.plannedDespatch)||((this.plannedDespatch!= null)&&this.plannedDespatch.equals(rhs.plannedDespatch))))&&((this.parentShipmentID == rhs.parentShipmentID)||((this.parentShipmentID!= null)&&this.parentShipmentID.equals(rhs.parentShipmentID))))&&((this.isMultiLegShipment == rhs.isMultiLegShipment)||((this.isMultiLegShipment!= null)&&this.isMultiLegShipment.equals(rhs.isMultiLegShipment))))&&((this.additionalShipmentId == rhs.additionalShipmentId)||((this.additionalShipmentId!= null)&&this.additionalShipmentId.equals(rhs.additionalShipmentId))))&&((this.plannedDelivery == rhs.plannedDelivery)||((this.plannedDelivery!= null)&&this.plannedDelivery.equals(rhs.plannedDelivery))))&&((this.primaryId == rhs.primaryId)||((this.primaryId!= null)&&this.primaryId.equals(rhs.primaryId))))&&((this.logisticServiceRequirementCode == rhs.logisticServiceRequirementCode)||((this.logisticServiceRequirementCode!= null)&&this.logisticServiceRequirementCode.equals(rhs.logisticServiceRequirementCode))))&&((this.transportServiceCategoryType == rhs.transportServiceCategoryType)||((this.transportServiceCategoryType!= null)&&this.transportServiceCategoryType.equals(rhs.transportServiceCategoryType))))&&((this.transportReference == rhs.transportReference)||((this.transportReference!= null)&&this.transportReference.equals(rhs.transportReference))))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.isCrossDockLeg == rhs.isCrossDockLeg)||((this.isCrossDockLeg!= null)&&this.isCrossDockLeg.equals(rhs.isCrossDockLeg))))&&((this.actionCode == rhs.actionCode)||((this.actionCode!= null)&&this.actionCode.equals(rhs.actionCode))))&&((this.commodityTypeCode == rhs.commodityTypeCode)||((this.commodityTypeCode!= null)&&this.commodityTypeCode.equals(rhs.commodityTypeCode))))&&((this.shipmentItem == rhs.shipmentItem)||((this.shipmentItem!= null)&&this.shipmentItem.equals(rhs.shipmentItem))))&&((this.tmReferenceNumber == rhs.tmReferenceNumber)||((this.tmReferenceNumber!= null)&&this.tmReferenceNumber.equals(rhs.tmReferenceNumber))))&&((this.shipTo == rhs.shipTo)||((this.shipTo!= null)&&this.shipTo.equals(rhs.shipTo))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
