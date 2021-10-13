
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TransactionalTradeItemType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "primaryId",
    "additionalTradeItemId",
    "itemName",
    "tradeItemQuantity",
    "tradeItemDescription",
    "productVariantId",
    "transactionalItemData",
    "ownerOfTradeItem"
})
@Generated("jsonschema2pojo")
public class TransactionalTradeItemType {

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
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("tradeItemQuantity")
    private QuantityType tradeItemQuantity;
    /**
     * Description200Type
     * <p>
     * 
     * 
     */
    @JsonProperty("tradeItemDescription")
    private Description200Type tradeItemDescription;
    /**
     * Text identifying a variant of the product, for example for promotional reasons.
     * 
     */
    @JsonProperty("productVariantId")
    @JsonPropertyDescription("Text identifying a variant of the product, for example for promotional reasons.")
    private String productVariantId;
    /**
     * Dynamic characteristics used to specify individual instances of a trade item, such as the best before date, batch number or serial number.
     * 
     */
    @JsonProperty("transactionalItemData")
    @JsonPropertyDescription("Dynamic characteristics used to specify individual instances of a trade item, such as the best before date, batch number or serial number.")
    private List<TransactionalItemDataType> transactionalItemData = new ArrayList<TransactionalItemDataType>();
    /**
     * The party that owns this item.
     * 
     */
    @JsonProperty("ownerOfTradeItem")
    @JsonPropertyDescription("The party that owns this item.")
    private String ownerOfTradeItem;

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

