
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
 * PartyType
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
    "partyId",
    "basicParty",
    "carrierDetails",
    "customerDetails",
    "supplierDetails",
    "senderDocumentId"
})
@Generated("jsonschema2pojo")
public class PartyType {

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
    @JsonProperty("partyId")
    @JsonPropertyDescription("The unique identifier of the piece of information, such as the object identifier or the document identifier.")
    private String partyId;
    /**
     * BasicPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("basicParty")
    private BasicPartyType basicParty;
    /**
     * CarrierDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("carrierDetails")
    private CarrierDetailsType carrierDetails;
    /**
     * CustomerDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("customerDetails")
    private CustomerDetailsType customerDetails;
    /**
     * SupplierDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("supplierDetails")
    private SupplierDetailsType supplierDetails;
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

    public PartyType withCreationDateTime(OffsetDateTime creationDateTime) {
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

    public PartyType withDocumentStatusCode(DocumentStatusEnumerationType documentStatusCode) {
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

    public PartyType withDocumentActionCode(DocumentActionEnumerationType documentActionCode) {
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

    public PartyType withLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
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

    public PartyType withExtensions(NoCustomExtensionsType extensions) {
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

    public PartyType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
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

    public PartyType withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * The unique identifier of the piece of information, such as the object identifier or the document identifier.
     * (Required)
     * 
     */
    @JsonProperty("partyId")
    public String getPartyId() {
        return partyId;
    }

    /**
     * The unique identifier of the piece of information, such as the object identifier or the document identifier.
     * (Required)
     * 
     */
    @JsonProperty("partyId")
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public PartyType withPartyId(String partyId) {
        this.partyId = partyId;
        return this;
    }

    /**
     * BasicPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("basicParty")
    public BasicPartyType getBasicParty() {
        return basicParty;
    }

    /**
     * BasicPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("basicParty")
    public void setBasicParty(BasicPartyType basicParty) {
        this.basicParty = basicParty;
    }

    public PartyType withBasicParty(BasicPartyType basicParty) {
        this.basicParty = basicParty;
        return this;
    }

    /**
     * CarrierDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("carrierDetails")
    public CarrierDetailsType getCarrierDetails() {
        return carrierDetails;
    }

    /**
     * CarrierDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("carrierDetails")
    public void setCarrierDetails(CarrierDetailsType carrierDetails) {
        this.carrierDetails = carrierDetails;
    }

    public PartyType withCarrierDetails(CarrierDetailsType carrierDetails) {
        this.carrierDetails = carrierDetails;
        return this;
    }

    /**
     * CustomerDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("customerDetails")
    public CustomerDetailsType getCustomerDetails() {
        return customerDetails;
    }

    /**
     * CustomerDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("customerDetails")
    public void setCustomerDetails(CustomerDetailsType customerDetails) {
        this.customerDetails = customerDetails;
    }

    public PartyType withCustomerDetails(CustomerDetailsType customerDetails) {
        this.customerDetails = customerDetails;
        return this;
    }

    /**
     * SupplierDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("supplierDetails")
    public SupplierDetailsType getSupplierDetails() {
        return supplierDetails;
    }

    /**
     * SupplierDetailsType
     * <p>
     * 
     * 
     */
    @JsonProperty("supplierDetails")
    public void setSupplierDetails(SupplierDetailsType supplierDetails) {
        this.supplierDetails = supplierDetails;
    }

    public PartyType withSupplierDetails(SupplierDetailsType supplierDetails) {
        this.supplierDetails = supplierDetails;
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

    public PartyType withSenderDocumentId(String senderDocumentId) {
        this.senderDocumentId = senderDocumentId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PartyType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("partyId");
        sb.append('=');
        sb.append(((this.partyId == null)?"<null>":this.partyId));
        sb.append(',');
        sb.append("basicParty");
        sb.append('=');
        sb.append(((this.basicParty == null)?"<null>":this.basicParty));
        sb.append(',');
        sb.append("carrierDetails");
        sb.append('=');
        sb.append(((this.carrierDetails == null)?"<null>":this.carrierDetails));
        sb.append(',');
        sb.append("customerDetails");
        sb.append('=');
        sb.append(((this.customerDetails == null)?"<null>":this.customerDetails));
        sb.append(',');
        sb.append("supplierDetails");
        sb.append('=');
        sb.append(((this.supplierDetails == null)?"<null>":this.supplierDetails));
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
        result = ((result* 31)+((this.documentStatusCode == null)? 0 :this.documentStatusCode.hashCode()));
        result = ((result* 31)+((this.entityId == null)? 0 :this.entityId.hashCode()));
        result = ((result* 31)+((this.documentActionCode == null)? 0 :this.documentActionCode.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.senderDocumentId == null)? 0 :this.senderDocumentId.hashCode()));
        result = ((result* 31)+((this.partyId == null)? 0 :this.partyId.hashCode()));
        result = ((result* 31)+((this.customerDetails == null)? 0 :this.customerDetails.hashCode()));
        result = ((result* 31)+((this.basicParty == null)? 0 :this.basicParty.hashCode()));
        result = ((result* 31)+((this.supplierDetails == null)? 0 :this.supplierDetails.hashCode()));
        result = ((result* 31)+((this.carrierDetails == null)? 0 :this.carrierDetails.hashCode()));
        result = ((result* 31)+((this.creationDateTime == null)? 0 :this.creationDateTime.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PartyType) == false) {
            return false;
        }
        PartyType rhs = ((PartyType) other);
        return ((((((((((((((this.lastUpdateDateTime == rhs.lastUpdateDateTime)||((this.lastUpdateDateTime!= null)&&this.lastUpdateDateTime.equals(rhs.lastUpdateDateTime)))&&((this.documentStatusCode == rhs.documentStatusCode)||((this.documentStatusCode!= null)&&this.documentStatusCode.equals(rhs.documentStatusCode))))&&((this.entityId == rhs.entityId)||((this.entityId!= null)&&this.entityId.equals(rhs.entityId))))&&((this.documentActionCode == rhs.documentActionCode)||((this.documentActionCode!= null)&&this.documentActionCode.equals(rhs.documentActionCode))))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.senderDocumentId == rhs.senderDocumentId)||((this.senderDocumentId!= null)&&this.senderDocumentId.equals(rhs.senderDocumentId))))&&((this.partyId == rhs.partyId)||((this.partyId!= null)&&this.partyId.equals(rhs.partyId))))&&((this.customerDetails == rhs.customerDetails)||((this.customerDetails!= null)&&this.customerDetails.equals(rhs.customerDetails))))&&((this.basicParty == rhs.basicParty)||((this.basicParty!= null)&&this.basicParty.equals(rhs.basicParty))))&&((this.supplierDetails == rhs.supplierDetails)||((this.supplierDetails!= null)&&this.supplierDetails.equals(rhs.supplierDetails))))&&((this.carrierDetails == rhs.carrierDetails)||((this.carrierDetails!= null)&&this.carrierDetails.equals(rhs.carrierDetails))))&&((this.creationDateTime == rhs.creationDateTime)||((this.creationDateTime!= null)&&this.creationDateTime.equals(rhs.creationDateTime))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
