
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * QuantityType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "measurementUnitCode",
    "value"
})
@Generated("jsonschema2pojo")
public class QuantityType {

    /**
     * MeasurementUnitCode
     * <p>
     * 
     * 
     */
    @JsonProperty("measurementUnitCode")
    private MeasurementUnitCode measurementUnitCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private Double value;

    /**
     * MeasurementUnitCode
     * <p>
     * 
     * 
     */
    @JsonProperty("measurementUnitCode")
    public MeasurementUnitCode getMeasurementUnitCode() {
        return measurementUnitCode;
    }

    /**
     * MeasurementUnitCode
     * <p>
     * 
     * 
     */
    @JsonProperty("measurementUnitCode")
    public void setMeasurementUnitCode(MeasurementUnitCode measurementUnitCode) {
        this.measurementUnitCode = measurementUnitCode;
    }

    public QuantityType withMeasurementUnitCode(MeasurementUnitCode measurementUnitCode) {
        this.measurementUnitCode = measurementUnitCode;
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

    public QuantityType withValue(Double value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QuantityType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("measurementUnitCode");
        sb.append('=');
        sb.append(((this.measurementUnitCode == null)?"<null>":this.measurementUnitCode));
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
        result = ((result* 31)+((this.measurementUnitCode == null)? 0 :this.measurementUnitCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QuantityType) == false) {
            return false;
        }
        QuantityType rhs = ((QuantityType) other);
        return (((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value)))&&((this.measurementUnitCode == rhs.measurementUnitCode)||((this.measurementUnitCode!= null)&&this.measurementUnitCode.equals(rhs.measurementUnitCode))));
    }

}
