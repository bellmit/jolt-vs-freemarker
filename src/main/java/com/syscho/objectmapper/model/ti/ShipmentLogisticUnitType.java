
package com.syscho.objectmapper.model.ti;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.List;


/**
 * ShipmentLogisticUnitType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "primaryId",
    "additionalLogisticUnitId",
    "grossWeight",
    "tradeItemQuantity",
    "referencedTransportEquipment",
    "dimension",
    "unitMeasurement",
    "actionCode",
    "logisticUnitName",
    "childLogisticUnitName",
    "logisticUnitType",
    "parcelPackageCode",
    "commodityTypeCode",
    "shipmentSplitMethod",
    "totalPalletsToPlan",
    "monetaryAmountIncludingTaxes",
    "declaredValueForCustoms",
    "totalLoadingLength",
    "isStackableUpon",
    "tmReferenceNumber",
    "containedShipmentItemReference"
})
@Generated("jsonschema2pojo")
public class ShipmentLogisticUnitType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primaryId")
    private String primaryId;
    /**
     * Additional (non-SSCC) identification attached to a shipping container or shipping package and used for logistical and traceability purposes.
     * 
     */
    @JsonProperty("additionalLogisticUnitId")
    @JsonPropertyDescription("Additional (non-SSCC) identification attached to a shipping container or shipping package and used for logistical and traceability purposes.")
    private List<AdditionalLogisticUnitIdentificationType> additionalLogisticUnitId = new ArrayList<AdditionalLogisticUnitIdentificationType>();
    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("grossWeight")
    private MeasurementType grossWeight;
    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("tradeItemQuantity")
    private QuantityType tradeItemQuantity;
    /**
     * TransportEquipmentType
     * <p>
     * 
     * 
     */
    @JsonProperty("referencedTransportEquipment")
    private TransportEquipmentType referencedTransportEquipment;
    /**
     * DimensionType
     * <p>
     * 
     * 
     */
    @JsonProperty("dimension")
    private DimensionType dimension;
    /**
     * Information specifying the weight or volume of a unit.
     * 
     */
    @JsonProperty("unitMeasurement")
    @JsonPropertyDescription("Information specifying the weight or volume of a unit.")
    private List<UnitMeasurementType> unitMeasurement = new ArrayList<UnitMeasurementType>();
    /**
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("actionCode")
    private SegmentActionEnumerationType actionCode;
    /**
     * The logistic unit name. Used to convey the UOM for this package level, eg EA, CA, PA.
     * 
     */
    @JsonProperty("logisticUnitName")
    @JsonPropertyDescription("The logistic unit name. Used to convey the UOM for this package level, eg EA, CA, PA.")
    private String logisticUnitName;
    /**
     * The child logistic unit name. Used to convey the UOM for the chile package level, eg EA, CA, PA.
     * 
     */
    @JsonProperty("childLogisticUnitName")
    @JsonPropertyDescription("The child logistic unit name. Used to convey the UOM for the chile package level, eg EA, CA, PA.")
    private String childLogisticUnitName;
    /**
     * A term representing the general business terminlogy that describes the shipping logistic unit.
     * 
     */
    @JsonProperty("logisticUnitType")
    @JsonPropertyDescription("A term representing the general business terminlogy that describes the shipping logistic unit.")
    private String logisticUnitType;
    /**
     * ParcelPackageCode
     * <p>
     * 
     * 
     */
    @JsonProperty("parcelPackageCode")
    private ParcelPackageCode parcelPackageCode;
    /**
     * Specifies the type of commodity for transport purposes, according to the user-selected coding scheme.
     * 
     */
    @JsonProperty("commodityTypeCode")
    @JsonPropertyDescription("Specifies the type of commodity for transport purposes, according to the user-selected coding scheme.")
    private List<CodeType> commodityTypeCode = new ArrayList<CodeType>();
    /**
     * ShipmentSplitMethodCode
     * <p>
     * 
     * 
     */
    @JsonProperty("shipmentSplitMethod")
    private ShipmentSplitMethodCode shipmentSplitMethod;
    /**
     * The total pallets to plan.
     * 
     */
    @JsonProperty("totalPalletsToPlan")
    @JsonPropertyDescription("The total pallets to plan.")
    private Double totalPalletsToPlan;
    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("monetaryAmountIncludingTaxes")
    private AmountType monetaryAmountIncludingTaxes;
    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("declaredValueForCustoms")
    private AmountType declaredValueForCustoms;
    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("totalLoadingLength")
    private MeasurementType totalLoadingLength;
    /**
     * If true, then another container can be stacked upon this container.
     * 
     */
    @JsonProperty("isStackableUpon")
    @JsonPropertyDescription("If true, then another container can be stacked upon this container.")
    private Boolean isStackableUpon;
    /**
     * Used to hold TM reference fields.
     * 
     */
    @JsonProperty("tmReferenceNumber")
    @JsonPropertyDescription("Used to hold TM reference fields.")
    private List<TransportManagementReferenceNumberType> tmReferenceNumber = new ArrayList<TransportManagementReferenceNumberType>();
    /**
     * Identifies which shipment items are in this container.  These references will match the lineItemNumber of the transportInstructionShipmentItem.
     * 
     */
    @JsonProperty("containedShipmentItemReference")
    @JsonPropertyDescription("Identifies which shipment items are in this container.  These references will match the lineItemNumber of the transportInstructionShipmentItem.")
    private List<Integer> containedShipmentItemReference = new ArrayList<Integer>();

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

    public ShipmentLogisticUnitType withPrimaryId(String primaryId) {
        this.primaryId = primaryId;
        return this;
    }

    /**
     * Additional (non-SSCC) identification attached to a shipping container or shipping package and used for logistical and traceability purposes.
     * 
     */
    @JsonProperty("additionalLogisticUnitId")
    public List<AdditionalLogisticUnitIdentificationType> getAdditionalLogisticUnitId() {
        return additionalLogisticUnitId;
    }

    /**
     * Additional (non-SSCC) identification attached to a shipping container or shipping package and used for logistical and traceability purposes.
     * 
     */
    @JsonProperty("additionalLogisticUnitId")
    public void setAdditionalLogisticUnitId(List<AdditionalLogisticUnitIdentificationType> additionalLogisticUnitId) {
        this.additionalLogisticUnitId = additionalLogisticUnitId;
    }

    public ShipmentLogisticUnitType withAdditionalLogisticUnitId(List<AdditionalLogisticUnitIdentificationType> additionalLogisticUnitId) {
        this.additionalLogisticUnitId = additionalLogisticUnitId;
        return this;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("grossWeight")
    public MeasurementType getGrossWeight() {
        return grossWeight;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("grossWeight")
    public void setGrossWeight(MeasurementType grossWeight) {
        this.grossWeight = grossWeight;
    }

    public ShipmentLogisticUnitType withGrossWeight(MeasurementType grossWeight) {
        this.grossWeight = grossWeight;
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

    public ShipmentLogisticUnitType withTradeItemQuantity(QuantityType tradeItemQuantity) {
        this.tradeItemQuantity = tradeItemQuantity;
        return this;
    }

    /**
     * TransportEquipmentType
     * <p>
     * 
     * 
     */
    @JsonProperty("referencedTransportEquipment")
    public TransportEquipmentType getReferencedTransportEquipment() {
        return referencedTransportEquipment;
    }

    /**
     * TransportEquipmentType
     * <p>
     * 
     * 
     */
    @JsonProperty("referencedTransportEquipment")
    public void setReferencedTransportEquipment(TransportEquipmentType referencedTransportEquipment) {
        this.referencedTransportEquipment = referencedTransportEquipment;
    }

    public ShipmentLogisticUnitType withReferencedTransportEquipment(TransportEquipmentType referencedTransportEquipment) {
        this.referencedTransportEquipment = referencedTransportEquipment;
        return this;
    }

    /**
     * DimensionType
     * <p>
     * 
     * 
     */
    @JsonProperty("dimension")
    public DimensionType getDimension() {
        return dimension;
    }

    /**
     * DimensionType
     * <p>
     * 
     * 
     */
    @JsonProperty("dimension")
    public void setDimension(DimensionType dimension) {
        this.dimension = dimension;
    }

    public ShipmentLogisticUnitType withDimension(DimensionType dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * Information specifying the weight or volume of a unit.
     * 
     */
    @JsonProperty("unitMeasurement")
    public List<UnitMeasurementType> getUnitMeasurement() {
        return unitMeasurement;
    }

    /**
     * Information specifying the weight or volume of a unit.
     * 
     */
    @JsonProperty("unitMeasurement")
    public void setUnitMeasurement(List<UnitMeasurementType> unitMeasurement) {
        this.unitMeasurement = unitMeasurement;
    }

    public ShipmentLogisticUnitType withUnitMeasurement(List<UnitMeasurementType> unitMeasurement) {
        this.unitMeasurement = unitMeasurement;
        return this;
    }

    /**
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("actionCode")
    public SegmentActionEnumerationType getActionCode() {
        return actionCode;
    }

    /**
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("actionCode")
    public void setActionCode(SegmentActionEnumerationType actionCode) {
        this.actionCode = actionCode;
    }

    public ShipmentLogisticUnitType withActionCode(SegmentActionEnumerationType actionCode) {
        this.actionCode = actionCode;
        return this;
    }

    /**
     * The logistic unit name. Used to convey the UOM for this package level, eg EA, CA, PA.
     * 
     */
    @JsonProperty("logisticUnitName")
    public String getLogisticUnitName() {
        return logisticUnitName;
    }

    /**
     * The logistic unit name. Used to convey the UOM for this package level, eg EA, CA, PA.
     * 
     */
    @JsonProperty("logisticUnitName")
    public void setLogisticUnitName(String logisticUnitName) {
        this.logisticUnitName = logisticUnitName;
    }

    public ShipmentLogisticUnitType withLogisticUnitName(String logisticUnitName) {
        this.logisticUnitName = logisticUnitName;
        return this;
    }

    /**
     * The child logistic unit name. Used to convey the UOM for the chile package level, eg EA, CA, PA.
     * 
     */
    @JsonProperty("childLogisticUnitName")
    public String getChildLogisticUnitName() {
        return childLogisticUnitName;
    }

    /**
     * The child logistic unit name. Used to convey the UOM for the chile package level, eg EA, CA, PA.
     * 
     */
    @JsonProperty("childLogisticUnitName")
    public void setChildLogisticUnitName(String childLogisticUnitName) {
        this.childLogisticUnitName = childLogisticUnitName;
    }

    public ShipmentLogisticUnitType withChildLogisticUnitName(String childLogisticUnitName) {
        this.childLogisticUnitName = childLogisticUnitName;
        return this;
    }

    /**
     * A term representing the general business terminlogy that describes the shipping logistic unit.
     * 
     */
    @JsonProperty("logisticUnitType")
    public String getLogisticUnitType() {
        return logisticUnitType;
    }

    /**
     * A term representing the general business terminlogy that describes the shipping logistic unit.
     * 
     */
    @JsonProperty("logisticUnitType")
    public void setLogisticUnitType(String logisticUnitType) {
        this.logisticUnitType = logisticUnitType;
    }

    public ShipmentLogisticUnitType withLogisticUnitType(String logisticUnitType) {
        this.logisticUnitType = logisticUnitType;
        return this;
    }

    /**
     * ParcelPackageCode
     * <p>
     * 
     * 
     */
    @JsonProperty("parcelPackageCode")
    public ParcelPackageCode getParcelPackageCode() {
        return parcelPackageCode;
    }

    /**
     * ParcelPackageCode
     * <p>
     * 
     * 
     */
    @JsonProperty("parcelPackageCode")
    public void setParcelPackageCode(ParcelPackageCode parcelPackageCode) {
        this.parcelPackageCode = parcelPackageCode;
    }

    public ShipmentLogisticUnitType withParcelPackageCode(ParcelPackageCode parcelPackageCode) {
        this.parcelPackageCode = parcelPackageCode;
        return this;
    }

    /**
     * Specifies the type of commodity for transport purposes, according to the user-selected coding scheme.
     * 
     */
    @JsonProperty("commodityTypeCode")
    public List<CodeType> getCommodityTypeCode() {
        return commodityTypeCode;
    }

    /**
     * Specifies the type of commodity for transport purposes, according to the user-selected coding scheme.
     * 
     */
    @JsonProperty("commodityTypeCode")
    public void setCommodityTypeCode(List<CodeType> commodityTypeCode) {
        this.commodityTypeCode = commodityTypeCode;
    }

    public ShipmentLogisticUnitType withCommodityTypeCode(List<CodeType> commodityTypeCode) {
        this.commodityTypeCode = commodityTypeCode;
        return this;
    }

    /**
     * ShipmentSplitMethodCode
     * <p>
     * 
     * 
     */
    @JsonProperty("shipmentSplitMethod")
    public ShipmentSplitMethodCode getShipmentSplitMethod() {
        return shipmentSplitMethod;
    }

    /**
     * ShipmentSplitMethodCode
     * <p>
     * 
     * 
     */
    @JsonProperty("shipmentSplitMethod")
    public void setShipmentSplitMethod(ShipmentSplitMethodCode shipmentSplitMethod) {
        this.shipmentSplitMethod = shipmentSplitMethod;
    }

    public ShipmentLogisticUnitType withShipmentSplitMethod(ShipmentSplitMethodCode shipmentSplitMethod) {
        this.shipmentSplitMethod = shipmentSplitMethod;
        return this;
    }

    /**
     * The total pallets to plan.
     * 
     */
    @JsonProperty("totalPalletsToPlan")
    public Double getTotalPalletsToPlan() {
        return totalPalletsToPlan;
    }

    /**
     * The total pallets to plan.
     * 
     */
    @JsonProperty("totalPalletsToPlan")
    public void setTotalPalletsToPlan(Double totalPalletsToPlan) {
        this.totalPalletsToPlan = totalPalletsToPlan;
    }

    public ShipmentLogisticUnitType withTotalPalletsToPlan(Double totalPalletsToPlan) {
        this.totalPalletsToPlan = totalPalletsToPlan;
        return this;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("monetaryAmountIncludingTaxes")
    public AmountType getMonetaryAmountIncludingTaxes() {
        return monetaryAmountIncludingTaxes;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("monetaryAmountIncludingTaxes")
    public void setMonetaryAmountIncludingTaxes(AmountType monetaryAmountIncludingTaxes) {
        this.monetaryAmountIncludingTaxes = monetaryAmountIncludingTaxes;
    }

    public ShipmentLogisticUnitType withMonetaryAmountIncludingTaxes(AmountType monetaryAmountIncludingTaxes) {
        this.monetaryAmountIncludingTaxes = monetaryAmountIncludingTaxes;
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

    public ShipmentLogisticUnitType withDeclaredValueForCustoms(AmountType declaredValueForCustoms) {
        this.declaredValueForCustoms = declaredValueForCustoms;
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

    public ShipmentLogisticUnitType withTotalLoadingLength(MeasurementType totalLoadingLength) {
        this.totalLoadingLength = totalLoadingLength;
        return this;
    }

    /**
     * If true, then another container can be stacked upon this container.
     * 
     */
    @JsonProperty("isStackableUpon")
    public Boolean getIsStackableUpon() {
        return isStackableUpon;
    }

    /**
     * If true, then another container can be stacked upon this container.
     * 
     */
    @JsonProperty("isStackableUpon")
    public void setIsStackableUpon(Boolean isStackableUpon) {
        this.isStackableUpon = isStackableUpon;
    }

    public ShipmentLogisticUnitType withIsStackableUpon(Boolean isStackableUpon) {
        this.isStackableUpon = isStackableUpon;
        return this;
    }

    /**
     * Used to hold TM reference fields.
     * 
     */
    @JsonProperty("tmReferenceNumber")
    public List<TransportManagementReferenceNumberType> getTmReferenceNumber() {
        return tmReferenceNumber;
    }

    /**
     * Used to hold TM reference fields.
     * 
     */
    @JsonProperty("tmReferenceNumber")
    public void setTmReferenceNumber(List<TransportManagementReferenceNumberType> tmReferenceNumber) {
        this.tmReferenceNumber = tmReferenceNumber;
    }

    public ShipmentLogisticUnitType withTmReferenceNumber(List<TransportManagementReferenceNumberType> tmReferenceNumber) {
        this.tmReferenceNumber = tmReferenceNumber;
        return this;
    }

    /**
     * Identifies which shipment items are in this container.  These references will match the lineItemNumber of the transportInstructionShipmentItem.
     * 
     */
    @JsonProperty("containedShipmentItemReference")
    public List<Integer> getContainedShipmentItemReference() {
        return containedShipmentItemReference;
    }

    /**
     * Identifies which shipment items are in this container.  These references will match the lineItemNumber of the transportInstructionShipmentItem.
     * 
     */
    @JsonProperty("containedShipmentItemReference")
    public void setContainedShipmentItemReference(List<Integer> containedShipmentItemReference) {
        this.containedShipmentItemReference = containedShipmentItemReference;
    }

    public ShipmentLogisticUnitType withContainedShipmentItemReference(List<Integer> containedShipmentItemReference) {
        this.containedShipmentItemReference = containedShipmentItemReference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ShipmentLogisticUnitType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("primaryId");
        sb.append('=');
        sb.append(((this.primaryId == null)?"<null>":this.primaryId));
        sb.append(',');
        sb.append("additionalLogisticUnitId");
        sb.append('=');
        sb.append(((this.additionalLogisticUnitId == null)?"<null>":this.additionalLogisticUnitId));
        sb.append(',');
        sb.append("grossWeight");
        sb.append('=');
        sb.append(((this.grossWeight == null)?"<null>":this.grossWeight));
        sb.append(',');
        sb.append("tradeItemQuantity");
        sb.append('=');
        sb.append(((this.tradeItemQuantity == null)?"<null>":this.tradeItemQuantity));
        sb.append(',');
        sb.append("referencedTransportEquipment");
        sb.append('=');
        sb.append(((this.referencedTransportEquipment == null)?"<null>":this.referencedTransportEquipment));
        sb.append(',');
        sb.append("dimension");
        sb.append('=');
        sb.append(((this.dimension == null)?"<null>":this.dimension));
        sb.append(',');
        sb.append("unitMeasurement");
        sb.append('=');
        sb.append(((this.unitMeasurement == null)?"<null>":this.unitMeasurement));
        sb.append(',');
        sb.append("actionCode");
        sb.append('=');
        sb.append(((this.actionCode == null)?"<null>":this.actionCode));
        sb.append(',');
        sb.append("logisticUnitName");
        sb.append('=');
        sb.append(((this.logisticUnitName == null)?"<null>":this.logisticUnitName));
        sb.append(',');
        sb.append("childLogisticUnitName");
        sb.append('=');
        sb.append(((this.childLogisticUnitName == null)?"<null>":this.childLogisticUnitName));
        sb.append(',');
        sb.append("logisticUnitType");
        sb.append('=');
        sb.append(((this.logisticUnitType == null)?"<null>":this.logisticUnitType));
        sb.append(',');
        sb.append("parcelPackageCode");
        sb.append('=');
        sb.append(((this.parcelPackageCode == null)?"<null>":this.parcelPackageCode));
        sb.append(',');
        sb.append("commodityTypeCode");
        sb.append('=');
        sb.append(((this.commodityTypeCode == null)?"<null>":this.commodityTypeCode));
        sb.append(',');
        sb.append("shipmentSplitMethod");
        sb.append('=');
        sb.append(((this.shipmentSplitMethod == null)?"<null>":this.shipmentSplitMethod));
        sb.append(',');
        sb.append("totalPalletsToPlan");
        sb.append('=');
        sb.append(((this.totalPalletsToPlan == null)?"<null>":this.totalPalletsToPlan));
        sb.append(',');
        sb.append("monetaryAmountIncludingTaxes");
        sb.append('=');
        sb.append(((this.monetaryAmountIncludingTaxes == null)?"<null>":this.monetaryAmountIncludingTaxes));
        sb.append(',');
        sb.append("declaredValueForCustoms");
        sb.append('=');
        sb.append(((this.declaredValueForCustoms == null)?"<null>":this.declaredValueForCustoms));
        sb.append(',');
        sb.append("totalLoadingLength");
        sb.append('=');
        sb.append(((this.totalLoadingLength == null)?"<null>":this.totalLoadingLength));
        sb.append(',');
        sb.append("isStackableUpon");
        sb.append('=');
        sb.append(((this.isStackableUpon == null)?"<null>":this.isStackableUpon));
        sb.append(',');
        sb.append("tmReferenceNumber");
        sb.append('=');
        sb.append(((this.tmReferenceNumber == null)?"<null>":this.tmReferenceNumber));
        sb.append(',');
        sb.append("containedShipmentItemReference");
        sb.append('=');
        sb.append(((this.containedShipmentItemReference == null)?"<null>":this.containedShipmentItemReference));
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
        result = ((result* 31)+((this.shipmentSplitMethod == null)? 0 :this.shipmentSplitMethod.hashCode()));
        result = ((result* 31)+((this.totalLoadingLength == null)? 0 :this.totalLoadingLength.hashCode()));
        result = ((result* 31)+((this.totalPalletsToPlan == null)? 0 :this.totalPalletsToPlan.hashCode()));
        result = ((result* 31)+((this.childLogisticUnitName == null)? 0 :this.childLogisticUnitName.hashCode()));
        result = ((result* 31)+((this.isStackableUpon == null)? 0 :this.isStackableUpon.hashCode()));
        result = ((result* 31)+((this.parcelPackageCode == null)? 0 :this.parcelPackageCode.hashCode()));
        result = ((result* 31)+((this.primaryId == null)? 0 :this.primaryId.hashCode()));
        result = ((result* 31)+((this.logisticUnitType == null)? 0 :this.logisticUnitType.hashCode()));
        result = ((result* 31)+((this.tradeItemQuantity == null)? 0 :this.tradeItemQuantity.hashCode()));
        result = ((result* 31)+((this.declaredValueForCustoms == null)? 0 :this.declaredValueForCustoms.hashCode()));
        result = ((result* 31)+((this.grossWeight == null)? 0 :this.grossWeight.hashCode()));
        result = ((result* 31)+((this.unitMeasurement == null)? 0 :this.unitMeasurement.hashCode()));
        result = ((result* 31)+((this.monetaryAmountIncludingTaxes == null)? 0 :this.monetaryAmountIncludingTaxes.hashCode()));
        result = ((result* 31)+((this.actionCode == null)? 0 :this.actionCode.hashCode()));
        result = ((result* 31)+((this.commodityTypeCode == null)? 0 :this.commodityTypeCode.hashCode()));
        result = ((result* 31)+((this.additionalLogisticUnitId == null)? 0 :this.additionalLogisticUnitId.hashCode()));
        result = ((result* 31)+((this.referencedTransportEquipment == null)? 0 :this.referencedTransportEquipment.hashCode()));
        result = ((result* 31)+((this.tmReferenceNumber == null)? 0 :this.tmReferenceNumber.hashCode()));
        result = ((result* 31)+((this.dimension == null)? 0 :this.dimension.hashCode()));
        result = ((result* 31)+((this.logisticUnitName == null)? 0 :this.logisticUnitName.hashCode()));
        result = ((result* 31)+((this.containedShipmentItemReference == null)? 0 :this.containedShipmentItemReference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShipmentLogisticUnitType) == false) {
            return false;
        }
        ShipmentLogisticUnitType rhs = ((ShipmentLogisticUnitType) other);
        return ((((((((((((((((((((((this.shipmentSplitMethod == rhs.shipmentSplitMethod)||((this.shipmentSplitMethod!= null)&&this.shipmentSplitMethod.equals(rhs.shipmentSplitMethod)))&&((this.totalLoadingLength == rhs.totalLoadingLength)||((this.totalLoadingLength!= null)&&this.totalLoadingLength.equals(rhs.totalLoadingLength))))&&((this.totalPalletsToPlan == rhs.totalPalletsToPlan)||((this.totalPalletsToPlan!= null)&&this.totalPalletsToPlan.equals(rhs.totalPalletsToPlan))))&&((this.childLogisticUnitName == rhs.childLogisticUnitName)||((this.childLogisticUnitName!= null)&&this.childLogisticUnitName.equals(rhs.childLogisticUnitName))))&&((this.isStackableUpon == rhs.isStackableUpon)||((this.isStackableUpon!= null)&&this.isStackableUpon.equals(rhs.isStackableUpon))))&&((this.parcelPackageCode == rhs.parcelPackageCode)||((this.parcelPackageCode!= null)&&this.parcelPackageCode.equals(rhs.parcelPackageCode))))&&((this.primaryId == rhs.primaryId)||((this.primaryId!= null)&&this.primaryId.equals(rhs.primaryId))))&&((this.logisticUnitType == rhs.logisticUnitType)||((this.logisticUnitType!= null)&&this.logisticUnitType.equals(rhs.logisticUnitType))))&&((this.tradeItemQuantity == rhs.tradeItemQuantity)||((this.tradeItemQuantity!= null)&&this.tradeItemQuantity.equals(rhs.tradeItemQuantity))))&&((this.declaredValueForCustoms == rhs.declaredValueForCustoms)||((this.declaredValueForCustoms!= null)&&this.declaredValueForCustoms.equals(rhs.declaredValueForCustoms))))&&((this.grossWeight == rhs.grossWeight)||((this.grossWeight!= null)&&this.grossWeight.equals(rhs.grossWeight))))&&((this.unitMeasurement == rhs.unitMeasurement)||((this.unitMeasurement!= null)&&this.unitMeasurement.equals(rhs.unitMeasurement))))&&((this.monetaryAmountIncludingTaxes == rhs.monetaryAmountIncludingTaxes)||((this.monetaryAmountIncludingTaxes!= null)&&this.monetaryAmountIncludingTaxes.equals(rhs.monetaryAmountIncludingTaxes))))&&((this.actionCode == rhs.actionCode)||((this.actionCode!= null)&&this.actionCode.equals(rhs.actionCode))))&&((this.commodityTypeCode == rhs.commodityTypeCode)||((this.commodityTypeCode!= null)&&this.commodityTypeCode.equals(rhs.commodityTypeCode))))&&((this.additionalLogisticUnitId == rhs.additionalLogisticUnitId)||((this.additionalLogisticUnitId!= null)&&this.additionalLogisticUnitId.equals(rhs.additionalLogisticUnitId))))&&((this.referencedTransportEquipment == rhs.referencedTransportEquipment)||((this.referencedTransportEquipment!= null)&&this.referencedTransportEquipment.equals(rhs.referencedTransportEquipment))))&&((this.tmReferenceNumber == rhs.tmReferenceNumber)||((this.tmReferenceNumber!= null)&&this.tmReferenceNumber.equals(rhs.tmReferenceNumber))))&&((this.dimension == rhs.dimension)||((this.dimension!= null)&&this.dimension.equals(rhs.dimension))))&&((this.logisticUnitName == rhs.logisticUnitName)||((this.logisticUnitName!= null)&&this.logisticUnitName.equals(rhs.logisticUnitName))))&&((this.containedShipmentItemReference == rhs.containedShipmentItemReference)||((this.containedShipmentItemReference!= null)&&this.containedShipmentItemReference.equals(rhs.containedShipmentItemReference))));
    }

}
