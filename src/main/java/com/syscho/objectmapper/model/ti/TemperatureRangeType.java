
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TemperatureRangeType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "maximumTemperature",
    "minimumTemperature"
})
@Generated("jsonschema2pojo")
public class TemperatureRangeType {

    /**
     * TemperatureMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumTemperature")
    private TemperatureMeasurementType maximumTemperature;
    /**
     * TemperatureMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("minimumTemperature")
    private TemperatureMeasurementType minimumTemperature;

    /**
     * TemperatureMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumTemperature")
    public TemperatureMeasurementType getMaximumTemperature() {
        return maximumTemperature;
    }

    /**
     * TemperatureMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumTemperature")
    public void setMaximumTemperature(TemperatureMeasurementType maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
    }

    public TemperatureRangeType withMaximumTemperature(TemperatureMeasurementType maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
        return this;
    }

    /**
     * TemperatureMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("minimumTemperature")
    public TemperatureMeasurementType getMinimumTemperature() {
        return minimumTemperature;
    }

    /**
     * TemperatureMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("minimumTemperature")
    public void setMinimumTemperature(TemperatureMeasurementType minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
    }

    public TemperatureRangeType withMinimumTemperature(TemperatureMeasurementType minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TemperatureRangeType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maximumTemperature");
        sb.append('=');
        sb.append(((this.maximumTemperature == null)?"<null>":this.maximumTemperature));
        sb.append(',');
        sb.append("minimumTemperature");
        sb.append('=');
        sb.append(((this.minimumTemperature == null)?"<null>":this.minimumTemperature));
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
        result = ((result* 31)+((this.minimumTemperature == null)? 0 :this.minimumTemperature.hashCode()));
        result = ((result* 31)+((this.maximumTemperature == null)? 0 :this.maximumTemperature.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TemperatureRangeType) == false) {
            return false;
        }
        TemperatureRangeType rhs = ((TemperatureRangeType) other);
        return (((this.minimumTemperature == rhs.minimumTemperature)||((this.minimumTemperature!= null)&&this.minimumTemperature.equals(rhs.minimumTemperature)))&&((this.maximumTemperature == rhs.maximumTemperature)||((this.maximumTemperature!= null)&&this.maximumTemperature.equals(rhs.maximumTemperature))));
    }

}
