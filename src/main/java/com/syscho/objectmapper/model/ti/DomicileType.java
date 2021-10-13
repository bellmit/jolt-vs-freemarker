
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
 * DomicileType
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
    "domicileId",
    "basicDetails",
    "logisticDetails",
    "domicileEquipmentDetails",
    "vehicleAvailabilityDetails"
})
@Generated("jsonschema2pojo")
public class DomicileType {

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
     * A set of characters that uniquely identifies a domicile.
     * (Required)
     * 
     */
    @JsonProperty("domicileId")
    @JsonPropertyDescription("A set of characters that uniquely identifies a domicile.")
    private String domicileId;
    /**
     * BasicDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("basicDetails")
    private BasicDetailsType basicDetails;
    /**
     * DomicileLogisticDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticDetails")
    private DomicileLogisticDetailsType logisticDetails;
    /**
     * Provides information for the planning system, about the equipment used at the domicile.
     * 
     */
    @JsonProperty("domicileEquipmentDetails")
    @JsonPropertyDescription("Provides information for the planning system, about the equipment used at the domicile.")
    private List<DomicileEquipmentDetailsType> domicileEquipmentDetails = new ArrayList<DomicileEquipmentDetailsType>();
    /**
     * Provides information about the availability and optimization parameters of vehicles at the domicile.
     * 
     */
    @JsonProperty("vehicleAvailabilityDetails")
    @JsonPropertyDescription("Provides information about the availability and optimization parameters of vehicles at the domicile.")
    private List<VehicleAvailabilityDetailsType> vehicleAvailabilityDetails = new ArrayList<VehicleAvailabilityDetailsType>();

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

