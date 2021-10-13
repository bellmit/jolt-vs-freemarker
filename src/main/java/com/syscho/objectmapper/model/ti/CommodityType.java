
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
 * CommodityType
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
    "commodityId",
    "freightClassCode",
    "standardTransportationCommodityCode",
    "isDangerousSubstance",
    "loadingSequenceNumber",
    "maximumCompartments",
    "splitMethod",
    "description",
    "commodityExclusion"
})
@Generated("jsonschema2pojo")
public class CommodityType {

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
    @JsonProperty("commodityId")
    @JsonPropertyDescription("The unique identifier of the piece of information, such as the object identifier or the document identifier.")
    private String commodityId;
    /**
     * The NMFC code for this Commodity.
     * 
     */
    @JsonProperty("freightClassCode")
    @JsonPropertyDescription("The NMFC code for this Commodity.")
    private String freightClassCode;
    /**
     * The Standard Transportation Commodity Code for this Commodity.
     * 
     */
    @JsonProperty("standardTransportationCommodityCode")
    @JsonPropertyDescription("The Standard Transportation Commodity Code for this Commodity.")
    private String standardTransportationCommodityCode;
    /**
     * An indicator that specifies whether this Commodity is classified as a hazardous material requiring special handling.
     * 
     */
    @JsonProperty("isDangerousSubstance")
    @JsonPropertyDescription("An indicator that specifies whether this Commodity is classified as a hazardous material requiring special handling.")
    private Boolean isDangerousSubstance;
    /**
     * If shipment sequencing is enabled for the Shipment version used when creating the Shipment, the optimizer will assign the Shipment to Loads based on the Shipment sequence number for the Commodity for each Shipment; this feature can be used to ensure that trailers are loaded first with frozen goods, followed by goods requiring refrigeration and finally ambient temperature goods.
     * 
     */
    @JsonProperty("loadingSequenceNumber")
    @JsonPropertyDescription("If shipment sequencing is enabled for the Shipment version used when creating the Shipment, the optimizer will assign the Shipment to Loads based on the Shipment sequence number for the Commodity for each Shipment; this feature can be used to ensure that trailers are loaded first with frozen goods, followed by goods requiring refrigeration and finally ambient temperature goods.")
    private Integer loadingSequenceNumber;
    /**
     * The maximum number of Equipment Compartments in a trailer that can be used for this Commodity.
     * 
     */
    @JsonProperty("maximumCompartments")
    @JsonPropertyDescription("The maximum number of Equipment Compartments in a trailer that can be used for this Commodity.")
    private Integer maximumCompartments;
    /**
     * SplitMethodEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("splitMethod")
    private SplitMethodEnumerationType splitMethod;
    /**
     * The terminology by which a Commodity is known and understood by the business.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The terminology by which a Commodity is known and understood by the business.")
    private List<DescriptionType> description = new ArrayList<DescriptionType>();
    /**
     * A relationship between two commodities for the purpose of defining transportation restrictions.  Defines Commodities that can not ship together.
     * 
     */
    @JsonProperty("commodityExclusion")
    @JsonPropertyDescription("A relationship between two commodities for the purpose of defining transportation restrictions.  Defines Commodities that can not ship together.")
    private List<CommodityExclusionType> commodityExclusion = new ArrayList<CommodityExclusionType>();

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

