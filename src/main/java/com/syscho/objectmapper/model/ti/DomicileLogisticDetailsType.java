
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DomicileLogisticDetailsType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "carrier",
    "shippingLocation",
    "despatchZoneId"
})
@Generated("jsonschema2pojo")
public class DomicileLogisticDetailsType {

    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("carrier")
    private PartyIdentificationType carrier;
    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("shippingLocation")
    private PartyIdentificationType shippingLocation;
    /**
     * The set of characters that uniquely references a specific geographic area from which movements of goods will originate.
     * 
     */
    @JsonProperty("despatchZoneId")
    @JsonPropertyDescription("The set of characters that uniquely references a specific geographic area from which movements of goods will originate.")
    private String despatchZoneId;

    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("carrier")
    public PartyIdentificationType getCarrier() {
        return carrier;
    }

    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("carrier")
    public void setCarrier(PartyIdentificationType carrier) {
        this.carrier = carrier;
    }

    public DomicileLogisticDetailsType withCarrier(PartyIdentificationType carrier) {
        this.carrier = carrier;
        return this;
    }

    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("shippingLocation")
    public PartyIdentificationType getShippingLocation() {
        return shippingLocation;
    }

    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("shippingLocation")
    public void setShippingLocation(PartyIdentificationType shippingLocation) {
        this.shippingLocation = shippingLocation;
    }

    public DomicileLogisticDetailsType withShippingLocation(PartyIdentificationType shippingLocation) {
        this.shippingLocation = shippingLocation;
        return this;
    }

    /**
     * The set of characters that uniquely references a specific geographic area from which movements of goods will originate.
     * 
     */
    @JsonProperty("despatchZoneId")
    public String getDespatchZoneId() {
        return despatchZoneId;
    }

    /**
     * The set of characters that uniquely references a specific geographic area from which movements of goods will originate.
     * 
     */
    @JsonProperty("despatchZoneId")
    public void setDespatchZoneId(String despatchZoneId) {
        this.despatchZoneId = despatchZoneId;
    }

    public DomicileLogisticDetailsType withDespatchZoneId(String despatchZoneId) {
        this.despatchZoneId = despatchZoneId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DomicileLogisticDetailsType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("carrier");
        sb.append('=');
        sb.append(((this.carrier == null)?"<null>":this.carrier));
        sb.append(',');
        sb.append("shippingLocation");
        sb.append('=');
        sb.append(((this.shippingLocation == null)?"<null>":this.shippingLocation));
        sb.append(',');
        sb.append("despatchZoneId");
        sb.append('=');
        sb.append(((this.despatchZoneId == null)?"<null>":this.despatchZoneId));
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
        result = ((result* 31)+((this.shippingLocation == null)? 0 :this.shippingLocation.hashCode()));
        result = ((result* 31)+((this.carrier == null)? 0 :this.carrier.hashCode()));
        result = ((result* 31)+((this.despatchZoneId == null)? 0 :this.despatchZoneId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomicileLogisticDetailsType) == false) {
            return false;
        }
        DomicileLogisticDetailsType rhs = ((DomicileLogisticDetailsType) other);
        return ((((this.shippingLocation == rhs.shippingLocation)||((this.shippingLocation!= null)&&this.shippingLocation.equals(rhs.shippingLocation)))&&((this.carrier == rhs.carrier)||((this.carrier!= null)&&this.carrier.equals(rhs.carrier))))&&((this.despatchZoneId == rhs.despatchZoneId)||((this.despatchZoneId!= null)&&this.despatchZoneId.equals(rhs.despatchZoneId))));
    }

}
