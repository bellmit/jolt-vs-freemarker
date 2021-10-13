
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AssociatedShipToType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isManagedByTransportation",
    "allLocations",
    "shipTo"
})
@Generated("jsonschema2pojo")
public class AssociatedShipToType {

    /**
     * Location is managed by transportation system.
     * 
     */
    @JsonProperty("isManagedByTransportation")
    @JsonPropertyDescription("Location is managed by transportation system.")
    private Boolean isManagedByTransportation;
    /**
     * Location can ship to / ship from all locations.
     * 
     */
    @JsonProperty("allLocations")
    @JsonPropertyDescription("Location can ship to / ship from all locations.")
    private Boolean allLocations;
    /**
     * Basic location shipping to these locations.
     * 
     */
    @JsonProperty("shipTo")
    @JsonPropertyDescription("Basic location shipping to these locations.")
    private List<PartyIdentificationType> shipTo = new ArrayList<PartyIdentificationType>();

    /**
     * Location is managed by transportation system.
     * 
     */
    @JsonProperty("isManagedByTransportation")
    public Boolean getIsManagedByTransportation() {
        return isManagedByTransportation;
    }

    /**
     * Location is managed by transportation system.
     * 
     */
    @JsonProperty("isManagedByTransportation")
    public void setIsManagedByTransportation(Boolean isManagedByTransportation) {
        this.isManagedByTransportation = isManagedByTransportation;
    }

    public AssociatedShipToType withIsManagedByTransportation(Boolean isManagedByTransportation) {
        this.isManagedByTransportation = isManagedByTransportation;
        return this;
    }

    /**
     * Location can ship to / ship from all locations.
     * 
     */
    @JsonProperty("allLocations")
    public Boolean getAllLocations() {
        return allLocations;
    }

    /**
     * Location can ship to / ship from all locations.
     * 
     */
    @JsonProperty("allLocations")
    public void setAllLocations(Boolean allLocations) {
        this.allLocations = allLocations;
    }

    public AssociatedShipToType withAllLocations(Boolean allLocations) {
        this.allLocations = allLocations;
        return this;
    }

    /**
     * Basic location shipping to these locations.
     * 
     */
    @JsonProperty("shipTo")
    public List<PartyIdentificationType> getShipTo() {
        return shipTo;
    }

    /**
     * Basic location shipping to these locations.
     * 
     */
    @JsonProperty("shipTo")
    public void setShipTo(List<PartyIdentificationType> shipTo) {
        this.shipTo = shipTo;
    }

    public AssociatedShipToType withShipTo(List<PartyIdentificationType> shipTo) {
        this.shipTo = shipTo;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AssociatedShipToType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isManagedByTransportation");
        sb.append('=');
        sb.append(((this.isManagedByTransportation == null)?"<null>":this.isManagedByTransportation));
        sb.append(',');
        sb.append("allLocations");
        sb.append('=');
        sb.append(((this.allLocations == null)?"<null>":this.allLocations));
        sb.append(',');
        sb.append("shipTo");
        sb.append('=');
        sb.append(((this.shipTo == null)?"<null>":this.shipTo));
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
        result = ((result* 31)+((this.allLocations == null)? 0 :this.allLocations.hashCode()));
        result = ((result* 31)+((this.isManagedByTransportation == null)? 0 :this.isManagedByTransportation.hashCode()));
        result = ((result* 31)+((this.shipTo == null)? 0 :this.shipTo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssociatedShipToType) == false) {
            return false;
        }
        AssociatedShipToType rhs = ((AssociatedShipToType) other);
        return ((((this.allLocations == rhs.allLocations)||((this.allLocations!= null)&&this.allLocations.equals(rhs.allLocations)))&&((this.isManagedByTransportation == rhs.isManagedByTransportation)||((this.isManagedByTransportation!= null)&&this.isManagedByTransportation.equals(rhs.isManagedByTransportation))))&&((this.shipTo == rhs.shipTo)||((this.shipTo!= null)&&this.shipTo.equals(rhs.shipTo))));
    }

}
