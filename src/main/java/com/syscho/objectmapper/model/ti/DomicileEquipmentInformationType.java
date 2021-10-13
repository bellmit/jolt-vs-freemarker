
package com.syscho.objectmapper.model.ti;

import java.time.OffsetDateTime;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DomicileEquipmentInformationType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "minimumLoad",
    "maximumLoad",
    "enforceConstraintAsPercentage",
    "minimumLoadPenaltyAmount",
    "maximumLoadPenaltyAmount",
    "maximumTravelDistance",
    "earliestAvailableStartDateTime",
    "latestAvailableStartDateTime",
    "maximumDeadheadDistancePerLoad",
    "maximumReturnToOriginDistance",
    "maximumInitialRepositioningDistance"
})
@Generated("jsonschema2pojo")
public class DomicileEquipmentInformationType {

    /**
     * The minimum number of loads or trips, or percentage of loads or trips, that must be assigned to this domicile during a given optimization to avoid the minimum load or trip penalty. enforceConstraintAsPercentage flag determines if this value is a number or percentage.
     * 
     */
    @JsonProperty("minimumLoad")
    @JsonPropertyDescription("The minimum number of loads or trips, or percentage of loads or trips, that must be assigned to this domicile during a given optimization to avoid the minimum load or trip penalty. enforceConstraintAsPercentage flag determines if this value is a number or percentage.")
    private Integer minimumLoad;
    /**
     * The maximum number of loads or trips, or percentage of loads or trips, that can be assigned to this domicile during a given optimization before the maximum load penalty will be applied. enforceConstraintAsPercentage flag determines if this value is a number or percentage.
     * 
     */
    @JsonProperty("maximumLoad")
    @JsonPropertyDescription("The maximum number of loads or trips, or percentage of loads or trips, that can be assigned to this domicile during a given optimization before the maximum load penalty will be applied. enforceConstraintAsPercentage flag determines if this value is a number or percentage.")
    private Integer maximumLoad;
    /**
     * An indicator that determines whether the minimumLoad and maximumLoad values are regarded as percentages rather than as absolute numbers.
     * 
     */
    @JsonProperty("enforceConstraintAsPercentage")
    @JsonPropertyDescription("An indicator that determines whether the minimumLoad and maximumLoad values are regarded as percentages rather than as absolute numbers.")
    private Boolean enforceConstraintAsPercentage;
    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("minimumLoadPenaltyAmount")
    private AmountType minimumLoadPenaltyAmount;
    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumLoadPenaltyAmount")
    private AmountType maximumLoadPenaltyAmount;
    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumTravelDistance")
    private QuantityType maximumTravelDistance;
    /**
     * The earliest date and time when the equipment becomes available for use at the domicile.
     * 
     */
    @JsonProperty("earliestAvailableStartDateTime")
    @JsonPropertyDescription("The earliest date and time when the equipment becomes available for use at the domicile.")
    private OffsetDateTime earliestAvailableStartDateTime;
    /**
     * The latest date and time the equipment must begin to be used.
     * 
     */
    @JsonProperty("latestAvailableStartDateTime")
    @JsonPropertyDescription("The latest date and time the equipment must begin to be used.")
    private OffsetDateTime latestAvailableStartDateTime;
    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumDeadheadDistancePerLoad")
    private QuantityType maximumDeadheadDistancePerLoad;
    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumReturnToOriginDistance")
    private QuantityType maximumReturnToOriginDistance;
    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumInitialRepositioningDistance")
    private QuantityType maximumInitialRepositioningDistance;

    /**
     * The minimum number of loads or trips, or percentage of loads or trips, that must be assigned to this domicile during a given optimization to avoid the minimum load or trip penalty. enforceConstraintAsPercentage flag determines if this value is a number or percentage.
     * 
     */
    @JsonProperty("minimumLoad")
    public Integer getMinimumLoad() {
        return minimumLoad;
    }

    /**
     * The minimum number of loads or trips, or percentage of loads or trips, that must be assigned to this domicile during a given optimization to avoid the minimum load or trip penalty. enforceConstraintAsPercentage flag determines if this value is a number or percentage.
     * 
     */
    @JsonProperty("minimumLoad")
    public void setMinimumLoad(Integer minimumLoad) {
        this.minimumLoad = minimumLoad;
    }

    public DomicileEquipmentInformationType withMinimumLoad(Integer minimumLoad) {
        this.minimumLoad = minimumLoad;
        return this;
    }

