
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OperatingHoursType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dayOfTheWeekCode",
    "isOperational",
    "closingTime",
    "openingTime"
})
@Generated("jsonschema2pojo")
public class OperatingHoursType {

    /**
     * DayOfTheWeekEnumerationType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("dayOfTheWeekCode")
    private DayOfTheWeekEnumerationType dayOfTheWeekCode;
    /**
     * Indicator specifying whether or not the business or facility is operational on the specified day.
     * 
     * (Required)
     * 
     */
    @JsonProperty("isOperational")
    @JsonPropertyDescription("Indicator specifying whether or not the business or facility is operational on the specified day.\n")
    private Boolean isOperational;
    /**
     * Time at which the business or facility closes on the specified day.
     * 
     */
    @JsonProperty("closingTime")
    @JsonPropertyDescription("Time at which the business or facility closes on the specified day.")
    private String closingTime;
    /**
     * Time at which the business or facility opens on the specified day.
     * 
     */
    @JsonProperty("openingTime")
    @JsonPropertyDescription("Time at which the business or facility opens on the specified day.")
    private String openingTime;

    /**
     * DayOfTheWeekEnumerationType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("dayOfTheWeekCode")
    public DayOfTheWeekEnumerationType getDayOfTheWeekCode() {
        return dayOfTheWeekCode;
    }

    /**
     * DayOfTheWeekEnumerationType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("dayOfTheWeekCode")
    public void setDayOfTheWeekCode(DayOfTheWeekEnumerationType dayOfTheWeekCode) {
        this.dayOfTheWeekCode = dayOfTheWeekCode;
    }

    public OperatingHoursType withDayOfTheWeekCode(DayOfTheWeekEnumerationType dayOfTheWeekCode) {
        this.dayOfTheWeekCode = dayOfTheWeekCode;
        return this;
    }

    /**
     * Indicator specifying whether or not the business or facility is operational on the specified day.
     * 
     * (Required)
     * 
     */
    @JsonProperty("isOperational")
    public Boolean getIsOperational() {
        return isOperational;
    }

    /**
     * Indicator specifying whether or not the business or facility is operational on the specified day.
     * 
     * (Required)
     * 
     */
    @JsonProperty("isOperational")
    public void setIsOperational(Boolean isOperational) {
        this.isOperational = isOperational;
    }

    public OperatingHoursType withIsOperational(Boolean isOperational) {
        this.isOperational = isOperational;
        return this;
    }

    /**
     * Time at which the business or facility closes on the specified day.
     * 
     */
    @JsonProperty("closingTime")
    public String getClosingTime() {
        return closingTime;
    }

    /**
     * Time at which the business or facility closes on the specified day.
     * 
     */
    @JsonProperty("closingTime")
    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    public OperatingHoursType withClosingTime(String closingTime) {
        this.closingTime = closingTime;
        return this;
    }

    /**
     * Time at which the business or facility opens on the specified day.
     * 
     */
    @JsonProperty("openingTime")
    public String getOpeningTime() {
        return openingTime;
    }

    /**
     * Time at which the business or facility opens on the specified day.
     * 
     */
    @JsonProperty("openingTime")
    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public OperatingHoursType withOpeningTime(String openingTime) {
        this.openingTime = openingTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OperatingHoursType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dayOfTheWeekCode");
        sb.append('=');
        sb.append(((this.dayOfTheWeekCode == null)?"<null>":this.dayOfTheWeekCode));
        sb.append(',');
        sb.append("isOperational");
        sb.append('=');
        sb.append(((this.isOperational == null)?"<null>":this.isOperational));
        sb.append(',');
        sb.append("closingTime");
        sb.append('=');
        sb.append(((this.closingTime == null)?"<null>":this.closingTime));
        sb.append(',');
        sb.append("openingTime");
        sb.append('=');
        sb.append(((this.openingTime == null)?"<null>":this.openingTime));
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
        result = ((result* 31)+((this.closingTime == null)? 0 :this.closingTime.hashCode()));
        result = ((result* 31)+((this.dayOfTheWeekCode == null)? 0 :this.dayOfTheWeekCode.hashCode()));
        result = ((result* 31)+((this.isOperational == null)? 0 :this.isOperational.hashCode()));
        result = ((result* 31)+((this.openingTime == null)? 0 :this.openingTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OperatingHoursType) == false) {
            return false;
        }
        OperatingHoursType rhs = ((OperatingHoursType) other);
        return (((((this.closingTime == rhs.closingTime)||((this.closingTime!= null)&&this.closingTime.equals(rhs.closingTime)))&&((this.dayOfTheWeekCode == rhs.dayOfTheWeekCode)||((this.dayOfTheWeekCode!= null)&&this.dayOfTheWeekCode.equals(rhs.dayOfTheWeekCode))))&&((this.isOperational == rhs.isOperational)||((this.isOperational!= null)&&this.isOperational.equals(rhs.isOperational))))&&((this.openingTime == rhs.openingTime)||((this.openingTime!= null)&&this.openingTime.equals(rhs.openingTime))));
    }

}
