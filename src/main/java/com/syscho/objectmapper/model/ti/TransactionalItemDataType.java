
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TransactionalItemDataType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "availableForSaleDate",
    "batchNumber",
    "countryOfOrigin",
    "itemExpirationDate",
    "lotNumber",
    "packagingDate",
    "productionDate",
    "serialNumber",
    "tradeItemQuantity",
    "transactionalItemWeight",
    "availableForSaleTime"
})
@Generated("jsonschema2pojo")
public class TransactionalItemDataType {

    /**
     * The date the item is available for sale.
     * 
     */
    @JsonProperty("availableForSaleDate")
    @JsonPropertyDescription("The date the item is available for sale.")
    private String availableForSaleDate;
    /**
     * A batch unites products or items that have undergone or are grouped together to undergo the same transformation process, not necessarily a production process.
     * 
     */
    @JsonProperty("batchNumber")
    @JsonPropertyDescription("A batch unites products or items that have undergone or are grouped together to undergo the same transformation process, not necessarily a production process.")
    private String batchNumber;
    /**
     * CountryCode
     * <p>
     * 
     * 
     */
    @JsonProperty("countryOfOrigin")
    private CountryCode countryOfOrigin;
    /**
     * The date after which the product should not be used or consumed. Its meaning is determined based on the trade item context (e.g., for food, the date will indicate the possibility of a direct health risk resulting from use of the product after the date, for pharmaceutical products, it will indicate the possibility of an indirect health risk resulting from the ineffectiveness of the product after the date). It is often referred to as "use by date" or "maximum durability date.â€�
     * 
     */
    @JsonProperty("itemExpirationDate")
    @JsonPropertyDescription("The date after which the product should not be used or consumed. Its meaning is determined based on the trade item context (e.g., for food, the date will indicate the possibility of a direct health risk resulting from use of the product after the date, for pharmaceutical products, it will indicate the possibility of an indirect health risk resulting from the ineffectiveness of the product after the date). It is often referred to as \"use by date\" or \"maximum durability date.\u00e2\u20ac\ufffd")
    private String itemExpirationDate;
    /**
     * A distinctive combination of numbers and/or letters from which the complete history of the manufacture, processing, packaging, coding and distribution of a batch can be determined.
     * 
     */
    @JsonProperty("lotNumber")
    @JsonPropertyDescription("A distinctive combination of numbers and/or letters from which the complete history of the manufacture, processing, packaging, coding and distribution of a batch can be determined.")
    private String lotNumber;
    /**
     * The date on which the packaging of a product took place.
     * 
     */
    @JsonProperty("packagingDate")
    @JsonPropertyDescription("The date on which the packaging of a product took place.")
    private String packagingDate;
    /**
     * The date that the product was produced.
     * 
     */
    @JsonProperty("productionDate")
    @JsonPropertyDescription("The date that the product was produced.")
    private String productionDate;
    /**
     * A unique identifier assigned to a specific trade item.
     * 
     */
    @JsonProperty("serialNumber")
    @JsonPropertyDescription("A unique identifier assigned to a specific trade item.")
    private List<String> serialNumber = new ArrayList<String>();
    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("tradeItemQuantity")
    private QuantityType tradeItemQuantity;
    /**
     * Information specifying the weight or volume of a unit.
     * 
     */
    @JsonProperty("transactionalItemWeight")
    @JsonPropertyDescription("Information specifying the weight or volume of a unit.")
    private List<UnitMeasurementType> transactionalItemWeight = new ArrayList<UnitMeasurementType>();
    /**
     * The time on availableForSaleDate when the item is available for sale.
     * 
     */
    @JsonProperty("availableForSaleTime")
    @JsonPropertyDescription("The time on availableForSaleDate when the item is available for sale.")
    private String availableForSaleTime;

    /**
     * The date the item is available for sale.
     * 
     */
    @JsonProperty("availableForSaleDate")
    public String getAvailableForSaleDate() {
        return availableForSaleDate;
    }

    /**
     * The date the item is available for sale.
     * 
     */
    @JsonProperty("availableForSaleDate")
    public void setAvailableForSaleDate(String availableForSaleDate) {
        this.availableForSaleDate = availableForSaleDate;
    }

    public TransactionalItemDataType withAvailableForSaleDate(String availableForSaleDate) {
        this.availableForSaleDate = availableForSaleDate;
        return this;
    }

