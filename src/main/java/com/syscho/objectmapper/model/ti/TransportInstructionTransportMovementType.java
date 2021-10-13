
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TransportInstructionTransportMovementType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sequenceNumber",
    "transportModeCode",
    "transportLoadId",
    "carrier",
    "plannedDeparture",
    "plannedArrival",
    "actionCode"
})
@Generated("jsonschema2pojo")
public class TransportInstructionTransportMovementType {

    /**
     * Unique number identifying the sequence of this transport movement with respect to the other specified movements.
     * (Required)
     * 
     */
    @JsonProperty("sequenceNumber")
    @JsonPropertyDescription("Unique number identifying the sequence of this transport movement with respect to the other specified movements.")
    private Integer sequenceNumber;
    /**
     * TransportModeCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportModeCode")
    private TransportModeCode transportModeCode;
    /**
     * Unique identifier of the standard route that will be used for this transport movement.
     * 
     */
    @JsonProperty("transportLoadId")
    @JsonPropertyDescription("Unique identifier of the standard route that will be used for this transport movement.")
    private String transportLoadId;
    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("carrier")
    private TransactionalPartyType carrier;
    /**
     * LogisticEventType
     * <p>
     * 
     * 
     */
    @JsonProperty("plannedDeparture")
    private LogisticEventType plannedDeparture;
    /**
     * LogisticEventType
     * <p>
     * 
     * 
     */
    @JsonProperty("plannedArrival")
    private LogisticEventType plannedArrival;
    /**
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("actionCode")
    private SegmentActionEnumerationType actionCode;

    /**
     * Unique number identifying the sequence of this transport movement with respect to the other specified movements.
     * (Required)
     * 
     */
    @JsonProperty("sequenceNumber")
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Unique number identifying the sequence of this transport movement with respect to the other specified movements.
     * (Required)
     * 
     */
    @JsonProperty("sequenceNumber")
    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public TransportInstructionTransportMovementType withSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * TransportModeCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportModeCode")
    public TransportModeCode getTransportModeCode() {
        return transportModeCode;
    }

    /**
     * TransportModeCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportModeCode")
    public void setTransportModeCode(TransportModeCode transportModeCode) {
        this.transportModeCode = transportModeCode;
    }

    public TransportInstructionTransportMovementType withTransportModeCode(TransportModeCode transportModeCode) {
        this.transportModeCode = transportModeCode;
        return this;
    }

    /**
     * Unique identifier of the standard route that will be used for this transport movement.
     * 
     */
    @JsonProperty("transportLoadId")
    public String getTransportLoadId() {
        return transportLoadId;
    }

    /**
     * Unique identifier of the standard route that will be used for this transport movement.
     * 
     */
    @JsonProperty("transportLoadId")
    public void setTransportLoadId(String transportLoadId) {
        this.transportLoadId = transportLoadId;
    }

