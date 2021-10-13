
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SpecialOperatingHoursType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isOperational",
    "specialDate",
    "closingTime",
    "openingTime",
    "specialDateName"
})
@Generated("jsonschema2pojo")
public class SpecialOperatingHoursType {

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
     * Date specifying the day to which the special operating hours apply.
     * 
     * (Required)
     * 
     */
    @JsonProperty("specialDate")
    @JsonPropertyDescription("Date specifying the day to which the special operating hours apply.\n")
    private String specialDate;
    /**
     * Time on which the business or facility will close on the specified day.
     * 
     * 
     */
    @JsonProperty("closingTime")
    @JsonPropertyDescription("Time on which the business or facility will close on the specified day.\n")
    private String closingTime;
    /**
     * Time on which the business or facility will open on the specified day.
     * 
     * 
     */
    @JsonProperty("openingTime")
    @JsonPropertyDescription("Time on which the business or facility will open on the specified day.\n")
    private String openingTime;
    /**
     * Description80Type
     * <p>
     * 
     * 
     */
    @JsonProperty("specialDateName")
    private Description80Type specialDateName;

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

    public SpecialOperatingHoursType withIsOperational(Boolean isOperational) {
        this.isOperational = isOperational;
        return this;
    }

    /**
     * Date specifying the day to which the special operating hours apply.
     * 
     * (Required)
     * 
     */
    @JsonProperty("specialDate")
    public String getSpecialDate() {
        return specialDate;
    }

    /**
     * Date specifying the day to which the special operating hours apply.
     * 
     * (Required)
     * 
     */
    @JsonProperty("specialDate")
    public void setSpecialDate(String specialDate) {
        this.specialDate = specialDate;
    }

    public SpecialOperatingHoursType withSpecialDate(String specialDate) {
        this.specialDate = specialDate;
        return this;
    }

    /**
     * Time on which the business or facility will close on the specified day.
     * 
     * 
     */
    @JsonProperty("closingTime")
    public String getClosingTime() {
        return closingTime;
    }

    /**
     * Time on which the business or facility will close on the specified day.
     * 
     * 
     */
    @JsonProperty("closingTime")
    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    public SpecialOperatingHoursType withClosingTime(String closingTime) {
        this.closingTime = closingTime;
        return this;
    }

    /**
     * Time on which the business or facility will open on the specified day.
     * 
     * 
     */
    @JsonProperty("openingTime")
    public String getOpeningTime() {
        return openingTime;
    }

    /**
     * Time on which the business or facility will open on the specified day.
     * 
     * 
     */
    @JsonProperty("openingTime")
    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public SpecialOperatingHoursType withOpeningTime(String openingTime) {
        this.openingTime = openingTime;
        return this;
    }

    /**
     * Description80Type
     * <p>
     * 
     * 
     */
    @JsonProperty("specialDateName")
    public Description80Type getSpecialDateName() {
        return specialDateName;
    }

    /**
     * Description80Type
     * <p>
     * 
     * 
     */
    @JsonProperty("specialDateName")
    public void setSpecialDateName(Description80Type specialDateName) {
        this.specialDateName = specialDateName;
    }

    public SpecialOperatingHoursType withSpecialDateName(Description80Type specialDateName) {
        this.specialDateName = specialDateName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SpecialOperatingHoursType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("isOperational");
        sb.append('=');
        sb.append(((this.isOperational == null)?"<null>":this.isOperational));
        sb.append(',');
        sb.append("specialDate");
        sb.append('=');
        sb.append(((this.specialDate == null)?"<null>":this.specialDate));
        sb.append(',');
        sb.append("closingTime");
        sb.append('=');
        sb.append(((this.closingTime == null)?"<null>":this.closingTime));
        sb.append(',');
        sb.append("openingTime");
        sb.append('=');
        sb.append(((this.openingTime == null)?"<null>":this.openingTime));
        sb.append(',');
        sb.append("specialDateName");
        sb.append('=');
        sb.append(((this.specialDateName == null)?"<null>":this.specialDateName));
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
        result = ((result* 31)+((this.specialDateName == null)? 0 :this.specialDateName.hashCode()));
        result = ((result* 31)+((this.closingTime == null)? 0 :this.closingTime.hashCode()));
        result = ((result* 31)+((this.isOperational == null)? 0 :this.isOperational.hashCode()));
        result = ((result* 31)+((this.specialDate == null)? 0 :this.specialDate.hashCode()));
        result = ((result* 31)+((this.openingTime == null)? 0 :this.openingTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpecialOperatingHoursType) == false) {
            return false;
        }
        SpecialOperatingHoursType rhs = ((SpecialOperatingHoursType) other);
        return ((((((this.specialDateName == rhs.specialDateName)||((this.specialDateName!= null)&&this.specialDateName.equals(rhs.specialDateName)))&&((this.closingTime == rhs.closingTime)||((this.closingTime!= null)&&this.closingTime.equals(rhs.closingTime))))&&((this.isOperational == rhs.isOperational)||((this.isOperational!= null)&&this.isOperational.equals(rhs.isOperational))))&&((this.specialDate == rhs.specialDate)||((this.specialDate!= null)&&this.specialDate.equals(rhs.specialDate))))&&((this.openingTime == rhs.openingTime)||((this.openingTime!= null)&&this.openingTime.equals(rhs.openingTime))));
    }

}
