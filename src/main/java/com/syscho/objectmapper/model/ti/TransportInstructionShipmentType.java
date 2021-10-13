
package com.syscho.objectmapper.model.ti;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 * TransportInstructionShipmentType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "primaryId",
    "additionalShipmentId",
    "actionCode",
    "transportInstructionStatusDescription",
    "receiver",
    "shipper",
    "carrier",
    "shipTo",
    "shipFrom",
    "transportInstructionTerms",
    "transportCargoCharacteristics",
    "plannedDelivery",
    "plannedDespatch",
    "deliveryTerms",
    "transportReference",
    "handlingInstruction",
    "shipmentItem",
    "shipmentDescription",
    "deliveryTypeCode",
    "customerCode",
    "note",
    "transportInstructionSubStatusDescription",
    "routeVia",
    "shipperName",
    "receiverName",
    "actualShipDateTime",
    "actualDeliveryDateTime",
    "predictedDeliveryDateTime",
    "proofOfDeliveryDeliveryDateTime",
    "transportMeans",
    "shippingInformation",
    "freightTermsCode",
    "chargeOverride",
    "tmReferenceNumber",
    "logisticUnit",
    "extensions",
    "avpList"
})
@Generated("jsonschema2pojo")
public class TransportInstructionShipmentType {

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
     * Description70Type
     * <p>
     * 
     * 
     */
    @JsonProperty("transportInstructionStatusDescription")
    private Description70Type transportInstructionStatusDescription;
    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("receiver")
    private TransactionalPartyType receiver;
    /**
     * TransactionalPartyType
     * <p>
     * 
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
    @JsonProperty("carrier")
    private TransactionalPartyType carrier;
    /**
     * TransportInstructionShipToFromType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipTo")
    private TransportInstructionShipToFromType shipTo;
    /**
     * TransportInstructionShipToFromType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipFrom")
    private TransportInstructionShipToFromType shipFrom;
    /**
     * TransportInstructionTermsType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportInstructionTerms")
    private TransportInstructionTermsType transportInstructionTerms;
    /**
     * TransportCargoCharacteristicsType
     * <p>
     * 
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
     * DeliveryTermsType
     * <p>
     * 
     * 
     */
    @JsonProperty("deliveryTerms")
    private DeliveryTermsType deliveryTerms;
    /**
     * Reference to associated information in support of related business processes. E.g. a purchase order, a bank account number.
     * 
     */
    @JsonProperty("transportReference")
    @JsonPropertyDescription("Reference to associated information in support of related business processes. E.g. a purchase order, a bank account number.")
    private List<TransportReferenceType> transportReference = new ArrayList<TransportReferenceType>();
    /**
     * Instruction on the way to treat goods during transport and storage.
     * 
     */
    @JsonProperty("handlingInstruction")
    @JsonPropertyDescription("Instruction on the way to treat goods during transport and storage.")
    private List<HandlingInstructionType> handlingInstruction = new ArrayList<HandlingInstructionType>();
    /**
     * A shipment item is a (collection of) Trade Items and/or Logistic Units that can each be identified (uniquely) within a shipment.
     * 
     */
    @JsonProperty("shipmentItem")
    @JsonPropertyDescription("A shipment item is a (collection of) Trade Items and/or Logistic Units that can each be identified (uniquely) within a shipment.")
    private List<TransportInstructionShipmentItemType> shipmentItem = new ArrayList<TransportInstructionShipmentItemType>();
    /**
     * DescriptionType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipmentDescription")
    private DescriptionType shipmentDescription;
    /**
     * DeliveryTypeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("deliveryTypeCode")
    private DeliveryTypeCode deliveryTypeCode;
    /**
     * Transportation Management customer code.
     * 
     */
    @JsonProperty("customerCode")
    @JsonPropertyDescription("Transportation Management customer code.")
    private String customerCode;
    /**
     * Free text used to convey information that is not processed by applications.
     * 
     */
    @JsonProperty("note")
    @JsonPropertyDescription("Free text used to convey information that is not processed by applications.")
    private List<NoteType> note = new ArrayList<NoteType>();
    /**
     * Description70Type
     * <p>
     * 
     * 
     */
    @JsonProperty("transportInstructionSubStatusDescription")
    private Description70Type transportInstructionSubStatusDescription;
    /**
     * TransportInstructionShipmentThroughPointType
     * <p>
     * 
     * 
     */
    @JsonProperty("routeVia")
    private TransportInstructionShipmentThroughPointType routeVia;
    /**
     * Name of the shipper.
     * 
     */
    @JsonProperty("shipperName")
    @JsonPropertyDescription("Name of the shipper.")
    private String shipperName;
    /**
     * Name of the receiver.
     * 
     */
    @JsonProperty("receiverName")
    @JsonPropertyDescription("Name of the receiver.")
    private String receiverName;
    /**
     * The date and time the goods were shipped.
     * 
     */
    @JsonProperty("actualShipDateTime")
    @JsonPropertyDescription("The date and time the goods were shipped.")
    private OffsetDateTime actualShipDateTime;
    /**
     * The actual date and time of delivery.
     * 
     */
    @JsonProperty("actualDeliveryDateTime")
    @JsonPropertyDescription("The actual date and time of delivery.")
    private OffsetDateTime actualDeliveryDateTime;
    /**
     * The predicted date and time of delivery.
     * 
     */
    @JsonProperty("predictedDeliveryDateTime")
    @JsonPropertyDescription("The predicted date and time of delivery.")
    private OffsetDateTime predictedDeliveryDateTime;
    /**
     * The proof of delivery date and time.
     * 
     */
    @JsonProperty("proofOfDeliveryDeliveryDateTime")
    @JsonPropertyDescription("The proof of delivery date and time.")
    private OffsetDateTime proofOfDeliveryDeliveryDateTime;
    /**
     * TransportMeansType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportMeans")
    private TransportMeansType transportMeans;
    /**
     * ShipmentInformationType
     * <p>
     * 
     * 
     */
    @JsonProperty("shippingInformation")
    private ShipmentInformationType shippingInformation;
    /**
     * TransportPaymentMethodCode
     * <p>
     * 
     * 
     */
    @JsonProperty("freightTermsCode")
    private TransportPaymentMethodCode freightTermsCode;
    /**
     * An override to a charge.
     * 
     */
    @JsonProperty("chargeOverride")
    @JsonPropertyDescription("An override to a charge.")
    private List<ChargeOverrideType> chargeOverride = new ArrayList<ChargeOverrideType>();
    /**
     * Used to hold TM reference fields.
     * 
     */
    @JsonProperty("tmReferenceNumber")
    @JsonPropertyDescription("Used to hold TM reference fields.")
    private List<TransportManagementReferenceNumberType> tmReferenceNumber = new ArrayList<TransportManagementReferenceNumberType>();
    /**
     * A logistic unit is a unit of any composition made up for transport and or storage which has to be managed throughout the supply chain.
     * 
     */
    @JsonProperty("logisticUnit")
    @JsonPropertyDescription("A logistic unit is a unit of any composition made up for transport and or storage which has to be managed throughout the supply chain.")
    private List<ShipmentLogisticUnitType> logisticUnit = new ArrayList<ShipmentLogisticUnitType>();
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

