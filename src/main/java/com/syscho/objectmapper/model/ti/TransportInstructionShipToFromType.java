
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TransportInstructionShipToFromType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "primaryId",
    "additionalPartyId",
    "address",
    "contact",
    "organisationName",
    "addressId",
    "addressType",
    "isTemporaryAddress",
    "areGeographicalCoordinatesOverridden",
    "isResidentialAddress",
    "note",
    "addressDistrict",
    "addressRegion",
    "honorific",
    "externalAddressId",
    "name",
    "timeZoneCode",
    "ownerOfLocation"
})
@Generated("jsonschema2pojo")
public class TransportInstructionShipToFromType {

    @JsonProperty("primaryId")
    private String primaryId;
    /**
     * Identification of a party by use of a code other than the Global Location Number.
     * 
     */
    @JsonProperty("additionalPartyId")
    @JsonPropertyDescription("Identification of a party by use of a code other than the Global Location Number.")
    private List<AdditionalPartyIdentificationType> additionalPartyId = new ArrayList<AdditionalPartyIdentificationType>();
    /**
     * AddressType
     * <p>
     * 
     * 
     */
    @JsonProperty("address")
    private AddressType address;
    /**
     * Information on an individual or department acting as point of contact for an organization.
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("Information on an individual or department acting as point of contact for an organization.")
    private List<ContactType> contact = new ArrayList<ContactType>();
    /**
     * The official name of the organisation.
     * 
     * 
     * 
     * 
     */
    @JsonProperty("organisationName")
    @JsonPropertyDescription("The official name of the organisation.\n\n\n")
    private String organisationName;
    /**
     * The ID of the address.
     * 
     */
    @JsonProperty("addressId")
    @JsonPropertyDescription("The ID of the address.")
    private String addressId;
    /**
     * Address Type - (ADRTYP) in WM are BLDG, SUP, CAR, INS, STR, CLI, USR, CST, WH.
     * 
     */
    @JsonProperty("addressType")
    @JsonPropertyDescription("Address Type - (ADRTYP) in WM are BLDG, SUP, CAR, INS, STR, CLI, USR, CST, WH.")
    private String addressType;
    /**
     * Indicates that an address is intended for limited use, and not for long-term management by the system.
     * 
     */
    @JsonProperty("isTemporaryAddress")
    @JsonPropertyDescription("Indicates that an address is intended for limited use, and not for long-term management by the system.")
    private Boolean isTemporaryAddress;
    /**
     * Indicates whether the latitude or longitude values have been manually overridden.
     * 
     */
    @JsonProperty("areGeographicalCoordinatesOverridden")
    @JsonPropertyDescription("Indicates whether the latitude or longitude values have been manually overridden.")
    private Boolean areGeographicalCoordinatesOverridden;
    /**
     * Indicates whether the address is a residential address. If omitted from input, false will be assumed.
     * 
     */
    @JsonProperty("isResidentialAddress")
    @JsonPropertyDescription("Indicates whether the address is a residential address. If omitted from input, false will be assumed.")
    private Boolean isResidentialAddress;
    /**
     * Description500Type
     * <p>
     * 
     * 
     */
    @JsonProperty("note")
    private Description500Type note;
    /**
     * The district code for the customer address.
     * 
     */
    @JsonProperty("addressDistrict")
    @JsonPropertyDescription("The district code for the customer address.")
    private String addressDistrict;
    /**
     * The region code for the customer address.
     * 
     */
    @JsonProperty("addressRegion")
    @JsonPropertyDescription("The region code for the customer address.")
    private String addressRegion;
    /**
     * The honorific for the customer, for example, Mr., Ms., Mrs., Dr. etc.
     * 
     */
    @JsonProperty("honorific")
    @JsonPropertyDescription("The honorific for the customer, for example, Mr., Ms., Mrs., Dr. etc.")
    private String honorific;
    /**
     * External Address Identifier.
     * 
     */
    @JsonProperty("externalAddressId")
    @JsonPropertyDescription("External Address Identifier.")
    private String externalAddressId;
    /**
     * Name of the location.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the location.")
    private String name;
    /**
     * TimeZoneNameCode
     * <p>
     * 
     * 
     */
    @JsonProperty("timeZoneCode")
    private TimeZoneNameCode timeZoneCode;
    /**
     * The party that owns this location.
     * 
     */
    @JsonProperty("ownerOfLocation")
    @JsonPropertyDescription("The party that owns this location.")
    private String ownerOfLocation;

