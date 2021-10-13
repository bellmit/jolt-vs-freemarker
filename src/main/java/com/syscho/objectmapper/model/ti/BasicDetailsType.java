
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BasicDetailsType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "domicileDescription",
    "address",
    "contact",
    "isEnabledForOptimization",
    "organisationName",
    "operatingHours"
})
@Generated("jsonschema2pojo")
public class BasicDetailsType {

    /**
     * The description of the domicile.
     * 
     */
    @JsonProperty("domicileDescription")
    @JsonPropertyDescription("The description of the domicile.")
    private List<DescriptionType> domicileDescription = new ArrayList<DescriptionType>();
    /**
     * TransportationAddressType
     * <p>
     * 
     * 
     */
    @JsonProperty("address")
    private TransportationAddressType address;
    /**
     * Information about contacts associated with the domicile.
     * 
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("Information about contacts associated with the domicile.")
    private List<DomicileContactType> contact = new ArrayList<DomicileContactType>();
    /**
     * An indicator that determines whether a domicile is enabled for optimization and routing.
     * 
     */
    @JsonProperty("isEnabledForOptimization")
    @JsonPropertyDescription("An indicator that determines whether a domicile is enabled for optimization and routing.")
    private Boolean isEnabledForOptimization;
    /**
     * The official name of the business entity to which this domicile belongs.
     * 
     */
    @JsonProperty("organisationName")
    @JsonPropertyDescription("The official name of the business entity to which this domicile belongs.")
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
     * The description of the domicile.
     * 
     */
    @JsonProperty("domicileDescription")
    public List<DescriptionType> getDomicileDescription() {
        return domicileDescription;
    }

    /**
     * The description of the domicile.
     * 
     */
    @JsonProperty("domicileDescription")
    public void setDomicileDescription(List<DescriptionType> domicileDescription) {
        this.domicileDescription = domicileDescription;
    }

    public BasicDetailsType withDomicileDescription(List<DescriptionType> domicileDescription) {
        this.domicileDescription = domicileDescription;
        return this;
    }

    /**
     * TransportationAddressType
     * <p>
     * 
     * 
     */
    @JsonProperty("address")
    public TransportationAddressType getAddress() {
        return address;
    }

    /**
     * TransportationAddressType
     * <p>
     * 
     * 
     */
    @JsonProperty("address")
    public void setAddress(TransportationAddressType address) {
        this.address = address;
    }

    public BasicDetailsType withAddress(TransportationAddressType address) {
        this.address = address;
        return this;
    }

    /**
     * Information about contacts associated with the domicile.
     * 
     */
    @JsonProperty("contact")
    public List<DomicileContactType> getContact() {
        return contact;
    }

    /**
     * Information about contacts associated with the domicile.
     * 
     */
    @JsonProperty("contact")
    public void setContact(List<DomicileContactType> contact) {
        this.contact = contact;
    }

    public BasicDetailsType withContact(List<DomicileContactType> contact) {
        this.contact = contact;
        return this;
    }

    /**
     * An indicator that determines whether a domicile is enabled for optimization and routing.
     * 
     */
    @JsonProperty("isEnabledForOptimization")
    public Boolean getIsEnabledForOptimization() {
        return isEnabledForOptimization;
    }

    /**
     * An indicator that determines whether a domicile is enabled for optimization and routing.
     * 
     */
    @JsonProperty("isEnabledForOptimization")
    public void setIsEnabledForOptimization(Boolean isEnabledForOptimization) {
        this.isEnabledForOptimization = isEnabledForOptimization;
    }

    public BasicDetailsType withIsEnabledForOptimization(Boolean isEnabledForOptimization) {
        this.isEnabledForOptimization = isEnabledForOptimization;
        return this;
    }

    /**
     * The official name of the business entity to which this domicile belongs.
     * 
     */
    @JsonProperty("organisationName")
    public String getOrganisationName() {
        return organisationName;
    }

    /**
     * The official name of the business entity to which this domicile belongs.
     * 
     */
    @JsonProperty("organisationName")
    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    public BasicDetailsType withOrganisationName(String organisationName) {
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

    public BasicDetailsType withOperatingHours(OperatingHours operatingHours) {
        this.operatingHours = operatingHours;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BasicDetailsType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("domicileDescription");
        sb.append('=');
        sb.append(((this.domicileDescription == null)?"<null>":this.domicileDescription));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("isEnabledForOptimization");
        sb.append('=');
        sb.append(((this.isEnabledForOptimization == null)?"<null>":this.isEnabledForOptimization));
        sb.append(',');
        sb.append("organisationName");
        sb.append('=');
        sb.append(((this.organisationName == null)?"<null>":this.organisationName));
        sb.append(',');
        sb.append("operatingHours");
        sb.append('=');
        sb.append(((this.operatingHours == null)?"<null>":this.operatingHours));
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
        result = ((result* 31)+((this.domicileDescription == null)? 0 :this.domicileDescription.hashCode()));
        result = ((result* 31)+((this.organisationName == null)? 0 :this.organisationName.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.isEnabledForOptimization == null)? 0 :this.isEnabledForOptimization.hashCode()));
        result = ((result* 31)+((this.operatingHours == null)? 0 :this.operatingHours.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BasicDetailsType) == false) {
            return false;
        }
        BasicDetailsType rhs = ((BasicDetailsType) other);
        return (((((((this.domicileDescription == rhs.domicileDescription)||((this.domicileDescription!= null)&&this.domicileDescription.equals(rhs.domicileDescription)))&&((this.organisationName == rhs.organisationName)||((this.organisationName!= null)&&this.organisationName.equals(rhs.organisationName))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.isEnabledForOptimization == rhs.isEnabledForOptimization)||((this.isEnabledForOptimization!= null)&&this.isEnabledForOptimization.equals(rhs.isEnabledForOptimization))))&&((this.operatingHours == rhs.operatingHours)||((this.operatingHours!= null)&&this.operatingHours.equals(rhs.operatingHours))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))));
    }

}
