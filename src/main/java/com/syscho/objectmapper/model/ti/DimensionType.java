
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DimensionType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "depth",
    "height",
    "width"
})
@Generated("jsonschema2pojo")
public class DimensionType {

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("depth")
    private MeasurementType depth;
    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("height")
    private MeasurementType height;
    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("width")
    private MeasurementType width;

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("depth")
    public MeasurementType getDepth() {
        return depth;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("depth")
    public void setDepth(MeasurementType depth) {
        this.depth = depth;
    }

    public DimensionType withDepth(MeasurementType depth) {
        this.depth = depth;
        return this;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("height")
    public MeasurementType getHeight() {
        return height;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("height")
    public void setHeight(MeasurementType height) {
        this.height = height;
    }

    public DimensionType withHeight(MeasurementType height) {
        this.height = height;
        return this;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("width")
    public MeasurementType getWidth() {
        return width;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("width")
    public void setWidth(MeasurementType width) {
        this.width = width;
    }

    public DimensionType withWidth(MeasurementType width) {
        this.width = width;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DimensionType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("depth");
        sb.append('=');
        sb.append(((this.depth == null)?"<null>":this.depth));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null)?"<null>":this.height));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null)?"<null>":this.width));
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
        result = ((result* 31)+((this.width == null)? 0 :this.width.hashCode()));
        result = ((result* 31)+((this.depth == null)? 0 :this.depth.hashCode()));
        result = ((result* 31)+((this.height == null)? 0 :this.height.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DimensionType) == false) {
            return false;
        }
        DimensionType rhs = ((DimensionType) other);
        return ((((this.width == rhs.width)||((this.width!= null)&&this.width.equals(rhs.width)))&&((this.depth == rhs.depth)||((this.depth!= null)&&this.depth.equals(rhs.depth))))&&((this.height == rhs.height)||((this.height!= null)&&this.height.equals(rhs.height))));
    }

}
