
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RouteScheduleType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "routeId",
    "beginDay",
    "beginTime",
    "endDay",
    "endTime",
    "stopNumber"
})
@Generated("jsonschema2pojo")
public class RouteScheduleType {

    /**
     * The set of characters that uniquely references the transportation movement that is assigned to deliver goods to this store.
     * 
     */
    @JsonProperty("routeId")
    @JsonPropertyDescription("The set of characters that uniquely references the transportation movement that is assigned to deliver goods to this store.")
    private String routeId;
    /**
     * DayOfTheWeekEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("beginDay")
    private DayOfTheWeekEnumerationType beginDay;
    /**
     * The hour and minute of the begin day on which the route is scheduled to be dispatched and begin its delivery runs.
     * 
     */
    @JsonProperty("beginTime")
    @JsonPropertyDescription("The hour and minute of the begin day on which the route is scheduled to be dispatched and begin its delivery runs.")
    private String beginTime;
    /**
     * DayOfTheWeekEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("endDay")
    private DayOfTheWeekEnumerationType endDay;
    /**
     * The hour and minute of the end day on which the route is scheduled to complete its delivery runs.
     * 
     */
    @JsonProperty("endTime")
    @JsonPropertyDescription("The hour and minute of the end day on which the route is scheduled to complete its delivery runs.")
    private String endTime;
    /**
     * The numeric position in the route for this store to be delivered.
     * 
     */
    @JsonProperty("stopNumber")
    @JsonPropertyDescription("The numeric position in the route for this store to be delivered.")
    private Integer stopNumber;

    /**
     * The set of characters that uniquely references the transportation movement that is assigned to deliver goods to this store.
     * 
     */
    @JsonProperty("routeId")
    public String getRouteId() {
        return routeId;
    }

    /**
     * The set of characters that uniquely references the transportation movement that is assigned to deliver goods to this store.
     * 
     */
    @JsonProperty("routeId")
    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public RouteScheduleType withRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }

    /**
     * DayOfTheWeekEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("beginDay")
    public DayOfTheWeekEnumerationType getBeginDay() {
        return beginDay;
    }

    /**
     * DayOfTheWeekEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("beginDay")
    public void setBeginDay(DayOfTheWeekEnumerationType beginDay) {
        this.beginDay = beginDay;
    }

    public RouteScheduleType withBeginDay(DayOfTheWeekEnumerationType beginDay) {
        this.beginDay = beginDay;
        return this;
    }

    /**
     * The hour and minute of the begin day on which the route is scheduled to be dispatched and begin its delivery runs.
     * 
     */
    @JsonProperty("beginTime")
    public String getBeginTime() {
        return beginTime;
    }

    /**
     * The hour and minute of the begin day on which the route is scheduled to be dispatched and begin its delivery runs.
     * 
     */
    @JsonProperty("beginTime")
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public RouteScheduleType withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * DayOfTheWeekEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("endDay")
    public DayOfTheWeekEnumerationType getEndDay() {
        return endDay;
    }

    /**
     * DayOfTheWeekEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("endDay")
    public void setEndDay(DayOfTheWeekEnumerationType endDay) {
        this.endDay = endDay;
    }

    public RouteScheduleType withEndDay(DayOfTheWeekEnumerationType endDay) {
        this.endDay = endDay;
        return this;
    }

    /**
     * The hour and minute of the end day on which the route is scheduled to complete its delivery runs.
     * 
     */
    @JsonProperty("endTime")
    public String getEndTime() {
        return endTime;
    }

    /**
     * The hour and minute of the end day on which the route is scheduled to complete its delivery runs.
     * 
     */
    @JsonProperty("endTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public RouteScheduleType withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * The numeric position in the route for this store to be delivered.
     * 
     */
    @JsonProperty("stopNumber")
    public Integer getStopNumber() {
        return stopNumber;
    }

    /**
     * The numeric position in the route for this store to be delivered.
     * 
     */
    @JsonProperty("stopNumber")
    public void setStopNumber(Integer stopNumber) {
        this.stopNumber = stopNumber;
    }

    public RouteScheduleType withStopNumber(Integer stopNumber) {
        this.stopNumber = stopNumber;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RouteScheduleType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("routeId");
        sb.append('=');
        sb.append(((this.routeId == null)?"<null>":this.routeId));
        sb.append(',');
        sb.append("beginDay");
        sb.append('=');
        sb.append(((this.beginDay == null)?"<null>":this.beginDay));
        sb.append(',');
        sb.append("beginTime");
        sb.append('=');
        sb.append(((this.beginTime == null)?"<null>":this.beginTime));
        sb.append(',');
        sb.append("endDay");
        sb.append('=');
        sb.append(((this.endDay == null)?"<null>":this.endDay));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
        sb.append(',');
        sb.append("stopNumber");
        sb.append('=');
        sb.append(((this.stopNumber == null)?"<null>":this.stopNumber));
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
        result = ((result* 31)+((this.stopNumber == null)? 0 :this.stopNumber.hashCode()));
        result = ((result* 31)+((this.routeId == null)? 0 :this.routeId.hashCode()));
        result = ((result* 31)+((this.beginDay == null)? 0 :this.beginDay.hashCode()));
        result = ((result* 31)+((this.endDay == null)? 0 :this.endDay.hashCode()));
        result = ((result* 31)+((this.beginTime == null)? 0 :this.beginTime.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RouteScheduleType) == false) {
            return false;
        }
        RouteScheduleType rhs = ((RouteScheduleType) other);
        return (((((((this.stopNumber == rhs.stopNumber)||((this.stopNumber!= null)&&this.stopNumber.equals(rhs.stopNumber)))&&((this.routeId == rhs.routeId)||((this.routeId!= null)&&this.routeId.equals(rhs.routeId))))&&((this.beginDay == rhs.beginDay)||((this.beginDay!= null)&&this.beginDay.equals(rhs.beginDay))))&&((this.endDay == rhs.endDay)||((this.endDay!= null)&&this.endDay.equals(rhs.endDay))))&&((this.beginTime == rhs.beginTime)||((this.beginTime!= null)&&this.beginTime.equals(rhs.beginTime))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))));
    }

}
