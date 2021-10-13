
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LocationMeasuresType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "storageUnitOfMeasure",
    "measure"
})
@Generated("jsonschema2pojo")
public class LocationMeasuresType {

    /**
     * MeasurementUnitCode
     * <p>
     * 
     * 
     */
    @JsonProperty("storageUnitOfMeasure")
    private MeasurementUnitCode storageUnitOfMeasure;
    /**
     * Time-phased capacities/constraints/measures associated with this location.
     * 
     */
    @JsonProperty("measure")
    @JsonPropertyDescription("Time-phased capacities/constraints/measures associated with this location.")
    private List<LocationMeasureType> measure = new ArrayList<LocationMeasureType>();

    /**
     * MeasurementUnitCode
     * <p>
     * 
     * 
     */
    @JsonProperty("storageUnitOfMeasure")
    public MeasurementUnitCode getStorageUnitOfMeasure() {
        return storageUnitOfMeasure;
    }

    /**
     * MeasurementUnitCode
     * <p>
     * 
     * 
     */
    @JsonProperty("storageUnitOfMeasure")
    public void setStorageUnitOfMeasure(MeasurementUnitCode storageUnitOfMeasure) {
        this.storageUnitOfMeasure = storageUnitOfMeasure;
    }

    public LocationMeasuresType withStorageUnitOfMeasure(MeasurementUnitCode storageUnitOfMeasure) {
        this.storageUnitOfMeasure = storageUnitOfMeasure;
        return this;
    }

    /**
     * Time-phased capacities/constraints/measures associated with this location.
     * 
     */
    @JsonProperty("measure")
    public List<LocationMeasureType> getMeasure() {
        return measure;
    }

    /**
     * Time-phased capacities/constraints/measures associated with this location.
     * 
     */
    @JsonProperty("measure")
    public void setMeasure(List<LocationMeasureType> measure) {
        this.measure = measure;
    }

    public LocationMeasuresType withMeasure(List<LocationMeasureType> measure) {
        this.measure = measure;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocationMeasuresType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("storageUnitOfMeasure");
        sb.append('=');
        sb.append(((this.storageUnitOfMeasure == null)?"<null>":this.storageUnitOfMeasure));
        sb.append(',');
        sb.append("measure");
        sb.append('=');
        sb.append(((this.measure == null)?"<null>":this.measure));
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
        result = ((result* 31)+((this.storageUnitOfMeasure == null)? 0 :this.storageUnitOfMeasure.hashCode()));
        result = ((result* 31)+((this.measure == null)? 0 :this.measure.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocationMeasuresType) == false) {
            return false;
        }
        LocationMeasuresType rhs = ((LocationMeasuresType) other);
        return (((this.storageUnitOfMeasure == rhs.storageUnitOfMeasure)||((this.storageUnitOfMeasure!= null)&&this.storageUnitOfMeasure.equals(rhs.storageUnitOfMeasure)))&&((this.measure == rhs.measure)||((this.measure!= null)&&this.measure.equals(rhs.measure))));
    }

}
