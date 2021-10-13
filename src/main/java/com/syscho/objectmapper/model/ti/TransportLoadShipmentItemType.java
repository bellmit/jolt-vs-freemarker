
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TransportLoadShipmentItemType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lineItemNumber",
    "transactionalTradeItem",
    "requestedTradeItem",
    "transportCargoCharacteristics",
    "transportReference",
    "tmReferenceNumber",
    "plannedInventoryStatus",
    "sourcingMethod",
    "sourcingCost",
    "extensions",
    "avpList",
    "actionCode"
})
@Generated("jsonschema2pojo")
public class TransportLoadShipmentItemType {

    /**
     * Provides the line number associated to the Line Item.
     * (Required)
     * 
     */
    @JsonProperty("lineItemNumber")
    @JsonPropertyDescription("Provides the line number associated to the Line Item.")
    private Integer lineItemNumber;
    /**
     * A trade item is any item (product or service) upon which there is a need to retrieve pre-defined information and that may be priced, or ordered, or invoiced at any point in any supply chain.
     * 
     */
    @JsonProperty("transactionalTradeItem")
    @JsonPropertyDescription("A trade item is any item (product or service) upon which there is a need to retrieve pre-defined information and that may be priced, or ordered, or invoiced at any point in any supply chain.")
    private List<TransactionalTradeItemType> transactionalTradeItem = new ArrayList<TransactionalTradeItemType>();
    /**
     * TransactionalTradeItemType
     * <p>
     * 
     * 
     */
    @JsonProperty("requestedTradeItem")
    private TransactionalTradeItemType requestedTradeItem;
    /**
     * TransportCargoCharacteristicsType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportCargoCharacteristics")
    private TransportCargoCharacteristicsType transportCargoCharacteristics;
    /**
     * Reference to associated information in support of related business process.
     * 
     */
    @JsonProperty("transportReference")
    @JsonPropertyDescription("Reference to associated information in support of related business process.")
    private List<TransportLoadTransportReferenceType> transportReference = new ArrayList<TransportLoadTransportReferenceType>();
    /**
     * Used to hold TM reference fields.
     * 
     */
    @JsonProperty("tmReferenceNumber")
    @JsonPropertyDescription("Used to hold TM reference fields.")
    private List<TransportManagementReferenceNumberType> tmReferenceNumber = new ArrayList<TransportManagementReferenceNumberType>();
    /**
     * QuantitySpecificationTypeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("plannedInventoryStatus")
    private QuantitySpecificationTypeCode plannedInventoryStatus;
    /**
     * Refers to the sourcing method used to acquire the inventory.
     * 
     */
    @JsonProperty("sourcingMethod")
    @JsonPropertyDescription("Refers to the sourcing method used to acquire the inventory.")
    private String sourcingMethod;
    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("sourcingCost")
    private AmountType sourcingCost;
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
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("actionCode")
    private SegmentActionEnumerationType actionCode;

    /**
     * Provides the line number associated to the Line Item.
     * (Required)
     * 
     */
    @JsonProperty("lineItemNumber")
    public Integer getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Provides the line number associated to the Line Item.
     * (Required)
     * 
     */
    @JsonProperty("lineItemNumber")
    public void setLineItemNumber(Integer lineItemNumber) {
        this.lineItemNumber = lineItemNumber;
    }

