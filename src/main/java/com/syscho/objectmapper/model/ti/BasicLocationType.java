
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BasicLocationType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "additionalPartyId",
    "sublocationId",
    "banner",
    "locationName",
    "description",
    "address",
    "contact",
    "organisationName",
    "operatingHours",
    "locationTypeCode",
    "accountGroup",
    "isCrossDock",
    "shipToLocations",
    "shipFromLocations",
    "status",
    "deliveryPostalCode",
    "extensions",
    "avpList"
})
@Generated("jsonschema2pojo")
public class BasicLocationType {

    /**
     * Identifier of the party or location, specified in addition to the GLN.
     * 
     */
    @JsonProperty("additionalPartyId")
    @JsonPropertyDescription("Identifier of the party or location, specified in addition to the GLN.")
    private List<AdditionalPartyIdentificationType> additionalPartyId = new ArrayList<AdditionalPartyIdentificationType>();
    /**
     * Text further specifying the exact logistic location. For example: dock door, department, building.
     * 
     */
    @JsonProperty("sublocationId")
    @JsonPropertyDescription("Text further specifying the exact logistic location. For example: dock door, department, building.")
    private String sublocationId;
    /**
     * The term for a subsidiary used by an enterprise.
     * 
     */
    @JsonProperty("banner")
    @JsonPropertyDescription("The term for a subsidiary used by an enterprise.")
    private String banner;
    /**
     * The user friendly name of the location.
     * 
     */
    @JsonProperty("locationName")
    @JsonPropertyDescription("The user friendly name of the location.")
    private String locationName;
    /**
     * DescriptionType
     * <p>
     * 
     * 
     */
    @JsonProperty("description")
    private DescriptionType description;
    /**
     * LocationAddressType
     * <p>
     * 
     * 
     */
    @JsonProperty("address")
    private LocationAddressType address;
    /**
     * Information on an individual or department acting as point of contact for an organization.
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("Information on an individual or department acting as point of contact for an organization.")
    private List<LocationContactType> contact = new ArrayList<LocationContactType>();
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
     * OperatingHours
     * <p>
     * 
     * 
     */
    @JsonProperty("operatingHours")
    private OperatingHours operatingHours;
    /**
     * PartyRoleCode
     * <p>
     * 
     * 
     */
    @JsonProperty("locationTypeCode")
    private PartyRoleCode locationTypeCode;
    /**
     * CustomerAccountGroup.
     * 
     */
    @JsonProperty("accountGroup")
    @JsonPropertyDescription("CustomerAccountGroup.")
    private String accountGroup;
    /**
     * This attribute will define if Location is Cross Dock also.
     * 
     */
    @JsonProperty("isCrossDock")
    @JsonPropertyDescription("This attribute will define if Location is Cross Dock also.")
    private Boolean isCrossDock;
    /**
     * AssociatedShipToType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipToLocations")
    private AssociatedShipToType shipToLocations;
    /**
     * AssociatedShipFromType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipFromLocations")
    private AssociatedShipFromType shipFromLocations;
    /**
     * Information about when a location is active/inactive.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Information about when a location is active/inactive.")
    private List<LocationStatusType> status = new ArrayList<LocationStatusType>();
    /**
     * The postal code to which the orders from this location can be delivered.
     * 
     */
    @JsonProperty("deliveryPostalCode")
    @JsonPropertyDescription("The postal code to which the orders from this location can be delivered.")
    private List<String> deliveryPostalCode = new ArrayList<String>();
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

    public BasicLocationType withAdditionalPartyId(List<AdditionalPartyIdentificationType> additionalPartyId) {
        this.additionalPartyId = additionalPartyId;
        return this;
    }

    /**
     * Text further specifying the exact logistic location. For example: dock door, department, building.
     * 
     */
    @JsonProperty("sublocationId")
    public String getSublocationId() {
        return sublocationId;
    }

    /**
     * Text further specifying the exact logistic location. For example: dock door, department, building.
     * 
     */
    @JsonProperty("sublocationId")
    public void setSublocationId(String sublocationId) {
        this.sublocationId = sublocationId;
    }

    public BasicLocationType withSublocationId(String sublocationId) {
        this.sublocationId = sublocationId;
        return this;
    }

    /**
     * The term for a subsidiary used by an enterprise.
     * 
     */
    @JsonProperty("banner")
    public String getBanner() {
        return banner;
    }

    /**
     * The term for a subsidiary used by an enterprise.
     * 
     */
    @JsonProperty("banner")
    public void setBanner(String banner) {
        this.banner = banner;
    }

    public BasicLocationType withBanner(String banner) {
        this.banner = banner;
        return this;
    }

    /**
     * The user friendly name of the location.
     * 
     */
    @JsonProperty("locationName")
    public String getLocationName() {
        return locationName;
    }

