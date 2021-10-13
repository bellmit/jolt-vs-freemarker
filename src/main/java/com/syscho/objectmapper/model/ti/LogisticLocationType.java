
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LogisticLocationType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "additionalLocationId",
    "sublocationId",
    "locationSpecificInstructions",
    "address",
    "contact"
})
@Generated("jsonschema2pojo")
public class LogisticLocationType {

    /**
     * Identification of a location by use of a code other than the Global Location Number.
     * 
     */
    @JsonProperty("additionalLocationId")
    @JsonPropertyDescription("Identification of a location by use of a code other than the Global Location Number.")
    private List<String> additionalLocationId = new ArrayList<String>();
    /**
     * Text further specifying the exact logistic location. For example: dock door, department, building.
     * 
     */
    @JsonProperty("sublocationId")
    @JsonPropertyDescription("Text further specifying the exact logistic location. For example: dock door, department, building.")
    private String sublocationId;
    /**
     * Description200Type
     * <p>
     * 
     * 
     */
    @JsonProperty("locationSpecificInstructions")
    private Description200Type locationSpecificInstructions;
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
     * Identification of a location by use of a code other than the Global Location Number.
     * 
     */
    @JsonProperty("additionalLocationId")
    public List<String> getAdditionalLocationId() {
        return additionalLocationId;
    }

    /**
     * Identification of a location by use of a code other than the Global Location Number.
     * 
     */
    @JsonProperty("additionalLocationId")
    public void setAdditionalLocationId(List<String> additionalLocationId) {
        this.additionalLocationId = additionalLocationId;
    }

    public LogisticLocationType withAdditionalLocationId(List<String> additionalLocationId) {
        this.additionalLocationId = additionalLocationId;
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

    public LogisticLocationType withSublocationId(String sublocationId) {
        this.sublocationId = sublocationId;
        return this;
    }

    /**
     * Description200Type
     * <p>
     * 
     * 
     */
    @JsonProperty("locationSpecificInstructions")
    public Description200Type getLocationSpecificInstructions() {
        return locationSpecificInstructions;
    }

    /**
     * Description200Type
     * <p>
     * 
     * 
     */
    @JsonProperty("locationSpecificInstructions")
    public void setLocationSpecificInstructions(Description200Type locationSpecificInstructions) {
        this.locationSpecificInstructions = locationSpecificInstructions;
    }

    public LogisticLocationType withLocationSpecificInstructions(Description200Type locationSpecificInstructions) {
        this.locationSpecificInstructions = locationSpecificInstructions;
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

    public LogisticLocationType withAddress(AddressType address) {
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

    public LogisticLocationType withContact(List<ContactType> contact) {
        this.contact = contact;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LogisticLocationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("additionalLocationId");
        sb.append('=');
        sb.append(((this.additionalLocationId == null)?"<null>":this.additionalLocationId));
        sb.append(',');
        sb.append("sublocationId");
        sb.append('=');
        sb.append(((this.sublocationId == null)?"<null>":this.sublocationId));
        sb.append(',');
        sb.append("locationSpecificInstructions");
        sb.append('=');
        sb.append(((this.locationSpecificInstructions == null)?"<null>":this.locationSpecificInstructions));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
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
        result = ((result* 31)+((this.locationSpecificInstructions == null)? 0 :this.locationSpecificInstructions.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.additionalLocationId == null)? 0 :this.additionalLocationId.hashCode()));
        result = ((result* 31)+((this.sublocationId == null)? 0 :this.sublocationId.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LogisticLocationType) == false) {
            return false;
        }
        LogisticLocationType rhs = ((LogisticLocationType) other);
        return ((((((this.locationSpecificInstructions == rhs.locationSpecificInstructions)||((this.locationSpecificInstructions!= null)&&this.locationSpecificInstructions.equals(rhs.locationSpecificInstructions)))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.additionalLocationId == rhs.additionalLocationId)||((this.additionalLocationId!= null)&&this.additionalLocationId.equals(rhs.additionalLocationId))))&&((this.sublocationId == rhs.sublocationId)||((this.sublocationId!= null)&&this.sublocationId.equals(rhs.sublocationId))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))));
    }

}
