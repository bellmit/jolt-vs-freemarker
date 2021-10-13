
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DateOptionalTimeType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "time"
})
@Generated("jsonschema2pojo")
public class DateOptionalTimeType {

    /**
     * The specification of a day as calendar date.
     * (Required)
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("The specification of a day as calendar date.")
    private String date;
    /**
     * The specification of a point in time during the day.
     * 
     */
    @JsonProperty("time")
    @JsonPropertyDescription("The specification of a point in time during the day.")
    private String time;

    /**
     * The specification of a day as calendar date.
     * (Required)
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * The specification of a day as calendar date.
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public DateOptionalTimeType withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * The specification of a point in time during the day.
     * 
     */
    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    /**
     * The specification of a point in time during the day.
     * 
     */
    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    public DateOptionalTimeType withTime(String time) {
        this.time = time;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DateOptionalTimeType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.time == null)? 0 :this.time.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DateOptionalTimeType) == false) {
            return false;
        }
        DateOptionalTimeType rhs = ((DateOptionalTimeType) other);
        return (((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.time == rhs.time)||((this.time!= null)&&this.time.equals(rhs.time))));
    }

}
