
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TimeMeasurementType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timeMeasurementUnitCode",
    "value"
})
@Generated("jsonschema2pojo")
public class TimeMeasurementType {

    /**
     * TimeMeasurementUnitCode
     * <p>
     * 
     * 
     */
    @JsonProperty("timeMeasurementUnitCode")
    private TimeMeasurementUnitCode timeMeasurementUnitCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private Double value;

    /**
     * TimeMeasurementUnitCode
     * <p>
     * 
     * 
     */
    @JsonProperty("timeMeasurementUnitCode")
    public TimeMeasurementUnitCode getTimeMeasurementUnitCode() {
        return timeMeasurementUnitCode;
    }

    /**
     * TimeMeasurementUnitCode
     * <p>
     * 
     * 
     */
    @JsonProperty("timeMeasurementUnitCode")
    public void setTimeMeasurementUnitCode(TimeMeasurementUnitCode timeMeasurementUnitCode) {
        this.timeMeasurementUnitCode = timeMeasurementUnitCode;
    }

    public TimeMeasurementType withTimeMeasurementUnitCode(TimeMeasurementUnitCode timeMeasurementUnitCode) {
        this.timeMeasurementUnitCode = timeMeasurementUnitCode;
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

    public TimeMeasurementType withValue(Double value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TimeMeasurementType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timeMeasurementUnitCode");
        sb.append('=');
        sb.append(((this.timeMeasurementUnitCode == null)?"<null>":this.timeMeasurementUnitCode));
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
        result = ((result* 31)+((this.timeMeasurementUnitCode == null)? 0 :this.timeMeasurementUnitCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TimeMeasurementType) == false) {
            return false;
        }
        TimeMeasurementType rhs = ((TimeMeasurementType) other);
        return (((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value)))&&((this.timeMeasurementUnitCode == rhs.timeMeasurementUnitCode)||((this.timeMeasurementUnitCode!= null)&&this.timeMeasurementUnitCode.equals(rhs.timeMeasurementUnitCode))));
    }

}