    public TransportInstructionTransportMovementType withTransportLoadId(String transportLoadId) {
        this.transportLoadId = transportLoadId;
        return this;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("carrier")
    public TransactionalPartyType getCarrier() {
        return carrier;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * 
     */
    @JsonProperty("carrier")
    public void setCarrier(TransactionalPartyType carrier) {
        this.carrier = carrier;
    }

    public TransportInstructionTransportMovementType withCarrier(TransactionalPartyType carrier) {
        this.carrier = carrier;
        return this;
    }

    /**
     * LogisticEventType
     * <p>
     * 
     * 
     */
    @JsonProperty("plannedDeparture")
    public LogisticEventType getPlannedDeparture() {
        return plannedDeparture;
    }

    /**
     * LogisticEventType
     * <p>
     * 
     * 
     */
    @JsonProperty("plannedDeparture")
    public void setPlannedDeparture(LogisticEventType plannedDeparture) {
        this.plannedDeparture = plannedDeparture;
    }

    public TransportInstructionTransportMovementType withPlannedDeparture(LogisticEventType plannedDeparture) {
        this.plannedDeparture = plannedDeparture;
        return this;
    }

    /**
     * LogisticEventType
     * <p>
     * 
     * 
     */
    @JsonProperty("plannedArrival")
    public LogisticEventType getPlannedArrival() {
        return plannedArrival;
    }

    /**
     * LogisticEventType
     * <p>
     * 
     * 
     */
    @JsonProperty("plannedArrival")
    public void setPlannedArrival(LogisticEventType plannedArrival) {
        this.plannedArrival = plannedArrival;
    }

    public TransportInstructionTransportMovementType withPlannedArrival(LogisticEventType plannedArrival) {
        this.plannedArrival = plannedArrival;
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

    public TransportInstructionTransportMovementType withActionCode(SegmentActionEnumerationType actionCode) {
        this.actionCode = actionCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportInstructionTransportMovementType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sequenceNumber");
        sb.append('=');
        sb.append(((this.sequenceNumber == null)?"<null>":this.sequenceNumber));
        sb.append(',');
        sb.append("transportModeCode");
        sb.append('=');
        sb.append(((this.transportModeCode == null)?"<null>":this.transportModeCode));
        sb.append(',');
        sb.append("transportLoadId");
        sb.append('=');
        sb.append(((this.transportLoadId == null)?"<null>":this.transportLoadId));
        sb.append(',');
        sb.append("carrier");
        sb.append('=');
        sb.append(((this.carrier == null)?"<null>":this.carrier));
        sb.append(',');
        sb.append("plannedDeparture");
        sb.append('=');
        sb.append(((this.plannedDeparture == null)?"<null>":this.plannedDeparture));
        sb.append(',');
        sb.append("plannedArrival");
        sb.append('=');
        sb.append(((this.plannedArrival == null)?"<null>":this.plannedArrival));
        sb.append(',');
        sb.append("actionCode");
        sb.append('=');
        sb.append(((this.actionCode == null)?"<null>":this.actionCode));
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
        result = ((result* 31)+((this.sequenceNumber == null)? 0 :this.sequenceNumber.hashCode()));
        result = ((result* 31)+((this.carrier == null)? 0 :this.carrier.hashCode()));
        result = ((result* 31)+((this.plannedDeparture == null)? 0 :this.plannedDeparture.hashCode()));
        result = ((result* 31)+((this.plannedArrival == null)? 0 :this.plannedArrival.hashCode()));
        result = ((result* 31)+((this.transportModeCode == null)? 0 :this.transportModeCode.hashCode()));
        result = ((result* 31)+((this.actionCode == null)? 0 :this.actionCode.hashCode()));
        result = ((result* 31)+((this.transportLoadId == null)? 0 :this.transportLoadId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportInstructionTransportMovementType) == false) {
            return false;
        }
        TransportInstructionTransportMovementType rhs = ((TransportInstructionTransportMovementType) other);
        return ((((((((this.sequenceNumber == rhs.sequenceNumber)||((this.sequenceNumber!= null)&&this.sequenceNumber.equals(rhs.sequenceNumber)))&&((this.carrier == rhs.carrier)||((this.carrier!= null)&&this.carrier.equals(rhs.carrier))))&&((this.plannedDeparture == rhs.plannedDeparture)||((this.plannedDeparture!= null)&&this.plannedDeparture.equals(rhs.plannedDeparture))))&&((this.plannedArrival == rhs.plannedArrival)||((this.plannedArrival!= null)&&this.plannedArrival.equals(rhs.plannedArrival))))&&((this.transportModeCode == rhs.transportModeCode)||((this.transportModeCode!= null)&&this.transportModeCode.equals(rhs.transportModeCode))))&&((this.actionCode == rhs.actionCode)||((this.actionCode!= null)&&this.actionCode.equals(rhs.actionCode))))&&((this.transportLoadId == rhs.transportLoadId)||((this.transportLoadId!= null)&&this.transportLoadId.equals(rhs.transportLoadId))));
    }

}