    public TransportLoadShipmentItemType withLineItemNumber(Integer lineItemNumber) {
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

    public TransportLoadShipmentItemType withTransactionalTradeItem(List<TransactionalTradeItemType> transactionalTradeItem) {
        this.transactionalTradeItem = transactionalTradeItem;
        return this;
    }

    /**
     * TransactionalTradeItemType
     * <p>
     * 
     * 
     */
    @JsonProperty("requestedTradeItem")
    public TransactionalTradeItemType getRequestedTradeItem() {
        return requestedTradeItem;
    }

    /**
     * TransactionalTradeItemType
     * <p>
     * 
     * 
     */
    @JsonProperty("requestedTradeItem")
    public void setRequestedTradeItem(TransactionalTradeItemType requestedTradeItem) {
        this.requestedTradeItem = requestedTradeItem;
    }

    public TransportLoadShipmentItemType withRequestedTradeItem(TransactionalTradeItemType requestedTradeItem) {
        this.requestedTradeItem = requestedTradeItem;
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

    public TransportLoadShipmentItemType withTransportCargoCharacteristics(TransportCargoCharacteristicsType transportCargoCharacteristics) {
        this.transportCargoCharacteristics = transportCargoCharacteristics;
        return this;
    }

    /**
     * Reference to associated information in support of related business process.
     * 
     */
    @JsonProperty("transportReference")
    public List<TransportLoadTransportReferenceType> getTransportReference() {
        return transportReference;
    }

    /**
     * Reference to associated information in support of related business process.
     * 
     */
    @JsonProperty("transportReference")
    public void setTransportReference(List<TransportLoadTransportReferenceType> transportReference) {
        this.transportReference = transportReference;
    }

    public TransportLoadShipmentItemType withTransportReference(List<TransportLoadTransportReferenceType> transportReference) {
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

    public TransportLoadShipmentItemType withTmReferenceNumber(List<TransportManagementReferenceNumberType> tmReferenceNumber) {
        this.tmReferenceNumber = tmReferenceNumber;
        return this;
    }

    /**
     * QuantitySpecificationTypeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("plannedInventoryStatus")
    public QuantitySpecificationTypeCode getPlannedInventoryStatus() {
        return plannedInventoryStatus;
    }

    /**
     * QuantitySpecificationTypeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("plannedInventoryStatus")
    public void setPlannedInventoryStatus(QuantitySpecificationTypeCode plannedInventoryStatus) {
        this.plannedInventoryStatus = plannedInventoryStatus;
    }

    public TransportLoadShipmentItemType withPlannedInventoryStatus(QuantitySpecificationTypeCode plannedInventoryStatus) {
        this.plannedInventoryStatus = plannedInventoryStatus;
        return this;
    }

    /**
     * Refers to the sourcing method used to acquire the inventory.
     * 
     */
    @JsonProperty("sourcingMethod")
    public String getSourcingMethod() {
        return sourcingMethod;
    }

    /**
     * Refers to the sourcing method used to acquire the inventory.
     * 
     */
    @JsonProperty("sourcingMethod")
    public void setSourcingMethod(String sourcingMethod) {
        this.sourcingMethod = sourcingMethod;
    }

    public TransportLoadShipmentItemType withSourcingMethod(String sourcingMethod) {
        this.sourcingMethod = sourcingMethod;
        return this;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("sourcingCost")
    public AmountType getSourcingCost() {
        return sourcingCost;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("sourcingCost")
    public void setSourcingCost(AmountType sourcingCost) {
        this.sourcingCost = sourcingCost;
    }

    public TransportLoadShipmentItemType withSourcingCost(AmountType sourcingCost) {
        this.sourcingCost = sourcingCost;
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

    public TransportLoadShipmentItemType withExtensions(NoCustomExtensionsType extensions) {
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

    public TransportLoadShipmentItemType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
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

    public TransportLoadShipmentItemType withActionCode(SegmentActionEnumerationType actionCode) {
        this.actionCode = actionCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportLoadShipmentItemType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lineItemNumber");
        sb.append('=');
        sb.append(((this.lineItemNumber == null)?"<null>":this.lineItemNumber));
        sb.append(',');
        sb.append("transactionalTradeItem");
        sb.append('=');
        sb.append(((this.transactionalTradeItem == null)?"<null>":this.transactionalTradeItem));
        sb.append(',');
        sb.append("requestedTradeItem");
        sb.append('=');
        sb.append(((this.requestedTradeItem == null)?"<null>":this.requestedTradeItem));
        sb.append(',');
        sb.append("transportCargoCharacteristics");
        sb.append('=');
        sb.append(((this.transportCargoCharacteristics == null)?"<null>":this.transportCargoCharacteristics));
        sb.append(',');
        sb.append("transportReference");
        sb.append('=');
        sb.append(((this.transportReference == null)?"<null>":this.transportReference));
        sb.append(',');
        sb.append("tmReferenceNumber");
        sb.append('=');
        sb.append(((this.tmReferenceNumber == null)?"<null>":this.tmReferenceNumber));
        sb.append(',');
        sb.append("plannedInventoryStatus");
        sb.append('=');
        sb.append(((this.plannedInventoryStatus == null)?"<null>":this.plannedInventoryStatus));
        sb.append(',');
        sb.append("sourcingMethod");
        sb.append('=');
        sb.append(((this.sourcingMethod == null)?"<null>":this.sourcingMethod));
        sb.append(',');
        sb.append("sourcingCost");
        sb.append('=');
        sb.append(((this.sourcingCost == null)?"<null>":this.sourcingCost));
        sb.append(',');
        sb.append("extensions");
        sb.append('=');
        sb.append(((this.extensions == null)?"<null>":this.extensions));
        sb.append(',');
        sb.append("avpList");
        sb.append('=');
        sb.append(((this.avpList == null)?"<null>":this.avpList));
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
        result = ((result* 31)+((this.sourcingCost == null)? 0 :this.sourcingCost.hashCode()));
        result = ((result* 31)+((this.transportCargoCharacteristics == null)? 0 :this.transportCargoCharacteristics.hashCode()));
        result = ((result* 31)+((this.sourcingMethod == null)? 0 :this.sourcingMethod.hashCode()));
        result = ((result* 31)+((this.transactionalTradeItem == null)? 0 :this.transactionalTradeItem.hashCode()));
        result = ((result* 31)+((this.requestedTradeItem == null)? 0 :this.requestedTradeItem.hashCode()));
        result = ((result* 31)+((this.transportReference == null)? 0 :this.transportReference.hashCode()));
        result = ((result* 31)+((this.plannedInventoryStatus == null)? 0 :this.plannedInventoryStatus.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.actionCode == null)? 0 :this.actionCode.hashCode()));
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
        if ((other instanceof TransportLoadShipmentItemType) == false) {
            return false;
        }
        TransportLoadShipmentItemType rhs = ((TransportLoadShipmentItemType) other);
        return (((((((((((((this.sourcingCost == rhs.sourcingCost)||((this.sourcingCost!= null)&&this.sourcingCost.equals(rhs.sourcingCost)))&&((this.transportCargoCharacteristics == rhs.transportCargoCharacteristics)||((this.transportCargoCharacteristics!= null)&&this.transportCargoCharacteristics.equals(rhs.transportCargoCharacteristics))))&&((this.sourcingMethod == rhs.sourcingMethod)||((this.sourcingMethod!= null)&&this.sourcingMethod.equals(rhs.sourcingMethod))))&&((this.transactionalTradeItem == rhs.transactionalTradeItem)||((this.transactionalTradeItem!= null)&&this.transactionalTradeItem.equals(rhs.transactionalTradeItem))))&&((this.requestedTradeItem == rhs.requestedTradeItem)||((this.requestedTradeItem!= null)&&this.requestedTradeItem.equals(rhs.requestedTradeItem))))&&((this.transportReference == rhs.transportReference)||((this.transportReference!= null)&&this.transportReference.equals(rhs.transportReference))))&&((this.plannedInventoryStatus == rhs.plannedInventoryStatus)||((this.plannedInventoryStatus!= null)&&this.plannedInventoryStatus.equals(rhs.plannedInventoryStatus))))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.actionCode == rhs.actionCode)||((this.actionCode!= null)&&this.actionCode.equals(rhs.actionCode))))&&((this.tmReferenceNumber == rhs.tmReferenceNumber)||((this.tmReferenceNumber!= null)&&this.tmReferenceNumber.equals(rhs.tmReferenceNumber))))&&((this.lineItemNumber == rhs.lineItemNumber)||((this.lineItemNumber!= null)&&this.lineItemNumber.equals(rhs.lineItemNumber))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
