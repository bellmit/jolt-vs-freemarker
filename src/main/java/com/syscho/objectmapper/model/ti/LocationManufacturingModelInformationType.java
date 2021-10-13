
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LocationManufacturingModelInformationType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "modelId",
    "freezeWindowDuration"
})
@Generated("jsonschema2pojo")
public class LocationManufacturingModelInformationType {

    /**
     * The name of the model.
     * (Required)
     * 
     */
    @JsonProperty("modelId")
    @JsonPropertyDescription("The name of the model.")
    private String modelId;
    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("freezeWindowDuration")
    private TimeMeasurementType freezeWindowDuration;

    /**
     * The name of the model.
     * (Required)
     * 
     */
    @JsonProperty("modelId")
    public String getModelId() {
        return modelId;
    }

    /**
     * The name of the model.
     * (Required)
     * 
     */
    @JsonProperty("modelId")
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public LocationManufacturingModelInformationType withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("freezeWindowDuration")
    public TimeMeasurementType getFreezeWindowDuration() {
        return freezeWindowDuration;
    }

    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("freezeWindowDuration")
    public void setFreezeWindowDuration(TimeMeasurementType freezeWindowDuration) {
        this.freezeWindowDuration = freezeWindowDuration;
    }

    public LocationManufacturingModelInformationType withFreezeWindowDuration(TimeMeasurementType freezeWindowDuration) {
        this.freezeWindowDuration = freezeWindowDuration;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocationManufacturingModelInformationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("modelId");
        sb.append('=');
        sb.append(((this.modelId == null)?"<null>":this.modelId));
        sb.append(',');
        sb.append("freezeWindowDuration");
        sb.append('=');
        sb.append(((this.freezeWindowDuration == null)?"<null>":this.freezeWindowDuration));
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
        result = ((result* 31)+((this.modelId == null)? 0 :this.modelId.hashCode()));
        result = ((result* 31)+((this.freezeWindowDuration == null)? 0 :this.freezeWindowDuration.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocationManufacturingModelInformationType) == false) {
            return false;
        }
        LocationManufacturingModelInformationType rhs = ((LocationManufacturingModelInformationType) other);
        return (((this.modelId == rhs.modelId)||((this.modelId!= null)&&this.modelId.equals(rhs.modelId)))&&((this.freezeWindowDuration == rhs.freezeWindowDuration)||((this.freezeWindowDuration!= null)&&this.freezeWindowDuration.equals(rhs.freezeWindowDuration))));
    }

}
