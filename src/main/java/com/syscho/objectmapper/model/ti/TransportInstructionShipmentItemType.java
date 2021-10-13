
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
 * TransportInstructionShipmentItemType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lineItemNumber",
    "transactionalTradeItem",
    "transportCargoCharacteristics",
    "transportReference",
    "packageTotal",
    "handlingInstruction",
    "extensions",
    "avpList",
    "lineStatus",
    "shipmentItemActionCode",
    "lastUpdateDateTime",
    "subLineId",
    "itemName",
    "commodityTypeCode",
    "supplierItemId",
    "transportModeCode",
    "materialClassification",
    "isLotEnabled",
    "itemOrderValue",
    "itemDeclaredValue",
    "tmReferenceNumber",
    "actionCode"
})
@Generated("jsonschema2pojo")
public class TransportInstructionShipmentItemType {

    /**
     * The sequence number for this shipment item.
     * (Required)
     * 
     */
    @JsonProperty("lineItemNumber")
    @JsonPropertyDescription("The sequence number for this shipment item.")
    private Integer lineItemNumber;
    /**
     * A trade item is any item (product or service) upon which there is a need to retrieve pre-defined information and that may be priced, or ordered, or invoiced at any point in any supply chain.
     * 
     */
    @JsonProperty("transactionalTradeItem")
    @JsonPropertyDescription("A trade item is any item (product or service) upon which there is a need to retrieve pre-defined information and that may be priced, or ordered, or invoiced at any point in any supply chain.")
    private List<TransactionalTradeItemType> transactionalTradeItem = new ArrayList<TransactionalTradeItemType>();
    /**
     * TransportCargoCharacteristicsType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportCargoCharacteristics")
    private TransportCargoCharacteristicsType transportCargoCharacteristics;
    /**
     * Reference to associated information in support of related business processes. E.g. a purchase order, a bank account number.
     * 
     */
    @JsonProperty("transportReference")
    @JsonPropertyDescription("Reference to associated information in support of related business processes. E.g. a purchase order, a bank account number.")
    private List<TransportReferenceType> transportReference = new ArrayList<TransportReferenceType>();
    /**
     * Aggregated information for a specific package type.
     * 
     */
    @JsonProperty("packageTotal")
    @JsonPropertyDescription("Aggregated information for a specific package type.")
    private List<PackageTotalType> packageTotal = new ArrayList<PackageTotalType>();
    /**
     * Instruction on the way to treat goods during transport and storage.
     * 
     */
    @JsonProperty("handlingInstruction")
    @JsonPropertyDescription("Instruction on the way to treat goods during transport and storage.")
    private List<HandlingInstructionType> handlingInstruction = new ArrayList<HandlingInstructionType>();
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
     * The status of this shipment line item.
     * 
     */
    @JsonProperty("lineStatus")
    @JsonPropertyDescription("The status of this shipment line item.")
    private String lineStatus;
    /**
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipmentItemActionCode")
    private SegmentActionEnumerationType shipmentItemActionCode;
    /**
     * Date and time when the document was last updated.
     * 
     */
    @JsonProperty("lastUpdateDateTime")
    @JsonPropertyDescription("Date and time when the document was last updated.")
    private OffsetDateTime lastUpdateDateTime;
    /**
     * Unique Identifier of the Order Sub Line. Order Sub Line - Can be used to tie lines together on a single order line to ensure that the inventory for the lines allocate as sets of inventory or as complete groups of inventory.
     * 
     */
    @JsonProperty("subLineId")
    @JsonPropertyDescription("Unique Identifier of the Order Sub Line. Order Sub Line - Can be used to tie lines together on a single order line to ensure that the inventory for the lines allocate as sets of inventory or as complete groups of inventory.")
    private String subLineId;
    /**
     * Name of the item.
     * 
     */
    @JsonProperty("itemName")
    @JsonPropertyDescription("Name of the item.")
    private String itemName;
    /**
     * Specifies the type of commodity for transport purposes, according to the user-selected coding scheme.
     * 
     */
    @JsonProperty("commodityTypeCode")
    @JsonPropertyDescription("Specifies the type of commodity for transport purposes, according to the user-selected coding scheme.")
    private List<CodeType> commodityTypeCode = new ArrayList<CodeType>();
    /**
     * TradeItemIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("supplierItemId")
    private TradeItemIdentificationType supplierItemId;
    /**
     * TransportModeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("transportModeCode")
    private TransportModeCode transportModeCode;
    /**
     * Specifies the class of material this item belongs to.
     * 
     */
    @JsonProperty("materialClassification")
    @JsonPropertyDescription("Specifies the class of material this item belongs to.")
    private String materialClassification;
    /**
     * Items which have Lot ID associated with it.
     * 
     */
    @JsonProperty("isLotEnabled")
    @JsonPropertyDescription("Items which have Lot ID associated with it.")
    private Boolean isLotEnabled;
    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("itemOrderValue")
    private AmountType itemOrderValue;
    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("itemDeclaredValue")
    private AmountType itemDeclaredValue;
    /**
     * Used to hold TM reference fields.
     * 
     */
    @JsonProperty("tmReferenceNumber")
    @JsonPropertyDescription("Used to hold TM reference fields.")
    private List<TransportManagementReferenceNumberType> tmReferenceNumber = new ArrayList<TransportManagementReferenceNumberType>();
    /**
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("actionCode")
    private SegmentActionEnumerationType actionCode;

    /**
     * The sequence number for this shipment item.
     * (Required)
     * 
     */
    @JsonProperty("lineItemNumber")
    public Integer getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * The sequence number for this shipment item.
     * (Required)
     * 
     */
    @JsonProperty("lineItemNumber")
    public void setLineItemNumber(Integer lineItemNumber) {
        this.lineItemNumber = lineItemNumber;
    }

