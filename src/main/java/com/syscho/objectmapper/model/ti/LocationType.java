
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
 * LocationType
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
    "locationId",
    "parentParty",
    "basicLocation",
    "despatchAdviceRestrictionCode",
    "locationHierarchyInformation",
    "logisticDetails",
    "planningDetails",
    "retailDetails",
    "distributionCenterDetails",
    "measures",
    "manufacturingModelInformation",
    "requiresTransportPlanning",
    "senderDocumentId"
})
@Generated("jsonschema2pojo")
public class LocationType {

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
     * LocationTypeExtensions
     * <p>
     * 
     * 
     */
    @JsonProperty("extensions")
    private LocationTypeExtensions extensions;
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
    @JsonProperty("locationId")
    @JsonPropertyDescription("The unique identifier of the piece of information, such as the object identifier or the document identifier.")
    private String locationId;
    /**
     * ParentPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("parentParty")
    private ParentPartyType parentParty;
    /**
     * BasicLocationType
     * <p>
     * 
     * 
     */
    @JsonProperty("basicLocation")
    private BasicLocationType basicLocation;
    /**
     * DespatchAdviceRestrictionCode
     * <p>
     * 
     * 
     */
    @JsonProperty("despatchAdviceRestrictionCode")
    private DespatchAdviceRestrictionCode despatchAdviceRestrictionCode;
    /**
     * HierarchyInformationType
     * <p>
     * 
     * 
     */
    @JsonProperty("locationHierarchyInformation")
    private HierarchyInformationType locationHierarchyInformation;
    /**
     * LogisticDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticDetails")
    private LogisticDetailsType logisticDetails;
    /**
     * PlanningDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("planningDetails")
    private PlanningDetailsType planningDetails;
    /**
     * RetailDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("retailDetails")
    private RetailDetailsType retailDetails;
    /**
     * Detailed information needed for an individual warehouse that replenishes goods for the store.
     * 
     */
    @JsonProperty("distributionCenterDetails")
    @JsonPropertyDescription("Detailed information needed for an individual warehouse that replenishes goods for the store.")
    private List<DistributionCenterDetailsType> distributionCenterDetails = new ArrayList<DistributionCenterDetailsType>();
    /**
     * LocationMeasuresType
     * <p>
     * 
     * 
     */
    @JsonProperty("measures")
    private LocationMeasuresType measures;
    /**
     * Location specific parameters for manufacturing model.
     * 
     */
    @JsonProperty("manufacturingModelInformation")
    @JsonPropertyDescription("Location specific parameters for manufacturing model.")
    private List<LocationManufacturingModelInformationType> manufacturingModelInformation = new ArrayList<LocationManufacturingModelInformationType>();
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