    public TransactionalTradeItemType withPrimaryId(String primaryId) {
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

    public TransactionalTradeItemType withAdditionalTradeItemId(List<AdditionalTradeItemIdentificationType> additionalTradeItemId) {
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

    public TransactionalTradeItemType withItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("tradeItemQuantity")
    public QuantityType getTradeItemQuantity() {
        return tradeItemQuantity;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("tradeItemQuantity")
    public void setTradeItemQuantity(QuantityType tradeItemQuantity) {
        this.tradeItemQuantity = tradeItemQuantity;
    }

    public TransactionalTradeItemType withTradeItemQuantity(QuantityType tradeItemQuantity) {
        this.tradeItemQuantity = tradeItemQuantity;
        return this;
    }

    /**
     * Description200Type
     * <p>
     * 
     * 
     */
    @JsonProperty("tradeItemDescription")
    public Description200Type getTradeItemDescription() {
        return tradeItemDescription;
    }

    /**
     * Description200Type
     * <p>
     * 
     * 
     */
    @JsonProperty("tradeItemDescription")
    public void setTradeItemDescription(Description200Type tradeItemDescription) {
        this.tradeItemDescription = tradeItemDescription;
    }

    public TransactionalTradeItemType withTradeItemDescription(Description200Type tradeItemDescription) {
        this.tradeItemDescription = tradeItemDescription;
        return this;
    }

    /**
     * Text identifying a variant of the product, for example for promotional reasons.
     * 
     */
    @JsonProperty("productVariantId")
    public String getProductVariantId() {
        return productVariantId;
    }

    /**
     * Text identifying a variant of the product, for example for promotional reasons.
     * 
     */
    @JsonProperty("productVariantId")
    public void setProductVariantId(String productVariantId) {
        this.productVariantId = productVariantId;
    }

    public TransactionalTradeItemType withProductVariantId(String productVariantId) {
        this.productVariantId = productVariantId;
        return this;
    }

    /**
     * Dynamic characteristics used to specify individual instances of a trade item, such as the best before date, batch number or serial number.
     * 
     */
    @JsonProperty("transactionalItemData")
    public List<TransactionalItemDataType> getTransactionalItemData() {
        return transactionalItemData;
    }

    /**
     * Dynamic characteristics used to specify individual instances of a trade item, such as the best before date, batch number or serial number.
     * 
     */
    @JsonProperty("transactionalItemData")
    public void setTransactionalItemData(List<TransactionalItemDataType> transactionalItemData) {
        this.transactionalItemData = transactionalItemData;
    }

    public TransactionalTradeItemType withTransactionalItemData(List<TransactionalItemDataType> transactionalItemData) {
        this.transactionalItemData = transactionalItemData;
        return this;
    }

    /**
     * The party that owns this item.
     * 
     */
    @JsonProperty("ownerOfTradeItem")
    public String getOwnerOfTradeItem() {
        return ownerOfTradeItem;
    }

    /**
     * The party that owns this item.
     * 
     */
    @JsonProperty("ownerOfTradeItem")
    public void setOwnerOfTradeItem(String ownerOfTradeItem) {
        this.ownerOfTradeItem = ownerOfTradeItem;
    }

    public TransactionalTradeItemType withOwnerOfTradeItem(String ownerOfTradeItem) {
        this.ownerOfTradeItem = ownerOfTradeItem;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransactionalTradeItemType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("tradeItemQuantity");
        sb.append('=');
        sb.append(((this.tradeItemQuantity == null)?"<null>":this.tradeItemQuantity));
        sb.append(',');
        sb.append("tradeItemDescription");
        sb.append('=');
        sb.append(((this.tradeItemDescription == null)?"<null>":this.tradeItemDescription));
        sb.append(',');
        sb.append("productVariantId");
        sb.append('=');
        sb.append(((this.productVariantId == null)?"<null>":this.productVariantId));
        sb.append(',');
        sb.append("transactionalItemData");
        sb.append('=');
        sb.append(((this.transactionalItemData == null)?"<null>":this.transactionalItemData));
        sb.append(',');
        sb.append("ownerOfTradeItem");
        sb.append('=');
        sb.append(((this.ownerOfTradeItem == null)?"<null>":this.ownerOfTradeItem));
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
        result = ((result* 31)+((this.tradeItemDescription == null)? 0 :this.tradeItemDescription.hashCode()));
        result = ((result* 31)+((this.productVariantId == null)? 0 :this.productVariantId.hashCode()));
        result = ((result* 31)+((this.ownerOfTradeItem == null)? 0 :this.ownerOfTradeItem.hashCode()));
        result = ((result* 31)+((this.additionalTradeItemId == null)? 0 :this.additionalTradeItemId.hashCode()));
        result = ((result* 31)+((this.primaryId == null)? 0 :this.primaryId.hashCode()));
        result = ((result* 31)+((this.transactionalItemData == null)? 0 :this.transactionalItemData.hashCode()));
        result = ((result* 31)+((this.tradeItemQuantity == null)? 0 :this.tradeItemQuantity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransactionalTradeItemType) == false) {
            return false;
        }
        TransactionalTradeItemType rhs = ((TransactionalTradeItemType) other);
        return (((((((((this.itemName == rhs.itemName)||((this.itemName!= null)&&this.itemName.equals(rhs.itemName)))&&((this.tradeItemDescription == rhs.tradeItemDescription)||((this.tradeItemDescription!= null)&&this.tradeItemDescription.equals(rhs.tradeItemDescription))))&&((this.productVariantId == rhs.productVariantId)||((this.productVariantId!= null)&&this.productVariantId.equals(rhs.productVariantId))))&&((this.ownerOfTradeItem == rhs.ownerOfTradeItem)||((this.ownerOfTradeItem!= null)&&this.ownerOfTradeItem.equals(rhs.ownerOfTradeItem))))&&((this.additionalTradeItemId == rhs.additionalTradeItemId)||((this.additionalTradeItemId!= null)&&this.additionalTradeItemId.equals(rhs.additionalTradeItemId))))&&((this.primaryId == rhs.primaryId)||((this.primaryId!= null)&&this.primaryId.equals(rhs.primaryId))))&&((this.transactionalItemData == rhs.transactionalItemData)||((this.transactionalItemData!= null)&&this.transactionalItemData.equals(rhs.transactionalItemData))))&&((this.tradeItemQuantity == rhs.tradeItemQuantity)||((this.tradeItemQuantity!= null)&&this.tradeItemQuantity.equals(rhs.tradeItemQuantity))));
    }

}
