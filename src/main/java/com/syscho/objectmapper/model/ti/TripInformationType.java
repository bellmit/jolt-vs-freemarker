
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TripInformationType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "numberOfLoads",
    "loadInformation"
})
@Generated("jsonschema2pojo")
public class TripInformationType {

    /**
     * The total number of loads participating in this trip.
     * 
     */
    @JsonProperty("numberOfLoads")
    @JsonPropertyDescription("The total number of loads participating in this trip.")
    private Integer numberOfLoads;
    /**
     * Information pertaining to the constituent loads on this trip.
     * (Required)
     * 
     */
    @JsonProperty("loadInformation")
    @JsonPropertyDescription("Information pertaining to the constituent loads on this trip.")
    private List<LoadInformationType> loadInformation = new ArrayList<LoadInformationType>();

    /**
     * The total number of loads participating in this trip.
     * 
     */
    @JsonProperty("numberOfLoads")
    public Integer getNumberOfLoads() {
        return numberOfLoads;
    }

    /**
     * The total number of loads participating in this trip.
     * 
     */
    @JsonProperty("numberOfLoads")
    public void setNumberOfLoads(Integer numberOfLoads) {
        this.numberOfLoads = numberOfLoads;
    }

    public TripInformationType withNumberOfLoads(Integer numberOfLoads) {
        this.numberOfLoads = numberOfLoads;
        return this;
    }

    /**
     * Information pertaining to the constituent loads on this trip.
     * (Required)
     * 
     */
    @JsonProperty("loadInformation")
    public List<LoadInformationType> getLoadInformation() {
        return loadInformation;
    }

    /**
     * Information pertaining to the constituent loads on this trip.
     * (Required)
     * 
     */
    @JsonProperty("loadInformation")
    public void setLoadInformation(List<LoadInformationType> loadInformation) {
        this.loadInformation = loadInformation;
    }

    public TripInformationType withLoadInformation(List<LoadInformationType> loadInformation) {
        this.loadInformation = loadInformation;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TripInformationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numberOfLoads");
        sb.append('=');
        sb.append(((this.numberOfLoads == null)?"<null>":this.numberOfLoads));
        sb.append(',');
        sb.append("loadInformation");
        sb.append('=');
        sb.append(((this.loadInformation == null)?"<null>":this.loadInformation));
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
        result = ((result* 31)+((this.numberOfLoads == null)? 0 :this.numberOfLoads.hashCode()));
        result = ((result* 31)+((this.loadInformation == null)? 0 :this.loadInformation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TripInformationType) == false) {
            return false;
        }
        TripInformationType rhs = ((TripInformationType) other);
        return (((this.numberOfLoads == rhs.numberOfLoads)||((this.numberOfLoads!= null)&&this.numberOfLoads.equals(rhs.numberOfLoads)))&&((this.loadInformation == rhs.loadInformation)||((this.loadInformation!= null)&&this.loadInformation.equals(rhs.loadInformation))));
    }

}