    public LocationType withCreationDateTime(OffsetDateTime creationDateTime) {
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

    public LocationType withDocumentStatusCode(DocumentStatusEnumerationType documentStatusCode) {
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

    public LocationType withDocumentActionCode(DocumentActionEnumerationType documentActionCode) {
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

    public LocationType withLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
        return this;
    }

    /**
     * LocationTypeExtensions
     * <p>
     * 
     * 
     */
    @JsonProperty("extensions")
    public LocationTypeExtensions getExtensions() {
        return extensions;
    }

    /**
     * LocationTypeExtensions
     * <p>
     * 
     * 
     */
    @JsonProperty("extensions")
    public void setExtensions(LocationTypeExtensions extensions) {
        this.extensions = extensions;
    }

    public LocationType withExtensions(LocationTypeExtensions extensions) {
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

    public LocationType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
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

    public LocationType withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * The unique identifier of the piece of information, such as the object identifier or the document identifier.
     * (Required)
     * 
     */
    @JsonProperty("locationId")
    public String getLocationId() {
        return locationId;
    }

    /**
     * The unique identifier of the piece of information, such as the object identifier or the document identifier.
     * (Required)
     * 
     */
    @JsonProperty("locationId")
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public LocationType withLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }

    /**
     * ParentPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("parentParty")
    public ParentPartyType getParentParty() {
        return parentParty;
    }

    /**
     * ParentPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("parentParty")
    public void setParentParty(ParentPartyType parentParty) {
        this.parentParty = parentParty;
    }

    public LocationType withParentParty(ParentPartyType parentParty) {
        this.parentParty = parentParty;
        return this;
    }

    /**
     * BasicLocationType
     * <p>
     * 
     * 
     */
    @JsonProperty("basicLocation")
    public BasicLocationType getBasicLocation() {
        return basicLocation;
    }

    /**
     * BasicLocationType
     * <p>
     * 
     * 
     */
    @JsonProperty("basicLocation")
    public void setBasicLocation(BasicLocationType basicLocation) {
        this.basicLocation = basicLocation;
    }

    public LocationType withBasicLocation(BasicLocationType basicLocation) {
        this.basicLocation = basicLocation;
        return this;
    }

    /**
     * DespatchAdviceRestrictionCode
     * <p>
     * 
     * 
     */
    @JsonProperty("despatchAdviceRestrictionCode")
    public DespatchAdviceRestrictionCode getDespatchAdviceRestrictionCode() {
        return despatchAdviceRestrictionCode;
    }

    /**
     * DespatchAdviceRestrictionCode
     * <p>
     * 
     * 
     */
    @JsonProperty("despatchAdviceRestrictionCode")
    public void setDespatchAdviceRestrictionCode(DespatchAdviceRestrictionCode despatchAdviceRestrictionCode) {
        this.despatchAdviceRestrictionCode = despatchAdviceRestrictionCode;
    }

    public LocationType withDespatchAdviceRestrictionCode(DespatchAdviceRestrictionCode despatchAdviceRestrictionCode) {
        this.despatchAdviceRestrictionCode = despatchAdviceRestrictionCode;
        return this;
    }

    /**
     * HierarchyInformationType
     * <p>
     * 
     * 
     */
    @JsonProperty("locationHierarchyInformation")
    public HierarchyInformationType getLocationHierarchyInformation() {
        return locationHierarchyInformation;
    }

    /**
     * HierarchyInformationType
     * <p>
     * 
     * 
     */
    @JsonProperty("locationHierarchyInformation")
    public void setLocationHierarchyInformation(HierarchyInformationType locationHierarchyInformation) {
        this.locationHierarchyInformation = locationHierarchyInformation;
    }

    public LocationType withLocationHierarchyInformation(HierarchyInformationType locationHierarchyInformation) {
        this.locationHierarchyInformation = locationHierarchyInformation;
        return this;
    }

    /**
     * LogisticDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticDetails")
    public LogisticDetailsType getLogisticDetails() {
        return logisticDetails;
    }

    /**
     * LogisticDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticDetails")
    public void setLogisticDetails(LogisticDetailsType logisticDetails) {
        this.logisticDetails = logisticDetails;
    }

    public LocationType withLogisticDetails(LogisticDetailsType logisticDetails) {
        this.logisticDetails = logisticDetails;
        return this;
    }

    /**
     * PlanningDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("planningDetails")
    public PlanningDetailsType getPlanningDetails() {
        return planningDetails;
    }

    /**
     * PlanningDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("planningDetails")
    public void setPlanningDetails(PlanningDetailsType planningDetails) {
        this.planningDetails = planningDetails;
    }

    public LocationType withPlanningDetails(PlanningDetailsType planningDetails) {
        this.planningDetails = planningDetails;
        return this;
    }

    /**
     * RetailDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("retailDetails")
    public RetailDetailsType getRetailDetails() {
        return retailDetails;
    }

    /**
     * RetailDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("retailDetails")
    public void setRetailDetails(RetailDetailsType retailDetails) {
        this.retailDetails = retailDetails;
    }

    public LocationType withRetailDetails(RetailDetailsType retailDetails) {
        this.retailDetails = retailDetails;
        return this;
    }

    /**
     * Detailed information needed for an individual warehouse that replenishes goods for the store.
     * 
     */
    @JsonProperty("distributionCenterDetails")
    public List<DistributionCenterDetailsType> getDistributionCenterDetails() {
        return distributionCenterDetails;
    }

    /**
     * Detailed information needed for an individual warehouse that replenishes goods for the store.
     * 
     */
    @JsonProperty("distributionCenterDetails")
    public void setDistributionCenterDetails(List<DistributionCenterDetailsType> distributionCenterDetails) {
        this.distributionCenterDetails = distributionCenterDetails;
    }

    public LocationType withDistributionCenterDetails(List<DistributionCenterDetailsType> distributionCenterDetails) {
        this.distributionCenterDetails = distributionCenterDetails;
        return this;
    }

    /**
     * LocationMeasuresType
     * <p>
     * 
     * 
     */
    @JsonProperty("measures")
    public LocationMeasuresType getMeasures() {
        return measures;
    }

    /**
     * LocationMeasuresType
     * <p>
     * 
     * 
     */
    @JsonProperty("measures")
    public void setMeasures(LocationMeasuresType measures) {
        this.measures = measures;
    }

    public LocationType withMeasures(LocationMeasuresType measures) {
        this.measures = measures;
        return this;
    }

    /**
     * Location specific parameters for manufacturing model.
     * 
     */
    @JsonProperty("manufacturingModelInformation")
    public List<LocationManufacturingModelInformationType> getManufacturingModelInformation() {
        return manufacturingModelInformation;
    }

    /**
     * Location specific parameters for manufacturing model.
     * 
     */
    @JsonProperty("manufacturingModelInformation")
    public void setManufacturingModelInformation(List<LocationManufacturingModelInformationType> manufacturingModelInformation) {
        this.manufacturingModelInformation = manufacturingModelInformation;
    }

    public LocationType withManufacturingModelInformation(List<LocationManufacturingModelInformationType> manufacturingModelInformation) {
        this.manufacturingModelInformation = manufacturingModelInformation;
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

    public LocationType withRequiresTransportPlanning(Boolean requiresTransportPlanning) {
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

    public LocationType withSenderDocumentId(String senderDocumentId) {
        this.senderDocumentId = senderDocumentId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("locationId");
        sb.append('=');
        sb.append(((this.locationId == null)?"<null>":this.locationId));
        sb.append(',');
        sb.append("parentParty");
        sb.append('=');
        sb.append(((this.parentParty == null)?"<null>":this.parentParty));
        sb.append(',');
        sb.append("basicLocation");
        sb.append('=');
        sb.append(((this.basicLocation == null)?"<null>":this.basicLocation));
        sb.append(',');
        sb.append("despatchAdviceRestrictionCode");
        sb.append('=');
        sb.append(((this.despatchAdviceRestrictionCode == null)?"<null>":this.despatchAdviceRestrictionCode));
        sb.append(',');
        sb.append("locationHierarchyInformation");
        sb.append('=');
        sb.append(((this.locationHierarchyInformation == null)?"<null>":this.locationHierarchyInformation));
        sb.append(',');
        sb.append("logisticDetails");
        sb.append('=');
        sb.append(((this.logisticDetails == null)?"<null>":this.logisticDetails));
        sb.append(',');
        sb.append("planningDetails");
        sb.append('=');
        sb.append(((this.planningDetails == null)?"<null>":this.planningDetails));
        sb.append(',');
        sb.append("retailDetails");
        sb.append('=');
        sb.append(((this.retailDetails == null)?"<null>":this.retailDetails));
        sb.append(',');
        sb.append("distributionCenterDetails");
        sb.append('=');
        sb.append(((this.distributionCenterDetails == null)?"<null>":this.distributionCenterDetails));
        sb.append(',');
        sb.append("measures");
        sb.append('=');
        sb.append(((this.measures == null)?"<null>":this.measures));
        sb.append(',');
        sb.append("manufacturingModelInformation");
        sb.append('=');
        sb.append(((this.manufacturingModelInformation == null)?"<null>":this.manufacturingModelInformation));
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
        result = ((result* 31)+((this.planningDetails == null)? 0 :this.planningDetails.hashCode()));
        result = ((result* 31)+((this.documentStatusCode == null)? 0 :this.documentStatusCode.hashCode()));
        result = ((result* 31)+((this.logisticDetails == null)? 0 :this.logisticDetails.hashCode()));
        result = ((result* 31)+((this.manufacturingModelInformation == null)? 0 :this.manufacturingModelInformation.hashCode()));
        result = ((result* 31)+((this.entityId == null)? 0 :this.entityId.hashCode()));
        result = ((result* 31)+((this.documentActionCode == null)? 0 :this.documentActionCode.hashCode()));
        result = ((result* 31)+((this.distributionCenterDetails == null)? 0 :this.distributionCenterDetails.hashCode()));
        result = ((result* 31)+((this.despatchAdviceRestrictionCode == null)? 0 :this.despatchAdviceRestrictionCode.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.measures == null)? 0 :this.measures.hashCode()));
        result = ((result* 31)+((this.senderDocumentId == null)? 0 :this.senderDocumentId.hashCode()));
        result = ((result* 31)+((this.locationId == null)? 0 :this.locationId.hashCode()));
        result = ((result* 31)+((this.locationHierarchyInformation == null)? 0 :this.locationHierarchyInformation.hashCode()));
        result = ((result* 31)+((this.requiresTransportPlanning == null)? 0 :this.requiresTransportPlanning.hashCode()));
        result = ((result* 31)+((this.basicLocation == null)? 0 :this.basicLocation.hashCode()));
        result = ((result* 31)+((this.parentParty == null)? 0 :this.parentParty.hashCode()));
        result = ((result* 31)+((this.retailDetails == null)? 0 :this.retailDetails.hashCode()));
        result = ((result* 31)+((this.creationDateTime == null)? 0 :this.creationDateTime.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocationType) == false) {
            return false;
        }
        LocationType rhs = ((LocationType) other);
        return (((((((((((((((((((((this.lastUpdateDateTime == rhs.lastUpdateDateTime)||((this.lastUpdateDateTime!= null)&&this.lastUpdateDateTime.equals(rhs.lastUpdateDateTime)))&&((this.planningDetails == rhs.planningDetails)||((this.planningDetails!= null)&&this.planningDetails.equals(rhs.planningDetails))))&&((this.documentStatusCode == rhs.documentStatusCode)||((this.documentStatusCode!= null)&&this.documentStatusCode.equals(rhs.documentStatusCode))))&&((this.logisticDetails == rhs.logisticDetails)||((this.logisticDetails!= null)&&this.logisticDetails.equals(rhs.logisticDetails))))&&((this.manufacturingModelInformation == rhs.manufacturingModelInformation)||((this.manufacturingModelInformation!= null)&&this.manufacturingModelInformation.equals(rhs.manufacturingModelInformation))))&&((this.entityId == rhs.entityId)||((this.entityId!= null)&&this.entityId.equals(rhs.entityId))))&&((this.documentActionCode == rhs.documentActionCode)||((this.documentActionCode!= null)&&this.documentActionCode.equals(rhs.documentActionCode))))&&((this.distributionCenterDetails == rhs.distributionCenterDetails)||((this.distributionCenterDetails!= null)&&this.distributionCenterDetails.equals(rhs.distributionCenterDetails))))&&((this.despatchAdviceRestrictionCode == rhs.despatchAdviceRestrictionCode)||((this.despatchAdviceRestrictionCode!= null)&&this.despatchAdviceRestrictionCode.equals(rhs.despatchAdviceRestrictionCode))))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.measures == rhs.measures)||((this.measures!= null)&&this.measures.equals(rhs.measures))))&&((this.senderDocumentId == rhs.senderDocumentId)||((this.senderDocumentId!= null)&&this.senderDocumentId.equals(rhs.senderDocumentId))))&&((this.locationId == rhs.locationId)||((this.locationId!= null)&&this.locationId.equals(rhs.locationId))))&&((this.locationHierarchyInformation == rhs.locationHierarchyInformation)||((this.locationHierarchyInformation!= null)&&this.locationHierarchyInformation.equals(rhs.locationHierarchyInformation))))&&((this.requiresTransportPlanning == rhs.requiresTransportPlanning)||((this.requiresTransportPlanning!= null)&&this.requiresTransportPlanning.equals(rhs.requiresTransportPlanning))))&&((this.basicLocation == rhs.basicLocation)||((this.basicLocation!= null)&&this.basicLocation.equals(rhs.basicLocation))))&&((this.parentParty == rhs.parentParty)||((this.parentParty!= null)&&this.parentParty.equals(rhs.parentParty))))&&((this.retailDetails == rhs.retailDetails)||((this.retailDetails!= null)&&this.retailDetails.equals(rhs.retailDetails))))&&((this.creationDateTime == rhs.creationDateTime)||((this.creationDateTime!= null)&&this.creationDateTime.equals(rhs.creationDateTime))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
