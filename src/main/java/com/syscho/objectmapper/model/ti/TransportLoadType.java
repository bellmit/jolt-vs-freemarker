
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
 * TransportLoadType
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
    "transportLoadId",
    "loadStatusCode",
    "logisticServicesSeller",
    "logisticServicesBuyer",
    "transportModeCode",
    "transportCargoCharacteristics",
    "transportServiceCategoryType",
    "transportServiceLevelCode",
    "carrier",
    "driver",
    "transportEquipment",
    "transportReference",
    "loadStartDateTime",
    "loadEndDateTime",
    "tmReferenceNumber",
    "note",
    "numberOfPickUpStops",
    "numberOfDropOffStops",
    "externalTransportServiceLevelCode1",
    "externalTransportServiceLevelCode2",
    "tripId",
    "tripInformation",
    "stop",
    "shipment"
})
@Generated("jsonschema2pojo")
public class TransportLoadType {

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
    @JsonProperty("transportLoadId")
    @JsonPropertyDescription("The unique identifier of the piece of information, such as the object identifier or the document identifier.")
    private String transportLoadId;
    /**
     * LoadStatusCode
     * <p>
     * 
     * 
     */
    @JsonProperty("loadStatusCode")
    private LoadStatusCode loadStatusCode;
    /**
     * TransactionalPartyType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("logisticServicesSeller")
    private TransactionalPartyType logisticServicesSeller;
    /**
     * TransactionalPartyType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("logisticServicesBuyer")
    private TransactionalPartyType logisticServicesBuyer;
    /**
     * TransportModeCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportModeCode")
    private TransportModeCode transportModeCode;
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
     * TransportServiceCategoryCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportServiceCategoryType")
    private TransportServiceCategoryCode transportServiceCategoryType;
    /**
     * TransportServiceLevelCode
     * <p>
     * 
     * 
     */
    @JsonProperty("transportServiceLevelCode")
    private TransportServiceLevelCode transportServiceLevelCode;
    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("carrier")
    private TransactionalPartyType carrier;
    /**
     * LoadDriverType
     * <p>
     * 
     * 
     */
    @JsonProperty("driver")
    private LoadDriverType driver;
    /**
     * TransportInstructionTransportEquipmentType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportEquipment")
    private TransportInstructionTransportEquipmentType transportEquipment;
    /**
     * Reference to associated information in support of related business processes. E.g. a purchase order, a bank account number.
     * 
     */
    @JsonProperty("transportReference")
    @JsonPropertyDescription("Reference to associated information in support of related business processes. E.g. a purchase order, a bank account number.")
    private List<TransportReferenceType> transportReference = new ArrayList<TransportReferenceType>();
    /**
     * The date and time on which the load is planed to begin moving.
     * 
     */
    @JsonProperty("loadStartDateTime")
    @JsonPropertyDescription("The date and time on which the load is planed to begin moving.")
    private OffsetDateTime loadStartDateTime;
    /**
     * The date and time the load is planned to be completed with its activity.
     * 
     */
    @JsonProperty("loadEndDateTime")
    @JsonPropertyDescription("The date and time the load is planned to be completed with its activity.")
    private OffsetDateTime loadEndDateTime;
    /**
     * Transportation reference information at the load level.
     * 
     */
    @JsonProperty("tmReferenceNumber")
    @JsonPropertyDescription("Transportation reference information at the load level.")
    private List<TransportManagementReferenceNumberType> tmReferenceNumber = new ArrayList<TransportManagementReferenceNumberType>();
    /**
     * Description500Type
     * <p>
     * 
     * 
     */
    @JsonProperty("note")
    private Description500Type note;
    /**
     * Number of stops on this load where goods are loaded onto the truck.
     * 
     */
    @JsonProperty("numberOfPickUpStops")
    @JsonPropertyDescription("Number of stops on this load where goods are loaded onto the truck.")
    private Integer numberOfPickUpStops;
    /**
     * Number of stops on this load where goods are unloaded from the truck.
     * 
     */
    @JsonProperty("numberOfDropOffStops")
    @JsonPropertyDescription("Number of stops on this load where goods are unloaded from the truck.")
    private Integer numberOfDropOffStops;
    /**
     * Code specifying an external e.g. customer-provided, transport service level.
     * 
     */
    @JsonProperty("externalTransportServiceLevelCode1")
    @JsonPropertyDescription("Code specifying an external e.g. customer-provided, transport service level.")
    private String externalTransportServiceLevelCode1;
    /**
     * Code specifying an external e.g. customer-provided, transport service level.
     * 
     */
    @JsonProperty("externalTransportServiceLevelCode2")
    @JsonPropertyDescription("Code specifying an external e.g. customer-provided, transport service level.")
    private String externalTransportServiceLevelCode2;
    /**
     * The identification of the trip this load is on.
     * 
     */
    @JsonProperty("tripId")
    @JsonPropertyDescription("The identification of the trip this load is on.")
    private String tripId;
    /**
     * TripInformationType
     * <p>
     * 
     * 
     */
    @JsonProperty("tripInformation")
    private TripInformationType tripInformation;
    /**
     * Information about stops on a load.
     * (Required)
     * 
     */
    @JsonProperty("stop")
    @JsonPropertyDescription("Information about stops on a load.")
    private List<TransportLoadStopType> stop = new ArrayList<TransportLoadStopType>();
    /**
     * A shipment is an identifiable collection of one or more Trade Items available to be transported together from the shipper (Original Consignor/Shipper), to the receiver (Final/Ultimate Consignee). Typically the shipment is the entity communicated between trading partners in the Despatch and Receiving Advice.
     * 
     */
    @JsonProperty("shipment")
    @JsonPropertyDescription("A shipment is an identifiable collection of one or more Trade Items available to be transported together from the shipper (Original Consignor/Shipper), to the receiver (Final/Ultimate Consignee). Typically the shipment is the entity communicated between trading partners in the Despatch and Receiving Advice.")
    private List<TransportLoadShipmentType> shipment = new ArrayList<TransportLoadShipmentType>();

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

