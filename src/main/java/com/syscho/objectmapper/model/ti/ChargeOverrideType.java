
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ChargeOverrideType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "chargeCode",
    "apChargeOptionLevel",
    "manualOverrideQuantity",
    "arChargeOptionLevel"
})
@Generated("jsonschema2pojo")
public class ChargeOverrideType {

    /**
     * The ID code of the option or condition to override.
     * (Required)
     * 
     */
    @JsonProperty("chargeCode")
    @JsonPropertyDescription("The ID code of the option or condition to override.")
    private String chargeCode;
    /**
     * APChargeOptionLevelEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("apChargeOptionLevel")
    private APChargeOptionLevelEnumerationType apChargeOptionLevel;
    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("manualOverrideQuantity")
    private QuantityType manualOverrideQuantity;
    /**
     * ARChargeOptionLevelEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("arChargeOptionLevel")
    private ARChargeOptionLevelEnumerationType arChargeOptionLevel;

    /**
     * The ID code of the option or condition to override.
     * (Required)
     * 
     */
    @JsonProperty("chargeCode")
    public String getChargeCode() {
        return chargeCode;
    }

    /**
     * The ID code of the option or condition to override.
     * (Required)
     * 
     */
    @JsonProperty("chargeCode")
    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    public ChargeOverrideType withChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
        return this;
    }

    /**
     * APChargeOptionLevelEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("apChargeOptionLevel")
    public APChargeOptionLevelEnumerationType getApChargeOptionLevel() {
        return apChargeOptionLevel;
    }

    /**
     * APChargeOptionLevelEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("apChargeOptionLevel")
    public void setApChargeOptionLevel(APChargeOptionLevelEnumerationType apChargeOptionLevel) {
        this.apChargeOptionLevel = apChargeOptionLevel;
    }

    public ChargeOverrideType withApChargeOptionLevel(APChargeOptionLevelEnumerationType apChargeOptionLevel) {
        this.apChargeOptionLevel = apChargeOptionLevel;
        return this;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("manualOverrideQuantity")
    public QuantityType getManualOverrideQuantity() {
        return manualOverrideQuantity;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("manualOverrideQuantity")
    public void setManualOverrideQuantity(QuantityType manualOverrideQuantity) {
        this.manualOverrideQuantity = manualOverrideQuantity;
    }

    public ChargeOverrideType withManualOverrideQuantity(QuantityType manualOverrideQuantity) {
        this.manualOverrideQuantity = manualOverrideQuantity;
        return this;
    }

    /**
     * ARChargeOptionLevelEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("arChargeOptionLevel")
    public ARChargeOptionLevelEnumerationType getArChargeOptionLevel() {
        return arChargeOptionLevel;
    }

    /**
     * ARChargeOptionLevelEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("arChargeOptionLevel")
    public void setArChargeOptionLevel(ARChargeOptionLevelEnumerationType arChargeOptionLevel) {
        this.arChargeOptionLevel = arChargeOptionLevel;
    }

    public ChargeOverrideType withArChargeOptionLevel(ARChargeOptionLevelEnumerationType arChargeOptionLevel) {
        this.arChargeOptionLevel = arChargeOptionLevel;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChargeOverrideType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("chargeCode");
        sb.append('=');
        sb.append(((this.chargeCode == null)?"<null>":this.chargeCode));
        sb.append(',');
        sb.append("apChargeOptionLevel");
        sb.append('=');
        sb.append(((this.apChargeOptionLevel == null)?"<null>":this.apChargeOptionLevel));
        sb.append(',');
        sb.append("manualOverrideQuantity");
        sb.append('=');
        sb.append(((this.manualOverrideQuantity == null)?"<null>":this.manualOverrideQuantity));
        sb.append(',');
        sb.append("arChargeOptionLevel");
        sb.append('=');
        sb.append(((this.arChargeOptionLevel == null)?"<null>":this.arChargeOptionLevel));
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
        result = ((result* 31)+((this.arChargeOptionLevel == null)? 0 :this.arChargeOptionLevel.hashCode()));
        result = ((result* 31)+((this.apChargeOptionLevel == null)? 0 :this.apChargeOptionLevel.hashCode()));
        result = ((result* 31)+((this.chargeCode == null)? 0 :this.chargeCode.hashCode()));
        result = ((result* 31)+((this.manualOverrideQuantity == null)? 0 :this.manualOverrideQuantity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChargeOverrideType) == false) {
            return false;
        }
        ChargeOverrideType rhs = ((ChargeOverrideType) other);
        return (((((this.arChargeOptionLevel == rhs.arChargeOptionLevel)||((this.arChargeOptionLevel!= null)&&this.arChargeOptionLevel.equals(rhs.arChargeOptionLevel)))&&((this.apChargeOptionLevel == rhs.apChargeOptionLevel)||((this.apChargeOptionLevel!= null)&&this.apChargeOptionLevel.equals(rhs.apChargeOptionLevel))))&&((this.chargeCode == rhs.chargeCode)||((this.chargeCode!= null)&&this.chargeCode.equals(rhs.chargeCode))))&&((this.manualOverrideQuantity == rhs.manualOverrideQuantity)||((this.manualOverrideQuantity!= null)&&this.manualOverrideQuantity.equals(rhs.manualOverrideQuantity))));
    }

}