    public DomicileType withCreationDateTime(OffsetDateTime creationDateTime) {
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

    public DomicileType withDocumentStatusCode(DocumentStatusEnumerationType documentStatusCode) {
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

    public DomicileType withDocumentActionCode(DocumentActionEnumerationType documentActionCode) {
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

    public DomicileType withLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
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

    public DomicileType withExtensions(NoCustomExtensionsType extensions) {
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

    public DomicileType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
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

    public DomicileType withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * A set of characters that uniquely identifies a domicile.
     * (Required)
     * 
     */
    @JsonProperty("domicileId")
    public String getDomicileId() {
        return domicileId;
    }

    /**
     * A set of characters that uniquely identifies a domicile.
     * (Required)
     * 
     */
    @JsonProperty("domicileId")
    public void setDomicileId(String domicileId) {
        this.domicileId = domicileId;
    }

    public DomicileType withDomicileId(String domicileId) {
        this.domicileId = domicileId;
        return this;
    }

    /**
     * BasicDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("basicDetails")
    public BasicDetailsType getBasicDetails() {
        return basicDetails;
    }

    /**
     * BasicDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("basicDetails")
    public void setBasicDetails(BasicDetailsType basicDetails) {
        this.basicDetails = basicDetails;
    }

    public DomicileType withBasicDetails(BasicDetailsType basicDetails) {
        this.basicDetails = basicDetails;
        return this;
    }

    /**
     * DomicileLogisticDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticDetails")
    public DomicileLogisticDetailsType getLogisticDetails() {
        return logisticDetails;
    }

    /**
     * DomicileLogisticDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticDetails")
    public void setLogisticDetails(DomicileLogisticDetailsType logisticDetails) {
        this.logisticDetails = logisticDetails;
    }

    public DomicileType withLogisticDetails(DomicileLogisticDetailsType logisticDetails) {
        this.logisticDetails = logisticDetails;
        return this;
    }

    /**
     * Provides information for the planning system, about the equipment used at the domicile.
     * 
     */
    @JsonProperty("domicileEquipmentDetails")
    public List<DomicileEquipmentDetailsType> getDomicileEquipmentDetails() {
        return domicileEquipmentDetails;
    }

    /**
     * Provides information for the planning system, about the equipment used at the domicile.
     * 
     */
    @JsonProperty("domicileEquipmentDetails")
    public void setDomicileEquipmentDetails(List<DomicileEquipmentDetailsType> domicileEquipmentDetails) {
        this.domicileEquipmentDetails = domicileEquipmentDetails;
    }

    public DomicileType withDomicileEquipmentDetails(List<DomicileEquipmentDetailsType> domicileEquipmentDetails) {
        this.domicileEquipmentDetails = domicileEquipmentDetails;
        return this;
    }

    /**
     * Provides information about the availability and optimization parameters of vehicles at the domicile.
     * 
     */
    @JsonProperty("vehicleAvailabilityDetails")
    public List<VehicleAvailabilityDetailsType> getVehicleAvailabilityDetails() {
        return vehicleAvailabilityDetails;
    }

    /**
     * Provides information about the availability and optimization parameters of vehicles at the domicile.
     * 
     */
    @JsonProperty("vehicleAvailabilityDetails")
    public void setVehicleAvailabilityDetails(List<VehicleAvailabilityDetailsType> vehicleAvailabilityDetails) {
        this.vehicleAvailabilityDetails = vehicleAvailabilityDetails;
    }

    public DomicileType withVehicleAvailabilityDetails(List<VehicleAvailabilityDetailsType> vehicleAvailabilityDetails) {
        this.vehicleAvailabilityDetails = vehicleAvailabilityDetails;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DomicileType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("domicileId");
        sb.append('=');
        sb.append(((this.domicileId == null)?"<null>":this.domicileId));
        sb.append(',');
        sb.append("basicDetails");
        sb.append('=');
        sb.append(((this.basicDetails == null)?"<null>":this.basicDetails));
        sb.append(',');
        sb.append("logisticDetails");
        sb.append('=');
        sb.append(((this.logisticDetails == null)?"<null>":this.logisticDetails));
        sb.append(',');
        sb.append("domicileEquipmentDetails");
        sb.append('=');
        sb.append(((this.domicileEquipmentDetails == null)?"<null>":this.domicileEquipmentDetails));
        sb.append(',');
        sb.append("vehicleAvailabilityDetails");
        sb.append('=');
        sb.append(((this.vehicleAvailabilityDetails == null)?"<null>":this.vehicleAvailabilityDetails));
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
        result = ((result* 31)+((this.vehicleAvailabilityDetails == null)? 0 :this.vehicleAvailabilityDetails.hashCode()));
        result = ((result* 31)+((this.lastUpdateDateTime == null)? 0 :this.lastUpdateDateTime.hashCode()));
        result = ((result* 31)+((this.documentStatusCode == null)? 0 :this.documentStatusCode.hashCode()));
        result = ((result* 31)+((this.logisticDetails == null)? 0 :this.logisticDetails.hashCode()));
        result = ((result* 31)+((this.entityId == null)? 0 :this.entityId.hashCode()));
        result = ((result* 31)+((this.basicDetails == null)? 0 :this.basicDetails.hashCode()));
        result = ((result* 31)+((this.documentActionCode == null)? 0 :this.documentActionCode.hashCode()));
        result = ((result* 31)+((this.domicileEquipmentDetails == null)? 0 :this.domicileEquipmentDetails.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.domicileId == null)? 0 :this.domicileId.hashCode()));
        result = ((result* 31)+((this.creationDateTime == null)? 0 :this.creationDateTime.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomicileType) == false) {
            return false;
        }
        DomicileType rhs = ((DomicileType) other);
        return (((((((((((((this.vehicleAvailabilityDetails == rhs.vehicleAvailabilityDetails)||((this.vehicleAvailabilityDetails!= null)&&this.vehicleAvailabilityDetails.equals(rhs.vehicleAvailabilityDetails)))&&((this.lastUpdateDateTime == rhs.lastUpdateDateTime)||((this.lastUpdateDateTime!= null)&&this.lastUpdateDateTime.equals(rhs.lastUpdateDateTime))))&&((this.documentStatusCode == rhs.documentStatusCode)||((this.documentStatusCode!= null)&&this.documentStatusCode.equals(rhs.documentStatusCode))))&&((this.logisticDetails == rhs.logisticDetails)||((this.logisticDetails!= null)&&this.logisticDetails.equals(rhs.logisticDetails))))&&((this.entityId == rhs.entityId)||((this.entityId!= null)&&this.entityId.equals(rhs.entityId))))&&((this.basicDetails == rhs.basicDetails)||((this.basicDetails!= null)&&this.basicDetails.equals(rhs.basicDetails))))&&((this.documentActionCode == rhs.documentActionCode)||((this.documentActionCode!= null)&&this.documentActionCode.equals(rhs.documentActionCode))))&&((this.domicileEquipmentDetails == rhs.domicileEquipmentDetails)||((this.domicileEquipmentDetails!= null)&&this.domicileEquipmentDetails.equals(rhs.domicileEquipmentDetails))))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.domicileId == rhs.domicileId)||((this.domicileId!= null)&&this.domicileId.equals(rhs.domicileId))))&&((this.creationDateTime == rhs.creationDateTime)||((this.creationDateTime!= null)&&this.creationDateTime.equals(rhs.creationDateTime))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
