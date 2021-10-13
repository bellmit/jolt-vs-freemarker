
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
 * TransportInstructionType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "creationDateTime",
    "documentStatusCode",
    "documentActionCode",
    "lastUpdateDateTime",
    "extensions",
    "avpList",
    "entityId",
    "transportInstructionId",
    "transportInstructionFunction",
    "logisticServicesSeller",
    "logisticServicesBuyer",
    "billTo",
    "consignment",
    "shipment",
    "requiresTransportPlanning",
    "senderDocumentId"
})
@Generated("jsonschema2pojo")
public class TransportInstructionType {

    /**
     * Date and time when the document was created.
     * 
     */
    @JsonProperty("creationDateTime")
    @JsonPropertyDescription("Date and time when the document was created.")
    private OffsetDateTime creationDateTime;
    /**
     * DocumentStatusEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("documentStatusCode")
    private DocumentStatusEnumerationType documentStatusCode;
    /**
     * DocumentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("documentActionCode")
    private DocumentActionEnumerationType documentActionCode;
    /**
     * Date and time when the document was last updated.
     * 
     */
    @JsonProperty("lastUpdateDateTime")
    @JsonPropertyDescription("Date and time when the document was last updated.")
    private OffsetDateTime lastUpdateDateTime;
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
     * An internally used identifier used for document tracking.
     * 
     */
    @JsonProperty("entityId")
    @JsonPropertyDescription("An internally used identifier used for document tracking.")
    private String entityId;
    /**
     * The unique identifier of the piece of information, such as the object identifier or the document identifier.
     * (Required)
     * 
     */
    @JsonProperty("transportInstructionId")
    @JsonPropertyDescription("The unique identifier of the piece of information, such as the object identifier or the document identifier.")
    private String transportInstructionId;
    /**
     * TransportInstructionFunctionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportInstructionFunction")
    private TransportInstructionFunctionEnumerationType transportInstructionFunction;
    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticServicesSeller")
    private TransactionalPartyType logisticServicesSeller;
    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticServicesBuyer")
    private TransactionalPartyType logisticServicesBuyer;
    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("billTo")
    private TransactionalPartyType billTo;
    /**
     * A consignment is a logical grouping of goods (one or more physical entities) that is intended to be transported as a whole from a consignor to a consignee by a carrier or freight forwarder via one or more modes of transport, subject to one single transport contract.
     * 
     */
    @JsonProperty("consignment")
    @JsonPropertyDescription("A consignment is a logical grouping of goods (one or more physical entities) that is intended to be transported as a whole from a consignor to a consignee by a carrier or freight forwarder via one or more modes of transport, subject to one single transport contract.")
    private List<TransportInstructionConsignmentType> consignment = new ArrayList<TransportInstructionConsignmentType>();
    /**
     * A shipment is an identifiable collection of one or more Trade Items available to be transported together from the shipper (Original Consignor/Shipper), to the receiver (Final/Ultimate Consignee). Typically the shipment is the entity communicated between trading partners in the Despatch and Receiving Advice.
     * 
     */
    @JsonProperty("shipment")
    @JsonPropertyDescription("A shipment is an identifiable collection of one or more Trade Items available to be transported together from the shipper (Original Consignor/Shipper), to the receiver (Final/Ultimate Consignee). Typically the shipment is the entity communicated between trading partners in the Despatch and Receiving Advice.")
    private List<TransportInstructionShipmentType> shipment = new ArrayList<TransportInstructionShipmentType>();
    /**
     * Used to determine if this order should be sent to the TM system to be planned
     * 
     */
    @JsonProperty("requiresTransportPlanning")
    @JsonPropertyDescription("Used to determine if this order should be sent to the TM system to be planned")
    private Boolean requiresTransportPlanning;
    /**
     * The identification of the original document that was sent.  Examples could be an SAP IDOC number.
     * 
     */
    @JsonProperty("senderDocumentId")
    @JsonPropertyDescription("The identification of the original document that was sent.  Examples could be an SAP IDOC number.")
    private String senderDocumentId;