    public TransportLoadType withCreationDateTime(OffsetDateTime creationDateTime) {
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

    public TransportLoadType withDocumentStatusCode(DocumentStatusEnumerationType documentStatusCode) {
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

    public TransportLoadType withDocumentActionCode(DocumentActionEnumerationType documentActionCode) {
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

    public TransportLoadType withLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
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

    public TransportLoadType withExtensions(NoCustomExtensionsType extensions) {
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

    public TransportLoadType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
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

    public TransportLoadType withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * The unique identifier of the piece of information, such as the object identifier or the document identifier.
     * (Required)
     * 
     */
    @JsonProperty("transportLoadId")
    public String getTransportLoadId() {
        return transportLoadId;
    }

    /**
     * The unique identifier of the piece of information, such as the object identifier or the document identifier.
     * (Required)
     * 
     */
    @JsonProperty("transportLoadId")
    public void setTransportLoadId(String transportLoadId) {
        this.transportLoadId = transportLoadId;
    }

    public TransportLoadType withTransportLoadId(String transportLoadId) {
        this.transportLoadId = transportLoadId;
        return this;
    }

    /**
     * LoadStatusCode
     * <p>
     * 
     * 
     */
    @JsonProperty("loadStatusCode")
    public LoadStatusCode getLoadStatusCode() {
        return loadStatusCode;
    }

    /**
     * LoadStatusCode
     * <p>
     * 
     * 
     */
    @JsonProperty("loadStatusCode")
    public void setLoadStatusCode(LoadStatusCode loadStatusCode) {
        this.loadStatusCode = loadStatusCode;
    }

    public TransportLoadType withLoadStatusCode(LoadStatusCode loadStatusCode) {
        this.loadStatusCode = loadStatusCode;
        return this;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("logisticServicesSeller")
    public void setLogisticServicesSeller(TransactionalPartyType logisticServicesSeller) {
        this.logisticServicesSeller = logisticServicesSeller;
    }

    public TransportLoadType withLogisticServicesSeller(TransactionalPartyType logisticServicesSeller) {
        this.logisticServicesSeller = logisticServicesSeller;
        return this;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("logisticServicesBuyer")
    public void setLogisticServicesBuyer(TransactionalPartyType logisticServicesBuyer) {
        this.logisticServicesBuyer = logisticServicesBuyer;
    }

    public TransportLoadType withLogisticServicesBuyer(TransactionalPartyType logisticServicesBuyer) {
        this.logisticServicesBuyer = logisticServicesBuyer;
        return this;
    }

    /**
     * TransportModeCode
     * <p>
     * 
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("transportModeCode")
    public void setTransportModeCode(TransportModeCode transportModeCode) {
        this.transportModeCode = transportModeCode;
    }

    public TransportLoadType withTransportModeCode(TransportModeCode transportModeCode) {
        this.transportModeCode = transportModeCode;
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

    public TransportLoadType withTransportCargoCharacteristics(TransportCargoCharacteristicsType transportCargoCharacteristics) {
        this.transportCargoCharacteristics = transportCargoCharacteristics;
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

    public TransportLoadType withTransportServiceCategoryType(TransportServiceCategoryCode transportServiceCategoryType) {
        this.transportServiceCategoryType = transportServiceCategoryType;
        return this;
    }

    /**
     * TransportServiceLevelCode
     * <p>
     * 
     * 
     */
    @JsonProperty("transportServiceLevelCode")
    public TransportServiceLevelCode getTransportServiceLevelCode() {
        return transportServiceLevelCode;
    }

    /**
     * TransportServiceLevelCode
     * <p>
     * 
     * 
     */
    @JsonProperty("transportServiceLevelCode")
    public void setTransportServiceLevelCode(TransportServiceLevelCode transportServiceLevelCode) {
        this.transportServiceLevelCode = transportServiceLevelCode;
    }

    public TransportLoadType withTransportServiceLevelCode(TransportServiceLevelCode transportServiceLevelCode) {
        this.transportServiceLevelCode = transportServiceLevelCode;
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

    public TransportLoadType withCarrier(TransactionalPartyType carrier) {
        this.carrier = carrier;
        return this;
    }

    /**
     * LoadDriverType
     * <p>
     * 
     * 
     */
    @JsonProperty("driver")
    public LoadDriverType getDriver() {
        return driver;
    }

    /**
     * LoadDriverType
     * <p>
     * 
     * 
     */
    @JsonProperty("driver")
    public void setDriver(LoadDriverType driver) {
        this.driver = driver;
    }

    public TransportLoadType withDriver(LoadDriverType driver) {
        this.driver = driver;
        return this;
    }

    /**
     * TransportInstructionTransportEquipmentType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportEquipment")
    public TransportInstructionTransportEquipmentType getTransportEquipment() {
        return transportEquipment;
    }

    /**
     * TransportInstructionTransportEquipmentType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportEquipment")
    public void setTransportEquipment(TransportInstructionTransportEquipmentType transportEquipment) {
        this.transportEquipment = transportEquipment;
    }

    public TransportLoadType withTransportEquipment(TransportInstructionTransportEquipmentType transportEquipment) {
        this.transportEquipment = transportEquipment;
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

    public TransportLoadType withTransportReference(List<TransportReferenceType> transportReference) {
        this.transportReference = transportReference;
        return this;
    }

    /**
     * The date and time on which the load is planed to begin moving.
     * 
     */
    @JsonProperty("loadStartDateTime")
    public OffsetDateTime getLoadStartDateTime() {
        return loadStartDateTime;
    }

    /**
     * The date and time on which the load is planed to begin moving.
     * 
     */
    @JsonProperty("loadStartDateTime")
    public void setLoadStartDateTime(OffsetDateTime loadStartDateTime) {
        this.loadStartDateTime = loadStartDateTime;
    }

    public TransportLoadType withLoadStartDateTime(OffsetDateTime loadStartDateTime) {
        this.loadStartDateTime = loadStartDateTime;
        return this;
    }

    /**
     * The date and time the load is planned to be completed with its activity.
     * 
     */
    @JsonProperty("loadEndDateTime")
    public OffsetDateTime getLoadEndDateTime() {
        return loadEndDateTime;
    }

    /**
     * The date and time the load is planned to be completed with its activity.
     * 
     */
    @JsonProperty("loadEndDateTime")
    public void setLoadEndDateTime(OffsetDateTime loadEndDateTime) {
        this.loadEndDateTime = loadEndDateTime;
    }

    public TransportLoadType withLoadEndDateTime(OffsetDateTime loadEndDateTime) {
        this.loadEndDateTime = loadEndDateTime;
        return this;
    }

    /**
     * Transportation reference information at the load level.
     * 
     */
    @JsonProperty("tmReferenceNumber")
    public List<TransportManagementReferenceNumberType> getTmReferenceNumber() {
        return tmReferenceNumber;
    }

    /**
     * Transportation reference information at the load level.
     * 
     */
    @JsonProperty("tmReferenceNumber")
    public void setTmReferenceNumber(List<TransportManagementReferenceNumberType> tmReferenceNumber) {
        this.tmReferenceNumber = tmReferenceNumber;
    }

    public TransportLoadType withTmReferenceNumber(List<TransportManagementReferenceNumberType> tmReferenceNumber) {
        this.tmReferenceNumber = tmReferenceNumber;
        return this;
    }

    /**
     * Description500Type
     * <p>
     * 
     * 
     */
    @JsonProperty("note")
    public Description500Type getNote() {
        return note;
    }

    /**
     * Description500Type
     * <p>
     * 
     * 
     */
    @JsonProperty("note")
    public void setNote(Description500Type note) {
        this.note = note;
    }

    public TransportLoadType withNote(Description500Type note) {
        this.note = note;
        return this;
    }

    /**
     * Number of stops on this load where goods are loaded onto the truck.
     * 
     */
    @JsonProperty("numberOfPickUpStops")
    public Integer getNumberOfPickUpStops() {
        return numberOfPickUpStops;
    }

    /**
     * Number of stops on this load where goods are loaded onto the truck.
     * 
     */
    @JsonProperty("numberOfPickUpStops")
    public void setNumberOfPickUpStops(Integer numberOfPickUpStops) {
        this.numberOfPickUpStops = numberOfPickUpStops;
    }

    public TransportLoadType withNumberOfPickUpStops(Integer numberOfPickUpStops) {
        this.numberOfPickUpStops = numberOfPickUpStops;
        return this;
    }

    /**
     * Number of stops on this load where goods are unloaded from the truck.
     * 
     */
    @JsonProperty("numberOfDropOffStops")
    public Integer getNumberOfDropOffStops() {
        return numberOfDropOffStops;
    }

    /**
     * Number of stops on this load where goods are unloaded from the truck.
     * 
     */
    @JsonProperty("numberOfDropOffStops")
    public void setNumberOfDropOffStops(Integer numberOfDropOffStops) {
        this.numberOfDropOffStops = numberOfDropOffStops;
    }

    public TransportLoadType withNumberOfDropOffStops(Integer numberOfDropOffStops) {
        this.numberOfDropOffStops = numberOfDropOffStops;
        return this;
    }

    /**
     * Code specifying an external e.g. customer-provided, transport service level.
     * 
     */
    @JsonProperty("externalTransportServiceLevelCode1")
    public String getExternalTransportServiceLevelCode1() {
        return externalTransportServiceLevelCode1;
    }

    /**
     * Code specifying an external e.g. customer-provided, transport service level.
     * 
     */
    @JsonProperty("externalTransportServiceLevelCode1")
    public void setExternalTransportServiceLevelCode1(String externalTransportServiceLevelCode1) {
        this.externalTransportServiceLevelCode1 = externalTransportServiceLevelCode1;
    }

    public TransportLoadType withExternalTransportServiceLevelCode1(String externalTransportServiceLevelCode1) {
        this.externalTransportServiceLevelCode1 = externalTransportServiceLevelCode1;
        return this;
    }

    /**
     * Code specifying an external e.g. customer-provided, transport service level.
     * 
     */
    @JsonProperty("externalTransportServiceLevelCode2")
    public String getExternalTransportServiceLevelCode2() {
        return externalTransportServiceLevelCode2;
    }

    /**
     * Code specifying an external e.g. customer-provided, transport service level.
     * 
     */
    @JsonProperty("externalTransportServiceLevelCode2")
    public void setExternalTransportServiceLevelCode2(String externalTransportServiceLevelCode2) {
        this.externalTransportServiceLevelCode2 = externalTransportServiceLevelCode2;
    }

    public TransportLoadType withExternalTransportServiceLevelCode2(String externalTransportServiceLevelCode2) {
        this.externalTransportServiceLevelCode2 = externalTransportServiceLevelCode2;
        return this;
    }

    /**
     * The identification of the trip this load is on.
     * 
     */
    @JsonProperty("tripId")
    public String getTripId() {
        return tripId;
    }

    /**
     * The identification of the trip this load is on.
     * 
     */
    @JsonProperty("tripId")
    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public TransportLoadType withTripId(String tripId) {
        this.tripId = tripId;
        return this;
    }

    /**
     * TripInformationType
     * <p>
     * 
     * 
     */
    @JsonProperty("tripInformation")
    public TripInformationType getTripInformation() {
        return tripInformation;
    }

    /**
     * TripInformationType
     * <p>
     * 
     * 
     */
    @JsonProperty("tripInformation")
    public void setTripInformation(TripInformationType tripInformation) {
        this.tripInformation = tripInformation;
    }

    public TransportLoadType withTripInformation(TripInformationType tripInformation) {
        this.tripInformation = tripInformation;
        return this;
    }

    /**
     * Information about stops on a load.
     * (Required)
     * 
     */
    @JsonProperty("stop")
    public List<TransportLoadStopType> getStop() {
        return stop;
    }

    /**
     * Information about stops on a load.
     * (Required)
     * 
     */
    @JsonProperty("stop")
    public void setStop(List<TransportLoadStopType> stop) {
        this.stop = stop;
    }

    public TransportLoadType withStop(List<TransportLoadStopType> stop) {
        this.stop = stop;
        return this;
    }

    /**
     * A shipment is an identifiable collection of one or more Trade Items available to be transported together from the shipper (Original Consignor/Shipper), to the receiver (Final/Ultimate Consignee). Typically the shipment is the entity communicated between trading partners in the Despatch and Receiving Advice.
     * 
     */
    @JsonProperty("shipment")
    public List<TransportLoadShipmentType> getShipment() {
        return shipment;
    }

    /**
     * A shipment is an identifiable collection of one or more Trade Items available to be transported together from the shipper (Original Consignor/Shipper), to the receiver (Final/Ultimate Consignee). Typically the shipment is the entity communicated between trading partners in the Despatch and Receiving Advice.
     * 
     */
    @JsonProperty("shipment")
    public void setShipment(List<TransportLoadShipmentType> shipment) {
        this.shipment = shipment;
    }

    public TransportLoadType withShipment(List<TransportLoadShipmentType> shipment) {
        this.shipment = shipment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportLoadType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("transportLoadId");
        sb.append('=');
        sb.append(((this.transportLoadId == null)?"<null>":this.transportLoadId));
        sb.append(',');
        sb.append("loadStatusCode");
        sb.append('=');
        sb.append(((this.loadStatusCode == null)?"<null>":this.loadStatusCode));
        sb.append(',');
        sb.append("logisticServicesSeller");
        sb.append('=');
        sb.append(((this.logisticServicesSeller == null)?"<null>":this.logisticServicesSeller));
        sb.append(',');
        sb.append("logisticServicesBuyer");
        sb.append('=');
        sb.append(((this.logisticServicesBuyer == null)?"<null>":this.logisticServicesBuyer));
        sb.append(',');
        sb.append("transportModeCode");
        sb.append('=');
        sb.append(((this.transportModeCode == null)?"<null>":this.transportModeCode));
        sb.append(',');
        sb.append("transportCargoCharacteristics");
        sb.append('=');
        sb.append(((this.transportCargoCharacteristics == null)?"<null>":this.transportCargoCharacteristics));
        sb.append(',');
        sb.append("transportServiceCategoryType");
        sb.append('=');
        sb.append(((this.transportServiceCategoryType == null)?"<null>":this.transportServiceCategoryType));
        sb.append(',');
        sb.append("transportServiceLevelCode");
        sb.append('=');
        sb.append(((this.transportServiceLevelCode == null)?"<null>":this.transportServiceLevelCode));
        sb.append(',');
        sb.append("carrier");
        sb.append('=');
        sb.append(((this.carrier == null)?"<null>":this.carrier));
        sb.append(',');
        sb.append("driver");
        sb.append('=');
        sb.append(((this.driver == null)?"<null>":this.driver));
        sb.append(',');
        sb.append("transportEquipment");
        sb.append('=');
        sb.append(((this.transportEquipment == null)?"<null>":this.transportEquipment));
        sb.append(',');
        sb.append("transportReference");
        sb.append('=');
        sb.append(((this.transportReference == null)?"<null>":this.transportReference));
        sb.append(',');
        sb.append("loadStartDateTime");
        sb.append('=');
        sb.append(((this.loadStartDateTime == null)?"<null>":this.loadStartDateTime));
        sb.append(',');
        sb.append("loadEndDateTime");
        sb.append('=');
        sb.append(((this.loadEndDateTime == null)?"<null>":this.loadEndDateTime));
        sb.append(',');
        sb.append("tmReferenceNumber");
        sb.append('=');
        sb.append(((this.tmReferenceNumber == null)?"<null>":this.tmReferenceNumber));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("numberOfPickUpStops");
        sb.append('=');
        sb.append(((this.numberOfPickUpStops == null)?"<null>":this.numberOfPickUpStops));
        sb.append(',');
        sb.append("numberOfDropOffStops");
        sb.append('=');
        sb.append(((this.numberOfDropOffStops == null)?"<null>":this.numberOfDropOffStops));
        sb.append(',');
        sb.append("externalTransportServiceLevelCode1");
        sb.append('=');
        sb.append(((this.externalTransportServiceLevelCode1 == null)?"<null>":this.externalTransportServiceLevelCode1));
        sb.append(',');
        sb.append("externalTransportServiceLevelCode2");
        sb.append('=');
        sb.append(((this.externalTransportServiceLevelCode2 == null)?"<null>":this.externalTransportServiceLevelCode2));
        sb.append(',');
        sb.append("tripId");
        sb.append('=');
        sb.append(((this.tripId == null)?"<null>":this.tripId));
        sb.append(',');
        sb.append("tripInformation");
        sb.append('=');
        sb.append(((this.tripInformation == null)?"<null>":this.tripInformation));
        sb.append(',');
        sb.append("stop");
        sb.append('=');
        sb.append(((this.stop == null)?"<null>":this.stop));
        sb.append(',');
        sb.append("shipment");
        sb.append('=');
        sb.append(((this.shipment == null)?"<null>":this.shipment));
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
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.documentStatusCode == null)? 0 :this.documentStatusCode.hashCode()));
        result = ((result* 31)+((this.numberOfPickUpStops == null)? 0 :this.numberOfPickUpStops.hashCode()));
        result = ((result* 31)+((this.transportModeCode == null)? 0 :this.transportModeCode.hashCode()));
        result = ((result* 31)+((this.tripId == null)? 0 :this.tripId.hashCode()));
        result = ((result* 31)+((this.transportServiceLevelCode == null)? 0 :this.transportServiceLevelCode.hashCode()));
        result = ((result* 31)+((this.transportServiceCategoryType == null)? 0 :this.transportServiceCategoryType.hashCode()));
        result = ((result* 31)+((this.transportReference == null)? 0 :this.transportReference.hashCode()));
        result = ((result* 31)+((this.loadStatusCode == null)? 0 :this.loadStatusCode.hashCode()));
        result = ((result* 31)+((this.creationDateTime == null)? 0 :this.creationDateTime.hashCode()));
        result = ((result* 31)+((this.lastUpdateDateTime == null)? 0 :this.lastUpdateDateTime.hashCode()));
        result = ((result* 31)+((this.tripInformation == null)? 0 :this.tripInformation.hashCode()));
        result = ((result* 31)+((this.numberOfDropOffStops == null)? 0 :this.numberOfDropOffStops.hashCode()));
        result = ((result* 31)+((this.logisticServicesBuyer == null)? 0 :this.logisticServicesBuyer.hashCode()));
        result = ((result* 31)+((this.transportCargoCharacteristics == null)? 0 :this.transportCargoCharacteristics.hashCode()));
        result = ((result* 31)+((this.shipment == null)? 0 :this.shipment.hashCode()));
        result = ((result* 31)+((this.transportEquipment == null)? 0 :this.transportEquipment.hashCode()));
        result = ((result* 31)+((this.externalTransportServiceLevelCode1 == null)? 0 :this.externalTransportServiceLevelCode1 .hashCode()));
        result = ((result* 31)+((this.externalTransportServiceLevelCode2 == null)? 0 :this.externalTransportServiceLevelCode2 .hashCode()));
        result = ((result* 31)+((this.entityId == null)? 0 :this.entityId.hashCode()));
        result = ((result* 31)+((this.documentActionCode == null)? 0 :this.documentActionCode.hashCode()));
        result = ((result* 31)+((this.loadStartDateTime == null)? 0 :this.loadStartDateTime.hashCode()));
        result = ((result* 31)+((this.transportLoadId == null)? 0 :this.transportLoadId.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.carrier == null)? 0 :this.carrier.hashCode()));
        result = ((result* 31)+((this.logisticServicesSeller == null)? 0 :this.logisticServicesSeller.hashCode()));
        result = ((result* 31)+((this.driver == null)? 0 :this.driver.hashCode()));
        result = ((result* 31)+((this.stop == null)? 0 :this.stop.hashCode()));
        result = ((result* 31)+((this.loadEndDateTime == null)? 0 :this.loadEndDateTime.hashCode()));
        result = ((result* 31)+((this.tmReferenceNumber == null)? 0 :this.tmReferenceNumber.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportLoadType) == false) {
            return false;
        }
        TransportLoadType rhs = ((TransportLoadType) other);
        return ((((((((((((((((((((((((((((((((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note)))&&((this.documentStatusCode == rhs.documentStatusCode)||((this.documentStatusCode!= null)&&this.documentStatusCode.equals(rhs.documentStatusCode))))&&((this.numberOfPickUpStops == rhs.numberOfPickUpStops)||((this.numberOfPickUpStops!= null)&&this.numberOfPickUpStops.equals(rhs.numberOfPickUpStops))))&&((this.transportModeCode == rhs.transportModeCode)||((this.transportModeCode!= null)&&this.transportModeCode.equals(rhs.transportModeCode))))&&((this.tripId == rhs.tripId)||((this.tripId!= null)&&this.tripId.equals(rhs.tripId))))&&((this.transportServiceLevelCode == rhs.transportServiceLevelCode)||((this.transportServiceLevelCode!= null)&&this.transportServiceLevelCode.equals(rhs.transportServiceLevelCode))))&&((this.transportServiceCategoryType == rhs.transportServiceCategoryType)||((this.transportServiceCategoryType!= null)&&this.transportServiceCategoryType.equals(rhs.transportServiceCategoryType))))&&((this.transportReference == rhs.transportReference)||((this.transportReference!= null)&&this.transportReference.equals(rhs.transportReference))))&&((this.loadStatusCode == rhs.loadStatusCode)||((this.loadStatusCode!= null)&&this.loadStatusCode.equals(rhs.loadStatusCode))))&&((this.creationDateTime == rhs.creationDateTime)||((this.creationDateTime!= null)&&this.creationDateTime.equals(rhs.creationDateTime))))&&((this.lastUpdateDateTime == rhs.lastUpdateDateTime)||((this.lastUpdateDateTime!= null)&&this.lastUpdateDateTime.equals(rhs.lastUpdateDateTime))))&&((this.tripInformation == rhs.tripInformation)||((this.tripInformation!= null)&&this.tripInformation.equals(rhs.tripInformation))))&&((this.numberOfDropOffStops == rhs.numberOfDropOffStops)||((this.numberOfDropOffStops!= null)&&this.numberOfDropOffStops.equals(rhs.numberOfDropOffStops))))&&((this.logisticServicesBuyer == rhs.logisticServicesBuyer)||((this.logisticServicesBuyer!= null)&&this.logisticServicesBuyer.equals(rhs.logisticServicesBuyer))))&&((this.transportCargoCharacteristics == rhs.transportCargoCharacteristics)||((this.transportCargoCharacteristics!= null)&&this.transportCargoCharacteristics.equals(rhs.transportCargoCharacteristics))))&&((this.shipment == rhs.shipment)||((this.shipment!= null)&&this.shipment.equals(rhs.shipment))))&&((this.transportEquipment == rhs.transportEquipment)||((this.transportEquipment!= null)&&this.transportEquipment.equals(rhs.transportEquipment))))&&((this.externalTransportServiceLevelCode1 == rhs.externalTransportServiceLevelCode1)||((this.externalTransportServiceLevelCode1 != null)&&this.externalTransportServiceLevelCode1 .equals(rhs.externalTransportServiceLevelCode1))))&&((this.externalTransportServiceLevelCode2 == rhs.externalTransportServiceLevelCode2)||((this.externalTransportServiceLevelCode2 != null)&&this.externalTransportServiceLevelCode2 .equals(rhs.externalTransportServiceLevelCode2))))&&((this.entityId == rhs.entityId)||((this.entityId!= null)&&this.entityId.equals(rhs.entityId))))&&((this.documentActionCode == rhs.documentActionCode)||((this.documentActionCode!= null)&&this.documentActionCode.equals(rhs.documentActionCode))))&&((this.loadStartDateTime == rhs.loadStartDateTime)||((this.loadStartDateTime!= null)&&this.loadStartDateTime.equals(rhs.loadStartDateTime))))&&((this.transportLoadId == rhs.transportLoadId)||((this.transportLoadId!= null)&&this.transportLoadId.equals(rhs.transportLoadId))))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.carrier == rhs.carrier)||((this.carrier!= null)&&this.carrier.equals(rhs.carrier))))&&((this.logisticServicesSeller == rhs.logisticServicesSeller)||((this.logisticServicesSeller!= null)&&this.logisticServicesSeller.equals(rhs.logisticServicesSeller))))&&((this.driver == rhs.driver)||((this.driver!= null)&&this.driver.equals(rhs.driver))))&&((this.stop == rhs.stop)||((this.stop!= null)&&this.stop.equals(rhs.stop))))&&((this.loadEndDateTime == rhs.loadEndDateTime)||((this.loadEndDateTime!= null)&&this.loadEndDateTime.equals(rhs.loadEndDateTime))))&&((this.tmReferenceNumber == rhs.tmReferenceNumber)||((this.tmReferenceNumber!= null)&&this.tmReferenceNumber.equals(rhs.tmReferenceNumber))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
