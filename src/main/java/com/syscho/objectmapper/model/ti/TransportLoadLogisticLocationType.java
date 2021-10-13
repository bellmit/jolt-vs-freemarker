
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TransportLoadLogisticLocationType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "gln",
    "additionalLocationId",
    "sublocationId",
    "dockId",
    "locationSpecificInstructions",
    "address"
})
@Generated("jsonschema2pojo")
public class TransportLoadLogisticLocationType {

    /**
     * The GS1 global location number (GLN) of this logistic location.
     * 
     */
    @JsonProperty("gln")
    @JsonPropertyDescription("The GS1 global location number (GLN) of this logistic location.")
    private String gln;
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
     * The string of characters by which a specific dock door is uniquely known by the enterprise.
     * 
     */
    @JsonProperty("dockId")
    @JsonPropertyDescription("The string of characters by which a specific dock door is uniquely known by the enterprise.")
    private String dockId;
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
     * The GS1 global location number (GLN) of this logistic location.
     * 
     */
    @JsonProperty("gln")
    public String getGln() {
        return gln;
    }

    /**
     * The GS1 global location number (GLN) of this logistic location.
     * 
     */
    @JsonProperty("gln")
    public void setGln(String gln) {
        this.gln = gln;
    }

    public TransportLoadLogisticLocationType withGln(String gln) {
        this.gln = gln;
        return this;
    }

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

    public TransportLoadLogisticLocationType withAdditionalLocationId(List<String> additionalLocationId) {
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

    public TransportLoadLogisticLocationType withSublocationId(String sublocationId) {
        this.sublocationId = sublocationId;
        return this;
    }

    /**
     * The string of characters by which a specific dock door is uniquely known by the enterprise.
     * 
     */
    @JsonProperty("dockId")
    public String getDockId() {
        return dockId;
    }

    /**
     * The string of characters by which a specific dock door is uniquely known by the enterprise.
     * 
     */
    @JsonProperty("dockId")
    public void setDockId(String dockId) {
        this.dockId = dockId;
    }

    public TransportLoadLogisticLocationType withDockId(String dockId) {
        this.dockId = dockId;
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

    public TransportLoadLogisticLocationType withLocationSpecificInstructions(Description200Type locationSpecificInstructions) {
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

    public TransportLoadLogisticLocationType withAddress(AddressType address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportLoadLogisticLocationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gln");
        sb.append('=');
        sb.append(((this.gln == null)?"<null>":this.gln));
        sb.append(',');
        sb.append("additionalLocationId");
        sb.append('=');
        sb.append(((this.additionalLocationId == null)?"<null>":this.additionalLocationId));
        sb.append(',');
        sb.append("sublocationId");
        sb.append('=');
        sb.append(((this.sublocationId == null)?"<null>":this.sublocationId));
        sb.append(',');
        sb.append("dockId");
        sb.append('=');
        sb.append(((this.dockId == null)?"<null>":this.dockId));
        sb.append(',');
        sb.append("locationSpecificInstructions");
        sb.append('=');
        sb.append(((this.locationSpecificInstructions == null)?"<null>":this.locationSpecificInstructions));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
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
        result = ((result* 31)+((this.dockId == null)? 0 :this.dockId.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.gln == null)? 0 :this.gln.hashCode()));
        result = ((result* 31)+((this.locationSpecificInstructions == null)? 0 :this.locationSpecificInstructions.hashCode()));
        result = ((result* 31)+((this.additionalLocationId == null)? 0 :this.additionalLocationId.hashCode()));
        result = ((result* 31)+((this.sublocationId == null)? 0 :this.sublocationId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportLoadLogisticLocationType) == false) {
            return false;
        }
        TransportLoadLogisticLocationType rhs = ((TransportLoadLogisticLocationType) other);
        return (((((((this.dockId == rhs.dockId)||((this.dockId!= null)&&this.dockId.equals(rhs.dockId)))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.gln == rhs.gln)||((this.gln!= null)&&this.gln.equals(rhs.gln))))&&((this.locationSpecificInstructions == rhs.locationSpecificInstructions)||((this.locationSpecificInstructions!= null)&&this.locationSpecificInstructions.equals(rhs.locationSpecificInstructions))))&&((this.additionalLocationId == rhs.additionalLocationId)||((this.additionalLocationId!= null)&&this.additionalLocationId.equals(rhs.additionalLocationId))))&&((this.sublocationId == rhs.sublocationId)||((this.sublocationId!= null)&&this.sublocationId.equals(rhs.sublocationId))));
    }

}
