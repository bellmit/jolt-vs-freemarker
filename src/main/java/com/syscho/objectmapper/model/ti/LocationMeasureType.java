
package com.syscho.objectmapper.model.ti;

import java.time.OffsetDateTime;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LocationMeasureType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "measureType",
    "quantity",
    "effectiveFromDateTime",
    "effectiveUpToDateTime"
})
@Generated("jsonschema2pojo")
public class LocationMeasureType {

    /**
     * Name of the constraint/capacity/measure.
     * (Required)
     * 
     */
    @JsonProperty("measureType")
    @JsonPropertyDescription("Name of the constraint/capacity/measure.")
    private String measureType;
    /**
     * Quantity of this measure.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("Quantity of this measure.")
    private Double quantity;
    /**
     * Defines the time on the day from which, this measure begins.
     * 
     */
    @JsonProperty("effectiveFromDateTime")
    @JsonPropertyDescription("Defines the time on the day from which, this measure begins.")
    private OffsetDateTime effectiveFromDateTime;
    /**
     * Defines the time on a day up to which, this measure is valid.
     * 
     */
    @JsonProperty("effectiveUpToDateTime")
    @JsonPropertyDescription("Defines the time on a day up to which, this measure is valid.")
    private OffsetDateTime effectiveUpToDateTime;

    /**
     * Name of the constraint/capacity/measure.
     * (Required)
     * 
     */
    @JsonProperty("measureType")
    public String getMeasureType() {
        return measureType;
    }

    /**
     * Name of the constraint/capacity/measure.
     * (Required)
     * 
     */
    @JsonProperty("measureType")
    public void setMeasureType(String measureType) {
        this.measureType = measureType;
    }

    public LocationMeasureType withMeasureType(String measureType) {
        this.measureType = measureType;
        return this;
    }

    /**
     * Quantity of this measure.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    public Double getQuantity() {
        return quantity;
    }

    /**
     * Quantity of this measure.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public LocationMeasureType withQuantity(Double quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Defines the time on the day from which, this measure begins.
     * 
     */
    @JsonProperty("effectiveFromDateTime")
    public OffsetDateTime getEffectiveFromDateTime() {
        return effectiveFromDateTime;
    }

    /**
     * Defines the time on the day from which, this measure begins.
     * 
     */
    @JsonProperty("effectiveFromDateTime")
    public void setEffectiveFromDateTime(OffsetDateTime effectiveFromDateTime) {
        this.effectiveFromDateTime = effectiveFromDateTime;
    }

    public LocationMeasureType withEffectiveFromDateTime(OffsetDateTime effectiveFromDateTime) {
        this.effectiveFromDateTime = effectiveFromDateTime;
        return this;
    }

    /**
     * Defines the time on a day up to which, this measure is valid.
     * 
     */
    @JsonProperty("effectiveUpToDateTime")
    public OffsetDateTime getEffectiveUpToDateTime() {
        return effectiveUpToDateTime;
    }

    /**
     * Defines the time on a day up to which, this measure is valid.
     * 
     */
    @JsonProperty("effectiveUpToDateTime")
    public void setEffectiveUpToDateTime(OffsetDateTime effectiveUpToDateTime) {
        this.effectiveUpToDateTime = effectiveUpToDateTime;
    }

    public LocationMeasureType withEffectiveUpToDateTime(OffsetDateTime effectiveUpToDateTime) {
        this.effectiveUpToDateTime = effectiveUpToDateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocationMeasureType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("measureType");
        sb.append('=');
        sb.append(((this.measureType == null)?"<null>":this.measureType));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("effectiveFromDateTime");
        sb.append('=');
        sb.append(((this.effectiveFromDateTime == null)?"<null>":this.effectiveFromDateTime));
        sb.append(',');
        sb.append("effectiveUpToDateTime");
        sb.append('=');
        sb.append(((this.effectiveUpToDateTime == null)?"<null>":this.effectiveUpToDateTime));
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
        result = ((result* 31)+((this.effectiveFromDateTime == null)? 0 :this.effectiveFromDateTime.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.effectiveUpToDateTime == null)? 0 :this.effectiveUpToDateTime.hashCode()));
        result = ((result* 31)+((this.measureType == null)? 0 :this.measureType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocationMeasureType) == false) {
            return false;
        }
        LocationMeasureType rhs = ((LocationMeasureType) other);
        return (((((this.effectiveFromDateTime == rhs.effectiveFromDateTime)||((this.effectiveFromDateTime!= null)&&this.effectiveFromDateTime.equals(rhs.effectiveFromDateTime)))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.effectiveUpToDateTime == rhs.effectiveUpToDateTime)||((this.effectiveUpToDateTime!= null)&&this.effectiveUpToDateTime.equals(rhs.effectiveUpToDateTime))))&&((this.measureType == rhs.measureType)||((this.measureType!= null)&&this.measureType.equals(rhs.measureType))));
    }

}