    public TransportInstructionShipmentType withPrimaryId(String primaryId) {
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

    public TransportInstructionShipmentType withAdditionalShipmentId(List<AdditionalShipmentIdentificationType> additionalShipmentId) {
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

    public TransportInstructionShipmentType withActionCode(SegmentActionEnumerationType actionCode) {
        this.actionCode = actionCode;
        return this;
    }

    /**
     * Description70Type
     * <p>
     * 
     * 
     */
    @JsonProperty("transportInstructionStatusDescription")
    public Description70Type getTransportInstructionStatusDescription() {
        return transportInstructionStatusDescription;
    }

    /**
     * Description70Type
     * <p>
     * 
     * 
     */
    @JsonProperty("transportInstructionStatusDescription")
    public void setTransportInstructionStatusDescription(Description70Type transportInstructionStatusDescription) {
        this.transportInstructionStatusDescription = transportInstructionStatusDescription;
    }

    public TransportInstructionShipmentType withTransportInstructionStatusDescription(Description70Type transportInstructionStatusDescription) {
        this.transportInstructionStatusDescription = transportInstructionStatusDescription;
        return this;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
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
     * 
     */
    @JsonProperty("receiver")
    public void setReceiver(TransactionalPartyType receiver) {
        this.receiver = receiver;
    }

    public TransportInstructionShipmentType withReceiver(TransactionalPartyType receiver) {
        this.receiver = receiver;
        return this;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
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
     * 
     */
    @JsonProperty("shipper")
    public void setShipper(TransactionalPartyType shipper) {
        this.shipper = shipper;
    }

    public TransportInstructionShipmentType withShipper(TransactionalPartyType shipper) {
        this.shipper = shipper;
        return this;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("carrier")
    public TransactionalPartyType getCarrier() {
        return carrier;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("carrier")
    public void setCarrier(TransactionalPartyType carrier) {
        this.carrier = carrier;
    }

    public TransportInstructionShipmentType withCarrier(TransactionalPartyType carrier) {
        this.carrier = carrier;
        return this;
    }

    /**
     * TransportInstructionShipToFromType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipTo")
    public TransportInstructionShipToFromType getShipTo() {
        return shipTo;
    }

    /**
     * TransportInstructionShipToFromType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipTo")
    public void setShipTo(TransportInstructionShipToFromType shipTo) {
        this.shipTo = shipTo;
    }

    public TransportInstructionShipmentType withShipTo(TransportInstructionShipToFromType shipTo) {
        this.shipTo = shipTo;
        return this;
    }

    /**
     * TransportInstructionShipToFromType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipFrom")
    public TransportInstructionShipToFromType getShipFrom() {
        return shipFrom;
    }

    /**
     * TransportInstructionShipToFromType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipFrom")
    public void setShipFrom(TransportInstructionShipToFromType shipFrom) {
        this.shipFrom = shipFrom;
    }

    public TransportInstructionShipmentType withShipFrom(TransportInstructionShipToFromType shipFrom) {
        this.shipFrom = shipFrom;
        return this;
    }

    /**
     * TransportInstructionTermsType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportInstructionTerms")
    public TransportInstructionTermsType getTransportInstructionTerms() {
        return transportInstructionTerms;
    }

    /**
     * TransportInstructionTermsType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportInstructionTerms")
    public void setTransportInstructionTerms(TransportInstructionTermsType transportInstructionTerms) {
        this.transportInstructionTerms = transportInstructionTerms;
    }

    public TransportInstructionShipmentType withTransportInstructionTerms(TransportInstructionTermsType transportInstructionTerms) {
        this.transportInstructionTerms = transportInstructionTerms;
        return this;
    }

    /**
     * TransportCargoCharacteristicsType
     * <p>
     * 
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
     * 
     */
    @JsonProperty("transportCargoCharacteristics")
    public void setTransportCargoCharacteristics(TransportCargoCharacteristicsType transportCargoCharacteristics) {
        this.transportCargoCharacteristics = transportCargoCharacteristics;
    }

    public TransportInstructionShipmentType withTransportCargoCharacteristics(TransportCargoCharacteristicsType transportCargoCharacteristics) {
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

    public TransportInstructionShipmentType withPlannedDelivery(LogisticEventType plannedDelivery) {
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

    public TransportInstructionShipmentType withPlannedDespatch(LogisticEventType plannedDespatch) {
        this.plannedDespatch = plannedDespatch;
        return this;
    }

    /**
     * DeliveryTermsType
     * <p>
     * 
     * 
     */
    @JsonProperty("deliveryTerms")
    public DeliveryTermsType getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * DeliveryTermsType
     * <p>
     * 
     * 
     */
    @JsonProperty("deliveryTerms")
    public void setDeliveryTerms(DeliveryTermsType deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }

    public TransportInstructionShipmentType withDeliveryTerms(DeliveryTermsType deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
        return this;
    }

    /**
     * Reference to associated information in support of related business processes. E.g. a purchase order, a bank account number.
     * 
     */
    @JsonProperty("transportReference")
    public List<TransportReferenceType> getTransportReference() {
        return transportReference;
    }

    /**
     * Reference to associated information in support of related business processes. E.g. a purchase order, a bank account number.
     * 
     */
    @JsonProperty("transportReference")
    public void setTransportReference(List<TransportReferenceType> transportReference) {
        this.transportReference = transportReference;
    }

    public TransportInstructionShipmentType withTransportReference(List<TransportReferenceType> transportReference) {
        this.transportReference = transportReference;
        return this;
    }

    /**
     * Instruction on the way to treat goods during transport and storage.
     * 
     */
    @JsonProperty("handlingInstruction")
    public List<HandlingInstructionType> getHandlingInstruction() {
        return handlingInstruction;
    }

    /**
     * Instruction on the way to treat goods during transport and storage.
     * 
     */
    @JsonProperty("handlingInstruction")
    public void setHandlingInstruction(List<HandlingInstructionType> handlingInstruction) {
        this.handlingInstruction = handlingInstruction;
    }

    public TransportInstructionShipmentType withHandlingInstruction(List<HandlingInstructionType> handlingInstruction) {
        this.handlingInstruction = handlingInstruction;
        return this;
    }

    /**
     * A shipment item is a (collection of) Trade Items and/or Logistic Units that can each be identified (uniquely) within a shipment.
     * 
     */
    @JsonProperty("shipmentItem")
    public List<TransportInstructionShipmentItemType> getShipmentItem() {
        return shipmentItem;
    }

    /**
     * A shipment item is a (collection of) Trade Items and/or Logistic Units that can each be identified (uniquely) within a shipment.
     * 
     */
    @JsonProperty("shipmentItem")
    public void setShipmentItem(List<TransportInstructionShipmentItemType> shipmentItem) {
        this.shipmentItem = shipmentItem;
    }

    public TransportInstructionShipmentType withShipmentItem(List<TransportInstructionShipmentItemType> shipmentItem) {
        this.shipmentItem = shipmentItem;
        return this;
    }

    /**
     * DescriptionType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipmentDescription")
    public DescriptionType getShipmentDescription() {
        return shipmentDescription;
    }

    /**
     * DescriptionType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipmentDescription")
    public void setShipmentDescription(DescriptionType shipmentDescription) {
        this.shipmentDescription = shipmentDescription;
    }

    public TransportInstructionShipmentType withShipmentDescription(DescriptionType shipmentDescription) {
        this.shipmentDescription = shipmentDescription;
        return this;
    }

    /**
     * DeliveryTypeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("deliveryTypeCode")
    public DeliveryTypeCode getDeliveryTypeCode() {
        return deliveryTypeCode;
    }

    /**
     * DeliveryTypeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("deliveryTypeCode")
    public void setDeliveryTypeCode(DeliveryTypeCode deliveryTypeCode) {
        this.deliveryTypeCode = deliveryTypeCode;
    }

    public TransportInstructionShipmentType withDeliveryTypeCode(DeliveryTypeCode deliveryTypeCode) {
        this.deliveryTypeCode = deliveryTypeCode;
        return this;
    }

    /**
     * Transportation Management customer code.
     * 
     */
    @JsonProperty("customerCode")
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Transportation Management customer code.
     * 
     */
    @JsonProperty("customerCode")
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public TransportInstructionShipmentType withCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }

    /**
     * Free text used to convey information that is not processed by applications.
     * 
     */
    @JsonProperty("note")
    public List<NoteType> getNote() {
        return note;
    }

    /**
     * Free text used to convey information that is not processed by applications.
     * 
     */
    @JsonProperty("note")
    public void setNote(List<NoteType> note) {
        this.note = note;
    }

    public TransportInstructionShipmentType withNote(List<NoteType> note) {
        this.note = note;
        return this;
    }

    /**
     * Description70Type
     * <p>
     * 
     * 
     */
    @JsonProperty("transportInstructionSubStatusDescription")
    public Description70Type getTransportInstructionSubStatusDescription() {
        return transportInstructionSubStatusDescription;
    }

    /**
     * Description70Type
     * <p>
     * 
     * 
     */
    @JsonProperty("transportInstructionSubStatusDescription")
    public void setTransportInstructionSubStatusDescription(Description70Type transportInstructionSubStatusDescription) {
        this.transportInstructionSubStatusDescription = transportInstructionSubStatusDescription;
    }

    public TransportInstructionShipmentType withTransportInstructionSubStatusDescription(Description70Type transportInstructionSubStatusDescription) {
        this.transportInstructionSubStatusDescription = transportInstructionSubStatusDescription;
        return this;
    }

    /**
     * TransportInstructionShipmentThroughPointType
     * <p>
     * 
     * 
     */
    @JsonProperty("routeVia")
    public TransportInstructionShipmentThroughPointType getRouteVia() {
        return routeVia;
    }

    /**
     * TransportInstructionShipmentThroughPointType
     * <p>
     * 
     * 
     */
    @JsonProperty("routeVia")
    public void setRouteVia(TransportInstructionShipmentThroughPointType routeVia) {
        this.routeVia = routeVia;
    }

    public TransportInstructionShipmentType withRouteVia(TransportInstructionShipmentThroughPointType routeVia) {
        this.routeVia = routeVia;
        return this;
    }

    /**
     * Name of the shipper.
     * 
     */
    @JsonProperty("shipperName")
    public String getShipperName() {
        return shipperName;
    }

    /**
     * Name of the shipper.
     * 
     */
    @JsonProperty("shipperName")
    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    public TransportInstructionShipmentType withShipperName(String shipperName) {
        this.shipperName = shipperName;
        return this;
    }

    /**
     * Name of the receiver.
     * 
     */
    @JsonProperty("receiverName")
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * Name of the receiver.
     * 
     */
    @JsonProperty("receiverName")
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public TransportInstructionShipmentType withReceiverName(String receiverName) {
        this.receiverName = receiverName;
        return this;
    }

    /**
     * The date and time the goods were shipped.
     * 
     */
    @JsonProperty("actualShipDateTime")
    public OffsetDateTime getActualShipDateTime() {
        return actualShipDateTime;
    }

    /**
     * The date and time the goods were shipped.
     * 
     */
    @JsonProperty("actualShipDateTime")
    public void setActualShipDateTime(OffsetDateTime actualShipDateTime) {
        this.actualShipDateTime = actualShipDateTime;
    }

    public TransportInstructionShipmentType withActualShipDateTime(OffsetDateTime actualShipDateTime) {
        this.actualShipDateTime = actualShipDateTime;
        return this;
    }

    /**
     * The actual date and time of delivery.
     * 
     */
    @JsonProperty("actualDeliveryDateTime")
    public OffsetDateTime getActualDeliveryDateTime() {
        return actualDeliveryDateTime;
    }

    /**
     * The actual date and time of delivery.
     * 
     */
    @JsonProperty("actualDeliveryDateTime")
    public void setActualDeliveryDateTime(OffsetDateTime actualDeliveryDateTime) {
        this.actualDeliveryDateTime = actualDeliveryDateTime;
    }

    public TransportInstructionShipmentType withActualDeliveryDateTime(OffsetDateTime actualDeliveryDateTime) {
        this.actualDeliveryDateTime = actualDeliveryDateTime;
        return this;
    }

    /**
     * The predicted date and time of delivery.
     * 
     */
    @JsonProperty("predictedDeliveryDateTime")
    public OffsetDateTime getPredictedDeliveryDateTime() {
        return predictedDeliveryDateTime;
    }

    /**
     * The predicted date and time of delivery.
     * 
     */
    @JsonProperty("predictedDeliveryDateTime")
    public void setPredictedDeliveryDateTime(OffsetDateTime predictedDeliveryDateTime) {
        this.predictedDeliveryDateTime = predictedDeliveryDateTime;
    }

    public TransportInstructionShipmentType withPredictedDeliveryDateTime(OffsetDateTime predictedDeliveryDateTime) {
        this.predictedDeliveryDateTime = predictedDeliveryDateTime;
        return this;
    }

    /**
     * The proof of delivery date and time.
     * 
     */
    @JsonProperty("proofOfDeliveryDeliveryDateTime")
    public OffsetDateTime getProofOfDeliveryDeliveryDateTime() {
        return proofOfDeliveryDeliveryDateTime;
    }

    /**
     * The proof of delivery date and time.
     * 
     */
    @JsonProperty("proofOfDeliveryDeliveryDateTime")
    public void setProofOfDeliveryDeliveryDateTime(OffsetDateTime proofOfDeliveryDeliveryDateTime) {
        this.proofOfDeliveryDeliveryDateTime = proofOfDeliveryDeliveryDateTime;
    }

    public TransportInstructionShipmentType withProofOfDeliveryDeliveryDateTime(OffsetDateTime proofOfDeliveryDeliveryDateTime) {
        this.proofOfDeliveryDeliveryDateTime = proofOfDeliveryDeliveryDateTime;
        return this;
    }

    /**
     * TransportMeansType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportMeans")
    public TransportMeansType getTransportMeans() {
        return transportMeans;
    }

    /**
     * TransportMeansType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportMeans")
    public void setTransportMeans(TransportMeansType transportMeans) {
        this.transportMeans = transportMeans;
    }

    public TransportInstructionShipmentType withTransportMeans(TransportMeansType transportMeans) {
        this.transportMeans = transportMeans;
        return this;
    }

    /**
     * ShipmentInformationType
     * <p>
     * 
     * 
     */
    @JsonProperty("shippingInformation")
    public ShipmentInformationType getShippingInformation() {
        return shippingInformation;
    }

    /**
     * ShipmentInformationType
     * <p>
     * 
     * 
     */
    @JsonProperty("shippingInformation")
    public void setShippingInformation(ShipmentInformationType shippingInformation) {
        this.shippingInformation = shippingInformation;
    }

    public TransportInstructionShipmentType withShippingInformation(ShipmentInformationType shippingInformation) {
        this.shippingInformation = shippingInformation;
        return this;
    }

    /**
     * TransportPaymentMethodCode
     * <p>
     * 
     * 
     */
    @JsonProperty("freightTermsCode")
    public TransportPaymentMethodCode getFreightTermsCode() {
        return freightTermsCode;
    }

    /**
     * TransportPaymentMethodCode
     * <p>
     * 
     * 
     */
    @JsonProperty("freightTermsCode")
    public void setFreightTermsCode(TransportPaymentMethodCode freightTermsCode) {
        this.freightTermsCode = freightTermsCode;
    }

    public TransportInstructionShipmentType withFreightTermsCode(TransportPaymentMethodCode freightTermsCode) {
        this.freightTermsCode = freightTermsCode;
        return this;
    }

    /**
     * An override to a charge.
     * 
     */
    @JsonProperty("chargeOverride")
    public List<ChargeOverrideType> getChargeOverride() {
        return chargeOverride;
    }

    /**
     * An override to a charge.
     * 
     */
    @JsonProperty("chargeOverride")
    public void setChargeOverride(List<ChargeOverrideType> chargeOverride) {
        this.chargeOverride = chargeOverride;
    }

    public TransportInstructionShipmentType withChargeOverride(List<ChargeOverrideType> chargeOverride) {
        this.chargeOverride = chargeOverride;
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

    public TransportInstructionShipmentType withTmReferenceNumber(List<TransportManagementReferenceNumberType> tmReferenceNumber) {
        this.tmReferenceNumber = tmReferenceNumber;
        return this;
    }

    /**
     * A logistic unit is a unit of any composition made up for transport and or storage which has to be managed throughout the supply chain.
     * 
     */
    @JsonProperty("logisticUnit")
    public List<ShipmentLogisticUnitType> getLogisticUnit() {
        return logisticUnit;
    }

    /**
     * A logistic unit is a unit of any composition made up for transport and or storage which has to be managed throughout the supply chain.
     * 
     */
    @JsonProperty("logisticUnit")
    public void setLogisticUnit(List<ShipmentLogisticUnitType> logisticUnit) {
        this.logisticUnit = logisticUnit;
    }

    public TransportInstructionShipmentType withLogisticUnit(List<ShipmentLogisticUnitType> logisticUnit) {
        this.logisticUnit = logisticUnit;
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

    public TransportInstructionShipmentType withExtensions(NoCustomExtensionsType extensions) {
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

    public TransportInstructionShipmentType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportInstructionShipmentType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("transportInstructionStatusDescription");
        sb.append('=');
        sb.append(((this.transportInstructionStatusDescription == null)?"<null>":this.transportInstructionStatusDescription));
        sb.append(',');
        sb.append("receiver");
        sb.append('=');
        sb.append(((this.receiver == null)?"<null>":this.receiver));
        sb.append(',');
        sb.append("shipper");
        sb.append('=');
        sb.append(((this.shipper == null)?"<null>":this.shipper));
        sb.append(',');
        sb.append("carrier");
        sb.append('=');
        sb.append(((this.carrier == null)?"<null>":this.carrier));
        sb.append(',');
        sb.append("shipTo");
        sb.append('=');
        sb.append(((this.shipTo == null)?"<null>":this.shipTo));
        sb.append(',');
        sb.append("shipFrom");
        sb.append('=');
        sb.append(((this.shipFrom == null)?"<null>":this.shipFrom));
        sb.append(',');
        sb.append("transportInstructionTerms");
        sb.append('=');
        sb.append(((this.transportInstructionTerms == null)?"<null>":this.transportInstructionTerms));
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
        sb.append("deliveryTerms");
        sb.append('=');
        sb.append(((this.deliveryTerms == null)?"<null>":this.deliveryTerms));
        sb.append(',');
        sb.append("transportReference");
        sb.append('=');
        sb.append(((this.transportReference == null)?"<null>":this.transportReference));
        sb.append(',');
        sb.append("handlingInstruction");
        sb.append('=');
        sb.append(((this.handlingInstruction == null)?"<null>":this.handlingInstruction));
        sb.append(',');
        sb.append("shipmentItem");
        sb.append('=');
        sb.append(((this.shipmentItem == null)?"<null>":this.shipmentItem));
        sb.append(',');
        sb.append("shipmentDescription");
        sb.append('=');
        sb.append(((this.shipmentDescription == null)?"<null>":this.shipmentDescription));
        sb.append(',');
        sb.append("deliveryTypeCode");
        sb.append('=');
        sb.append(((this.deliveryTypeCode == null)?"<null>":this.deliveryTypeCode));
        sb.append(',');
        sb.append("customerCode");
        sb.append('=');
        sb.append(((this.customerCode == null)?"<null>":this.customerCode));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("transportInstructionSubStatusDescription");
        sb.append('=');
        sb.append(((this.transportInstructionSubStatusDescription == null)?"<null>":this.transportInstructionSubStatusDescription));
        sb.append(',');
        sb.append("routeVia");
        sb.append('=');
        sb.append(((this.routeVia == null)?"<null>":this.routeVia));
        sb.append(',');
        sb.append("shipperName");
        sb.append('=');
        sb.append(((this.shipperName == null)?"<null>":this.shipperName));
        sb.append(',');
        sb.append("receiverName");
        sb.append('=');
        sb.append(((this.receiverName == null)?"<null>":this.receiverName));
        sb.append(',');
        sb.append("actualShipDateTime");
        sb.append('=');
        sb.append(((this.actualShipDateTime == null)?"<null>":this.actualShipDateTime));
        sb.append(',');
        sb.append("actualDeliveryDateTime");
        sb.append('=');
        sb.append(((this.actualDeliveryDateTime == null)?"<null>":this.actualDeliveryDateTime));
        sb.append(',');
        sb.append("predictedDeliveryDateTime");
        sb.append('=');
        sb.append(((this.predictedDeliveryDateTime == null)?"<null>":this.predictedDeliveryDateTime));
        sb.append(',');
        sb.append("proofOfDeliveryDeliveryDateTime");
        sb.append('=');
        sb.append(((this.proofOfDeliveryDeliveryDateTime == null)?"<null>":this.proofOfDeliveryDeliveryDateTime));
        sb.append(',');
        sb.append("transportMeans");
        sb.append('=');
        sb.append(((this.transportMeans == null)?"<null>":this.transportMeans));
        sb.append(',');
        sb.append("shippingInformation");
        sb.append('=');
        sb.append(((this.shippingInformation == null)?"<null>":this.shippingInformation));
        sb.append(',');
        sb.append("freightTermsCode");
        sb.append('=');
        sb.append(((this.freightTermsCode == null)?"<null>":this.freightTermsCode));
        sb.append(',');
        sb.append("chargeOverride");
        sb.append('=');
        sb.append(((this.chargeOverride == null)?"<null>":this.chargeOverride));
        sb.append(',');
        sb.append("tmReferenceNumber");
        sb.append('=');
        sb.append(((this.tmReferenceNumber == null)?"<null>":this.tmReferenceNumber));
        sb.append(',');
        sb.append("logisticUnit");
        sb.append('=');
        sb.append(((this.logisticUnit == null)?"<null>":this.logisticUnit));
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
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.chargeOverride == null)? 0 :this.chargeOverride.hashCode()));
        result = ((result* 31)+((this.transportMeans == null)? 0 :this.transportMeans.hashCode()));
        result = ((result* 31)+((this.predictedDeliveryDateTime == null)? 0 :this.predictedDeliveryDateTime.hashCode()));
        result = ((result* 31)+((this.customerCode == null)? 0 :this.customerCode.hashCode()));
        result = ((result* 31)+((this.additionalShipmentId == null)? 0 :this.additionalShipmentId.hashCode()));
        result = ((result* 31)+((this.actualShipDateTime == null)? 0 :this.actualShipDateTime.hashCode()));
        result = ((result* 31)+((this.primaryId == null)? 0 :this.primaryId.hashCode()));
        result = ((result* 31)+((this.handlingInstruction == null)? 0 :this.handlingInstruction.hashCode()));
        result = ((result* 31)+((this.proofOfDeliveryDeliveryDateTime == null)? 0 :this.proofOfDeliveryDeliveryDateTime.hashCode()));
        result = ((result* 31)+((this.freightTermsCode == null)? 0 :this.freightTermsCode.hashCode()));
        result = ((result* 31)+((this.transportReference == null)? 0 :this.transportReference.hashCode()));
        result = ((result* 31)+((this.routeVia == null)? 0 :this.routeVia.hashCode()));
        result = ((result* 31)+((this.shippingInformation == null)? 0 :this.shippingInformation.hashCode()));
        result = ((result* 31)+((this.actionCode == null)? 0 :this.actionCode.hashCode()));
        result = ((result* 31)+((this.deliveryTypeCode == null)? 0 :this.deliveryTypeCode.hashCode()));
        result = ((result* 31)+((this.shipmentDescription == null)? 0 :this.shipmentDescription.hashCode()));
        result = ((result* 31)+((this.shipFrom == null)? 0 :this.shipFrom.hashCode()));
        result = ((result* 31)+((this.transportInstructionSubStatusDescription == null)? 0 :this.transportInstructionSubStatusDescription.hashCode()));
        result = ((result* 31)+((this.deliveryTerms == null)? 0 :this.deliveryTerms.hashCode()));
        result = ((result* 31)+((this.transportCargoCharacteristics == null)? 0 :this.transportCargoCharacteristics.hashCode()));
        result = ((result* 31)+((this.receiver == null)? 0 :this.receiver.hashCode()));
        result = ((result* 31)+((this.plannedDespatch == null)? 0 :this.plannedDespatch.hashCode()));
        result = ((result* 31)+((this.transportInstructionTerms == null)? 0 :this.transportInstructionTerms.hashCode()));
        result = ((result* 31)+((this.receiverName == null)? 0 :this.receiverName.hashCode()));
        result = ((result* 31)+((this.actualDeliveryDateTime == null)? 0 :this.actualDeliveryDateTime.hashCode()));
        result = ((result* 31)+((this.shipperName == null)? 0 :this.shipperName.hashCode()));
        result = ((result* 31)+((this.plannedDelivery == null)? 0 :this.plannedDelivery.hashCode()));
        result = ((result* 31)+((this.transportInstructionStatusDescription == null)? 0 :this.transportInstructionStatusDescription.hashCode()));
        result = ((result* 31)+((this.carrier == null)? 0 :this.carrier.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.shipmentItem == null)? 0 :this.shipmentItem.hashCode()));
        result = ((result* 31)+((this.tmReferenceNumber == null)? 0 :this.tmReferenceNumber.hashCode()));
        result = ((result* 31)+((this.shipTo == null)? 0 :this.shipTo.hashCode()));
        result = ((result* 31)+((this.logisticUnit == null)? 0 :this.logisticUnit.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportInstructionShipmentType) == false) {
            return false;
        }
        TransportInstructionShipmentType rhs = ((TransportInstructionShipmentType) other);
        return ((((((((((((((((((((((((((((((((((((((this.shipper == rhs.shipper)||((this.shipper!= null)&&this.shipper.equals(rhs.shipper)))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.chargeOverride == rhs.chargeOverride)||((this.chargeOverride!= null)&&this.chargeOverride.equals(rhs.chargeOverride))))&&((this.transportMeans == rhs.transportMeans)||((this.transportMeans!= null)&&this.transportMeans.equals(rhs.transportMeans))))&&((this.predictedDeliveryDateTime == rhs.predictedDeliveryDateTime)||((this.predictedDeliveryDateTime!= null)&&this.predictedDeliveryDateTime.equals(rhs.predictedDeliveryDateTime))))&&((this.customerCode == rhs.customerCode)||((this.customerCode!= null)&&this.customerCode.equals(rhs.customerCode))))&&((this.additionalShipmentId == rhs.additionalShipmentId)||((this.additionalShipmentId!= null)&&this.additionalShipmentId.equals(rhs.additionalShipmentId))))&&((this.actualShipDateTime == rhs.actualShipDateTime)||((this.actualShipDateTime!= null)&&this.actualShipDateTime.equals(rhs.actualShipDateTime))))&&((this.primaryId == rhs.primaryId)||((this.primaryId!= null)&&this.primaryId.equals(rhs.primaryId))))&&((this.handlingInstruction == rhs.handlingInstruction)||((this.handlingInstruction!= null)&&this.handlingInstruction.equals(rhs.handlingInstruction))))&&((this.proofOfDeliveryDeliveryDateTime == rhs.proofOfDeliveryDeliveryDateTime)||((this.proofOfDeliveryDeliveryDateTime!= null)&&this.proofOfDeliveryDeliveryDateTime.equals(rhs.proofOfDeliveryDeliveryDateTime))))&&((this.freightTermsCode == rhs.freightTermsCode)||((this.freightTermsCode!= null)&&this.freightTermsCode.equals(rhs.freightTermsCode))))&&((this.transportReference == rhs.transportReference)||((this.transportReference!= null)&&this.transportReference.equals(rhs.transportReference))))&&((this.routeVia == rhs.routeVia)||((this.routeVia!= null)&&this.routeVia.equals(rhs.routeVia))))&&((this.shippingInformation == rhs.shippingInformation)||((this.shippingInformation!= null)&&this.shippingInformation.equals(rhs.shippingInformation))))&&((this.actionCode == rhs.actionCode)||((this.actionCode!= null)&&this.actionCode.equals(rhs.actionCode))))&&((this.deliveryTypeCode == rhs.deliveryTypeCode)||((this.deliveryTypeCode!= null)&&this.deliveryTypeCode.equals(rhs.deliveryTypeCode))))&&((this.shipmentDescription == rhs.shipmentDescription)||((this.shipmentDescription!= null)&&this.shipmentDescription.equals(rhs.shipmentDescription))))&&((this.shipFrom == rhs.shipFrom)||((this.shipFrom!= null)&&this.shipFrom.equals(rhs.shipFrom))))&&((this.transportInstructionSubStatusDescription == rhs.transportInstructionSubStatusDescription)||((this.transportInstructionSubStatusDescription!= null)&&this.transportInstructionSubStatusDescription.equals(rhs.transportInstructionSubStatusDescription))))&&((this.deliveryTerms == rhs.deliveryTerms)||((this.deliveryTerms!= null)&&this.deliveryTerms.equals(rhs.deliveryTerms))))&&((this.transportCargoCharacteristics == rhs.transportCargoCharacteristics)||((this.transportCargoCharacteristics!= null)&&this.transportCargoCharacteristics.equals(rhs.transportCargoCharacteristics))))&&((this.receiver == rhs.receiver)||((this.receiver!= null)&&this.receiver.equals(rhs.receiver))))&&((this.plannedDespatch == rhs.plannedDespatch)||((this.plannedDespatch!= null)&&this.plannedDespatch.equals(rhs.plannedDespatch))))&&((this.transportInstructionTerms == rhs.transportInstructionTerms)||((this.transportInstructionTerms!= null)&&this.transportInstructionTerms.equals(rhs.transportInstructionTerms))))&&((this.receiverName == rhs.receiverName)||((this.receiverName!= null)&&this.receiverName.equals(rhs.receiverName))))&&((this.actualDeliveryDateTime == rhs.actualDeliveryDateTime)||((this.actualDeliveryDateTime!= null)&&this.actualDeliveryDateTime.equals(rhs.actualDeliveryDateTime))))&&((this.shipperName == rhs.shipperName)||((this.shipperName!= null)&&this.shipperName.equals(rhs.shipperName))))&&((this.plannedDelivery == rhs.plannedDelivery)||((this.plannedDelivery!= null)&&this.plannedDelivery.equals(rhs.plannedDelivery))))&&((this.transportInstructionStatusDescription == rhs.transportInstructionStatusDescription)||((this.transportInstructionStatusDescription!= null)&&this.transportInstructionStatusDescription.equals(rhs.transportInstructionStatusDescription))))&&((this.carrier == rhs.carrier)||((this.carrier!= null)&&this.carrier.equals(rhs.carrier))))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.shipmentItem == rhs.shipmentItem)||((this.shipmentItem!= null)&&this.shipmentItem.equals(rhs.shipmentItem))))&&((this.tmReferenceNumber == rhs.tmReferenceNumber)||((this.tmReferenceNumber!= null)&&this.tmReferenceNumber.equals(rhs.tmReferenceNumber))))&&((this.shipTo == rhs.shipTo)||((this.shipTo!= null)&&this.shipTo.equals(rhs.shipTo))))&&((this.logisticUnit == rhs.logisticUnit)||((this.logisticUnit!= null)&&this.logisticUnit.equals(rhs.logisticUnit))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
