
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TransportCargoCharacteristicsType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cargoTypeCode",
    "totalGrossVolume",
    "totalGrossWeight",
    "totalLoadingLength",
    "associatedInvoiceAmount",
    "declaredValueForCustoms",
    "totalPackageQuantity",
    "totalItemQuantity",
    "totalShipmentDistance",
    "weightByFreightClass"
})
@Generated("jsonschema2pojo")
public class TransportCargoCharacteristicsType {

    /**
     * CargoTypeCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("cargoTypeCode")
    private CargoTypeCode cargoTypeCode;
    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalGrossVolume")
    private MeasurementType totalGrossVolume;
    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalGrossWeight")
    private MeasurementType totalGrossWeight;
    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalLoadingLength")
    private MeasurementType totalLoadingLength;
    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("associatedInvoiceAmount")
    private AmountType associatedInvoiceAmount;
    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("declaredValueForCustoms")
    private AmountType declaredValueForCustoms;
    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalPackageQuantity")
    private QuantityType totalPackageQuantity;
    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalItemQuantity")
    private QuantityType totalItemQuantity;
    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalShipmentDistance")
    private MeasurementType totalShipmentDistance;
    /**
     * Shipment weights categoriezed by freight class type.
     * 
     */
    @JsonProperty("weightByFreightClass")
    @JsonPropertyDescription("Shipment weights categoriezed by freight class type.")
    private List<WeightByFreightClassType> weightByFreightClass = new ArrayList<WeightByFreightClassType>();

    /**
     * CargoTypeCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("cargoTypeCode")
    public CargoTypeCode getCargoTypeCode() {
        return cargoTypeCode;
    }

    /**
     * CargoTypeCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("cargoTypeCode")
    public void setCargoTypeCode(CargoTypeCode cargoTypeCode) {
        this.cargoTypeCode = cargoTypeCode;
    }

    public TransportCargoCharacteristicsType withCargoTypeCode(CargoTypeCode cargoTypeCode) {
        this.cargoTypeCode = cargoTypeCode;
        return this;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalGrossVolume")
    public MeasurementType getTotalGrossVolume() {
        return totalGrossVolume;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalGrossVolume")
    public void setTotalGrossVolume(MeasurementType totalGrossVolume) {
        this.totalGrossVolume = totalGrossVolume;
    }

    public TransportCargoCharacteristicsType withTotalGrossVolume(MeasurementType totalGrossVolume) {
        this.totalGrossVolume = totalGrossVolume;
        return this;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalGrossWeight")
    public MeasurementType getTotalGrossWeight() {
        return totalGrossWeight;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalGrossWeight")
    public void setTotalGrossWeight(MeasurementType totalGrossWeight) {
        this.totalGrossWeight = totalGrossWeight;
    }

    public TransportCargoCharacteristicsType withTotalGrossWeight(MeasurementType totalGrossWeight) {
        this.totalGrossWeight = totalGrossWeight;
        return this;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalLoadingLength")
    public MeasurementType getTotalLoadingLength() {
        return totalLoadingLength;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalLoadingLength")
    public void setTotalLoadingLength(MeasurementType totalLoadingLength) {
        this.totalLoadingLength = totalLoadingLength;
    }

    public TransportCargoCharacteristicsType withTotalLoadingLength(MeasurementType totalLoadingLength) {
        this.totalLoadingLength = totalLoadingLength;
        return this;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("associatedInvoiceAmount")
    public AmountType getAssociatedInvoiceAmount() {
        return associatedInvoiceAmount;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("associatedInvoiceAmount")
    public void setAssociatedInvoiceAmount(AmountType associatedInvoiceAmount) {
        this.associatedInvoiceAmount = associatedInvoiceAmount;
    }

    public TransportCargoCharacteristicsType withAssociatedInvoiceAmount(AmountType associatedInvoiceAmount) {
        this.associatedInvoiceAmount = associatedInvoiceAmount;
        return this;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("declaredValueForCustoms")
    public AmountType getDeclaredValueForCustoms() {
        return declaredValueForCustoms;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("declaredValueForCustoms")
    public void setDeclaredValueForCustoms(AmountType declaredValueForCustoms) {
        this.declaredValueForCustoms = declaredValueForCustoms;
    }

    public TransportCargoCharacteristicsType withDeclaredValueForCustoms(AmountType declaredValueForCustoms) {
        this.declaredValueForCustoms = declaredValueForCustoms;
        return this;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalPackageQuantity")
    public QuantityType getTotalPackageQuantity() {
        return totalPackageQuantity;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalPackageQuantity")
    public void setTotalPackageQuantity(QuantityType totalPackageQuantity) {
        this.totalPackageQuantity = totalPackageQuantity;
    }

    public TransportCargoCharacteristicsType withTotalPackageQuantity(QuantityType totalPackageQuantity) {
        this.totalPackageQuantity = totalPackageQuantity;
        return this;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalItemQuantity")
    public QuantityType getTotalItemQuantity() {
        return totalItemQuantity;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalItemQuantity")
    public void setTotalItemQuantity(QuantityType totalItemQuantity) {
        this.totalItemQuantity = totalItemQuantity;
    }

    public TransportCargoCharacteristicsType withTotalItemQuantity(QuantityType totalItemQuantity) {
        this.totalItemQuantity = totalItemQuantity;
        return this;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalShipmentDistance")
    public MeasurementType getTotalShipmentDistance() {
        return totalShipmentDistance;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalShipmentDistance")
    public void setTotalShipmentDistance(MeasurementType totalShipmentDistance) {
        this.totalShipmentDistance = totalShipmentDistance;
    }

    public TransportCargoCharacteristicsType withTotalShipmentDistance(MeasurementType totalShipmentDistance) {
        this.totalShipmentDistance = totalShipmentDistance;
        return this;
    }

    /**
     * Shipment weights categoriezed by freight class type.
     * 
     */
    @JsonProperty("weightByFreightClass")
    public List<WeightByFreightClassType> getWeightByFreightClass() {
        return weightByFreightClass;
    }