    /**
     * The user friendly name of the location.
     * 
     */
    @JsonProperty("locationName")
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public BasicLocationType withLocationName(String locationName) {
        this.locationName = locationName;
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

    public BasicLocationType withDescription(DescriptionType description) {
        this.description = description;
        return this;
    }

    /**
     * LocationAddressType
     * <p>
     * 
     * 
     */
    @JsonProperty("address")
    public LocationAddressType getAddress() {
        return address;
    }

    /**
     * LocationAddressType
     * <p>
     * 
     * 
     */
    @JsonProperty("address")
    public void setAddress(LocationAddressType address) {
        this.address = address;
    }

    public BasicLocationType withAddress(LocationAddressType address) {
        this.address = address;
        return this;
    }

    /**
     * Information on an individual or department acting as point of contact for an organization.
     * 
     */
    @JsonProperty("contact")
    public List<LocationContactType> getContact() {
        return contact;
    }

    /**
     * Information on an individual or department acting as point of contact for an organization.
     * 
     */
    @JsonProperty("contact")
    public void setContact(List<LocationContactType> contact) {
        this.contact = contact;
    }

    public BasicLocationType withContact(List<LocationContactType> contact) {
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

    public BasicLocationType withOrganisationName(String organisationName) {
        this.organisationName = organisationName;
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

    public BasicLocationType withOperatingHours(OperatingHours operatingHours) {
        this.operatingHours = operatingHours;
        return this;
    }

    /**
     * PartyRoleCode
     * <p>
     * 
     * 
     */
    @JsonProperty("locationTypeCode")
    public PartyRoleCode getLocationTypeCode() {
        return locationTypeCode;
    }

    /**
     * PartyRoleCode
     * <p>
     * 
     * 
     */
    @JsonProperty("locationTypeCode")
    public void setLocationTypeCode(PartyRoleCode locationTypeCode) {
        this.locationTypeCode = locationTypeCode;
    }

    public BasicLocationType withLocationTypeCode(PartyRoleCode locationTypeCode) {
        this.locationTypeCode = locationTypeCode;
        return this;
    }

    /**
     * CustomerAccountGroup.
     * 
     */
    @JsonProperty("accountGroup")
    public String getAccountGroup() {
        return accountGroup;
    }

    /**
     * CustomerAccountGroup.
     * 
     */
    @JsonProperty("accountGroup")
    public void setAccountGroup(String accountGroup) {
        this.accountGroup = accountGroup;
    }

    public BasicLocationType withAccountGroup(String accountGroup) {
        this.accountGroup = accountGroup;
        return this;
    }

    /**
     * This attribute will define if Location is Cross Dock also.
     * 
     */
    @JsonProperty("isCrossDock")
    public Boolean getIsCrossDock() {
        return isCrossDock;
    }

    /**
     * This attribute will define if Location is Cross Dock also.
     * 
     */
    @JsonProperty("isCrossDock")
    public void setIsCrossDock(Boolean isCrossDock) {
        this.isCrossDock = isCrossDock;
    }

    public BasicLocationType withIsCrossDock(Boolean isCrossDock) {
        this.isCrossDock = isCrossDock;
        return this;
    }

    /**
     * AssociatedShipToType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipToLocations")
    public AssociatedShipToType getShipToLocations() {
        return shipToLocations;
    }

    /**
     * AssociatedShipToType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipToLocations")
    public void setShipToLocations(AssociatedShipToType shipToLocations) {
        this.shipToLocations = shipToLocations;
    }

    public BasicLocationType withShipToLocations(AssociatedShipToType shipToLocations) {
        this.shipToLocations = shipToLocations;
        return this;
    }

    /**
     * AssociatedShipFromType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipFromLocations")
    public AssociatedShipFromType getShipFromLocations() {
        return shipFromLocations;
    }

    /**
     * AssociatedShipFromType
     * <p>
     * 
     * 
     */
    @JsonProperty("shipFromLocations")
    public void setShipFromLocations(AssociatedShipFromType shipFromLocations) {
        this.shipFromLocations = shipFromLocations;
    }

    public BasicLocationType withShipFromLocations(AssociatedShipFromType shipFromLocations) {
        this.shipFromLocations = shipFromLocations;
        return this;
    }

    /**
     * Information about when a location is active/inactive.
     * 
     */
    @JsonProperty("status")
    public List<LocationStatusType> getStatus() {
        return status;
    }

    /**
     * Information about when a location is active/inactive.
     * 
     */
    @JsonProperty("status")
    public void setStatus(List<LocationStatusType> status) {
        this.status = status;
    }

    public BasicLocationType withStatus(List<LocationStatusType> status) {
        this.status = status;
        return this;
    }

    /**
     * The postal code to which the orders from this location can be delivered.
     * 
     */
    @JsonProperty("deliveryPostalCode")
    public List<String> getDeliveryPostalCode() {
        return deliveryPostalCode;
    }

    /**
     * The postal code to which the orders from this location can be delivered.
     * 
     */
    @JsonProperty("deliveryPostalCode")
    public void setDeliveryPostalCode(List<String> deliveryPostalCode) {
        this.deliveryPostalCode = deliveryPostalCode;
    }

    public BasicLocationType withDeliveryPostalCode(List<String> deliveryPostalCode) {
        this.deliveryPostalCode = deliveryPostalCode;
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

    public BasicLocationType withExtensions(NoCustomExtensionsType extensions) {
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

    public BasicLocationType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BasicLocationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("additionalPartyId");
        sb.append('=');
        sb.append(((this.additionalPartyId == null)?"<null>":this.additionalPartyId));
        sb.append(',');
        sb.append("sublocationId");
        sb.append('=');
        sb.append(((this.sublocationId == null)?"<null>":this.sublocationId));
        sb.append(',');
        sb.append("banner");
        sb.append('=');
        sb.append(((this.banner == null)?"<null>":this.banner));
        sb.append(',');
        sb.append("locationName");
        sb.append('=');
        sb.append(((this.locationName == null)?"<null>":this.locationName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
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
        sb.append("operatingHours");
        sb.append('=');
        sb.append(((this.operatingHours == null)?"<null>":this.operatingHours));
        sb.append(',');
        sb.append("locationTypeCode");
        sb.append('=');
        sb.append(((this.locationTypeCode == null)?"<null>":this.locationTypeCode));
        sb.append(',');
        sb.append("accountGroup");
        sb.append('=');
        sb.append(((this.accountGroup == null)?"<null>":this.accountGroup));
        sb.append(',');
        sb.append("isCrossDock");
        sb.append('=');
        sb.append(((this.isCrossDock == null)?"<null>":this.isCrossDock));
        sb.append(',');
        sb.append("shipToLocations");
        sb.append('=');
        sb.append(((this.shipToLocations == null)?"<null>":this.shipToLocations));
        sb.append(',');
        sb.append("shipFromLocations");
        sb.append('=');
        sb.append(((this.shipFromLocations == null)?"<null>":this.shipFromLocations));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("deliveryPostalCode");
        sb.append('=');
        sb.append(((this.deliveryPostalCode == null)?"<null>":this.deliveryPostalCode));
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
        result = ((result* 31)+((this.locationName == null)? 0 :this.locationName.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.accountGroup == null)? 0 :this.accountGroup.hashCode()));
        result = ((result* 31)+((this.banner == null)? 0 :this.banner.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.isCrossDock == null)? 0 :this.isCrossDock.hashCode()));
        result = ((result* 31)+((this.sublocationId == null)? 0 :this.sublocationId.hashCode()));
        result = ((result* 31)+((this.organisationName == null)? 0 :this.organisationName.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.shipFromLocations == null)? 0 :this.shipFromLocations.hashCode()));
        result = ((result* 31)+((this.operatingHours == null)? 0 :this.operatingHours.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.deliveryPostalCode == null)? 0 :this.deliveryPostalCode.hashCode()));
        result = ((result* 31)+((this.locationTypeCode == null)? 0 :this.locationTypeCode.hashCode()));
        result = ((result* 31)+((this.shipToLocations == null)? 0 :this.shipToLocations.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BasicLocationType) == false) {
            return false;
        }
        BasicLocationType rhs = ((BasicLocationType) other);
        return (((((((((((((((((((this.additionalPartyId == rhs.additionalPartyId)||((this.additionalPartyId!= null)&&this.additionalPartyId.equals(rhs.additionalPartyId)))&&((this.locationName == rhs.locationName)||((this.locationName!= null)&&this.locationName.equals(rhs.locationName))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.accountGroup == rhs.accountGroup)||((this.accountGroup!= null)&&this.accountGroup.equals(rhs.accountGroup))))&&((this.banner == rhs.banner)||((this.banner!= null)&&this.banner.equals(rhs.banner))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.isCrossDock == rhs.isCrossDock)||((this.isCrossDock!= null)&&this.isCrossDock.equals(rhs.isCrossDock))))&&((this.sublocationId == rhs.sublocationId)||((this.sublocationId!= null)&&this.sublocationId.equals(rhs.sublocationId))))&&((this.organisationName == rhs.organisationName)||((this.organisationName!= null)&&this.organisationName.equals(rhs.organisationName))))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.shipFromLocations == rhs.shipFromLocations)||((this.shipFromLocations!= null)&&this.shipFromLocations.equals(rhs.shipFromLocations))))&&((this.operatingHours == rhs.operatingHours)||((this.operatingHours!= null)&&this.operatingHours.equals(rhs.operatingHours))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.deliveryPostalCode == rhs.deliveryPostalCode)||((this.deliveryPostalCode!= null)&&this.deliveryPostalCode.equals(rhs.deliveryPostalCode))))&&((this.locationTypeCode == rhs.locationTypeCode)||((this.locationTypeCode!= null)&&this.locationTypeCode.equals(rhs.locationTypeCode))))&&((this.shipToLocations == rhs.shipToLocations)||((this.shipToLocations!= null)&&this.shipToLocations.equals(rhs.shipToLocations))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