    /**
     * The maximum number of loads or trips, or percentage of loads or trips, that can be assigned to this domicile during a given optimization before the maximum load penalty will be applied. enforceConstraintAsPercentage flag determines if this value is a number or percentage.
     * 
     */
    @JsonProperty("maximumLoad")
    public Integer getMaximumLoad() {
        return maximumLoad;
    }

    /**
     * The maximum number of loads or trips, or percentage of loads or trips, that can be assigned to this domicile during a given optimization before the maximum load penalty will be applied. enforceConstraintAsPercentage flag determines if this value is a number or percentage.
     * 
     */
    @JsonProperty("maximumLoad")
    public void setMaximumLoad(Integer maximumLoad) {
        this.maximumLoad = maximumLoad;
    }

    public DomicileEquipmentInformationType withMaximumLoad(Integer maximumLoad) {
        this.maximumLoad = maximumLoad;
        return this;
    }

    /**
     * An indicator that determines whether the minimumLoad and maximumLoad values are regarded as percentages rather than as absolute numbers.
     * 
     */
    @JsonProperty("enforceConstraintAsPercentage")
    public Boolean getEnforceConstraintAsPercentage() {
        return enforceConstraintAsPercentage;
    }

    /**
     * An indicator that determines whether the minimumLoad and maximumLoad values are regarded as percentages rather than as absolute numbers.
     * 
     */
    @JsonProperty("enforceConstraintAsPercentage")
    public void setEnforceConstraintAsPercentage(Boolean enforceConstraintAsPercentage) {
        this.enforceConstraintAsPercentage = enforceConstraintAsPercentage;
    }

