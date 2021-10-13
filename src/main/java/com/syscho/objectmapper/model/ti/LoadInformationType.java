
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LoadInformationType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transportLoadId",
    "loadSequenceNumber"
})
@Generated("jsonschema2pojo")
public class LoadInformationType {

    /**
     * The unique set of characters identifying a load.
     * (Required)
     * 
     */
    @JsonProperty("transportLoadId")
    @JsonPropertyDescription("The unique set of characters identifying a load.")
    private String transportLoadId;
    /**
     * The order value in which the load appears during the trip.
     * (Required)
     * 
     */
    @JsonProperty("loadSequenceNumber")
    @JsonPropertyDescription("The order value in which the load appears during the trip.")
    private Integer loadSequenceNumber;

    /**
     * The unique set of characters identifying a load.
     * (Required)
     * 
     */
    @JsonProperty("transportLoadId")
    public String getTransportLoadId() {
        return transportLoadId;
    }

    /**
     * The unique set of characters identifying a load.
     * (Required)
     * 
     */
    @JsonProperty("transportLoadId")
    public void setTransportLoadId(String transportLoadId) {
        this.transportLoadId = transportLoadId;
    }

    public LoadInformationType withTransportLoadId(String transportLoadId) {
        this.transportLoadId = transportLoadId;
        return this;
    }

    /**
     * The order value in which the load appears during the trip.
     * (Required)
     * 
     */
    @JsonProperty("loadSequenceNumber")
    public Integer getLoadSequenceNumber() {
        return loadSequenceNumber;
    }

    /**
     * The order value in which the load appears during the trip.
     * (Required)
     * 
     */
    @JsonProperty("loadSequenceNumber")
    public void setLoadSequenceNumber(Integer loadSequenceNumber) {
        this.loadSequenceNumber = loadSequenceNumber;
    }

    public LoadInformationType withLoadSequenceNumber(Integer loadSequenceNumber) {
        this.loadSequenceNumber = loadSequenceNumber;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LoadInformationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("transportLoadId");
        sb.append('=');
        sb.append(((this.transportLoadId == null)?"<null>":this.transportLoadId));
        sb.append(',');
        sb.append("loadSequenceNumber");
        sb.append('=');
        sb.append(((this.loadSequenceNumber == null)?"<null>":this.loadSequenceNumber));
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
        result = ((result* 31)+((this.transportLoadId == null)? 0 :this.transportLoadId.hashCode()));
        result = ((result* 31)+((this.loadSequenceNumber == null)? 0 :this.loadSequenceNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadInformationType) == false) {
            return false;
        }
        LoadInformationType rhs = ((LoadInformationType) other);
        return (((this.transportLoadId == rhs.transportLoadId)||((this.transportLoadId!= null)&&this.transportLoadId.equals(rhs.transportLoadId)))&&((this.loadSequenceNumber == rhs.loadSequenceNumber)||((this.loadSequenceNumber!= null)&&this.loadSequenceNumber.equals(rhs.loadSequenceNumber))));
    }

}