    @JsonProperty("primaryId")
    public String getPrimaryId() {
        return primaryId;
    }

    @JsonProperty("primaryId")
    public void setPrimaryId(String primaryId) {
        this.primaryId = primaryId;
    }

    public TransportInstructionShipToFromType withPrimaryId(String primaryId) {
        this.primaryId = primaryId;
        return this;
    }

    /**
     * Identification of a party by use of a code other than the Global Location Number.
     * 
     */
    @JsonProperty("additionalPartyId")
    public List<AdditionalPartyIdentificationType> getAdditionalPartyId() {
        return additionalPartyId;
    }

    /**
     * Identification of a party by use of a code other than the Global Location Number.
     * 
     */
    @JsonProperty("additionalPartyId")
    public void setAdditionalPartyId(List<AdditionalPartyIdentificationType> additionalPartyId) {
        this.additionalPartyId = additionalPartyId;
    }

    public TransportInstructionShipToFromType withAdditionalPartyId(List<AdditionalPartyIdentificationType> additionalPartyId) {
        this.additionalPartyId = additionalPartyId;
        return this;
    }

    /**
     * AddressType
     * <p>
     * 
     * 
     */
    @JsonProperty("address")
    public AddressType getAddress() {
        return address;
    }

    /**
     * AddressType
     * <p>
     * 
     * 
     */
    @JsonProperty("address")
    public void setAddress(AddressType address) {
        this.address = address;
    }

    public TransportInstructionShipToFromType withAddress(AddressType address) {
        this.address = address;
        return this;
    }

    /**
     * Information on an individual or department acting as point of contact for an organization.
     * 
     */
    @JsonProperty("contact")
    public List<ContactType> getContact() {
        return contact;
    }

    /**
     * Information on an individual or department acting as point of contact for an organization.
     * 
     */
    @JsonProperty("contact")
    public void setContact(List<ContactType> contact) {
        this.contact = contact;
    }

    public TransportInstructionShipToFromType withContact(List<ContactType> contact) {
        this.contact = contact;
        return this;
    }

    /**
     * The official name of the organisation.
     * 
     * 
     * 
     * 
     */
    @JsonProperty("organisationName")
    public String getOrganisationName() {
        return organisationName;
    }

    /**
     * The official name of the organisation.
     * 
     * 
     * 
     * 
     */
    @JsonProperty("organisationName")
    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    public TransportInstructionShipToFromType withOrganisationName(String organisationName) {
        this.organisationName = organisationName;
        return this;
    }

    /**
     * The ID of the address.
     * 
     */
    @JsonProperty("addressId")
    public String getAddressId() {
        return addressId;
    }