    public DomicileEquipmentInformationType withEnforceConstraintAsPercentage(Boolean enforceConstraintAsPercentage) {
        this.enforceConstraintAsPercentage = enforceConstraintAsPercentage;
        return this;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("minimumLoadPenaltyAmount")
    public AmountType getMinimumLoadPenaltyAmount() {
        return minimumLoadPenaltyAmount;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("minimumLoadPenaltyAmount")
    public void setMinimumLoadPenaltyAmount(AmountType minimumLoadPenaltyAmount) {
        this.minimumLoadPenaltyAmount = minimumLoadPenaltyAmount;
    }

    public DomicileEquipmentInformationType withMinimumLoadPenaltyAmount(AmountType minimumLoadPenaltyAmount) {
        this.minimumLoadPenaltyAmount = minimumLoadPenaltyAmount;
        return this;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumLoadPenaltyAmount")
    public AmountType getMaximumLoadPenaltyAmount() {
        return maximumLoadPenaltyAmount;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumLoadPenaltyAmount")
    public void setMaximumLoadPenaltyAmount(AmountType maximumLoadPenaltyAmount) {
        this.maximumLoadPenaltyAmount = maximumLoadPenaltyAmount;
    }

    public DomicileEquipmentInformationType withMaximumLoadPenaltyAmount(AmountType maximumLoadPenaltyAmount) {
        this.maximumLoadPenaltyAmount = maximumLoadPenaltyAmount;
        return this;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumTravelDistance")
    public QuantityType getMaximumTravelDistance() {
        return maximumTravelDistance;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumTravelDistance")
    public void setMaximumTravelDistance(QuantityType maximumTravelDistance) {
        this.maximumTravelDistance = maximumTravelDistance;
    }

    public DomicileEquipmentInformationType withMaximumTravelDistance(QuantityType maximumTravelDistance) {
        this.maximumTravelDistance = maximumTravelDistance;
        return this;
    }

    /**
     * The earliest date and time when the equipment becomes available for use at the domicile.
     * 
     */
    @JsonProperty("earliestAvailableStartDateTime")
    public OffsetDateTime getEarliestAvailableStartDateTime() {
        return earliestAvailableStartDateTime;
    }

    /**
     * The earliest date and time when the equipment becomes available for use at the domicile.
     * 
     */
    @JsonProperty("earliestAvailableStartDateTime")
    public void setEarliestAvailableStartDateTime(OffsetDateTime earliestAvailableStartDateTime) {
        this.earliestAvailableStartDateTime = earliestAvailableStartDateTime;
    }

    public DomicileEquipmentInformationType withEarliestAvailableStartDateTime(OffsetDateTime earliestAvailableStartDateTime) {
        this.earliestAvailableStartDateTime = earliestAvailableStartDateTime;
        return this;
    }

    /**
     * The latest date and time the equipment must begin to be used.
     * 
     */
    @JsonProperty("latestAvailableStartDateTime")
    public OffsetDateTime getLatestAvailableStartDateTime() {
        return latestAvailableStartDateTime;
    }

    /**
     * The latest date and time the equipment must begin to be used.
     * 
     */
    @JsonProperty("latestAvailableStartDateTime")
    public void setLatestAvailableStartDateTime(OffsetDateTime latestAvailableStartDateTime) {
        this.latestAvailableStartDateTime = latestAvailableStartDateTime;
    }

    public DomicileEquipmentInformationType withLatestAvailableStartDateTime(OffsetDateTime latestAvailableStartDateTime) {
        this.latestAvailableStartDateTime = latestAvailableStartDateTime;
        return this;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumDeadheadDistancePerLoad")
    public QuantityType getMaximumDeadheadDistancePerLoad() {
        return maximumDeadheadDistancePerLoad;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumDeadheadDistancePerLoad")
    public void setMaximumDeadheadDistancePerLoad(QuantityType maximumDeadheadDistancePerLoad) {
        this.maximumDeadheadDistancePerLoad = maximumDeadheadDistancePerLoad;
    }

    public DomicileEquipmentInformationType withMaximumDeadheadDistancePerLoad(QuantityType maximumDeadheadDistancePerLoad) {
        this.maximumDeadheadDistancePerLoad = maximumDeadheadDistancePerLoad;
        return this;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumReturnToOriginDistance")
    public QuantityType getMaximumReturnToOriginDistance() {
        return maximumReturnToOriginDistance;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumReturnToOriginDistance")
    public void setMaximumReturnToOriginDistance(QuantityType maximumReturnToOriginDistance) {
        this.maximumReturnToOriginDistance = maximumReturnToOriginDistance;
    }

    public DomicileEquipmentInformationType withMaximumReturnToOriginDistance(QuantityType maximumReturnToOriginDistance) {
        this.maximumReturnToOriginDistance = maximumReturnToOriginDistance;
        return this;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumInitialRepositioningDistance")
    public QuantityType getMaximumInitialRepositioningDistance() {
        return maximumInitialRepositioningDistance;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumInitialRepositioningDistance")
    public void setMaximumInitialRepositioningDistance(QuantityType maximumInitialRepositioningDistance) {
        this.maximumInitialRepositioningDistance = maximumInitialRepositioningDistance;
    }

    public DomicileEquipmentInformationType withMaximumInitialRepositioningDistance(QuantityType maximumInitialRepositioningDistance) {
        this.maximumInitialRepositioningDistance = maximumInitialRepositioningDistance;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DomicileEquipmentInformationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("minimumLoad");
        sb.append('=');
        sb.append(((this.minimumLoad == null)?"<null>":this.minimumLoad));
        sb.append(',');
        sb.append("maximumLoad");
        sb.append('=');
        sb.append(((this.maximumLoad == null)?"<null>":this.maximumLoad));
        sb.append(',');
        sb.append("enforceConstraintAsPercentage");
        sb.append('=');
        sb.append(((this.enforceConstraintAsPercentage == null)?"<null>":this.enforceConstraintAsPercentage));
        sb.append(',');
        sb.append("minimumLoadPenaltyAmount");
        sb.append('=');
        sb.append(((this.minimumLoadPenaltyAmount == null)?"<null>":this.minimumLoadPenaltyAmount));
        sb.append(',');
        sb.append("maximumLoadPenaltyAmount");
        sb.append('=');
        sb.append(((this.maximumLoadPenaltyAmount == null)?"<null>":this.maximumLoadPenaltyAmount));
        sb.append(',');
        sb.append("maximumTravelDistance");
        sb.append('=');
        sb.append(((this.maximumTravelDistance == null)?"<null>":this.maximumTravelDistance));
        sb.append(',');
        sb.append("earliestAvailableStartDateTime");
        sb.append('=');
        sb.append(((this.earliestAvailableStartDateTime == null)?"<null>":this.earliestAvailableStartDateTime));
        sb.append(',');
        sb.append("latestAvailableStartDateTime");
        sb.append('=');
        sb.append(((this.latestAvailableStartDateTime == null)?"<null>":this.latestAvailableStartDateTime));
        sb.append(',');
        sb.append("maximumDeadheadDistancePerLoad");
        sb.append('=');
        sb.append(((this.maximumDeadheadDistancePerLoad == null)?"<null>":this.maximumDeadheadDistancePerLoad));
        sb.append(',');
        sb.append("maximumReturnToOriginDistance");
        sb.append('=');
        sb.append(((this.maximumReturnToOriginDistance == null)?"<null>":this.maximumReturnToOriginDistance));
        sb.append(',');
        sb.append("maximumInitialRepositioningDistance");
        sb.append('=');
        sb.append(((this.maximumInitialRepositioningDistance == null)?"<null>":this.maximumInitialRepositioningDistance));
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
        result = ((result* 31)+((this.maximumDeadheadDistancePerLoad == null)? 0 :this.maximumDeadheadDistancePerLoad.hashCode()));
        result = ((result* 31)+((this.minimumLoad == null)? 0 :this.minimumLoad.hashCode()));
        result = ((result* 31)+((this.maximumTravelDistance == null)? 0 :this.maximumTravelDistance.hashCode()));
        result = ((result* 31)+((this.maximumReturnToOriginDistance == null)? 0 :this.maximumReturnToOriginDistance.hashCode()));
        result = ((result* 31)+((this.maximumLoad == null)? 0 :this.maximumLoad.hashCode()));
        result = ((result* 31)+((this.enforceConstraintAsPercentage == null)? 0 :this.enforceConstraintAsPercentage.hashCode()));
        result = ((result* 31)+((this.earliestAvailableStartDateTime == null)? 0 :this.earliestAvailableStartDateTime.hashCode()));
        result = ((result* 31)+((this.minimumLoadPenaltyAmount == null)? 0 :this.minimumLoadPenaltyAmount.hashCode()));
        result = ((result* 31)+((this.latestAvailableStartDateTime == null)? 0 :this.latestAvailableStartDateTime.hashCode()));
        result = ((result* 31)+((this.maximumLoadPenaltyAmount == null)? 0 :this.maximumLoadPenaltyAmount.hashCode()));
        result = ((result* 31)+((this.maximumInitialRepositioningDistance == null)? 0 :this.maximumInitialRepositioningDistance.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomicileEquipmentInformationType) == false) {
            return false;
        }
        DomicileEquipmentInformationType rhs = ((DomicileEquipmentInformationType) other);
        return ((((((((((((this.maximumDeadheadDistancePerLoad == rhs.maximumDeadheadDistancePerLoad)||((this.maximumDeadheadDistancePerLoad!= null)&&this.maximumDeadheadDistancePerLoad.equals(rhs.maximumDeadheadDistancePerLoad)))&&((this.minimumLoad == rhs.minimumLoad)||((this.minimumLoad!= null)&&this.minimumLoad.equals(rhs.minimumLoad))))&&((this.maximumTravelDistance == rhs.maximumTravelDistance)||((this.maximumTravelDistance!= null)&&this.maximumTravelDistance.equals(rhs.maximumTravelDistance))))&&((this.maximumReturnToOriginDistance == rhs.maximumReturnToOriginDistance)||((this.maximumReturnToOriginDistance!= null)&&this.maximumReturnToOriginDistance.equals(rhs.maximumReturnToOriginDistance))))&&((this.maximumLoad == rhs.maximumLoad)||((this.maximumLoad!= null)&&this.maximumLoad.equals(rhs.maximumLoad))))&&((this.enforceConstraintAsPercentage == rhs.enforceConstraintAsPercentage)||((this.enforceConstraintAsPercentage!= null)&&this.enforceConstraintAsPercentage.equals(rhs.enforceConstraintAsPercentage))))&&((this.earliestAvailableStartDateTime == rhs.earliestAvailableStartDateTime)||((this.earliestAvailableStartDateTime!= null)&&this.earliestAvailableStartDateTime.equals(rhs.earliestAvailableStartDateTime))))&&((this.minimumLoadPenaltyAmount == rhs.minimumLoadPenaltyAmount)||((this.minimumLoadPenaltyAmount!= null)&&this.minimumLoadPenaltyAmount.equals(rhs.minimumLoadPenaltyAmount))))&&((this.latestAvailableStartDateTime == rhs.latestAvailableStartDateTime)||((this.latestAvailableStartDateTime!= null)&&this.latestAvailableStartDateTime.equals(rhs.latestAvailableStartDateTime))))&&((this.maximumLoadPenaltyAmount == rhs.maximumLoadPenaltyAmount)||((this.maximumLoadPenaltyAmount!= null)&&this.maximumLoadPenaltyAmount.equals(rhs.maximumLoadPenaltyAmount))))&&((this.maximumInitialRepositioningDistance == rhs.maximumInitialRepositioningDistance)||((this.maximumInitialRepositioningDistance!= null)&&this.maximumInitialRepositioningDistance.equals(rhs.maximumInitialRepositioningDistance))));
    }

}
