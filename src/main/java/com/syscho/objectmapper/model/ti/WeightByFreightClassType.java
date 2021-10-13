
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * WeightByFreightClassType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "weight",
    "freightClassCode"
})
@Generated("jsonschema2pojo")
public class WeightByFreightClassType {

    /**
     * The shipment weight for the given freight class.
     * (Required)
     * 
     */
    @JsonProperty("weight")
    @JsonPropertyDescription("The shipment weight for the given freight class.")
    private Double weight;
    /**
     * The freight class code.
     * (Required)
     * 
     */
    @JsonProperty("freightClassCode")
    @JsonPropertyDescription("The freight class code.")
    private String freightClassCode;

    /**
     * The shipment weight for the given freight class.
     * (Required)
     * 
     */
    @JsonProperty("weight")
    public Double getWeight() {
        return weight;
    }

    /**
     * The shipment weight for the given freight class.
     * (Required)
     * 
     */
    @JsonProperty("weight")
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public WeightByFreightClassType withWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    /**
     * The freight class code.
     * (Required)
     * 
     */
    @JsonProperty("freightClassCode")
    public String getFreightClassCode() {
        return freightClassCode;
    }

    /**
     * The freight class code.
     * (Required)
     * 
     */
    @JsonProperty("freightClassCode")
    public void setFreightClassCode(String freightClassCode) {
        this.freightClassCode = freightClassCode;
    }

    public WeightByFreightClassType withFreightClassCode(String freightClassCode) {
        this.freightClassCode = freightClassCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WeightByFreightClassType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("weight");
        sb.append('=');
        sb.append(((this.weight == null)?"<null>":this.weight));
        sb.append(',');
        sb.append("freightClassCode");
        sb.append('=');
        sb.append(((this.freightClassCode == null)?"<null>":this.freightClassCode));
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
        result = ((result* 31)+((this.weight == null)? 0 :this.weight.hashCode()));
        result = ((result* 31)+((this.freightClassCode == null)? 0 :this.freightClassCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WeightByFreightClassType) == false) {
            return false;
        }
        WeightByFreightClassType rhs = ((WeightByFreightClassType) other);
        return (((this.weight == rhs.weight)||((this.weight!= null)&&this.weight.equals(rhs.weight)))&&((this.freightClassCode == rhs.freightClassCode)||((this.freightClassCode!= null)&&this.freightClassCode.equals(rhs.freightClassCode))));
    }

}