    /**
     * The ID of the address.
     * 
     */
    @JsonProperty("addressId")
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public TransportInstructionShipToFromType withAddressId(String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     * Address Type - (ADRTYP) in WM are BLDG, SUP, CAR, INS, STR, CLI, USR, CST, WH.
     * 
     */
    @JsonProperty("addressType")
    public String getAddressType() {
        return addressType;
    }

    /**
     * Address Type - (ADRTYP) in WM are BLDG, SUP, CAR, INS, STR, CLI, USR, CST, WH.
     * 
     */
    @JsonProperty("addressType")
    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public TransportInstructionShipToFromType withAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * Indicates that an address is intended for limited use, and not for long-term management by the system.
     * 
     */
    @JsonProperty("isTemporaryAddress")
    public Boolean getIsTemporaryAddress() {
        return isTemporaryAddress;
    }

    /**
     * Indicates that an address is intended for limited use, and not for long-term management by the system.
     * 
     */
    @JsonProperty("isTemporaryAddress")
    public void setIsTemporaryAddress(Boolean isTemporaryAddress) {
        this.isTemporaryAddress = isTemporaryAddress;
    }

    public TransportInstructionShipToFromType withIsTemporaryAddress(Boolean isTemporaryAddress) {
        this.isTemporaryAddress = isTemporaryAddress;
        return this;
    }

    /**
     * Indicates whether the latitude or longitude values have been manually overridden.
     * 
     */
    @JsonProperty("areGeographicalCoordinatesOverridden")
    public Boolean getAreGeographicalCoordinatesOverridden() {
        return areGeographicalCoordinatesOverridden;
    }

    /**
     * Indicates whether the latitude or longitude values have been manually overridden.
     * 
     */
    @JsonProperty("areGeographicalCoordinatesOverridden")
    public void setAreGeographicalCoordinatesOverridden(Boolean areGeographicalCoordinatesOverridden) {
        this.areGeographicalCoordinatesOverridden = areGeographicalCoordinatesOverridden;
    }

    public TransportInstructionShipToFromType withAreGeographicalCoordinatesOverridden(Boolean areGeographicalCoordinatesOverridden) {
        this.areGeographicalCoordinatesOverridden = areGeographicalCoordinatesOverridden;
        return this;
    }

    /**
     * Indicates whether the address is a residential address. If omitted from input, false will be assumed.
     * 
     */
    @JsonProperty("isResidentialAddress")
    public Boolean getIsResidentialAddress() {
        return isResidentialAddress;
    }

    /**
     * Indicates whether the address is a residential address. If omitted from input, false will be assumed.
     * 
     */
    @JsonProperty("isResidentialAddress")
    public void setIsResidentialAddress(Boolean isResidentialAddress) {
        this.isResidentialAddress = isResidentialAddress;
    }

    public TransportInstructionShipToFromType withIsResidentialAddress(Boolean isResidentialAddress) {
        this.isResidentialAddress = isResidentialAddress;
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

    public TransportInstructionShipToFromType withNote(Description500Type note) {
        this.note = note;
        return this;
    }

    /**
     * The district code for the customer address.
     * 
     */
    @JsonProperty("addressDistrict")
    public String getAddressDistrict() {
        return addressDistrict;
    }

    /**
     * The district code for the customer address.
     * 
     */
    @JsonProperty("addressDistrict")
    public void setAddressDistrict(String addressDistrict) {
        this.addressDistrict = addressDistrict;
    }

    public TransportInstructionShipToFromType withAddressDistrict(String addressDistrict) {
        this.addressDistrict = addressDistrict;
        return this;
    }

    /**
     * The region code for the customer address.
     * 
     */
    @JsonProperty("addressRegion")
    public String getAddressRegion() {
        return addressRegion;
    }

    /**
     * The region code for the customer address.
     * 
     */
    @JsonProperty("addressRegion")
    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    public TransportInstructionShipToFromType withAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
        return this;
    }

    /**
     * The honorific for the customer, for example, Mr., Ms., Mrs., Dr. etc.
     * 
     */
    @JsonProperty("honorific")
    public String getHonorific() {
        return honorific;
    }

    /**
     * The honorific for the customer, for example, Mr., Ms., Mrs., Dr. etc.
     * 
     */
    @JsonProperty("honorific")
    public void setHonorific(String honorific) {
        this.honorific = honorific;
    }

    public TransportInstructionShipToFromType withHonorific(String honorific) {
        this.honorific = honorific;
        return this;
    }

    /**
     * External Address Identifier.
     * 
     */
    @JsonProperty("externalAddressId")
    public String getExternalAddressId() {
        return externalAddressId;
    }

    /**
     * External Address Identifier.
     * 
     */
    @JsonProperty("externalAddressId")
    public void setExternalAddressId(String externalAddressId) {
        this.externalAddressId = externalAddressId;
    }

    public TransportInstructionShipToFromType withExternalAddressId(String externalAddressId) {
        this.externalAddressId = externalAddressId;
        return this;
    }

    /**
     * Name of the location.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the location.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public TransportInstructionShipToFromType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * TimeZoneNameCode
     * <p>
     * 
     * 
     */
    @JsonProperty("timeZoneCode")
    public TimeZoneNameCode getTimeZoneCode() {
        return timeZoneCode;
    }

    /**
     * TimeZoneNameCode
     * <p>
     * 
     * 
     */
    @JsonProperty("timeZoneCode")
    public void setTimeZoneCode(TimeZoneNameCode timeZoneCode) {
        this.timeZoneCode = timeZoneCode;
    }

    public TransportInstructionShipToFromType withTimeZoneCode(TimeZoneNameCode timeZoneCode) {
        this.timeZoneCode = timeZoneCode;
        return this;
    }

    /**
     * The party that owns this location.
     * 
     */
    @JsonProperty("ownerOfLocation")
    public String getOwnerOfLocation() {
        return ownerOfLocation;
    }

    /**
     * The party that owns this location.
     * 
     */
    @JsonProperty("ownerOfLocation")
    public void setOwnerOfLocation(String ownerOfLocation) {
        this.ownerOfLocation = ownerOfLocation;
    }

    public TransportInstructionShipToFromType withOwnerOfLocation(String ownerOfLocation) {
        this.ownerOfLocation = ownerOfLocation;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportInstructionShipToFromType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("primaryId");
        sb.append('=');
        sb.append(((this.primaryId == null)?"<null>":this.primaryId));
        sb.append(',');
        sb.append("additionalPartyId");
        sb.append('=');
        sb.append(((this.additionalPartyId == null)?"<null>":this.additionalPartyId));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("organisationName");
        sb.append('=');
        sb.append(((this.organisationName == null)?"<null>":this.organisationName));
        sb.append(',');
        sb.append("addressId");
        sb.append('=');
        sb.append(((this.addressId == null)?"<null>":this.addressId));
        sb.append(',');
        sb.append("addressType");
        sb.append('=');
        sb.append(((this.addressType == null)?"<null>":this.addressType));
        sb.append(',');
        sb.append("isTemporaryAddress");
        sb.append('=');
        sb.append(((this.isTemporaryAddress == null)?"<null>":this.isTemporaryAddress));
        sb.append(',');
        sb.append("areGeographicalCoordinatesOverridden");
        sb.append('=');
        sb.append(((this.areGeographicalCoordinatesOverridden == null)?"<null>":this.areGeographicalCoordinatesOverridden));
        sb.append(',');
        sb.append("isResidentialAddress");
        sb.append('=');
        sb.append(((this.isResidentialAddress == null)?"<null>":this.isResidentialAddress));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("addressDistrict");
        sb.append('=');
        sb.append(((this.addressDistrict == null)?"<null>":this.addressDistrict));
        sb.append(',');
        sb.append("addressRegion");
        sb.append('=');
        sb.append(((this.addressRegion == null)?"<null>":this.addressRegion));
        sb.append(',');
        sb.append("honorific");
        sb.append('=');
        sb.append(((this.honorific == null)?"<null>":this.honorific));
        sb.append(',');
        sb.append("externalAddressId");
        sb.append('=');
        sb.append(((this.externalAddressId == null)?"<null>":this.externalAddressId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("timeZoneCode");
        sb.append('=');
        sb.append(((this.timeZoneCode == null)?"<null>":this.timeZoneCode));
        sb.append(',');
        sb.append("ownerOfLocation");
        sb.append('=');
        sb.append(((this.ownerOfLocation == null)?"<null>":this.ownerOfLocation));
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
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.addressType == null)? 0 :this.addressType.hashCode()));
        result = ((result* 31)+((this.areGeographicalCoordinatesOverridden == null)? 0 :this.areGeographicalCoordinatesOverridden.hashCode()));
        result = ((result* 31)+((this.primaryId == null)? 0 :this.primaryId.hashCode()));
        result = ((result* 31)+((this.isResidentialAddress == null)? 0 :this.isResidentialAddress.hashCode()));
        result = ((result* 31)+((this.addressId == null)? 0 :this.addressId.hashCode()));
        result = ((result* 31)+((this.isTemporaryAddress == null)? 0 :this.isTemporaryAddress.hashCode()));
        result = ((result* 31)+((this.externalAddressId == null)? 0 :this.externalAddressId.hashCode()));
        result = ((result* 31)+((this.ownerOfLocation == null)? 0 :this.ownerOfLocation.hashCode()));
        result = ((result* 31)+((this.organisationName == null)? 0 :this.organisationName.hashCode()));
        result = ((result* 31)+((this.timeZoneCode == null)? 0 :this.timeZoneCode.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.addressDistrict == null)? 0 :this.addressDistrict.hashCode()));
        result = ((result* 31)+((this.addressRegion == null)? 0 :this.addressRegion.hashCode()));
        result = ((result* 31)+((this.honorific == null)? 0 :this.honorific.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportInstructionShipToFromType) == false) {
            return false;
        }
        TransportInstructionShipToFromType rhs = ((TransportInstructionShipToFromType) other);
        return (((((((((((((((((((this.additionalPartyId == rhs.additionalPartyId)||((this.additionalPartyId!= null)&&this.additionalPartyId.equals(rhs.additionalPartyId)))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.addressType == rhs.addressType)||((this.addressType!= null)&&this.addressType.equals(rhs.addressType))))&&((this.areGeographicalCoordinatesOverridden == rhs.areGeographicalCoordinatesOverridden)||((this.areGeographicalCoordinatesOverridden!= null)&&this.areGeographicalCoordinatesOverridden.equals(rhs.areGeographicalCoordinatesOverridden))))&&((this.primaryId == rhs.primaryId)||((this.primaryId!= null)&&this.primaryId.equals(rhs.primaryId))))&&((this.isResidentialAddress == rhs.isResidentialAddress)||((this.isResidentialAddress!= null)&&this.isResidentialAddress.equals(rhs.isResidentialAddress))))&&((this.addressId == rhs.addressId)||((this.addressId!= null)&&this.addressId.equals(rhs.addressId))))&&((this.isTemporaryAddress == rhs.isTemporaryAddress)||((this.isTemporaryAddress!= null)&&this.isTemporaryAddress.equals(rhs.isTemporaryAddress))))&&((this.externalAddressId == rhs.externalAddressId)||((this.externalAddressId!= null)&&this.externalAddressId.equals(rhs.externalAddressId))))&&((this.ownerOfLocation == rhs.ownerOfLocation)||((this.ownerOfLocation!= null)&&this.ownerOfLocation.equals(rhs.ownerOfLocation))))&&((this.organisationName == rhs.organisationName)||((this.organisationName!= null)&&this.organisationName.equals(rhs.organisationName))))&&((this.timeZoneCode == rhs.timeZoneCode)||((this.timeZoneCode!= null)&&this.timeZoneCode.equals(rhs.timeZoneCode))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.addressDistrict == rhs.addressDistrict)||((this.addressDistrict!= null)&&this.addressDistrict.equals(rhs.addressDistrict))))&&((this.addressRegion == rhs.addressRegion)||((this.addressRegion!= null)&&this.addressRegion.equals(rhs.addressRegion))))&&((this.honorific == rhs.honorific)||((this.honorific!= null)&&this.honorific.equals(rhs.honorific))));
    }

}