    public TransportInstructionShipmentItemType withLineItemNumber(Integer lineItemNumber) {
        this.lineItemNumber = lineItemNumber;
        return this;
    }

    /**
     * A trade item is any item (product or service) upon which there is a need to retrieve pre-defined information and that may be priced, or ordered, or invoiced at any point in any supply chain.
     * 
     */
    @JsonProperty("transactionalTradeItem")
    public List<TransactionalTradeItemType> getTransactionalTradeItem() {
        return transactionalTradeItem;
    }

    /**
     * A trade item is any item (product or service) upon which there is a need to retrieve pre-defined information and that may be priced, or ordered, or invoiced at any point in any supply chain.
     * 
     */
    @JsonProperty("transactionalTradeItem")
    public void setTransactionalTradeItem(List<TransactionalTradeItemType> transactionalTradeItem) {
        this.transactionalTradeItem = transactionalTradeItem;
    }

    public TransportInstructionShipmentItemType withTransactionalTradeItem(List<TransactionalTradeItemType> transactionalTradeItem) {
        this.transactionalTradeItem = transactionalTradeItem;
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

    public TransportInstructionShipmentItemType withTransportCargoCharacteristics(TransportCargoCharacteristicsType transportCargoCharacteristics) {
        this.transportCargoCharacteristics = transportCargoCharacteristics;
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

    public TransportInstructionShipmentItemType withTransportReference(List<TransportReferenceType> transportReference) {
        this.transportReference = transportReference;
        return this;
    }

    /**
     * Aggregated information for a specific package type.
     * 
     */
    @JsonProperty("packageTotal")
    public List<PackageTotalType> getPackageTotal() {
        return packageTotal;
    }

    /**
     * Aggregated information for a specific package type.
     * 
     */
    @JsonProperty("packageTotal")
    public void setPackageTotal(List<PackageTotalType> packageTotal) {
        this.packageTotal = packageTotal;
    }

    public TransportInstructionShipmentItemType withPackageTotal(List<PackageTotalType> packageTotal) {
        this.packageTotal = packageTotal;
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

    public TransportInstructionShipmentItemType withHandlingInstruction(List<HandlingInstructionType> handlingInstruction) {
        this.handlingInstruction = handlingInstruction;
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

    public TransportInstructionShipmentItemType withExtensions(NoCustomExtensionsType extensions) {
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

    public TransportInstructionShipmentItemType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
        return this;
    }

    /**
     * The status of this shipment line item.
     * 
     */
    @JsonProperty("lineStatus")
    public String getLineStatus() {
        return lineStatus;
    }

    /**
     * The status of this shipment line item.
     * 
     */
    @JsonProperty("lineStatus")
    public void setLineStatus(String lineStatus) {
        this.lineStatus = lineStatus;
    }

    public TransportInstructionShipmentItemType withLineStatus(String lineStatus) {
        this.lineStatus = lineStatus;
        return this;
    }

    /**
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipmentItemActionCode")
    public SegmentActionEnumerationType getShipmentItemActionCode() {
        return shipmentItemActionCode;
    }

    /**
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipmentItemActionCode")
    public void setShipmentItemActionCode(SegmentActionEnumerationType shipmentItemActionCode) {
        this.shipmentItemActionCode = shipmentItemActionCode;
    }

    public TransportInstructionShipmentItemType withShipmentItemActionCode(SegmentActionEnumerationType shipmentItemActionCode) {
        this.shipmentItemActionCode = shipmentItemActionCode;
        return this;
    }

    /**
     * Date and time when the document was last updated.
     * 
     */
    @JsonProperty("lastUpdateDateTime")
    public OffsetDateTime getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    /**
     * Date and time when the document was last updated.
     * 
     */
    @JsonProperty("lastUpdateDateTime")
    public void setLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    public TransportInstructionShipmentItemType withLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
        return this;
    }

    /**
     * Unique Identifier of the Order Sub Line. Order Sub Line - Can be used to tie lines together on a single order line to ensure that the inventory for the lines allocate as sets of inventory or as complete groups of inventory.
     * 
     */
    @JsonProperty("subLineId")
    public String getSubLineId() {
        return subLineId;
    }

    /**
     * Unique Identifier of the Order Sub Line. Order Sub Line - Can be used to tie lines together on a single order line to ensure that the inventory for the lines allocate as sets of inventory or as complete groups of inventory.
     * 
     */
    @JsonProperty("subLineId")
    public void setSubLineId(String subLineId) {
        this.subLineId = subLineId;
    }

    public TransportInstructionShipmentItemType withSubLineId(String subLineId) {
        this.subLineId = subLineId;
        return this;
    }

    /**
     * Name of the item.
     * 
     */
    @JsonProperty("itemName")
    public String getItemName() {
        return itemName;
    }

    /**
     * Name of the item.
     * 
     */
    @JsonProperty("itemName")
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public TransportInstructionShipmentItemType withItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

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

    public TransportInstructionShipmentItemType withCommodityTypeCode(List<CodeType> commodityTypeCode) {
        this.commodityTypeCode = commodityTypeCode;
        return this;
    }

    /**
     * TradeItemIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("supplierItemId")
    public TradeItemIdentificationType getSupplierItemId() {
        return supplierItemId;
    }

    /**
     * TradeItemIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("supplierItemId")
    public void setSupplierItemId(TradeItemIdentificationType supplierItemId) {
        this.supplierItemId = supplierItemId;
    }

    public TransportInstructionShipmentItemType withSupplierItemId(TradeItemIdentificationType supplierItemId) {
        this.supplierItemId = supplierItemId;
        return this;
    }

    /**
     * TransportModeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("transportModeCode")
    public TransportModeCode getTransportModeCode() {
        return transportModeCode;
    }

    /**
     * TransportModeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("transportModeCode")
    public void setTransportModeCode(TransportModeCode transportModeCode) {
        this.transportModeCode = transportModeCode;
    }

    public TransportInstructionShipmentItemType withTransportModeCode(TransportModeCode transportModeCode) {
        this.transportModeCode = transportModeCode;
        return this;
    }

    /**
     * Specifies the class of material this item belongs to.
     * 
     */
    @JsonProperty("materialClassification")
    public String getMaterialClassification() {
        return materialClassification;
    }

    /**
     * Specifies the class of material this item belongs to.
     * 
     */
    @JsonProperty("materialClassification")
    public void setMaterialClassification(String materialClassification) {
        this.materialClassification = materialClassification;
    }

    public TransportInstructionShipmentItemType withMaterialClassification(String materialClassification) {
        this.materialClassification = materialClassification;
        return this;
    }

    /**
     * Items which have Lot ID associated with it.
     * 
     */
    @JsonProperty("isLotEnabled")
    public Boolean getIsLotEnabled() {
        return isLotEnabled;
    }

    /**
     * Items which have Lot ID associated with it.
     * 
     */
    @JsonProperty("isLotEnabled")
    public void setIsLotEnabled(Boolean isLotEnabled) {
        this.isLotEnabled = isLotEnabled;
    }

    public TransportInstructionShipmentItemType withIsLotEnabled(Boolean isLotEnabled) {
        this.isLotEnabled = isLotEnabled;
        return this;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("itemOrderValue")
    public AmountType getItemOrderValue() {
        return itemOrderValue;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("itemOrderValue")
    public void setItemOrderValue(AmountType itemOrderValue) {
        this.itemOrderValue = itemOrderValue;
    }

    public TransportInstructionShipmentItemType withItemOrderValue(AmountType itemOrderValue) {
        this.itemOrderValue = itemOrderValue;
        return this;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("itemDeclaredValue")
    public AmountType getItemDeclaredValue() {
        return itemDeclaredValue;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("itemDeclaredValue")
    public void setItemDeclaredValue(AmountType itemDeclaredValue) {
        this.itemDeclaredValue = itemDeclaredValue;
    }

    public TransportInstructionShipmentItemType withItemDeclaredValue(AmountType itemDeclaredValue) {
        this.itemDeclaredValue = itemDeclaredValue;
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

    public TransportInstructionShipmentItemType withTmReferenceNumber(List<TransportManagementReferenceNumberType> tmReferenceNumber) {
        this.tmReferenceNumber = tmReferenceNumber;
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

    public TransportInstructionShipmentItemType withActionCode(SegmentActionEnumerationType actionCode) {
        this.actionCode = actionCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportInstructionShipmentItemType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lineItemNumber");
        sb.append('=');
        sb.append(((this.lineItemNumber == null)?"<null>":this.lineItemNumber));
        sb.append(',');
        sb.append("transactionalTradeItem");
        sb.append('=');
        sb.append(((this.transactionalTradeItem == null)?"<null>":this.transactionalTradeItem));
        sb.append(',');
        sb.append("transportCargoCharacteristics");
        sb.append('=');
        sb.append(((this.transportCargoCharacteristics == null)?"<null>":this.transportCargoCharacteristics));
        sb.append(',');
        sb.append("transportReference");
        sb.append('=');
        sb.append(((this.transportReference == null)?"<null>":this.transportReference));
        sb.append(',');
        sb.append("packageTotal");
        sb.append('=');
        sb.append(((this.packageTotal == null)?"<null>":this.packageTotal));
        sb.append(',');
        sb.append("handlingInstruction");
        sb.append('=');
        sb.append(((this.handlingInstruction == null)?"<null>":this.handlingInstruction));
        sb.append(',');
        sb.append("extensions");
        sb.append('=');
        sb.append(((this.extensions == null)?"<null>":this.extensions));
        sb.append(',');
        sb.append("avpList");
        sb.append('=');
        sb.append(((this.avpList == null)?"<null>":this.avpList));
        sb.append(',');
        sb.append("lineStatus");
        sb.append('=');
        sb.append(((this.lineStatus == null)?"<null>":this.lineStatus));
        sb.append(',');
        sb.append("shipmentItemActionCode");
        sb.append('=');
        sb.append(((this.shipmentItemActionCode == null)?"<null>":this.shipmentItemActionCode));
        sb.append(',');
        sb.append("lastUpdateDateTime");
        sb.append('=');
        sb.append(((this.lastUpdateDateTime == null)?"<null>":this.lastUpdateDateTime));
        sb.append(',');
        sb.append("subLineId");
        sb.append('=');
        sb.append(((this.subLineId == null)?"<null>":this.subLineId));
        sb.append(',');
        sb.append("itemName");
        sb.append('=');
        sb.append(((this.itemName == null)?"<null>":this.itemName));
        sb.append(',');
        sb.append("commodityTypeCode");
        sb.append('=');
        sb.append(((this.commodityTypeCode == null)?"<null>":this.commodityTypeCode));
        sb.append(',');
        sb.append("supplierItemId");
        sb.append('=');
        sb.append(((this.supplierItemId == null)?"<null>":this.supplierItemId));
        sb.append(',');
        sb.append("transportModeCode");
        sb.append('=');
        sb.append(((this.transportModeCode == null)?"<null>":this.transportModeCode));
        sb.append(',');
        sb.append("materialClassification");
        sb.append('=');
        sb.append(((this.materialClassification == null)?"<null>":this.materialClassification));
        sb.append(',');
        sb.append("isLotEnabled");
        sb.append('=');
        sb.append(((this.isLotEnabled == null)?"<null>":this.isLotEnabled));
        sb.append(',');
        sb.append("itemOrderValue");
        sb.append('=');
        sb.append(((this.itemOrderValue == null)?"<null>":this.itemOrderValue));
        sb.append(',');
        sb.append("itemDeclaredValue");
        sb.append('=');
        sb.append(((this.itemDeclaredValue == null)?"<null>":this.itemDeclaredValue));
        sb.append(',');
        sb.append("tmReferenceNumber");
        sb.append('=');
        sb.append(((this.tmReferenceNumber == null)?"<null>":this.tmReferenceNumber));
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
        result = ((result* 31)+((this.lastUpdateDateTime == null)? 0 :this.lastUpdateDateTime.hashCode()));
        result = ((result* 31)+((this.supplierItemId == null)? 0 :this.supplierItemId.hashCode()));
        result = ((result* 31)+((this.transportCargoCharacteristics == null)? 0 :this.transportCargoCharacteristics.hashCode()));
        result = ((result* 31)+((this.transactionalTradeItem == null)? 0 :this.transactionalTradeItem.hashCode()));
        result = ((result* 31)+((this.itemDeclaredValue == null)? 0 :this.itemDeclaredValue.hashCode()));
        result = ((result* 31)+((this.transportModeCode == null)? 0 :this.transportModeCode.hashCode()));
        result = ((result* 31)+((this.shipmentItemActionCode == null)? 0 :this.shipmentItemActionCode.hashCode()));
        result = ((result* 31)+((this.handlingInstruction == null)? 0 :this.handlingInstruction.hashCode()));
        result = ((result* 31)+((this.lineStatus == null)? 0 :this.lineStatus.hashCode()));
        result = ((result* 31)+((this.transportReference == null)? 0 :this.transportReference.hashCode()));
        result = ((result* 31)+((this.materialClassification == null)? 0 :this.materialClassification.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.itemName == null)? 0 :this.itemName.hashCode()));
        result = ((result* 31)+((this.isLotEnabled == null)? 0 :this.isLotEnabled.hashCode()));
        result = ((result* 31)+((this.subLineId == null)? 0 :this.subLineId.hashCode()));
        result = ((result* 31)+((this.actionCode == null)? 0 :this.actionCode.hashCode()));
        result = ((result* 31)+((this.commodityTypeCode == null)? 0 :this.commodityTypeCode.hashCode()));
        result = ((result* 31)+((this.itemOrderValue == null)? 0 :this.itemOrderValue.hashCode()));
        result = ((result* 31)+((this.packageTotal == null)? 0 :this.packageTotal.hashCode()));
        result = ((result* 31)+((this.tmReferenceNumber == null)? 0 :this.tmReferenceNumber.hashCode()));
        result = ((result* 31)+((this.lineItemNumber == null)? 0 :this.lineItemNumber.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportInstructionShipmentItemType) == false) {
            return false;
        }
        TransportInstructionShipmentItemType rhs = ((TransportInstructionShipmentItemType) other);
        return (((((((((((((((((((((((this.lastUpdateDateTime == rhs.lastUpdateDateTime)||((this.lastUpdateDateTime!= null)&&this.lastUpdateDateTime.equals(rhs.lastUpdateDateTime)))&&((this.supplierItemId == rhs.supplierItemId)||((this.supplierItemId!= null)&&this.supplierItemId.equals(rhs.supplierItemId))))&&((this.transportCargoCharacteristics == rhs.transportCargoCharacteristics)||((this.transportCargoCharacteristics!= null)&&this.transportCargoCharacteristics.equals(rhs.transportCargoCharacteristics))))&&((this.transactionalTradeItem == rhs.transactionalTradeItem)||((this.transactionalTradeItem!= null)&&this.transactionalTradeItem.equals(rhs.transactionalTradeItem))))&&((this.itemDeclaredValue == rhs.itemDeclaredValue)||((this.itemDeclaredValue!= null)&&this.itemDeclaredValue.equals(rhs.itemDeclaredValue))))&&((this.transportModeCode == rhs.transportModeCode)||((this.transportModeCode!= null)&&this.transportModeCode.equals(rhs.transportModeCode))))&&((this.shipmentItemActionCode == rhs.shipmentItemActionCode)||((this.shipmentItemActionCode!= null)&&this.shipmentItemActionCode.equals(rhs.shipmentItemActionCode))))&&((this.handlingInstruction == rhs.handlingInstruction)||((this.handlingInstruction!= null)&&this.handlingInstruction.equals(rhs.handlingInstruction))))&&((this.lineStatus == rhs.lineStatus)||((this.lineStatus!= null)&&this.lineStatus.equals(rhs.lineStatus))))&&((this.transportReference == rhs.transportReference)||((this.transportReference!= null)&&this.transportReference.equals(rhs.transportReference))))&&((this.materialClassification == rhs.materialClassification)||((this.materialClassification!= null)&&this.materialClassification.equals(rhs.materialClassification))))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.itemName == rhs.itemName)||((this.itemName!= null)&&this.itemName.equals(rhs.itemName))))&&((this.isLotEnabled == rhs.isLotEnabled)||((this.isLotEnabled!= null)&&this.isLotEnabled.equals(rhs.isLotEnabled))))&&((this.subLineId == rhs.subLineId)||((this.subLineId!= null)&&this.subLineId.equals(rhs.subLineId))))&&((this.actionCode == rhs.actionCode)||((this.actionCode!= null)&&this.actionCode.equals(rhs.actionCode))))&&((this.commodityTypeCode == rhs.commodityTypeCode)||((this.commodityTypeCode!= null)&&this.commodityTypeCode.equals(rhs.commodityTypeCode))))&&((this.itemOrderValue == rhs.itemOrderValue)||((this.itemOrderValue!= null)&&this.itemOrderValue.equals(rhs.itemOrderValue))))&&((this.packageTotal == rhs.packageTotal)||((this.packageTotal!= null)&&this.packageTotal.equals(rhs.packageTotal))))&&((this.tmReferenceNumber == rhs.tmReferenceNumber)||((this.tmReferenceNumber!= null)&&this.tmReferenceNumber.equals(rhs.tmReferenceNumber))))&&((this.lineItemNumber == rhs.lineItemNumber)||((this.lineItemNumber!= null)&&this.lineItemNumber.equals(rhs.lineItemNumber))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
