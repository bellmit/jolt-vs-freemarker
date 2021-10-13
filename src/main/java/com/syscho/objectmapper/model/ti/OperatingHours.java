
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OperatingHours
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "utcOffset",
    "regularOperatingHours",
    "specialOperatingHours",
    "daylightSavingsOffset",
    "timeZoneCode"
})
@Generated("jsonschema2pojo")
public class OperatingHours {

    /**
     * Numeric value specifying the time zone of the location as offset from the Coordinated Universal Time.
     * 
     */
    @JsonProperty("utcOffset")
    @JsonPropertyDescription("Numeric value specifying the time zone of the location as offset from the Coordinated Universal Time.")
    private Double utcOffset;
    /**
     * The period during which a business or facility is operational on a weekday. 
     * 
     * 
     */
    @JsonProperty("regularOperatingHours")
    @JsonPropertyDescription("The period during which a business or facility is operational on a weekday. \n")
    private List<OperatingHoursType> regularOperatingHours = new ArrayList<OperatingHoursType>();
    /**
     * The period during which a business or facility is operational on special days, such as holidays. 
     * 
     * 
     */
    @JsonProperty("specialOperatingHours")
    @JsonPropertyDescription("The period during which a business or facility is operational on special days, such as holidays. \n")
    private List<SpecialOperatingHoursType> specialOperatingHours = new ArrayList<SpecialOperatingHoursType>();
    /**
     * The number of hours offset from the default business hours due to daylight savings time. Usually calculated based on the address of the object the business hours are attached to.
     * 
     */
    @JsonProperty("daylightSavingsOffset")
    @JsonPropertyDescription("The number of hours offset from the default business hours due to daylight savings time. Usually calculated based on the address of the object the business hours are attached to.")
    private Double daylightSavingsOffset;
    /**
     * TimeZoneNameCode
     * <p>
     * 
     * 
     */
    @JsonProperty("timeZoneCode")
    private TimeZoneNameCode timeZoneCode;

    /**
     * Numeric value specifying the time zone of the location as offset from the Coordinated Universal Time.
     * 
     */
    @JsonProperty("utcOffset")
    public Double getUtcOffset() {
        return utcOffset;
    }

    /**
     * Numeric value specifying the time zone of the location as offset from the Coordinated Universal Time.
     * 
     */
    @JsonProperty("utcOffset")
    public void setUtcOffset(Double utcOffset) {
        this.utcOffset = utcOffset;
    }

    public OperatingHours withUtcOffset(Double utcOffset) {
        this.utcOffset = utcOffset;
        return this;
    }

    /**
     * The period during which a business or facility is operational on a weekday. 
     * 
     * 
     */
    @JsonProperty("regularOperatingHours")
    public List<OperatingHoursType> getRegularOperatingHours() {
        return regularOperatingHours;
    }

    /**
     * The period during which a business or facility is operational on a weekday. 
     * 
     * 
     */
    @JsonProperty("regularOperatingHours")
    public void setRegularOperatingHours(List<OperatingHoursType> regularOperatingHours) {
        this.regularOperatingHours = regularOperatingHours;
    }

    public OperatingHours withRegularOperatingHours(List<OperatingHoursType> regularOperatingHours) {
        this.regularOperatingHours = regularOperatingHours;
        return this;
    }

    /**
     * The period during which a business or facility is operational on special days, such as holidays. 
     * 
     * 
     */
    @JsonProperty("specialOperatingHours")
    public List<SpecialOperatingHoursType> getSpecialOperatingHours() {
        return specialOperatingHours;
    }

    /**
     * The period during which a business or facility is operational on special days, such as holidays. 
     * 
     * 
     */
    @JsonProperty("specialOperatingHours")
    public void setSpecialOperatingHours(List<SpecialOperatingHoursType> specialOperatingHours) {
        this.specialOperatingHours = specialOperatingHours;
    }

    public OperatingHours withSpecialOperatingHours(List<SpecialOperatingHoursType> specialOperatingHours) {
        this.specialOperatingHours = specialOperatingHours;
        return this;
    }

