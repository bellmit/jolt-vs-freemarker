
package com.syscho.objectmapper.model.ti;

import java.time.OffsetDateTime;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DomicileVehicleAvailabilityInformationType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "numberOfVehicles",
    "earliestAvailableStartDateTime",
    "latestAvailableStartDateTime",
    "latestAvailableEndDateTime",
    "maximumDuration",
    "applyViolationPenalty",
    "violationPenaltyAmount",
    "isReused",
    "delayBetweenReuseDuration",
    "overTargetDurationPerHourPenaltyAmount",
    "targetDuration"
})
@Generated("jsonschema2pojo")
public class DomicileVehicleAvailabilityInformationType {

    /**
     * Number of vehicles in this pool for optimization;.
     * 
     */
    @JsonProperty("numberOfVehicles")
    @JsonPropertyDescription("Number of vehicles in this pool for optimization;.")
    private Integer numberOfVehicles;
    /**
     * The earliest date and time when the equipment becomes available for use at the domicile.
     * 
     */
    @JsonProperty("earliestAvailableStartDateTime")
    @JsonPropertyDescription("The earliest date and time when the equipment becomes available for use at the domicile.")
    private OffsetDateTime earliestAvailableStartDateTime;
    /**
     * The latest date and time by when, the equipment must start to be used.
     * 
     */
    @JsonProperty("latestAvailableStartDateTime")
    @JsonPropertyDescription("The latest date and time by when, the equipment must start to be used.")
    private OffsetDateTime latestAvailableStartDateTime;
    /**
     * The latest date and time by when, the utilization of equipment must end.
     * 
     */
    @JsonProperty("latestAvailableEndDateTime")
    @JsonPropertyDescription("The latest date and time by when, the utilization of equipment must end.")
    private OffsetDateTime latestAvailableEndDateTime;
    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumDuration")
    private TimeMeasurementType maximumDuration;
    /**
     * An indicator that determines whether penalty will be applied for constraint violation.
     * 
     */
    @JsonProperty("applyViolationPenalty")
    @JsonPropertyDescription("An indicator that determines whether penalty will be applied for constraint violation.")
    private Boolean applyViolationPenalty;
    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("violationPenaltyAmount")
    private AmountType violationPenaltyAmount;
    /**
     * An indicator that determines if the equipment can be reused on a second load or trip in the same optimization.
     * 
     */
    @JsonProperty("isReused")
    @JsonPropertyDescription("An indicator that determines if the equipment can be reused on a second load or trip in the same optimization.")
    private Boolean isReused;
    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("delayBetweenReuseDuration")
    private TimeMeasurementType delayBetweenReuseDuration;
    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("overTargetDurationPerHourPenaltyAmount")
    private AmountType overTargetDurationPerHourPenaltyAmount;
    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("targetDuration")
    private TimeMeasurementType targetDuration;

    /**
     * Number of vehicles in this pool for optimization;.
     * 
     */
    @JsonProperty("numberOfVehicles")
    public Integer getNumberOfVehicles() {
        return numberOfVehicles;
    }

    /**
     * Number of vehicles in this pool for optimization;.
     * 
     */
    @JsonProperty("numberOfVehicles")
    public void setNumberOfVehicles(Integer numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }

