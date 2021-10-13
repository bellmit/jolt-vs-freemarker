
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TradeItemIdentificationType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "primaryId",
    "additionalTradeItemId",
    "itemName"
})
@Generated("jsonschema2pojo")
public class TradeItemIdentificationType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primaryId")
    private String primaryId;
    /**
     * Alternative means to the Global Trade Item Number to identify a trade item.
     * 
     */
    @JsonProperty("additionalTradeItemId")
    @JsonPropertyDescription("Alternative means to the Global Trade Item Number to identify a trade item.")
    private List<AdditionalTradeItemIdentificationType> additionalTradeItemId = new ArrayList<AdditionalTradeItemIdentificationType>();
    /**
     * Name of the item.
     * 
     */
    @JsonProperty("itemName")
    @JsonPropertyDescription("Name of the item.")
    private String itemName;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primaryId")
    public String getPrimaryId() {
        return primaryId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primaryId")
    public void setPrimaryId(String primaryId) {
        this.primaryId = primaryId;
    }

    public TradeItemIdentificationType withPrimaryId(String primaryId) {
        this.primaryId = primaryId;
        return this;
    }

    /**
     * Alternative means to the Global Trade Item Number to identify a trade item.
     * 
     */
    @JsonProperty("additionalTradeItemId")
    public List<AdditionalTradeItemIdentificationType> getAdditionalTradeItemId() {
        return additionalTradeItemId;
    }

    /**
     * Alternative means to the Global Trade Item Number to identify a trade item.
     * 
     */
    @JsonProperty("additionalTradeItemId")
    public void setAdditionalTradeItemId(List<AdditionalTradeItemIdentificationType> additionalTradeItemId) {
        this.additionalTradeItemId = additionalTradeItemId;
    }

    public TradeItemIdentificationType withAdditionalTradeItemId(List<AdditionalTradeItemIdentificationType> additionalTradeItemId) {
        this.additionalTradeItemId = additionalTradeItemId;
        return this;
    }

    /**
     * Name of the item.
     * 
     */
    @JsonProperty("itemName")
    public String getItemName() {
        return itemName;
    }

    /**
     * Name of the item.
     * 
     */
    @JsonProperty("itemName")
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public TradeItemIdentificationType withItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TradeItemIdentificationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("primaryId");
        sb.append('=');
        sb.append(((this.primaryId == null)?"<null>":this.primaryId));
        sb.append(',');
        sb.append("additionalTradeItemId");
        sb.append('=');
        sb.append(((this.additionalTradeItemId == null)?"<null>":this.additionalTradeItemId));
        sb.append(',');
        sb.append("itemName");
        sb.append('=');
        sb.append(((this.itemName == null)?"<null>":this.itemName));
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
        result = ((result* 31)+((this.itemName == null)? 0 :this.itemName.hashCode()));
        result = ((result* 31)+((this.additionalTradeItemId == null)? 0 :this.additionalTradeItemId.hashCode()));
        result = ((result* 31)+((this.primaryId == null)? 0 :this.primaryId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TradeItemIdentificationType) == false) {
            return false;
        }
        TradeItemIdentificationType rhs = ((TradeItemIdentificationType) other);
        return ((((this.itemName == rhs.itemName)||((this.itemName!= null)&&this.itemName.equals(rhs.itemName)))&&((this.additionalTradeItemId == rhs.additionalTradeItemId)||((this.additionalTradeItemId!= null)&&this.additionalTradeItemId.equals(rhs.additionalTradeItemId))))&&((this.primaryId == rhs.primaryId)||((this.primaryId!= null)&&this.primaryId.equals(rhs.primaryId))));
    }

}