    /**
     * The number of hours offset from the default business hours due to daylight savings time. Usually calculated based on the address of the object the business hours are attached to.
     * 
     */
    @JsonProperty("daylightSavingsOffset")
    public Double getDaylightSavingsOffset() {
        return daylightSavingsOffset;
    }

    /**
     * The number of hours offset from the default business hours due to daylight savings time. Usually calculated based on the address of the object the business hours are attached to.
     * 
     */
    @JsonProperty("daylightSavingsOffset")
    public void setDaylightSavingsOffset(Double daylightSavingsOffset) {
        this.daylightSavingsOffset = daylightSavingsOffset;
    }

    public OperatingHours withDaylightSavingsOffset(Double daylightSavingsOffset) {
        this.daylightSavingsOffset = daylightSavingsOffset;
        return this;
    }

    /**
     * TimeZoneNameCode
     * <p>
     * 
     * 
     */
    @JsonProperty("timeZoneCode")
    public TimeZoneNameCode getTimeZoneCode() {
        return timeZoneCode;
    }

    /**
     * TimeZoneNameCode
     * <p>
     * 
     * 
     */
    @JsonProperty("timeZoneCode")
    public void setTimeZoneCode(TimeZoneNameCode timeZoneCode) {
        this.timeZoneCode = timeZoneCode;
    }

    public OperatingHours withTimeZoneCode(TimeZoneNameCode timeZoneCode) {
        this.timeZoneCode = timeZoneCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OperatingHours.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("utcOffset");
        sb.append('=');
        sb.append(((this.utcOffset == null)?"<null>":this.utcOffset));
        sb.append(',');
        sb.append("regularOperatingHours");
        sb.append('=');
        sb.append(((this.regularOperatingHours == null)?"<null>":this.regularOperatingHours));
        sb.append(',');
        sb.append("specialOperatingHours");
        sb.append('=');
        sb.append(((this.specialOperatingHours == null)?"<null>":this.specialOperatingHours));
        sb.append(',');
        sb.append("daylightSavingsOffset");
        sb.append('=');
        sb.append(((this.daylightSavingsOffset == null)?"<null>":this.daylightSavingsOffset));
        sb.append(',');
        sb.append("timeZoneCode");
        sb.append('=');
        sb.append(((this.timeZoneCode == null)?"<null>":this.timeZoneCode));
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
        result = ((result* 31)+((this.specialOperatingHours == null)? 0 :this.specialOperatingHours.hashCode()));
        result = ((result* 31)+((this.daylightSavingsOffset == null)? 0 :this.daylightSavingsOffset.hashCode()));
        result = ((result* 31)+((this.regularOperatingHours == null)? 0 :this.regularOperatingHours.hashCode()));
        result = ((result* 31)+((this.utcOffset == null)? 0 :this.utcOffset.hashCode()));
        result = ((result* 31)+((this.timeZoneCode == null)? 0 :this.timeZoneCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OperatingHours) == false) {
            return false;
        }
        OperatingHours rhs = ((OperatingHours) other);
        return ((((((this.specialOperatingHours == rhs.specialOperatingHours)||((this.specialOperatingHours!= null)&&this.specialOperatingHours.equals(rhs.specialOperatingHours)))&&((this.daylightSavingsOffset == rhs.daylightSavingsOffset)||((this.daylightSavingsOffset!= null)&&this.daylightSavingsOffset.equals(rhs.daylightSavingsOffset))))&&((this.regularOperatingHours == rhs.regularOperatingHours)||((this.regularOperatingHours!= null)&&this.regularOperatingHours.equals(rhs.regularOperatingHours))))&&((this.utcOffset == rhs.utcOffset)||((this.utcOffset!= null)&&this.utcOffset.equals(rhs.utcOffset))))&&((this.timeZoneCode == rhs.timeZoneCode)||((this.timeZoneCode!= null)&&this.timeZoneCode.equals(rhs.timeZoneCode))));
    }

}
