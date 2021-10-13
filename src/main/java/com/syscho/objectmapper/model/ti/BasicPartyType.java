
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BasicPartyType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "additionalPartyId",
    "partyName",
    "description",
    "organisationHighestPartyId",
    "partyRole",
    "partyAddress",
    "partyContact",
    "operatingHours",
    "financialInformation",
    "status",
    "extensions",
    "avpList"
})
@Generated("jsonschema2pojo")
public class BasicPartyType {

    /**
     * Identifier of the party or location, specified in addition to the GLN.
     * 
     */
    @JsonProperty("additionalPartyId")
    @JsonPropertyDescription("Identifier of the party or location, specified in addition to the GLN.")
    private List<AdditionalPartyIdentificationType> additionalPartyId = new ArrayList<AdditionalPartyIdentificationType>();
    /**
     * The name of the party.  Typically more user friendly than the Identification.
     * 
     */
    @JsonProperty("partyName")
    @JsonPropertyDescription("The name of the party.  Typically more user friendly than the Identification.")
    private String partyName;
    /**
     * DescriptionType
     * <p>
     * 
     * 
     */
    @JsonProperty("description")
    private DescriptionType description;
    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("organisationHighestPartyId")
    private PartyIdentificationType organisationHighestPartyId;
    /**
     * PartyRoleCode
     * <p>
     * 
     * 
     */
    @JsonProperty("partyRole")
    private PartyRoleCode partyRole;
    /**
     * AddressType
     * <p>
     * 
     * 
     */
    @JsonProperty("partyAddress")
    private AddressType partyAddress;
    /**
     * Information on an individual or department acting as point of contact for an organization.
     * 
     */
    @JsonProperty("partyContact")
    @JsonPropertyDescription("Information on an individual or department acting as point of contact for an organization.")
    private List<ContactType> partyContact = new ArrayList<ContactType>();
    /**
     * OperatingHours
     * <p>
     * 
     * 
     */
    @JsonProperty("operatingHours")
    private OperatingHours operatingHours;
    /**
     * FinancialDetails
     * <p>
     * 
     * 
     */
    @JsonProperty("financialInformation")
    private FinancialDetails financialInformation;
    /**
     * Information about when a party is active/inactive.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Information about when a party is active/inactive.")
    private List<PartyStatusType> status = new ArrayList<PartyStatusType>();
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
     * Identifier of the party or location, specified in addition to the GLN.
     * 
     */
    @JsonProperty("additionalPartyId")
    public List<AdditionalPartyIdentificationType> getAdditionalPartyId() {
        return additionalPartyId;
    }

    /**
     * Identifier of the party or location, specified in addition to the GLN.
     * 
     */
    @JsonProperty("additionalPartyId")
    public void setAdditionalPartyId(List<AdditionalPartyIdentificationType> additionalPartyId) {
        this.additionalPartyId = additionalPartyId;
    }

    public BasicPartyType withAdditionalPartyId(List<AdditionalPartyIdentificationType> additionalPartyId) {
        this.additionalPartyId = additionalPartyId;
        return this;
    }

    /**
     * The name of the party.  Typically more user friendly than the Identification.
     * 
     */
    @JsonProperty("partyName")
    public String getPartyName() {
        return partyName;
    }

    /**
     * The name of the party.  Typically more user friendly than the Identification.
     * 
     */
    @JsonProperty("partyName")
    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public BasicPartyType withPartyName(String partyName) {
        this.partyName = partyName;
        return this;
    }

    /**
     * DescriptionType
     * <p>
     * 
     * 
     */
    @JsonProperty("description")
    public DescriptionType getDescription() {
        return description;
    }

    /**
     * DescriptionType
     * <p>
     * 
     * 
     */
    @JsonProperty("description")
    public void setDescription(DescriptionType description) {
        this.description = description;
    }

    public BasicPartyType withDescription(DescriptionType description) {
        this.description = description;
        return this;
    }

    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("organisationHighestPartyId")
    public PartyIdentificationType getOrganisationHighestPartyId() {
        return organisationHighestPartyId;
    }

    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("organisationHighestPartyId")
    public void setOrganisationHighestPartyId(PartyIdentificationType organisationHighestPartyId) {
        this.organisationHighestPartyId = organisationHighestPartyId;
    }

    public BasicPartyType withOrganisationHighestPartyId(PartyIdentificationType organisationHighestPartyId) {
        this.organisationHighestPartyId = organisationHighestPartyId;
        return this;
    }

    /**
     * PartyRoleCode
     * <p>
     * 
     * 
     */
    @JsonProperty("partyRole")
    public PartyRoleCode getPartyRole() {
        return partyRole;
    }

    /**
     * PartyRoleCode
     * <p>
     * 
     * 
     */
    @JsonProperty("partyRole")
    public void setPartyRole(PartyRoleCode partyRole) {
        this.partyRole = partyRole;
    }

    public BasicPartyType withPartyRole(PartyRoleCode partyRole) {
        this.partyRole = partyRole;
        return this;
    }

    /**
     * AddressType
     * <p>
     * 
     * 
     */
    @JsonProperty("partyAddress")
    public AddressType getPartyAddress() {
        return partyAddress;
    }

    /**
     * AddressType
     * <p>
     * 
     * 
     */
    @JsonProperty("partyAddress")
    public void setPartyAddress(AddressType partyAddress) {
        this.partyAddress = partyAddress;
    }

    public BasicPartyType withPartyAddress(AddressType partyAddress) {
        this.partyAddress = partyAddress;
        return this;
    }