    /**
     * Date and time when the document was created.
     * 
     */
    @JsonProperty("creationDateTime")
    public OffsetDateTime getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Date and time when the document was created.
     * 
     */
    @JsonProperty("creationDateTime")
    public void setCreationDateTime(OffsetDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public TransportInstructionType withCreationDateTime(OffsetDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * DocumentStatusEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("documentStatusCode")
    public DocumentStatusEnumerationType getDocumentStatusCode() {
        return documentStatusCode;
    }

    /**
     * DocumentStatusEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("documentStatusCode")
    public void setDocumentStatusCode(DocumentStatusEnumerationType documentStatusCode) {
        this.documentStatusCode = documentStatusCode;
    }

    public TransportInstructionType withDocumentStatusCode(DocumentStatusEnumerationType documentStatusCode) {
        this.documentStatusCode = documentStatusCode;
        return this;
    }

    /**
     * DocumentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("documentActionCode")
    public DocumentActionEnumerationType getDocumentActionCode() {
        return documentActionCode;
    }

    /**
     * DocumentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("documentActionCode")
    public void setDocumentActionCode(DocumentActionEnumerationType documentActionCode) {
        this.documentActionCode = documentActionCode;
    }

    public TransportInstructionType withDocumentActionCode(DocumentActionEnumerationType documentActionCode) {
        this.documentActionCode = documentActionCode;
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

    public TransportInstructionType withLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
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

    public TransportInstructionType withExtensions(NoCustomExtensionsType extensions) {
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

    public TransportInstructionType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
        return this;
    }

    /**
     * An internally used identifier used for document tracking.
     * 
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * An internally used identifier used for document tracking.
     * 
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public TransportInstructionType withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * The unique identifier of the piece of information, such as the object identifier or the document identifier.
     * (Required)
     * 
     */
    @JsonProperty("transportInstructionId")
    public String getTransportInstructionId() {
        return transportInstructionId;
    }

    /**
     * The unique identifier of the piece of information, such as the object identifier or the document identifier.
     * (Required)
     * 
     */
    @JsonProperty("transportInstructionId")
    public void setTransportInstructionId(String transportInstructionId) {
        this.transportInstructionId = transportInstructionId;
    }

    public TransportInstructionType withTransportInstructionId(String transportInstructionId) {
        this.transportInstructionId = transportInstructionId;
        return this;
    }

    /**
     * TransportInstructionFunctionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportInstructionFunction")
    public TransportInstructionFunctionEnumerationType getTransportInstructionFunction() {
        return transportInstructionFunction;
    }

    /**
     * TransportInstructionFunctionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportInstructionFunction")
    public void setTransportInstructionFunction(TransportInstructionFunctionEnumerationType transportInstructionFunction) {
        this.transportInstructionFunction = transportInstructionFunction;
    }

    public TransportInstructionType withTransportInstructionFunction(TransportInstructionFunctionEnumerationType transportInstructionFunction) {
        this.transportInstructionFunction = transportInstructionFunction;
        return this;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticServicesSeller")
    public TransactionalPartyType getLogisticServicesSeller() {
        return logisticServicesSeller;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticServicesSeller")
    public void setLogisticServicesSeller(TransactionalPartyType logisticServicesSeller) {
        this.logisticServicesSeller = logisticServicesSeller;
    }

    public TransportInstructionType withLogisticServicesSeller(TransactionalPartyType logisticServicesSeller) {
        this.logisticServicesSeller = logisticServicesSeller;
        return this;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticServicesBuyer")
    public TransactionalPartyType getLogisticServicesBuyer() {
        return logisticServicesBuyer;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticServicesBuyer")
    public void setLogisticServicesBuyer(TransactionalPartyType logisticServicesBuyer) {
        this.logisticServicesBuyer = logisticServicesBuyer;
    }

    public TransportInstructionType withLogisticServicesBuyer(TransactionalPartyType logisticServicesBuyer) {
        this.logisticServicesBuyer = logisticServicesBuyer;
        return this;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("billTo")
    public TransactionalPartyType getBillTo() {
        return billTo;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("billTo")
    public void setBillTo(TransactionalPartyType billTo) {
        this.billTo = billTo;
    }

    public TransportInstructionType withBillTo(TransactionalPartyType billTo) {
        this.billTo = billTo;
        return this;
    }

    /**
     * A consignment is a logical grouping of goods (one or more physical entities) that is intended to be transported as a whole from a consignor to a consignee by a carrier or freight forwarder via one or more modes of transport, subject to one single transport contract.
     * 
     */
    @JsonProperty("consignment")
    public List<TransportInstructionConsignmentType> getConsignment() {
        return consignment;
    }

    /**
     * A consignment is a logical grouping of goods (one or more physical entities) that is intended to be transported as a whole from a consignor to a consignee by a carrier or freight forwarder via one or more modes of transport, subject to one single transport contract.
     * 
     */
    @JsonProperty("consignment")
    public void setConsignment(List<TransportInstructionConsignmentType> consignment) {
        this.consignment = consignment;
    }

    public TransportInstructionType withConsignment(List<TransportInstructionConsignmentType> consignment) {
        this.consignment = consignment;
        return this;
    }

    /**
     * A shipment is an identifiable collection of one or more Trade Items available to be transported together from the shipper (Original Consignor/Shipper), to the receiver (Final/Ultimate Consignee). Typically the shipment is the entity communicated between trading partners in the Despatch and Receiving Advice.
     * 
     */
    @JsonProperty("shipment")
    public List<TransportInstructionShipmentType> getShipment() {
        return shipment;
    }

    /**
     * A shipment is an identifiable collection of one or more Trade Items available to be transported together from the shipper (Original Consignor/Shipper), to the receiver (Final/Ultimate Consignee). Typically the shipment is the entity communicated between trading partners in the Despatch and Receiving Advice.
     * 
     */
    @JsonProperty("shipment")
    public void setShipment(List<TransportInstructionShipmentType> shipment) {
        this.shipment = shipment;
    }

    public TransportInstructionType withShipment(List<TransportInstructionShipmentType> shipment) {
        this.shipment = shipment;
        return this;
    }

    /**
     * Used to determine if this order should be sent to the TM system to be planned
     * 
     */
    @JsonProperty("requiresTransportPlanning")
    public Boolean getRequiresTransportPlanning() {
        return requiresTransportPlanning;
    }

    /**
     * Used to determine if this order should be sent to the TM system to be planned
     * 
     */
    @JsonProperty("requiresTransportPlanning")
    public void setRequiresTransportPlanning(Boolean requiresTransportPlanning) {
        this.requiresTransportPlanning = requiresTransportPlanning;
    }

    public TransportInstructionType withRequiresTransportPlanning(Boolean requiresTransportPlanning) {
        this.requiresTransportPlanning = requiresTransportPlanning;
        return this;
    }

    /**
     * The identification of the original document that was sent.  Examples could be an SAP IDOC number.
     * 
     */
    @JsonProperty("senderDocumentId")
    public String getSenderDocumentId() {
        return senderDocumentId;
    }

    /**
     * The identification of the original document that was sent.  Examples could be an SAP IDOC number.
     * 
     */
    @JsonProperty("senderDocumentId")
    public void setSenderDocumentId(String senderDocumentId) {
        this.senderDocumentId = senderDocumentId;
    }

    public TransportInstructionType withSenderDocumentId(String senderDocumentId) {
        this.senderDocumentId = senderDocumentId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportInstructionType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("creationDateTime");
        sb.append('=');
        sb.append(((this.creationDateTime == null)?"<null>":this.creationDateTime));
        sb.append(',');
        sb.append("documentStatusCode");
        sb.append('=');
        sb.append(((this.documentStatusCode == null)?"<null>":this.documentStatusCode));
        sb.append(',');
        sb.append("documentActionCode");
        sb.append('=');
        sb.append(((this.documentActionCode == null)?"<null>":this.documentActionCode));
        sb.append(',');
        sb.append("lastUpdateDateTime");
        sb.append('=');
        sb.append(((this.lastUpdateDateTime == null)?"<null>":this.lastUpdateDateTime));
        sb.append(',');
        sb.append("extensions");
        sb.append('=');
        sb.append(((this.extensions == null)?"<null>":this.extensions));
        sb.append(',');
        sb.append("avpList");
        sb.append('=');
        sb.append(((this.avpList == null)?"<null>":this.avpList));
        sb.append(',');
        sb.append("entityId");
        sb.append('=');
        sb.append(((this.entityId == null)?"<null>":this.entityId));
        sb.append(',');
        sb.append("transportInstructionId");
        sb.append('=');
        sb.append(((this.transportInstructionId == null)?"<null>":this.transportInstructionId));
        sb.append(',');
        sb.append("transportInstructionFunction");
        sb.append('=');
        sb.append(((this.transportInstructionFunction == null)?"<null>":this.transportInstructionFunction));
        sb.append(',');
        sb.append("logisticServicesSeller");
        sb.append('=');
        sb.append(((this.logisticServicesSeller == null)?"<null>":this.logisticServicesSeller));
        sb.append(',');
        sb.append("logisticServicesBuyer");
        sb.append('=');
        sb.append(((this.logisticServicesBuyer == null)?"<null>":this.logisticServicesBuyer));
        sb.append(',');
        sb.append("billTo");
        sb.append('=');
        sb.append(((this.billTo == null)?"<null>":this.billTo));
        sb.append(',');
        sb.append("consignment");
        sb.append('=');
        sb.append(((this.consignment == null)?"<null>":this.consignment));
        sb.append(',');
        sb.append("shipment");
        sb.append('=');
        sb.append(((this.shipment == null)?"<null>":this.shipment));
        sb.append(',');
        sb.append("requiresTransportPlanning");
        sb.append('=');
        sb.append(((this.requiresTransportPlanning == null)?"<null>":this.requiresTransportPlanning));
        sb.append(',');
        sb.append("senderDocumentId");
        sb.append('=');
        sb.append(((this.senderDocumentId == null)?"<null>":this.senderDocumentId));
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
        result = ((result* 31)+((this.transportInstructionFunction == null)? 0 :this.transportInstructionFunction.hashCode()));
        result = ((result* 31)+((this.logisticServicesBuyer == null)? 0 :this.logisticServicesBuyer.hashCode()));
        result = ((result* 31)+((this.shipment == null)? 0 :this.shipment.hashCode()));
        result = ((result* 31)+((this.documentStatusCode == null)? 0 :this.documentStatusCode.hashCode()));
        result = ((result* 31)+((this.entityId == null)? 0 :this.entityId.hashCode()));
        result = ((result* 31)+((this.documentActionCode == null)? 0 :this.documentActionCode.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.logisticServicesSeller == null)? 0 :this.logisticServicesSeller.hashCode()));
        result = ((result* 31)+((this.senderDocumentId == null)? 0 :this.senderDocumentId.hashCode()));
        result = ((result* 31)+((this.requiresTransportPlanning == null)? 0 :this.requiresTransportPlanning.hashCode()));
        result = ((result* 31)+((this.billTo == null)? 0 :this.billTo.hashCode()));
        result = ((result* 31)+((this.consignment == null)? 0 :this.consignment.hashCode()));
        result = ((result* 31)+((this.transportInstructionId == null)? 0 :this.transportInstructionId.hashCode()));
        result = ((result* 31)+((this.creationDateTime == null)? 0 :this.creationDateTime.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportInstructionType) == false) {
            return false;
        }
        TransportInstructionType rhs = ((TransportInstructionType) other);
        return (((((((((((((((((this.lastUpdateDateTime == rhs.lastUpdateDateTime)||((this.lastUpdateDateTime!= null)&&this.lastUpdateDateTime.equals(rhs.lastUpdateDateTime)))&&((this.transportInstructionFunction == rhs.transportInstructionFunction)||((this.transportInstructionFunction!= null)&&this.transportInstructionFunction.equals(rhs.transportInstructionFunction))))&&((this.logisticServicesBuyer == rhs.logisticServicesBuyer)||((this.logisticServicesBuyer!= null)&&this.logisticServicesBuyer.equals(rhs.logisticServicesBuyer))))&&((this.shipment == rhs.shipment)||((this.shipment!= null)&&this.shipment.equals(rhs.shipment))))&&((this.documentStatusCode == rhs.documentStatusCode)||((this.documentStatusCode!= null)&&this.documentStatusCode.equals(rhs.documentStatusCode))))&&((this.entityId == rhs.entityId)||((this.entityId!= null)&&this.entityId.equals(rhs.entityId))))&&((this.documentActionCode == rhs.documentActionCode)||((this.documentActionCode!= null)&&this.documentActionCode.equals(rhs.documentActionCode))))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.logisticServicesSeller == rhs.logisticServicesSeller)||((this.logisticServicesSeller!= null)&&this.logisticServicesSeller.equals(rhs.logisticServicesSeller))))&&((this.senderDocumentId == rhs.senderDocumentId)||((this.senderDocumentId!= null)&&this.senderDocumentId.equals(rhs.senderDocumentId))))&&((this.requiresTransportPlanning == rhs.requiresTransportPlanning)||((this.requiresTransportPlanning!= null)&&this.requiresTransportPlanning.equals(rhs.requiresTransportPlanning))))&&((this.billTo == rhs.billTo)||((this.billTo!= null)&&this.billTo.equals(rhs.billTo))))&&((this.consignment == rhs.consignment)||((this.consignment!= null)&&this.consignment.equals(rhs.consignment))))&&((this.transportInstructionId == rhs.transportInstructionId)||((this.transportInstructionId!= null)&&this.transportInstructionId.equals(rhs.transportInstructionId))))&&((this.creationDateTime == rhs.creationDateTime)||((this.creationDateTime!= null)&&this.creationDateTime.equals(rhs.creationDateTime))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
