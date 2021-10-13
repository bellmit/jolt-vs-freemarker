
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LogisticEventType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "logisticEventTypeCode",
    "logisticLocation",
    "logisticEventPeriod",
    "logisticEventDateTime"
})
@Generated("jsonschema2pojo")
public class LogisticEventType {

    /**
     * LogisticEventTypeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticEventTypeCode")
    private LogisticEventTypeCode logisticEventTypeCode;
    /**
     * LogisticLocationType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticLocation")
    private LogisticLocationType logisticLocation;
    /**
     * DateTimeRangeType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticEventPeriod")
    private DateTimeRangeType logisticEventPeriod;
    /**
     * DateOptionalTimeType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticEventDateTime")
    private DateOptionalTimeType logisticEventDateTime;

    /**
     * LogisticEventTypeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticEventTypeCode")
    public LogisticEventTypeCode getLogisticEventTypeCode() {
        return logisticEventTypeCode;
    }

    /**
     * LogisticEventTypeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticEventTypeCode")
    public void setLogisticEventTypeCode(LogisticEventTypeCode logisticEventTypeCode) {
        this.logisticEventTypeCode = logisticEventTypeCode;
    }

    public LogisticEventType withLogisticEventTypeCode(LogisticEventTypeCode logisticEventTypeCode) {
        this.logisticEventTypeCode = logisticEventTypeCode;
        return this;
    }

    /**
     * LogisticLocationType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticLocation")
    public LogisticLocationType getLogisticLocation() {
        return logisticLocation;
    }

    /**
     * LogisticLocationType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticLocation")
    public void setLogisticLocation(LogisticLocationType logisticLocation) {
        this.logisticLocation = logisticLocation;
    }

    public LogisticEventType withLogisticLocation(LogisticLocationType logisticLocation) {
        this.logisticLocation = logisticLocation;
        return this;
    }

    /**
     * DateTimeRangeType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticEventPeriod")
    public DateTimeRangeType getLogisticEventPeriod() {
        return logisticEventPeriod;
    }

    /**
     * DateTimeRangeType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticEventPeriod")
    public void setLogisticEventPeriod(DateTimeRangeType logisticEventPeriod) {
        this.logisticEventPeriod = logisticEventPeriod;
    }

    public LogisticEventType withLogisticEventPeriod(DateTimeRangeType logisticEventPeriod) {
        this.logisticEventPeriod = logisticEventPeriod;
        return this;
    }

    /**
     * DateOptionalTimeType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticEventDateTime")
    public DateOptionalTimeType getLogisticEventDateTime() {
        return logisticEventDateTime;
    }

    /**
     * DateOptionalTimeType
     * <p>
     * 
     * 
     */
    @JsonProperty("logisticEventDateTime")
    public void setLogisticEventDateTime(DateOptionalTimeType logisticEventDateTime) {
        this.logisticEventDateTime = logisticEventDateTime;
    }

    public LogisticEventType withLogisticEventDateTime(DateOptionalTimeType logisticEventDateTime) {
        this.logisticEventDateTime = logisticEventDateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LogisticEventType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("logisticEventTypeCode");
        sb.append('=');
        sb.append(((this.logisticEventTypeCode == null)?"<null>":this.logisticEventTypeCode));
        sb.append(',');
        sb.append("logisticLocation");
        sb.append('=');
        sb.append(((this.logisticLocation == null)?"<null>":this.logisticLocation));
        sb.append(',');
        sb.append("logisticEventPeriod");
        sb.append('=');
        sb.append(((this.logisticEventPeriod == null)?"<null>":this.logisticEventPeriod));
        sb.append(',');
        sb.append("logisticEventDateTime");
        sb.append('=');
        sb.append(((this.logisticEventDateTime == null)?"<null>":this.logisticEventDateTime));
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
        result = ((result* 31)+((this.logisticLocation == null)? 0 :this.logisticLocation.hashCode()));
        result = ((result* 31)+((this.logisticEventDateTime == null)? 0 :this.logisticEventDateTime.hashCode()));
        result = ((result* 31)+((this.logisticEventPeriod == null)? 0 :this.logisticEventPeriod.hashCode()));
        result = ((result* 31)+((this.logisticEventTypeCode == null)? 0 :this.logisticEventTypeCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LogisticEventType) == false) {
            return false;
        }
        LogisticEventType rhs = ((LogisticEventType) other);
        return (((((this.logisticLocation == rhs.logisticLocation)||((this.logisticLocation!= null)&&this.logisticLocation.equals(rhs.logisticLocation)))&&((this.logisticEventDateTime == rhs.logisticEventDateTime)||((this.logisticEventDateTime!= null)&&this.logisticEventDateTime.equals(rhs.logisticEventDateTime))))&&((this.logisticEventPeriod == rhs.logisticEventPeriod)||((this.logisticEventPeriod!= null)&&this.logisticEventPeriod.equals(rhs.logisticEventPeriod))))&&((this.logisticEventTypeCode == rhs.logisticEventTypeCode)||((this.logisticEventTypeCode!= null)&&this.logisticEventTypeCode.equals(rhs.logisticEventTypeCode))));
    }

}