    /**
     * Shipment weights categoriezed by freight class type.
     * 
     */
    @JsonProperty("weightByFreightClass")
    public void setWeightByFreightClass(List<WeightByFreightClassType> weightByFreightClass) {
        this.weightByFreightClass = weightByFreightClass;
    }

    public TransportCargoCharacteristicsType withWeightByFreightClass(List<WeightByFreightClassType> weightByFreightClass) {
        this.weightByFreightClass = weightByFreightClass;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportCargoCharacteristicsType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cargoTypeCode");
        sb.append('=');
        sb.append(((this.cargoTypeCode == null)?"<null>":this.cargoTypeCode));
        sb.append(',');
        sb.append("totalGrossVolume");
        sb.append('=');
        sb.append(((this.totalGrossVolume == null)?"<null>":this.totalGrossVolume));
        sb.append(',');
        sb.append("totalGrossWeight");
        sb.append('=');
        sb.append(((this.totalGrossWeight == null)?"<null>":this.totalGrossWeight));
        sb.append(',');
        sb.append("totalLoadingLength");
        sb.append('=');
        sb.append(((this.totalLoadingLength == null)?"<null>":this.totalLoadingLength));
        sb.append(',');
        sb.append("associatedInvoiceAmount");
        sb.append('=');
        sb.append(((this.associatedInvoiceAmount == null)?"<null>":this.associatedInvoiceAmount));
        sb.append(',');
        sb.append("declaredValueForCustoms");
        sb.append('=');
        sb.append(((this.declaredValueForCustoms == null)?"<null>":this.declaredValueForCustoms));
        sb.append(',');
        sb.append("totalPackageQuantity");
        sb.append('=');
        sb.append(((this.totalPackageQuantity == null)?"<null>":this.totalPackageQuantity));
        sb.append(',');
        sb.append("totalItemQuantity");
        sb.append('=');
        sb.append(((this.totalItemQuantity == null)?"<null>":this.totalItemQuantity));
        sb.append(',');
        sb.append("totalShipmentDistance");
        sb.append('=');
        sb.append(((this.totalShipmentDistance == null)?"<null>":this.totalShipmentDistance));
        sb.append(',');
        sb.append("weightByFreightClass");
        sb.append('=');
        sb.append(((this.weightByFreightClass == null)?"<null>":this.weightByFreightClass));
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
        result = ((result* 31)+((this.declaredValueForCustoms == null)? 0 :this.declaredValueForCustoms.hashCode()));
        result = ((result* 31)+((this.totalShipmentDistance == null)? 0 :this.totalShipmentDistance.hashCode()));
        result = ((result* 31)+((this.totalGrossWeight == null)? 0 :this.totalGrossWeight.hashCode()));
        result = ((result* 31)+((this.weightByFreightClass == null)? 0 :this.weightByFreightClass.hashCode()));
        result = ((result* 31)+((this.totalLoadingLength == null)? 0 :this.totalLoadingLength.hashCode()));
        result = ((result* 31)+((this.totalGrossVolume == null)? 0 :this.totalGrossVolume.hashCode()));
        result = ((result* 31)+((this.cargoTypeCode == null)? 0 :this.cargoTypeCode.hashCode()));
        result = ((result* 31)+((this.associatedInvoiceAmount == null)? 0 :this.associatedInvoiceAmount.hashCode()));
        result = ((result* 31)+((this.totalPackageQuantity == null)? 0 :this.totalPackageQuantity.hashCode()));
        result = ((result* 31)+((this.totalItemQuantity == null)? 0 :this.totalItemQuantity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportCargoCharacteristicsType) == false) {
            return false;
        }
        TransportCargoCharacteristicsType rhs = ((TransportCargoCharacteristicsType) other);
        return (((((((((((this.declaredValueForCustoms == rhs.declaredValueForCustoms)||((this.declaredValueForCustoms!= null)&&this.declaredValueForCustoms.equals(rhs.declaredValueForCustoms)))&&((this.totalShipmentDistance == rhs.totalShipmentDistance)||((this.totalShipmentDistance!= null)&&this.totalShipmentDistance.equals(rhs.totalShipmentDistance))))&&((this.totalGrossWeight == rhs.totalGrossWeight)||((this.totalGrossWeight!= null)&&this.totalGrossWeight.equals(rhs.totalGrossWeight))))&&((this.weightByFreightClass == rhs.weightByFreightClass)||((this.weightByFreightClass!= null)&&this.weightByFreightClass.equals(rhs.weightByFreightClass))))&&((this.totalLoadingLength == rhs.totalLoadingLength)||((this.totalLoadingLength!= null)&&this.totalLoadingLength.equals(rhs.totalLoadingLength))))&&((this.totalGrossVolume == rhs.totalGrossVolume)||((this.totalGrossVolume!= null)&&this.totalGrossVolume.equals(rhs.totalGrossVolume))))&&((this.cargoTypeCode == rhs.cargoTypeCode)||((this.cargoTypeCode!= null)&&this.cargoTypeCode.equals(rhs.cargoTypeCode))))&&((this.associatedInvoiceAmount == rhs.associatedInvoiceAmount)||((this.associatedInvoiceAmount!= null)&&this.associatedInvoiceAmount.equals(rhs.associatedInvoiceAmount))))&&((this.totalPackageQuantity == rhs.totalPackageQuantity)||((this.totalPackageQuantity!= null)&&this.totalPackageQuantity.equals(rhs.totalPackageQuantity))))&&((this.totalItemQuantity == rhs.totalItemQuantity)||((this.totalItemQuantity!= null)&&this.totalItemQuantity.equals(rhs.totalItemQuantity))));
    }

}