    public DomicileVehicleAvailabilityInformationType withNumberOfVehicles(Integer numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
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

    public DomicileVehicleAvailabilityInformationType withEarliestAvailableStartDateTime(OffsetDateTime earliestAvailableStartDateTime) {
        this.earliestAvailableStartDateTime = earliestAvailableStartDateTime;
        return this;
    }

    /**
     * The latest date and time by when, the equipment must start to be used.
     * 
     */
    @JsonProperty("latestAvailableStartDateTime")
    public OffsetDateTime getLatestAvailableStartDateTime() {
        return latestAvailableStartDateTime;
    }

    /**
     * The latest date and time by when, the equipment must start to be used.
     * 
     */
    @JsonProperty("latestAvailableStartDateTime")
    public void setLatestAvailableStartDateTime(OffsetDateTime latestAvailableStartDateTime) {
        this.latestAvailableStartDateTime = latestAvailableStartDateTime;
    }

    public DomicileVehicleAvailabilityInformationType withLatestAvailableStartDateTime(OffsetDateTime latestAvailableStartDateTime) {
        this.latestAvailableStartDateTime = latestAvailableStartDateTime;
        return this;
    }

    /**
     * The latest date and time by when, the utilization of equipment must end.
     * 
     */
    @JsonProperty("latestAvailableEndDateTime")
    public OffsetDateTime getLatestAvailableEndDateTime() {
        return latestAvailableEndDateTime;
    }

    /**
     * The latest date and time by when, the utilization of equipment must end.
     * 
     */
    @JsonProperty("latestAvailableEndDateTime")
    public void setLatestAvailableEndDateTime(OffsetDateTime latestAvailableEndDateTime) {
        this.latestAvailableEndDateTime = latestAvailableEndDateTime;
    }

    public DomicileVehicleAvailabilityInformationType withLatestAvailableEndDateTime(OffsetDateTime latestAvailableEndDateTime) {
        this.latestAvailableEndDateTime = latestAvailableEndDateTime;
        return this;
    }

    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumDuration")
    public TimeMeasurementType getMaximumDuration() {
        return maximumDuration;
    }

    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("maximumDuration")
    public void setMaximumDuration(TimeMeasurementType maximumDuration) {
        this.maximumDuration = maximumDuration;
    }

    public DomicileVehicleAvailabilityInformationType withMaximumDuration(TimeMeasurementType maximumDuration) {
        this.maximumDuration = maximumDuration;
        return this;
    }

    /**
     * An indicator that determines whether penalty will be applied for constraint violation.
     * 
     */
    @JsonProperty("applyViolationPenalty")
    public Boolean getApplyViolationPenalty() {
        return applyViolationPenalty;
    }

    /**
     * An indicator that determines whether penalty will be applied for constraint violation.
     * 
     */
    @JsonProperty("applyViolationPenalty")
    public void setApplyViolationPenalty(Boolean applyViolationPenalty) {
        this.applyViolationPenalty = applyViolationPenalty;
    }

    public DomicileVehicleAvailabilityInformationType withApplyViolationPenalty(Boolean applyViolationPenalty) {
        this.applyViolationPenalty = applyViolationPenalty;
        return this;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("violationPenaltyAmount")
    public AmountType getViolationPenaltyAmount() {
        return violationPenaltyAmount;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("violationPenaltyAmount")
    public void setViolationPenaltyAmount(AmountType violationPenaltyAmount) {
        this.violationPenaltyAmount = violationPenaltyAmount;
    }

    public DomicileVehicleAvailabilityInformationType withViolationPenaltyAmount(AmountType violationPenaltyAmount) {
        this.violationPenaltyAmount = violationPenaltyAmount;
        return this;
    }

    /**
     * An indicator that determines if the equipment can be reused on a second load or trip in the same optimization.
     * 
     */
    @JsonProperty("isReused")
    public Boolean getIsReused() {
        return isReused;
    }

    /**
     * An indicator that determines if the equipment can be reused on a second load or trip in the same optimization.
     * 
     */
    @JsonProperty("isReused")
    public void setIsReused(Boolean isReused) {
        this.isReused = isReused;
    }

    public DomicileVehicleAvailabilityInformationType withIsReused(Boolean isReused) {
        this.isReused = isReused;
        return this;
    }

    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("delayBetweenReuseDuration")
    public TimeMeasurementType getDelayBetweenReuseDuration() {
        return delayBetweenReuseDuration;
    }

    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("delayBetweenReuseDuration")
    public void setDelayBetweenReuseDuration(TimeMeasurementType delayBetweenReuseDuration) {
        this.delayBetweenReuseDuration = delayBetweenReuseDuration;
    }

    public DomicileVehicleAvailabilityInformationType withDelayBetweenReuseDuration(TimeMeasurementType delayBetweenReuseDuration) {
        this.delayBetweenReuseDuration = delayBetweenReuseDuration;
        return this;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("overTargetDurationPerHourPenaltyAmount")
    public AmountType getOverTargetDurationPerHourPenaltyAmount() {
        return overTargetDurationPerHourPenaltyAmount;
    }

    /**
     * AmountType
     * <p>
     * 
     * 
     */
    @JsonProperty("overTargetDurationPerHourPenaltyAmount")
    public void setOverTargetDurationPerHourPenaltyAmount(AmountType overTargetDurationPerHourPenaltyAmount) {
        this.overTargetDurationPerHourPenaltyAmount = overTargetDurationPerHourPenaltyAmount;
    }

    public DomicileVehicleAvailabilityInformationType withOverTargetDurationPerHourPenaltyAmount(AmountType overTargetDurationPerHourPenaltyAmount) {
        this.overTargetDurationPerHourPenaltyAmount = overTargetDurationPerHourPenaltyAmount;
        return this;
    }

    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("targetDuration")
    public TimeMeasurementType getTargetDuration() {
        return targetDuration;
    }

    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("targetDuration")
    public void setTargetDuration(TimeMeasurementType targetDuration) {
        this.targetDuration = targetDuration;
    }

    public DomicileVehicleAvailabilityInformationType withTargetDuration(TimeMeasurementType targetDuration) {
        this.targetDuration = targetDuration;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DomicileVehicleAvailabilityInformationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numberOfVehicles");
        sb.append('=');
        sb.append(((this.numberOfVehicles == null)?"<null>":this.numberOfVehicles));
        sb.append(',');
        sb.append("earliestAvailableStartDateTime");
        sb.append('=');
        sb.append(((this.earliestAvailableStartDateTime == null)?"<null>":this.earliestAvailableStartDateTime));
        sb.append(',');
        sb.append("latestAvailableStartDateTime");
        sb.append('=');
        sb.append(((this.latestAvailableStartDateTime == null)?"<null>":this.latestAvailableStartDateTime));
        sb.append(',');
        sb.append("latestAvailableEndDateTime");
        sb.append('=');
        sb.append(((this.latestAvailableEndDateTime == null)?"<null>":this.latestAvailableEndDateTime));
        sb.append(',');
        sb.append("maximumDuration");
        sb.append('=');
        sb.append(((this.maximumDuration == null)?"<null>":this.maximumDuration));
        sb.append(',');
        sb.append("applyViolationPenalty");
        sb.append('=');
        sb.append(((this.applyViolationPenalty == null)?"<null>":this.applyViolationPenalty));
        sb.append(',');
        sb.append("violationPenaltyAmount");
        sb.append('=');
        sb.append(((this.violationPenaltyAmount == null)?"<null>":this.violationPenaltyAmount));
        sb.append(',');
        sb.append("isReused");
        sb.append('=');
        sb.append(((this.isReused == null)?"<null>":this.isReused));
        sb.append(',');
        sb.append("delayBetweenReuseDuration");
        sb.append('=');
        sb.append(((this.delayBetweenReuseDuration == null)?"<null>":this.delayBetweenReuseDuration));
        sb.append(',');
        sb.append("overTargetDurationPerHourPenaltyAmount");
        sb.append('=');
        sb.append(((this.overTargetDurationPerHourPenaltyAmount == null)?"<null>":this.overTargetDurationPerHourPenaltyAmount));
        sb.append(',');
        sb.append("targetDuration");
        sb.append('=');
        sb.append(((this.targetDuration == null)?"<null>":this.targetDuration));
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
        result = ((result* 31)+((this.isReused == null)? 0 :this.isReused.hashCode()));
        result = ((result* 31)+((this.earliestAvailableStartDateTime == null)? 0 :this.earliestAvailableStartDateTime.hashCode()));
        result = ((result* 31)+((this.maximumDuration == null)? 0 :this.maximumDuration.hashCode()));
        result = ((result* 31)+((this.overTargetDurationPerHourPenaltyAmount == null)? 0 :this.overTargetDurationPerHourPenaltyAmount.hashCode()));
        result = ((result* 31)+((this.violationPenaltyAmount == null)? 0 :this.violationPenaltyAmount.hashCode()));
        result = ((result* 31)+((this.numberOfVehicles == null)? 0 :this.numberOfVehicles.hashCode()));
        result = ((result* 31)+((this.latestAvailableStartDateTime == null)? 0 :this.latestAvailableStartDateTime.hashCode()));
        result = ((result* 31)+((this.latestAvailableEndDateTime == null)? 0 :this.latestAvailableEndDateTime.hashCode()));
        result = ((result* 31)+((this.applyViolationPenalty == null)? 0 :this.applyViolationPenalty.hashCode()));
        result = ((result* 31)+((this.targetDuration == null)? 0 :this.targetDuration.hashCode()));
        result = ((result* 31)+((this.delayBetweenReuseDuration == null)? 0 :this.delayBetweenReuseDuration.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomicileVehicleAvailabilityInformationType) == false) {
            return false;
        }
        DomicileVehicleAvailabilityInformationType rhs = ((DomicileVehicleAvailabilityInformationType) other);
        return ((((((((((((this.isReused == rhs.isReused)||((this.isReused!= null)&&this.isReused.equals(rhs.isReused)))&&((this.earliestAvailableStartDateTime == rhs.earliestAvailableStartDateTime)||((this.earliestAvailableStartDateTime!= null)&&this.earliestAvailableStartDateTime.equals(rhs.earliestAvailableStartDateTime))))&&((this.maximumDuration == rhs.maximumDuration)||((this.maximumDuration!= null)&&this.maximumDuration.equals(rhs.maximumDuration))))&&((this.overTargetDurationPerHourPenaltyAmount == rhs.overTargetDurationPerHourPenaltyAmount)||((this.overTargetDurationPerHourPenaltyAmount!= null)&&this.overTargetDurationPerHourPenaltyAmount.equals(rhs.overTargetDurationPerHourPenaltyAmount))))&&((this.violationPenaltyAmount == rhs.violationPenaltyAmount)||((this.violationPenaltyAmount!= null)&&this.violationPenaltyAmount.equals(rhs.violationPenaltyAmount))))&&((this.numberOfVehicles == rhs.numberOfVehicles)||((this.numberOfVehicles!= null)&&this.numberOfVehicles.equals(rhs.numberOfVehicles))))&&((this.latestAvailableStartDateTime == rhs.latestAvailableStartDateTime)||((this.latestAvailableStartDateTime!= null)&&this.latestAvailableStartDateTime.equals(rhs.latestAvailableStartDateTime))))&&((this.latestAvailableEndDateTime == rhs.latestAvailableEndDateTime)||((this.latestAvailableEndDateTime!= null)&&this.latestAvailableEndDateTime.equals(rhs.latestAvailableEndDateTime))))&&((this.applyViolationPenalty == rhs.applyViolationPenalty)||((this.applyViolationPenalty!= null)&&this.applyViolationPenalty.equals(rhs.applyViolationPenalty))))&&((this.targetDuration == rhs.targetDuration)||((this.targetDuration!= null)&&this.targetDuration.equals(rhs.targetDuration))))&&((this.delayBetweenReuseDuration == rhs.delayBetweenReuseDuration)||((this.delayBetweenReuseDuration!= null)&&this.delayBetweenReuseDuration.equals(rhs.delayBetweenReuseDuration))));
    }

}