    /**
     * A batch unites products or items that have undergone or are grouped together to undergo the same transformation process, not necessarily a production process.
     * 
     */
    @JsonProperty("batchNumber")
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * A batch unites products or items that have undergone or are grouped together to undergo the same transformation process, not necessarily a production process.
     * 
     */
    @JsonProperty("batchNumber")
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public TransactionalItemDataType withBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
        return this;
    }

    /**
     * CountryCode
     * <p>
     * 
     * 
     */
    @JsonProperty("countryOfOrigin")
    public CountryCode getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * CountryCode
     * <p>
     * 
     * 
     */
    @JsonProperty("countryOfOrigin")
    public void setCountryOfOrigin(CountryCode countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public TransactionalItemDataType withCountryOfOrigin(CountryCode countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
        return this;
    }

    /**
     * The date after which the product should not be used or consumed. Its meaning is determined based on the trade item context (e.g., for food, the date will indicate the possibility of a direct health risk resulting from use of the product after the date, for pharmaceutical products, it will indicate the possibility of an indirect health risk resulting from the ineffectiveness of the product after the date). It is often referred to as "use by date" or "maximum durability date.â€�
     * 
     */
    @JsonProperty("itemExpirationDate")
    public String getItemExpirationDate() {
        return itemExpirationDate;
    }

    /**
     * The date after which the product should not be used or consumed. Its meaning is determined based on the trade item context (e.g., for food, the date will indicate the possibility of a direct health risk resulting from use of the product after the date, for pharmaceutical products, it will indicate the possibility of an indirect health risk resulting from the ineffectiveness of the product after the date). It is often referred to as "use by date" or "maximum durability date.â€�
     * 
     */
    @JsonProperty("itemExpirationDate")
    public void setItemExpirationDate(String itemExpirationDate) {
        this.itemExpirationDate = itemExpirationDate;
    }

    public TransactionalItemDataType withItemExpirationDate(String itemExpirationDate) {
        this.itemExpirationDate = itemExpirationDate;
        return this;
    }

    /**
     * A distinctive combination of numbers and/or letters from which the complete history of the manufacture, processing, packaging, coding and distribution of a batch can be determined.
     * 
     */
    @JsonProperty("lotNumber")
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * A distinctive combination of numbers and/or letters from which the complete history of the manufacture, processing, packaging, coding and distribution of a batch can be determined.
     * 
     */
    @JsonProperty("lotNumber")
    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public TransactionalItemDataType withLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
        return this;
    }

    /**
     * The date on which the packaging of a product took place.
     * 
     */
    @JsonProperty("packagingDate")
    public String getPackagingDate() {
        return packagingDate;
    }

    /**
     * The date on which the packaging of a product took place.
     * 
     */
    @JsonProperty("packagingDate")
    public void setPackagingDate(String packagingDate) {
        this.packagingDate = packagingDate;
    }

    public TransactionalItemDataType withPackagingDate(String packagingDate) {
        this.packagingDate = packagingDate;
        return this;
    }

    /**
     * The date that the product was produced.
     * 
     */
    @JsonProperty("productionDate")
    public String getProductionDate() {
        return productionDate;
    }

    /**
     * The date that the product was produced.
     * 
     */
    @JsonProperty("productionDate")
    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public TransactionalItemDataType withProductionDate(String productionDate) {
        this.productionDate = productionDate;
        return this;
    }

    /**
     * A unique identifier assigned to a specific trade item.
     * 
     */
    @JsonProperty("serialNumber")
    public List<String> getSerialNumber() {
        return serialNumber;
    }

    /**
     * A unique identifier assigned to a specific trade item.
     * 
     */
    @JsonProperty("serialNumber")
    public void setSerialNumber(List<String> serialNumber) {
        this.serialNumber = serialNumber;
    }

    public TransactionalItemDataType withSerialNumber(List<String> serialNumber) {
        this.serialNumber = serialNumber;
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

    public TransactionalItemDataType withTradeItemQuantity(QuantityType tradeItemQuantity) {
        this.tradeItemQuantity = tradeItemQuantity;
        return this;
    }

    /**
     * Information specifying the weight or volume of a unit.
     * 
     */
    @JsonProperty("transactionalItemWeight")
    public List<UnitMeasurementType> getTransactionalItemWeight() {
        return transactionalItemWeight;
    }

    /**
     * Information specifying the weight or volume of a unit.
     * 
     */
    @JsonProperty("transactionalItemWeight")
    public void setTransactionalItemWeight(List<UnitMeasurementType> transactionalItemWeight) {
        this.transactionalItemWeight = transactionalItemWeight;
    }

    public TransactionalItemDataType withTransactionalItemWeight(List<UnitMeasurementType> transactionalItemWeight) {
        this.transactionalItemWeight = transactionalItemWeight;
        return this;
    }

    /**
     * The time on availableForSaleDate when the item is available for sale.
     * 
     */
    @JsonProperty("availableForSaleTime")
    public String getAvailableForSaleTime() {
        return availableForSaleTime;
    }

    /**
     * The time on availableForSaleDate when the item is available for sale.
     * 
     */
    @JsonProperty("availableForSaleTime")
    public void setAvailableForSaleTime(String availableForSaleTime) {
        this.availableForSaleTime = availableForSaleTime;
    }

    public TransactionalItemDataType withAvailableForSaleTime(String availableForSaleTime) {
        this.availableForSaleTime = availableForSaleTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransactionalItemDataType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("availableForSaleDate");
        sb.append('=');
        sb.append(((this.availableForSaleDate == null)?"<null>":this.availableForSaleDate));
        sb.append(',');
        sb.append("batchNumber");
        sb.append('=');
        sb.append(((this.batchNumber == null)?"<null>":this.batchNumber));
        sb.append(',');
        sb.append("countryOfOrigin");
        sb.append('=');
        sb.append(((this.countryOfOrigin == null)?"<null>":this.countryOfOrigin));
        sb.append(',');
        sb.append("itemExpirationDate");
        sb.append('=');
        sb.append(((this.itemExpirationDate == null)?"<null>":this.itemExpirationDate));
        sb.append(',');
        sb.append("lotNumber");
        sb.append('=');
        sb.append(((this.lotNumber == null)?"<null>":this.lotNumber));
        sb.append(',');
        sb.append("packagingDate");
        sb.append('=');
        sb.append(((this.packagingDate == null)?"<null>":this.packagingDate));
        sb.append(',');
        sb.append("productionDate");
        sb.append('=');
        sb.append(((this.productionDate == null)?"<null>":this.productionDate));
        sb.append(',');
        sb.append("serialNumber");
        sb.append('=');
        sb.append(((this.serialNumber == null)?"<null>":this.serialNumber));
        sb.append(',');
        sb.append("tradeItemQuantity");
        sb.append('=');
        sb.append(((this.tradeItemQuantity == null)?"<null>":this.tradeItemQuantity));
        sb.append(',');
        sb.append("transactionalItemWeight");
        sb.append('=');
        sb.append(((this.transactionalItemWeight == null)?"<null>":this.transactionalItemWeight));
        sb.append(',');
        sb.append("availableForSaleTime");
        sb.append('=');
        sb.append(((this.availableForSaleTime == null)?"<null>":this.availableForSaleTime));
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
        result = ((result* 31)+((this.itemExpirationDate == null)? 0 :this.itemExpirationDate.hashCode()));
        result = ((result* 31)+((this.productionDate == null)? 0 :this.productionDate.hashCode()));
        result = ((result* 31)+((this.serialNumber == null)? 0 :this.serialNumber.hashCode()));
        result = ((result* 31)+((this.availableForSaleDate == null)? 0 :this.availableForSaleDate.hashCode()));
        result = ((result* 31)+((this.countryOfOrigin == null)? 0 :this.countryOfOrigin.hashCode()));
        result = ((result* 31)+((this.lotNumber == null)? 0 :this.lotNumber.hashCode()));
        result = ((result* 31)+((this.transactionalItemWeight == null)? 0 :this.transactionalItemWeight.hashCode()));
        result = ((result* 31)+((this.packagingDate == null)? 0 :this.packagingDate.hashCode()));
        result = ((result* 31)+((this.availableForSaleTime == null)? 0 :this.availableForSaleTime.hashCode()));
        result = ((result* 31)+((this.batchNumber == null)? 0 :this.batchNumber.hashCode()));
        result = ((result* 31)+((this.tradeItemQuantity == null)? 0 :this.tradeItemQuantity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransactionalItemDataType) == false) {
            return false;
        }
        TransactionalItemDataType rhs = ((TransactionalItemDataType) other);
        return ((((((((((((this.itemExpirationDate == rhs.itemExpirationDate)||((this.itemExpirationDate!= null)&&this.itemExpirationDate.equals(rhs.itemExpirationDate)))&&((this.productionDate == rhs.productionDate)||((this.productionDate!= null)&&this.productionDate.equals(rhs.productionDate))))&&((this.serialNumber == rhs.serialNumber)||((this.serialNumber!= null)&&this.serialNumber.equals(rhs.serialNumber))))&&((this.availableForSaleDate == rhs.availableForSaleDate)||((this.availableForSaleDate!= null)&&this.availableForSaleDate.equals(rhs.availableForSaleDate))))&&((this.countryOfOrigin == rhs.countryOfOrigin)||((this.countryOfOrigin!= null)&&this.countryOfOrigin.equals(rhs.countryOfOrigin))))&&((this.lotNumber == rhs.lotNumber)||((this.lotNumber!= null)&&this.lotNumber.equals(rhs.lotNumber))))&&((this.transactionalItemWeight == rhs.transactionalItemWeight)||((this.transactionalItemWeight!= null)&&this.transactionalItemWeight.equals(rhs.transactionalItemWeight))))&&((this.packagingDate == rhs.packagingDate)||((this.packagingDate!= null)&&this.packagingDate.equals(rhs.packagingDate))))&&((this.availableForSaleTime == rhs.availableForSaleTime)||((this.availableForSaleTime!= null)&&this.availableForSaleTime.equals(rhs.availableForSaleTime))))&&((this.batchNumber == rhs.batchNumber)||((this.batchNumber!= null)&&this.batchNumber.equals(rhs.batchNumber))))&&((this.tradeItemQuantity == rhs.tradeItemQuantity)||((this.tradeItemQuantity!= null)&&this.tradeItemQuantity.equals(rhs.tradeItemQuantity))));
    }

}
