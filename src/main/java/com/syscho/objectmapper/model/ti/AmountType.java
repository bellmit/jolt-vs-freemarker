
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AmountType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currencyCode",
    "value"
})
@Generated("jsonschema2pojo")
public class AmountType {

    /**
     * CurrencyCode
     * <p>
     * 
     * 
     */
    @JsonProperty("currencyCode")
    private CurrencyCode currencyCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private Double value;

    /**
     * CurrencyCode
     * <p>
     * 
     * 
     */
    @JsonProperty("currencyCode")
    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    /**
     * CurrencyCode
     * <p>
     * 
     * 
     */
    @JsonProperty("currencyCode")
    public void setCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }

    public AmountType withCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
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

    public AmountType withValue(Double value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AmountType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("currencyCode");
        sb.append('=');
        sb.append(((this.currencyCode == null)?"<null>":this.currencyCode));
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
        result = ((result* 31)+((this.currencyCode == null)? 0 :this.currencyCode.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AmountType) == false) {
            return false;
        }
        AmountType rhs = ((AmountType) other);
        return (((this.currencyCode == rhs.currencyCode)||((this.currencyCode!= null)&&this.currencyCode.equals(rhs.currencyCode)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
