
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TransportMeansType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transportMeansType",
    "transportMeansID"
})
@Generated("jsonschema2pojo")
public class TransportMeansType {

    /**
     * TransportMeansTypeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("transportMeansType")
    private TransportMeansTypeCode transportMeansType;
    /**
     * The unique identifier of a particular means of transport. E.g. A license plate number or vessel id.
     * 
     */
    @JsonProperty("transportMeansID")
    @JsonPropertyDescription("The unique identifier of a particular means of transport. E.g. A license plate number or vessel id.")
    private String transportMeansID;

    /**
     * TransportMeansTypeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("transportMeansType")
    public TransportMeansTypeCode getTransportMeansType() {
        return transportMeansType;
    }

    /**
     * TransportMeansTypeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("transportMeansType")
    public void setTransportMeansType(TransportMeansTypeCode transportMeansType) {
        this.transportMeansType = transportMeansType;
    }

    public TransportMeansType withTransportMeansType(TransportMeansTypeCode transportMeansType) {
        this.transportMeansType = transportMeansType;
        return this;
    }

    /**
     * The unique identifier of a particular means of transport. E.g. A license plate number or vessel id.
     * 
     */
    @JsonProperty("transportMeansID")
    public String getTransportMeansID() {
        return transportMeansID;
    }

    /**
     * The unique identifier of a particular means of transport. E.g. A license plate number or vessel id.
     * 
     */
    @JsonProperty("transportMeansID")
    public void setTransportMeansID(String transportMeansID) {
        this.transportMeansID = transportMeansID;
    }

    public TransportMeansType withTransportMeansID(String transportMeansID) {
        this.transportMeansID = transportMeansID;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportMeansType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("transportMeansType");
        sb.append('=');
        sb.append(((this.transportMeansType == null)?"<null>":this.transportMeansType));
        sb.append(',');
        sb.append("transportMeansID");
        sb.append('=');
        sb.append(((this.transportMeansID == null)?"<null>":this.transportMeansID));
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
        result = ((result* 31)+((this.transportMeansID == null)? 0 :this.transportMeansID.hashCode()));
        result = ((result* 31)+((this.transportMeansType == null)? 0 :this.transportMeansType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportMeansType) == false) {
            return false;
        }
        TransportMeansType rhs = ((TransportMeansType) other);
        return (((this.transportMeansID == rhs.transportMeansID)||((this.transportMeansID!= null)&&this.transportMeansID.equals(rhs.transportMeansID)))&&((this.transportMeansType == rhs.transportMeansType)||((this.transportMeansType!= null)&&this.transportMeansType.equals(rhs.transportMeansType))));
    }

}
