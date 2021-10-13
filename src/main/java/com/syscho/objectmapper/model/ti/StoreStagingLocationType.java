
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * StoreStagingLocationType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "destinationMovementZoneId",
    "sortSequence",
    "destinationLocation",
    "sourceBuildingId"
})
@Generated("jsonschema2pojo")
public class StoreStagingLocationType {

    /**
     * The set of characters that uniquely refers to a specific floor space in the distribution center at which goods for this store are to be collected.
     * 
     */
    @JsonProperty("destinationMovementZoneId")
    @JsonPropertyDescription("The set of characters that uniquely refers to a specific floor space in the distribution center at which goods for this store are to be collected.")
    private String destinationMovementZoneId;
    /**
     * A number corresponding to this store's position in a floor area.
     * 
     */
    @JsonProperty("sortSequence")
    @JsonPropertyDescription("A number corresponding to this store's position in a floor area.")
    private Integer sortSequence;
    /**
     * The specific area in the distribution center in which goods for this store will be collected prior to shipping.
     * 
     */
    @JsonProperty("destinationLocation")
    @JsonPropertyDescription("The specific area in the distribution center in which goods for this store will be collected prior to shipping.")
    private String destinationLocation;
    /**
     * The set of characters that uniquely refers to the building at which the goods to be collected for this store originated.
     * 
     */
    @JsonProperty("sourceBuildingId")
    @JsonPropertyDescription("The set of characters that uniquely refers to the building at which the goods to be collected for this store originated.")
    private String sourceBuildingId;

    /**
     * The set of characters that uniquely refers to a specific floor space in the distribution center at which goods for this store are to be collected.
     * 
     */
    @JsonProperty("destinationMovementZoneId")
    public String getDestinationMovementZoneId() {
        return destinationMovementZoneId;
    }

    /**
     * The set of characters that uniquely refers to a specific floor space in the distribution center at which goods for this store are to be collected.
     * 
     */
    @JsonProperty("destinationMovementZoneId")
    public void setDestinationMovementZoneId(String destinationMovementZoneId) {
        this.destinationMovementZoneId = destinationMovementZoneId;
    }

    public StoreStagingLocationType withDestinationMovementZoneId(String destinationMovementZoneId) {
        this.destinationMovementZoneId = destinationMovementZoneId;
        return this;
    }

    /**
     * A number corresponding to this store's position in a floor area.
     * 
     */
    @JsonProperty("sortSequence")
    public Integer getSortSequence() {
        return sortSequence;
    }

    /**
     * A number corresponding to this store's position in a floor area.
     * 
     */
    @JsonProperty("sortSequence")
    public void setSortSequence(Integer sortSequence) {
        this.sortSequence = sortSequence;
    }

    public StoreStagingLocationType withSortSequence(Integer sortSequence) {
        this.sortSequence = sortSequence;
        return this;
    }

    /**
     * The specific area in the distribution center in which goods for this store will be collected prior to shipping.
     * 
     */
    @JsonProperty("destinationLocation")
    public String getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * The specific area in the distribution center in which goods for this store will be collected prior to shipping.
     * 
     */
    @JsonProperty("destinationLocation")
    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public StoreStagingLocationType withDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
        return this;
    }

    /**
     * The set of characters that uniquely refers to the building at which the goods to be collected for this store originated.
     * 
     */
    @JsonProperty("sourceBuildingId")
    public String getSourceBuildingId() {
        return sourceBuildingId;
    }

    /**
     * The set of characters that uniquely refers to the building at which the goods to be collected for this store originated.
     * 
     */
    @JsonProperty("sourceBuildingId")
    public void setSourceBuildingId(String sourceBuildingId) {
        this.sourceBuildingId = sourceBuildingId;
    }

    public StoreStagingLocationType withSourceBuildingId(String sourceBuildingId) {
        this.sourceBuildingId = sourceBuildingId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StoreStagingLocationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("destinationMovementZoneId");
        sb.append('=');
        sb.append(((this.destinationMovementZoneId == null)?"<null>":this.destinationMovementZoneId));
        sb.append(',');
        sb.append("sortSequence");
        sb.append('=');
        sb.append(((this.sortSequence == null)?"<null>":this.sortSequence));
        sb.append(',');
        sb.append("destinationLocation");
        sb.append('=');
        sb.append(((this.destinationLocation == null)?"<null>":this.destinationLocation));
        sb.append(',');
        sb.append("sourceBuildingId");
        sb.append('=');
        sb.append(((this.sourceBuildingId == null)?"<null>":this.sourceBuildingId));
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
        result = ((result* 31)+((this.destinationLocation == null)? 0 :this.destinationLocation.hashCode()));
        result = ((result* 31)+((this.destinationMovementZoneId == null)? 0 :this.destinationMovementZoneId.hashCode()));
        result = ((result* 31)+((this.sourceBuildingId == null)? 0 :this.sourceBuildingId.hashCode()));
        result = ((result* 31)+((this.sortSequence == null)? 0 :this.sortSequence.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StoreStagingLocationType) == false) {
            return false;
        }
        StoreStagingLocationType rhs = ((StoreStagingLocationType) other);
        return (((((this.destinationLocation == rhs.destinationLocation)||((this.destinationLocation!= null)&&this.destinationLocation.equals(rhs.destinationLocation)))&&((this.destinationMovementZoneId == rhs.destinationMovementZoneId)||((this.destinationMovementZoneId!= null)&&this.destinationMovementZoneId.equals(rhs.destinationMovementZoneId))))&&((this.sourceBuildingId == rhs.sourceBuildingId)||((this.sourceBuildingId!= null)&&this.sourceBuildingId.equals(rhs.sourceBuildingId))))&&((this.sortSequence == rhs.sortSequence)||((this.sortSequence!= null)&&this.sortSequence.equals(rhs.sortSequence))));
    }

}
