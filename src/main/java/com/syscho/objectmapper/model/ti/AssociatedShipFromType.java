
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AssociatedShipFromType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isManagedByTransportation",
    "allLocations",
    "shipFrom"
})
@Generated("jsonschema2pojo")
public class AssociatedShipFromType {

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
     * Basic location receives from these locations.
     * 
     */
    @JsonProperty("shipFrom")
    @JsonPropertyDescription("Basic location receives from these locations.")
    private List<ShipFromType> shipFrom = new ArrayList<ShipFromType>();

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

    public AssociatedShipFromType withIsManagedByTransportation(Boolean isManagedByTransportation) {
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

    public AssociatedShipFromType withAllLocations(Boolean allLocations) {
        this.allLocations = allLocations;
        return this;
    }

    /**
     * Basic location receives from these locations.
     * 
     */
    @JsonProperty("shipFrom")
    public List<ShipFromType> getShipFrom() {
        return shipFrom;
    }

    /**
     * Basic location receives from these locations.
     * 
     */
    @JsonProperty("shipFrom")
    public void setShipFrom(List<ShipFromType> shipFrom) {
        this.shipFrom = shipFrom;
    }

    public AssociatedShipFromType withShipFrom(List<ShipFromType> shipFrom) {
        this.shipFrom = shipFrom;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AssociatedShipFromType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isManagedByTransportation");
        sb.append('=');
        sb.append(((this.isManagedByTransportation == null)?"<null>":this.isManagedByTransportation));
        sb.append(',');
        sb.append("allLocations");
        sb.append('=');
        sb.append(((this.allLocations == null)?"<null>":this.allLocations));
        sb.append(',');
        sb.append("shipFrom");
        sb.append('=');
        sb.append(((this.shipFrom == null)?"<null>":this.shipFrom));
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
        result = ((result* 31)+((this.shipFrom == null)? 0 :this.shipFrom.hashCode()));
        result = ((result* 31)+((this.isManagedByTransportation == null)? 0 :this.isManagedByTransportation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssociatedShipFromType) == false) {
            return false;
        }
        AssociatedShipFromType rhs = ((AssociatedShipFromType) other);
        return ((((this.allLocations == rhs.allLocations)||((this.allLocations!= null)&&this.allLocations.equals(rhs.allLocations)))&&((this.shipFrom == rhs.shipFrom)||((this.shipFrom!= null)&&this.shipFrom.equals(rhs.shipFrom))))&&((this.isManagedByTransportation == rhs.isManagedByTransportation)||((this.isManagedByTransportation!= null)&&this.isManagedByTransportation.equals(rhs.isManagedByTransportation))));
    }

}