    /**
     * Information on an individual or department acting as point of contact for an organization.
     * 
     */
    @JsonProperty("partyContact")
    public List<ContactType> getPartyContact() {
        return partyContact;
    }

    /**
     * Information on an individual or department acting as point of contact for an organization.
     * 
     */
    @JsonProperty("partyContact")
    public void setPartyContact(List<ContactType> partyContact) {
        this.partyContact = partyContact;
    }

    public BasicPartyType withPartyContact(List<ContactType> partyContact) {
        this.partyContact = partyContact;
        return this;
    }

    /**
     * OperatingHours
     * <p>
     * 
     * 
     */
    @JsonProperty("operatingHours")
    public OperatingHours getOperatingHours() {
        return operatingHours;
    }

    /**
     * OperatingHours
     * <p>
     * 
     * 
     */
    @JsonProperty("operatingHours")
    public void setOperatingHours(OperatingHours operatingHours) {
        this.operatingHours = operatingHours;
    }

    public BasicPartyType withOperatingHours(OperatingHours operatingHours) {
        this.operatingHours = operatingHours;
        return this;
    }

    /**
     * FinancialDetails
     * <p>
     * 
     * 
     */
    @JsonProperty("financialInformation")
    public FinancialDetails getFinancialInformation() {
        return financialInformation;
    }

    /**
     * FinancialDetails
     * <p>
     * 
     * 
     */
    @JsonProperty("financialInformation")
    public void setFinancialInformation(FinancialDetails financialInformation) {
        this.financialInformation = financialInformation;
    }

    public BasicPartyType withFinancialInformation(FinancialDetails financialInformation) {
        this.financialInformation = financialInformation;
        return this;
    }

    /**
     * Information about when a party is active/inactive.
     * 
     */
    @JsonProperty("status")
    public List<PartyStatusType> getStatus() {
        return status;
    }

    /**
     * Information about when a party is active/inactive.
     * 
     */
    @JsonProperty("status")
    public void setStatus(List<PartyStatusType> status) {
        this.status = status;
    }

    public BasicPartyType withStatus(List<PartyStatusType> status) {
        this.status = status;
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

    public BasicPartyType withExtensions(NoCustomExtensionsType extensions) {
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

    public BasicPartyType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BasicPartyType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("additionalPartyId");
        sb.append('=');
        sb.append(((this.additionalPartyId == null)?"<null>":this.additionalPartyId));
        sb.append(',');
        sb.append("partyName");
        sb.append('=');
        sb.append(((this.partyName == null)?"<null>":this.partyName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("organisationHighestPartyId");
        sb.append('=');
        sb.append(((this.organisationHighestPartyId == null)?"<null>":this.organisationHighestPartyId));
        sb.append(',');
        sb.append("partyRole");
        sb.append('=');
        sb.append(((this.partyRole == null)?"<null>":this.partyRole));
        sb.append(',');
        sb.append("partyAddress");
        sb.append('=');
        sb.append(((this.partyAddress == null)?"<null>":this.partyAddress));
        sb.append(',');
        sb.append("partyContact");
        sb.append('=');
        sb.append(((this.partyContact == null)?"<null>":this.partyContact));
        sb.append(',');
        sb.append("operatingHours");
        sb.append('=');
        sb.append(((this.operatingHours == null)?"<null>":this.operatingHours));
        sb.append(',');
        sb.append("financialInformation");
        sb.append('=');
        sb.append(((this.financialInformation == null)?"<null>":this.financialInformation));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.additionalPartyId == null)? 0 :this.additionalPartyId.hashCode()));
        result = ((result* 31)+((this.financialInformation == null)? 0 :this.financialInformation.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.partyContact == null)? 0 :this.partyContact.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.organisationHighestPartyId == null)? 0 :this.organisationHighestPartyId.hashCode()));
        result = ((result* 31)+((this.operatingHours == null)? 0 :this.operatingHours.hashCode()));
        result = ((result* 31)+((this.partyRole == null)? 0 :this.partyRole.hashCode()));
        result = ((result* 31)+((this.partyName == null)? 0 :this.partyName.hashCode()));
        result = ((result* 31)+((this.partyAddress == null)? 0 :this.partyAddress.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BasicPartyType) == false) {
            return false;
        }
        BasicPartyType rhs = ((BasicPartyType) other);
        return (((((((((((((this.additionalPartyId == rhs.additionalPartyId)||((this.additionalPartyId!= null)&&this.additionalPartyId.equals(rhs.additionalPartyId)))&&((this.financialInformation == rhs.financialInformation)||((this.financialInformation!= null)&&this.financialInformation.equals(rhs.financialInformation))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.partyContact == rhs.partyContact)||((this.partyContact!= null)&&this.partyContact.equals(rhs.partyContact))))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.organisationHighestPartyId == rhs.organisationHighestPartyId)||((this.organisationHighestPartyId!= null)&&this.organisationHighestPartyId.equals(rhs.organisationHighestPartyId))))&&((this.operatingHours == rhs.operatingHours)||((this.operatingHours!= null)&&this.operatingHours.equals(rhs.operatingHours))))&&((this.partyRole == rhs.partyRole)||((this.partyRole!= null)&&this.partyRole.equals(rhs.partyRole))))&&((this.partyName == rhs.partyName)||((this.partyName!= null)&&this.partyName.equals(rhs.partyName))))&&((this.partyAddress == rhs.partyAddress)||((this.partyAddress!= null)&&this.partyAddress.equals(rhs.partyAddress))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