    public CommodityType withCreationDateTime(OffsetDateTime creationDateTime) {
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

    public CommodityType withDocumentStatusCode(DocumentStatusEnumerationType documentStatusCode) {
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

    public CommodityType withDocumentActionCode(DocumentActionEnumerationType documentActionCode) {
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

    public CommodityType withLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
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

    public CommodityType withExtensions(NoCustomExtensionsType extensions) {
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

    public CommodityType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
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

    public CommodityType withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * The unique identifier of the piece of information, such as the object identifier or the document identifier.
     * (Required)
     * 
     */
    @JsonProperty("commodityId")
    public String getCommodityId() {
        return commodityId;
    }

    /**
     * The unique identifier of the piece of information, such as the object identifier or the document identifier.
     * (Required)
     * 
     */
    @JsonProperty("commodityId")
    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public CommodityType withCommodityId(String commodityId) {
        this.commodityId = commodityId;
        return this;
    }

    /**
     * The NMFC code for this Commodity.
     * 
     */
    @JsonProperty("freightClassCode")
    public String getFreightClassCode() {
        return freightClassCode;
    }

    /**
     * The NMFC code for this Commodity.
     * 
     */
    @JsonProperty("freightClassCode")
    public void setFreightClassCode(String freightClassCode) {
        this.freightClassCode = freightClassCode;
    }

    public CommodityType withFreightClassCode(String freightClassCode) {
        this.freightClassCode = freightClassCode;
        return this;
    }

    /**
     * The Standard Transportation Commodity Code for this Commodity.
     * 
     */
    @JsonProperty("standardTransportationCommodityCode")
    public String getStandardTransportationCommodityCode() {
        return standardTransportationCommodityCode;
    }

    /**
     * The Standard Transportation Commodity Code for this Commodity.
     * 
     */
    @JsonProperty("standardTransportationCommodityCode")
    public void setStandardTransportationCommodityCode(String standardTransportationCommodityCode) {
        this.standardTransportationCommodityCode = standardTransportationCommodityCode;
    }

    public CommodityType withStandardTransportationCommodityCode(String standardTransportationCommodityCode) {
        this.standardTransportationCommodityCode = standardTransportationCommodityCode;
        return this;
    }

    /**
     * An indicator that specifies whether this Commodity is classified as a hazardous material requiring special handling.
     * 
     */
    @JsonProperty("isDangerousSubstance")
    public Boolean getIsDangerousSubstance() {
        return isDangerousSubstance;
    }

    /**
     * An indicator that specifies whether this Commodity is classified as a hazardous material requiring special handling.
     * 
     */
    @JsonProperty("isDangerousSubstance")
    public void setIsDangerousSubstance(Boolean isDangerousSubstance) {
        this.isDangerousSubstance = isDangerousSubstance;
    }

    public CommodityType withIsDangerousSubstance(Boolean isDangerousSubstance) {
        this.isDangerousSubstance = isDangerousSubstance;
        return this;
    }

    /**
     * If shipment sequencing is enabled for the Shipment version used when creating the Shipment, the optimizer will assign the Shipment to Loads based on the Shipment sequence number for the Commodity for each Shipment; this feature can be used to ensure that trailers are loaded first with frozen goods, followed by goods requiring refrigeration and finally ambient temperature goods.
     * 
     */
    @JsonProperty("loadingSequenceNumber")
    public Integer getLoadingSequenceNumber() {
        return loadingSequenceNumber;
    }

    /**
     * If shipment sequencing is enabled for the Shipment version used when creating the Shipment, the optimizer will assign the Shipment to Loads based on the Shipment sequence number for the Commodity for each Shipment; this feature can be used to ensure that trailers are loaded first with frozen goods, followed by goods requiring refrigeration and finally ambient temperature goods.
     * 
     */
    @JsonProperty("loadingSequenceNumber")
    public void setLoadingSequenceNumber(Integer loadingSequenceNumber) {
        this.loadingSequenceNumber = loadingSequenceNumber;
    }

    public CommodityType withLoadingSequenceNumber(Integer loadingSequenceNumber) {
        this.loadingSequenceNumber = loadingSequenceNumber;
        return this;
    }

    /**
     * The maximum number of Equipment Compartments in a trailer that can be used for this Commodity.
     * 
     */
    @JsonProperty("maximumCompartments")
    public Integer getMaximumCompartments() {
        return maximumCompartments;
    }

    /**
     * The maximum number of Equipment Compartments in a trailer that can be used for this Commodity.
     * 
     */
    @JsonProperty("maximumCompartments")
    public void setMaximumCompartments(Integer maximumCompartments) {
        this.maximumCompartments = maximumCompartments;
    }

    public CommodityType withMaximumCompartments(Integer maximumCompartments) {
        this.maximumCompartments = maximumCompartments;
        return this;
    }

    /**
     * SplitMethodEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("splitMethod")
    public SplitMethodEnumerationType getSplitMethod() {
        return splitMethod;
    }

    /**
     * SplitMethodEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("splitMethod")
    public void setSplitMethod(SplitMethodEnumerationType splitMethod) {
        this.splitMethod = splitMethod;
    }

    public CommodityType withSplitMethod(SplitMethodEnumerationType splitMethod) {
        this.splitMethod = splitMethod;
        return this;
    }

    /**
     * The terminology by which a Commodity is known and understood by the business.
     * 
     */
    @JsonProperty("description")
    public List<DescriptionType> getDescription() {
        return description;
    }

    /**
     * The terminology by which a Commodity is known and understood by the business.
     * 
     */
    @JsonProperty("description")
    public void setDescription(List<DescriptionType> description) {
        this.description = description;
    }

    public CommodityType withDescription(List<DescriptionType> description) {
        this.description = description;
        return this;
    }

    /**
     * A relationship between two commodities for the purpose of defining transportation restrictions.  Defines Commodities that can not ship together.
     * 
     */
    @JsonProperty("commodityExclusion")
    public List<CommodityExclusionType> getCommodityExclusion() {
        return commodityExclusion;
    }

    /**
     * A relationship between two commodities for the purpose of defining transportation restrictions.  Defines Commodities that can not ship together.
     * 
     */
    @JsonProperty("commodityExclusion")
    public void setCommodityExclusion(List<CommodityExclusionType> commodityExclusion) {
        this.commodityExclusion = commodityExclusion;
    }

    public CommodityType withCommodityExclusion(List<CommodityExclusionType> commodityExclusion) {
        this.commodityExclusion = commodityExclusion;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommodityType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("commodityId");
        sb.append('=');
        sb.append(((this.commodityId == null)?"<null>":this.commodityId));
        sb.append(',');
        sb.append("freightClassCode");
        sb.append('=');
        sb.append(((this.freightClassCode == null)?"<null>":this.freightClassCode));
        sb.append(',');
        sb.append("standardTransportationCommodityCode");
        sb.append('=');
        sb.append(((this.standardTransportationCommodityCode == null)?"<null>":this.standardTransportationCommodityCode));
        sb.append(',');
        sb.append("isDangerousSubstance");
        sb.append('=');
        sb.append(((this.isDangerousSubstance == null)?"<null>":this.isDangerousSubstance));
        sb.append(',');
        sb.append("loadingSequenceNumber");
        sb.append('=');
        sb.append(((this.loadingSequenceNumber == null)?"<null>":this.loadingSequenceNumber));
        sb.append(',');
        sb.append("maximumCompartments");
        sb.append('=');
        sb.append(((this.maximumCompartments == null)?"<null>":this.maximumCompartments));
        sb.append(',');
        sb.append("splitMethod");
        sb.append('=');
        sb.append(((this.splitMethod == null)?"<null>":this.splitMethod));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("commodityExclusion");
        sb.append('=');
        sb.append(((this.commodityExclusion == null)?"<null>":this.commodityExclusion));
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
        result = ((result* 31)+((this.commodityExclusion == null)? 0 :this.commodityExclusion.hashCode()));
        result = ((result* 31)+((this.standardTransportationCommodityCode == null)? 0 :this.standardTransportationCommodityCode.hashCode()));
        result = ((result* 31)+((this.documentStatusCode == null)? 0 :this.documentStatusCode.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.entityId == null)? 0 :this.entityId.hashCode()));
        result = ((result* 31)+((this.documentActionCode == null)? 0 :this.documentActionCode.hashCode()));
        result = ((result* 31)+((this.commodityId == null)? 0 :this.commodityId.hashCode()));
        result = ((result* 31)+((this.splitMethod == null)? 0 :this.splitMethod.hashCode()));
        result = ((result* 31)+((this.maximumCompartments == null)? 0 :this.maximumCompartments.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.freightClassCode == null)? 0 :this.freightClassCode.hashCode()));
        result = ((result* 31)+((this.loadingSequenceNumber == null)? 0 :this.loadingSequenceNumber.hashCode()));
        result = ((result* 31)+((this.isDangerousSubstance == null)? 0 :this.isDangerousSubstance.hashCode()));
        result = ((result* 31)+((this.creationDateTime == null)? 0 :this.creationDateTime.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommodityType) == false) {
            return false;
        }
        CommodityType rhs = ((CommodityType) other);
        return (((((((((((((((((this.lastUpdateDateTime == rhs.lastUpdateDateTime)||((this.lastUpdateDateTime!= null)&&this.lastUpdateDateTime.equals(rhs.lastUpdateDateTime)))&&((this.commodityExclusion == rhs.commodityExclusion)||((this.commodityExclusion!= null)&&this.commodityExclusion.equals(rhs.commodityExclusion))))&&((this.standardTransportationCommodityCode == rhs.standardTransportationCommodityCode)||((this.standardTransportationCommodityCode!= null)&&this.standardTransportationCommodityCode.equals(rhs.standardTransportationCommodityCode))))&&((this.documentStatusCode == rhs.documentStatusCode)||((this.documentStatusCode!= null)&&this.documentStatusCode.equals(rhs.documentStatusCode))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.entityId == rhs.entityId)||((this.entityId!= null)&&this.entityId.equals(rhs.entityId))))&&((this.documentActionCode == rhs.documentActionCode)||((this.documentActionCode!= null)&&this.documentActionCode.equals(rhs.documentActionCode))))&&((this.commodityId == rhs.commodityId)||((this.commodityId!= null)&&this.commodityId.equals(rhs.commodityId))))&&((this.splitMethod == rhs.splitMethod)||((this.splitMethod!= null)&&this.splitMethod.equals(rhs.splitMethod))))&&((this.maximumCompartments == rhs.maximumCompartments)||((this.maximumCompartments!= null)&&this.maximumCompartments.equals(rhs.maximumCompartments))))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.freightClassCode == rhs.freightClassCode)||((this.freightClassCode!= null)&&this.freightClassCode.equals(rhs.freightClassCode))))&&((this.loadingSequenceNumber == rhs.loadingSequenceNumber)||((this.loadingSequenceNumber!= null)&&this.loadingSequenceNumber.equals(rhs.loadingSequenceNumber))))&&((this.isDangerousSubstance == rhs.isDangerousSubstance)||((this.isDangerousSubstance!= null)&&this.isDangerousSubstance.equals(rhs.isDangerousSubstance))))&&((this.creationDateTime == rhs.creationDateTime)||((this.creationDateTime!= null)&&this.creationDateTime.equals(rhs.creationDateTime))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
