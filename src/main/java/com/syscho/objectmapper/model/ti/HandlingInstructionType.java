
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * HandlingInstructionType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "handlingInstructionCode",
    "handlingInstructionText",
    "storageTemperature",
    "transportTemperature"
})
@Generated("jsonschema2pojo")
public class HandlingInstructionType {

    /**
     * HandlingInstructionCode
     * <p>
     * 
     * 
     */
    @JsonProperty("handlingInstructionCode")
    private HandlingInstructionCode handlingInstructionCode;
    /**
     * Description500Type
     * <p>
     * 
     * 
     */
    @JsonProperty("handlingInstructionText")
    private Description500Type handlingInstructionText;
    /**
     * TemperatureRangeType
     * <p>
     * 
     * 
     */
    @JsonProperty("storageTemperature")
    private TemperatureRangeType storageTemperature;
    /**
     * TemperatureRangeType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportTemperature")
    private TemperatureRangeType transportTemperature;

    /**
     * HandlingInstructionCode
     * <p>
     * 
     * 
     */
    @JsonProperty("handlingInstructionCode")
    public HandlingInstructionCode getHandlingInstructionCode() {
        return handlingInstructionCode;
    }

    /**
     * HandlingInstructionCode
     * <p>
     * 
     * 
     */
    @JsonProperty("handlingInstructionCode")
    public void setHandlingInstructionCode(HandlingInstructionCode handlingInstructionCode) {
        this.handlingInstructionCode = handlingInstructionCode;
    }

    public HandlingInstructionType withHandlingInstructionCode(HandlingInstructionCode handlingInstructionCode) {
        this.handlingInstructionCode = handlingInstructionCode;
        return this;
    }

    /**
     * Description500Type
     * <p>
     * 
     * 
     */
    @JsonProperty("handlingInstructionText")
    public Description500Type getHandlingInstructionText() {
        return handlingInstructionText;
    }

    /**
     * Description500Type
     * <p>
     * 
     * 
     */
    @JsonProperty("handlingInstructionText")
    public void setHandlingInstructionText(Description500Type handlingInstructionText) {
        this.handlingInstructionText = handlingInstructionText;
    }

    public HandlingInstructionType withHandlingInstructionText(Description500Type handlingInstructionText) {
        this.handlingInstructionText = handlingInstructionText;
        return this;
    }

    /**
     * TemperatureRangeType
     * <p>
     * 
     * 
     */
    @JsonProperty("storageTemperature")
    public TemperatureRangeType getStorageTemperature() {
        return storageTemperature;
    }

    /**
     * TemperatureRangeType
     * <p>
     * 
     * 
     */
    @JsonProperty("storageTemperature")
    public void setStorageTemperature(TemperatureRangeType storageTemperature) {
        this.storageTemperature = storageTemperature;
    }

    public HandlingInstructionType withStorageTemperature(TemperatureRangeType storageTemperature) {
        this.storageTemperature = storageTemperature;
        return this;
    }

    /**
     * TemperatureRangeType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportTemperature")
    public TemperatureRangeType getTransportTemperature() {
        return transportTemperature;
    }

    /**
     * TemperatureRangeType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportTemperature")
    public void setTransportTemperature(TemperatureRangeType transportTemperature) {
        this.transportTemperature = transportTemperature;
    }

    public HandlingInstructionType withTransportTemperature(TemperatureRangeType transportTemperature) {
        this.transportTemperature = transportTemperature;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HandlingInstructionType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("handlingInstructionCode");
        sb.append('=');
        sb.append(((this.handlingInstructionCode == null)?"<null>":this.handlingInstructionCode));
        sb.append(',');
        sb.append("handlingInstructionText");
        sb.append('=');
        sb.append(((this.handlingInstructionText == null)?"<null>":this.handlingInstructionText));
        sb.append(',');
        sb.append("storageTemperature");
        sb.append('=');
        sb.append(((this.storageTemperature == null)?"<null>":this.storageTemperature));
        sb.append(',');
        sb.append("transportTemperature");
        sb.append('=');
        sb.append(((this.transportTemperature == null)?"<null>":this.transportTemperature));
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
        result = ((result* 31)+((this.handlingInstructionCode == null)? 0 :this.handlingInstructionCode.hashCode()));
        result = ((result* 31)+((this.handlingInstructionText == null)? 0 :this.handlingInstructionText.hashCode()));
        result = ((result* 31)+((this.storageTemperature == null)? 0 :this.storageTemperature.hashCode()));
        result = ((result* 31)+((this.transportTemperature == null)? 0 :this.transportTemperature.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HandlingInstructionType) == false) {
            return false;
        }
        HandlingInstructionType rhs = ((HandlingInstructionType) other);
        return (((((this.handlingInstructionCode == rhs.handlingInstructionCode)||((this.handlingInstructionCode!= null)&&this.handlingInstructionCode.equals(rhs.handlingInstructionCode)))&&((this.handlingInstructionText == rhs.handlingInstructionText)||((this.handlingInstructionText!= null)&&this.handlingInstructionText.equals(rhs.handlingInstructionText))))&&((this.storageTemperature == rhs.storageTemperature)||((this.storageTemperature!= null)&&this.storageTemperature.equals(rhs.storageTemperature))))&&((this.transportTemperature == rhs.transportTemperature)||((this.transportTemperature!= null)&&this.transportTemperature.equals(rhs.transportTemperature))));
    }

}
