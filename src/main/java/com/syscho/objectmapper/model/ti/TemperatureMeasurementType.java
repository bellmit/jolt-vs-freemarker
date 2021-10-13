
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TemperatureMeasurementType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "temperatureMeasurementUnitCode",
    "value"
})
@Generated("jsonschema2pojo")
public class TemperatureMeasurementType {

    /**
     * TemperatureMeasurementUnitCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("temperatureMeasurementUnitCode")
    private TemperatureMeasurementUnitCode temperatureMeasurementUnitCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private Double value;

    /**
     * TemperatureMeasurementUnitCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("temperatureMeasurementUnitCode")
    public TemperatureMeasurementUnitCode getTemperatureMeasurementUnitCode() {
        return temperatureMeasurementUnitCode;
    }

    /**
     * TemperatureMeasurementUnitCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("temperatureMeasurementUnitCode")
    public void setTemperatureMeasurementUnitCode(TemperatureMeasurementUnitCode temperatureMeasurementUnitCode) {
        this.temperatureMeasurementUnitCode = temperatureMeasurementUnitCode;
    }

    public TemperatureMeasurementType withTemperatureMeasurementUnitCode(TemperatureMeasurementUnitCode temperatureMeasurementUnitCode) {
        this.temperatureMeasurementUnitCode = temperatureMeasurementUnitCode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    public TemperatureMeasurementType withValue(Double value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TemperatureMeasurementType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("temperatureMeasurementUnitCode");
        sb.append('=');
        sb.append(((this.temperatureMeasurementUnitCode == null)?"<null>":this.temperatureMeasurementUnitCode));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.temperatureMeasurementUnitCode == null)? 0 :this.temperatureMeasurementUnitCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TemperatureMeasurementType) == false) {
            return false;
        }
        TemperatureMeasurementType rhs = ((TemperatureMeasurementType) other);
        return (((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value)))&&((this.temperatureMeasurementUnitCode == rhs.temperatureMeasurementUnitCode)||((this.temperatureMeasurementUnitCode!= null)&&this.temperatureMeasurementUnitCode.equals(rhs.temperatureMeasurementUnitCode))));
    }

}
