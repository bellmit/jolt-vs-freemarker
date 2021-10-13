
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DateTimeRangeType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "beginDate",
    "beginTime",
    "endDate",
    "endTime"
})
@Generated("jsonschema2pojo")
public class DateTimeRangeType {

    /**
     * Date specifying the first day for the date time range.
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Date specifying the first day for the date time range.")
    private String beginDate;
    /**
     * Time specifying the start time for the date time range.
     * 
     */
    @JsonProperty("beginTime")
    @JsonPropertyDescription("Time specifying the start time for the date time range.")
    private String beginTime;
    /**
     * Date specifying the last day for the date time range.
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Date specifying the last day for the date time range.")
    private String endDate;
    /**
     * Time specifying the end time for the date time range.
     * 
     */
    @JsonProperty("endTime")
    @JsonPropertyDescription("Time specifying the end time for the date time range.")
    private String endTime;

    /**
     * Date specifying the first day for the date time range.
     * 
     */
    @JsonProperty("beginDate")
    public String getBeginDate() {
        return beginDate;
    }

    /**
     * Date specifying the first day for the date time range.
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public DateTimeRangeType withBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * Time specifying the start time for the date time range.
     * 
     */
    @JsonProperty("beginTime")
    public String getBeginTime() {
        return beginTime;
    }

    /**
     * Time specifying the start time for the date time range.
     * 
     */
    @JsonProperty("beginTime")
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public DateTimeRangeType withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * Date specifying the last day for the date time range.
     * 
     */
    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    /**
     * Date specifying the last day for the date time range.
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public DateTimeRangeType withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Time specifying the end time for the date time range.
     * 
     */
    @JsonProperty("endTime")
    public String getEndTime() {
        return endTime;
    }

    /**
     * Time specifying the end time for the date time range.
     * 
     */
    @JsonProperty("endTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public DateTimeRangeType withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DateTimeRangeType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("beginTime");
        sb.append('=');
        sb.append(((this.beginTime == null)?"<null>":this.beginTime));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
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
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.beginTime == null)? 0 :this.beginTime.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DateTimeRangeType) == false) {
            return false;
        }
        DateTimeRangeType rhs = ((DateTimeRangeType) other);
        return (((((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate)))&&((this.beginTime == rhs.beginTime)||((this.beginTime!= null)&&this.beginTime.equals(rhs.beginTime))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))));
    }

}
