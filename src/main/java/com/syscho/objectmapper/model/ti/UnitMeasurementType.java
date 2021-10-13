
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UnitMeasurementType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "measurementType",
    "measurementValue"
})
@Generated("jsonschema2pojo")
public class UnitMeasurementType {

    /**
     * MeasurementTypeCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("measurementType")
    private MeasurementTypeCode measurementType;
    /**
     * MeasurementType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("measurementValue")
    private MeasurementType measurementValue;

    /**
     * MeasurementTypeCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("measurementType")
    public MeasurementTypeCode getMeasurementType() {
        return measurementType;
    }

    /**
     * MeasurementTypeCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("measurementType")
    public void setMeasurementType(MeasurementTypeCode measurementType) {
        this.measurementType = measurementType;
    }

    public UnitMeasurementType withMeasurementType(MeasurementTypeCode measurementType) {
        this.measurementType = measurementType;
        return this;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("measurementValue")
    public MeasurementType getMeasurementValue() {
        return measurementValue;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("measurementValue")
    public void setMeasurementValue(MeasurementType measurementValue) {
        this.measurementValue = measurementValue;
    }

    public UnitMeasurementType withMeasurementValue(MeasurementType measurementValue) {
        this.measurementValue = measurementValue;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UnitMeasurementType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("measurementType");
        sb.append('=');
        sb.append(((this.measurementType == null)?"<null>":this.measurementType));
        sb.append(',');
        sb.append("measurementValue");
        sb.append('=');
        sb.append(((this.measurementValue == null)?"<null>":this.measurementValue));
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
        result = ((result* 31)+((this.measurementType == null)? 0 :this.measurementType.hashCode()));
        result = ((result* 31)+((this.measurementValue == null)? 0 :this.measurementValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UnitMeasurementType) == false) {
            return false;
        }
        UnitMeasurementType rhs = ((UnitMeasurementType) other);
        return (((this.measurementType == rhs.measurementType)||((this.measurementType!= null)&&this.measurementType.equals(rhs.measurementType)))&&((this.measurementValue == rhs.measurementValue)||((this.measurementValue!= null)&&this.measurementValue.equals(rhs.measurementValue))));
    }

}
