
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TransportLoadStopType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "stopSequenceNumber",
    "stopId",
    "stopLocation",
    "stopLocationType",
    "stopLogisticEvent",
    "pickupTotal",
    "dropoffTotal",
    "distanceFromPreviousStop",
    "transitTimeFromPreviousStop",
    "transportReference",
    "tmReferenceNumber",
    "pickupShipmentReference",
    "pickupShipmentCount",
    "pickupShipmentLegId",
    "dropoffShipmentReference",
    "dropoffShipmentCount",
    "dropoffShipmentLegId",
    "extensions",
    "avpList",
    "actionCode"
})
@Generated("jsonschema2pojo")
public class TransportLoadStopType {

    /**
     * The position of the stop within the sequence of stops of the load.
     * (Required)
     * 
     */
    @JsonProperty("stopSequenceNumber")
    @JsonPropertyDescription("The position of the stop within the sequence of stops of the load.")
    private Integer stopSequenceNumber;
    /**
     * The set of characters by which a specific stop is uniquely known and referenced by interested applications.
     * 
     */
    @JsonProperty("stopId")
    @JsonPropertyDescription("The set of characters by which a specific stop is uniquely known and referenced by interested applications.")
    private String stopId;
    /**
     * TransportLoadLogisticLocationType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("stopLocation")
    private TransportLoadLogisticLocationType stopLocation;
    /**
     * PartyRoleCode
     * <p>
     * 
     * 
     */
    @JsonProperty("stopLocationType")
    private PartyRoleCode stopLocationType;
    /**
     * Provides the difference or interval between the begin date/time and end date/time.
     * (Required)
     * 
     */
    @JsonProperty("stopLogisticEvent")
    @JsonPropertyDescription("Provides the difference or interval between the begin date/time and end date/time.")
    private List<LogisticEventType> stopLogisticEvent = new ArrayList<LogisticEventType>();
    /**
     * Details about the stop (PickedWeight, CountOfShipmentsPickedAtStop, etc.
     * 
     */
    @JsonProperty("pickupTotal")
    @JsonPropertyDescription("Details about the stop (PickedWeight, CountOfShipmentsPickedAtStop, etc.")
    private List<UnitMeasurementType> pickupTotal = new ArrayList<UnitMeasurementType>();
    /**
     * Details about the stop (DroppedWeight, DroppedVolume, etc.
     * 
     */
    @JsonProperty("dropoffTotal")
    @JsonPropertyDescription("Details about the stop (DroppedWeight, DroppedVolume, etc.")
    private List<UnitMeasurementType> dropoffTotal = new ArrayList<UnitMeasurementType>();
    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("distanceFromPreviousStop")
    private QuantityType distanceFromPreviousStop;
    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("transitTimeFromPreviousStop")
    private TimeMeasurementType transitTimeFromPreviousStop;
    /**
     * Reference to associated information in support of related business processes.
     * 
     */
    @JsonProperty("transportReference")
    @JsonPropertyDescription("Reference to associated information in support of related business processes.")
    private List<TransportReferenceType> transportReference = new ArrayList<TransportReferenceType>();
    /**
     * Used to hold TM reference fields.
     * 
     */
    @JsonProperty("tmReferenceNumber")
    @JsonPropertyDescription("Used to hold TM reference fields.")
    private List<TransportManagementReferenceNumberType> tmReferenceNumber = new ArrayList<TransportManagementReferenceNumberType>();
    /**
     * Information used to identify a shipment.
     * 
     */
    @JsonProperty("pickupShipmentReference")
    @JsonPropertyDescription("Information used to identify a shipment.")
    private List<ShipmentIdentificationType> pickupShipmentReference = new ArrayList<ShipmentIdentificationType>();
    /**
     * The total number of Shipments being picked up at this stop.
     * 
     */
    @JsonProperty("pickupShipmentCount")
    @JsonPropertyDescription("The total number of Shipments being picked up at this stop.")
    private Integer pickupShipmentCount;
    /**
     * The sets of characters that uniquely identify the specific Shipment Legs originating at this stop.
     * 
     */
    @JsonProperty("pickupShipmentLegId")
    @JsonPropertyDescription("The sets of characters that uniquely identify the specific Shipment Legs originating at this stop.")
    private List<String> pickupShipmentLegId = new ArrayList<String>();
    /**
     * Information used to identify a shipment.
     * 
     */
    @JsonProperty("dropoffShipmentReference")
    @JsonPropertyDescription("Information used to identify a shipment.")
    private List<ShipmentIdentificationType> dropoffShipmentReference = new ArrayList<ShipmentIdentificationType>();
    /**
     * The total number of Shipments being dropped off at this stop.
     * 
     */
    @JsonProperty("dropoffShipmentCount")
    @JsonPropertyDescription("The total number of Shipments being dropped off at this stop.")
    private Integer dropoffShipmentCount;
    /**
     * The sets of characters that uniquely identify the specific Shipment Legs terminating at this stop.
     * 
     */
    @JsonProperty("dropoffShipmentLegId")
    @JsonPropertyDescription("The sets of characters that uniquely identify the specific Shipment Legs terminating at this stop.")
    private List<String> dropoffShipmentLegId = new ArrayList<String>();
    /**
     * NoCustomExtensionsType
     * <p>
     * 
     * 
     */
    @JsonProperty("extensions")
    private NoCustomExtensionsType extensions;
    /**
     * Deprecated, use 'extensions' instead. The placeholder for non-standard data.
     * 
     */
    @JsonProperty("avpList")
    @JsonPropertyDescription("Deprecated, use 'extensions' instead. The placeholder for non-standard data.")
    private List<EcomStringAttributeValuePairListType> avpList = new ArrayList<EcomStringAttributeValuePairListType>();
    /**
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("actionCode")
    private SegmentActionEnumerationType actionCode;

    /**
     * The position of the stop within the sequence of stops of the load.
     * (Required)
     * 
     */
    @JsonProperty("stopSequenceNumber")
    public Integer getStopSequenceNumber() {
        return stopSequenceNumber;
    }

    /**
     * The position of the stop within the sequence of stops of the load.
     * (Required)
     * 
     */
    @JsonProperty("stopSequenceNumber")
    public void setStopSequenceNumber(Integer stopSequenceNumber) {
        this.stopSequenceNumber = stopSequenceNumber;
    }

    public TransportLoadStopType withStopSequenceNumber(Integer stopSequenceNumber) {
        this.stopSequenceNumber = stopSequenceNumber;
        return this;
    }

    /**
     * The set of characters by which a specific stop is uniquely known and referenced by interested applications.
     * 
     */
    @JsonProperty("stopId")
    public String getStopId() {
        return stopId;
    }

    /**
     * The set of characters by which a specific stop is uniquely known and referenced by interested applications.
     * 
     */
    @JsonProperty("stopId")
    public void setStopId(String stopId) {
        this.stopId = stopId;
    }

    public TransportLoadStopType withStopId(String stopId) {
        this.stopId = stopId;
        return this;
    }

    /**
     * TransportLoadLogisticLocationType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("stopLocation")
    public TransportLoadLogisticLocationType getStopLocation() {
        return stopLocation;
    }

    /**
     * TransportLoadLogisticLocationType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("stopLocation")
    public void setStopLocation(TransportLoadLogisticLocationType stopLocation) {
        this.stopLocation = stopLocation;
    }

    public TransportLoadStopType withStopLocation(TransportLoadLogisticLocationType stopLocation) {
        this.stopLocation = stopLocation;
        return this;
    }

    /**
     * PartyRoleCode
     * <p>
     * 
     * 
     */
    @JsonProperty("stopLocationType")
    public PartyRoleCode getStopLocationType() {
        return stopLocationType;
    }

    /**
     * PartyRoleCode
     * <p>
     * 
     * 
     */
    @JsonProperty("stopLocationType")
    public void setStopLocationType(PartyRoleCode stopLocationType) {
        this.stopLocationType = stopLocationType;
    }

    public TransportLoadStopType withStopLocationType(PartyRoleCode stopLocationType) {
        this.stopLocationType = stopLocationType;
        return this;
    }

    /**
     * Provides the difference or interval between the begin date/time and end date/time.
     * (Required)
     * 
     */
    @JsonProperty("stopLogisticEvent")
    public List<LogisticEventType> getStopLogisticEvent() {
        return stopLogisticEvent;
    }

    /**
     * Provides the difference or interval between the begin date/time and end date/time.
     * (Required)
     * 
     */
    @JsonProperty("stopLogisticEvent")
    public void setStopLogisticEvent(List<LogisticEventType> stopLogisticEvent) {
        this.stopLogisticEvent = stopLogisticEvent;
    }

    public TransportLoadStopType withStopLogisticEvent(List<LogisticEventType> stopLogisticEvent) {
        this.stopLogisticEvent = stopLogisticEvent;
        return this;
    }

    /**
     * Details about the stop (PickedWeight, CountOfShipmentsPickedAtStop, etc.
     * 
     */
    @JsonProperty("pickupTotal")
    public List<UnitMeasurementType> getPickupTotal() {
        return pickupTotal;
    }

    /**
     * Details about the stop (PickedWeight, CountOfShipmentsPickedAtStop, etc.
     * 
     */
    @JsonProperty("pickupTotal")
    public void setPickupTotal(List<UnitMeasurementType> pickupTotal) {
        this.pickupTotal = pickupTotal;
    }

    public TransportLoadStopType withPickupTotal(List<UnitMeasurementType> pickupTotal) {
        this.pickupTotal = pickupTotal;
        return this;
    }

    /**
     * Details about the stop (DroppedWeight, DroppedVolume, etc.
     * 
     */
    @JsonProperty("dropoffTotal")
    public List<UnitMeasurementType> getDropoffTotal() {
        return dropoffTotal;
    }

    /**
     * Details about the stop (DroppedWeight, DroppedVolume, etc.
     * 
     */
    @JsonProperty("dropoffTotal")
    public void setDropoffTotal(List<UnitMeasurementType> dropoffTotal) {
        this.dropoffTotal = dropoffTotal;
    }

    public TransportLoadStopType withDropoffTotal(List<UnitMeasurementType> dropoffTotal) {
        this.dropoffTotal = dropoffTotal;
        return this;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("distanceFromPreviousStop")
    public QuantityType getDistanceFromPreviousStop() {
        return distanceFromPreviousStop;
    }

    /**
     * QuantityType
     * <p>
     * 
     * 
     */
    @JsonProperty("distanceFromPreviousStop")
    public void setDistanceFromPreviousStop(QuantityType distanceFromPreviousStop) {
        this.distanceFromPreviousStop = distanceFromPreviousStop;
    }

    public TransportLoadStopType withDistanceFromPreviousStop(QuantityType distanceFromPreviousStop) {
        this.distanceFromPreviousStop = distanceFromPreviousStop;
        return this;
    }

    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("transitTimeFromPreviousStop")
    public TimeMeasurementType getTransitTimeFromPreviousStop() {
        return transitTimeFromPreviousStop;
    }

    /**
     * TimeMeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("transitTimeFromPreviousStop")
    public void setTransitTimeFromPreviousStop(TimeMeasurementType transitTimeFromPreviousStop) {
        this.transitTimeFromPreviousStop = transitTimeFromPreviousStop;
    }

    public TransportLoadStopType withTransitTimeFromPreviousStop(TimeMeasurementType transitTimeFromPreviousStop) {
        this.transitTimeFromPreviousStop = transitTimeFromPreviousStop;
        return this;
    }

    /**
     * Reference to associated information in support of related business processes.
     * 
     */
    @JsonProperty("transportReference")
    public List<TransportReferenceType> getTransportReference() {
        return transportReference;
    }

    /**
     * Reference to associated information in support of related business processes.
     * 
     */
    @JsonProperty("transportReference")
    public void setTransportReference(List<TransportReferenceType> transportReference) {
        this.transportReference = transportReference;
    }

    public TransportLoadStopType withTransportReference(List<TransportReferenceType> transportReference) {
        this.transportReference = transportReference;
        return this;
    }

    /**
     * Used to hold TM reference fields.
     * 
     */
    @JsonProperty("tmReferenceNumber")
    public List<TransportManagementReferenceNumberType> getTmReferenceNumber() {
        return tmReferenceNumber;
    }

    /**
     * Used to hold TM reference fields.
     * 
     */
    @JsonProperty("tmReferenceNumber")
    public void setTmReferenceNumber(List<TransportManagementReferenceNumberType> tmReferenceNumber) {
        this.tmReferenceNumber = tmReferenceNumber;
    }

    public TransportLoadStopType withTmReferenceNumber(List<TransportManagementReferenceNumberType> tmReferenceNumber) {
        this.tmReferenceNumber = tmReferenceNumber;
        return this;
    }

    /**
     * Information used to identify a shipment.
     * 
     */
    @JsonProperty("pickupShipmentReference")
    public List<ShipmentIdentificationType> getPickupShipmentReference() {
        return pickupShipmentReference;
    }

    /**
     * Information used to identify a shipment.
     * 
     */
    @JsonProperty("pickupShipmentReference")
    public void setPickupShipmentReference(List<ShipmentIdentificationType> pickupShipmentReference) {
        this.pickupShipmentReference = pickupShipmentReference;
    }

    public TransportLoadStopType withPickupShipmentReference(List<ShipmentIdentificationType> pickupShipmentReference) {
        this.pickupShipmentReference = pickupShipmentReference;
        return this;
    }

    /**
     * The total number of Shipments being picked up at this stop.
     * 
     */
    @JsonProperty("pickupShipmentCount")
    public Integer getPickupShipmentCount() {
        return pickupShipmentCount;
    }

    /**
     * The total number of Shipments being picked up at this stop.
     * 
     */
    @JsonProperty("pickupShipmentCount")
    public void setPickupShipmentCount(Integer pickupShipmentCount) {
        this.pickupShipmentCount = pickupShipmentCount;
    }

    public TransportLoadStopType withPickupShipmentCount(Integer pickupShipmentCount) {
        this.pickupShipmentCount = pickupShipmentCount;
        return this;
    }

    /**
     * The sets of characters that uniquely identify the specific Shipment Legs originating at this stop.
     * 
     */
    @JsonProperty("pickupShipmentLegId")
    public List<String> getPickupShipmentLegId() {
        return pickupShipmentLegId;
    }

    /**
     * The sets of characters that uniquely identify the specific Shipment Legs originating at this stop.
     * 
     */
    @JsonProperty("pickupShipmentLegId")
    public void setPickupShipmentLegId(List<String> pickupShipmentLegId) {
        this.pickupShipmentLegId = pickupShipmentLegId;
    }

    public TransportLoadStopType withPickupShipmentLegId(List<String> pickupShipmentLegId) {
        this.pickupShipmentLegId = pickupShipmentLegId;
        return this;
    }

    /**
     * Information used to identify a shipment.
     * 
     */
    @JsonProperty("dropoffShipmentReference")
    public List<ShipmentIdentificationType> getDropoffShipmentReference() {
        return dropoffShipmentReference;
    }

    /**
     * Information used to identify a shipment.
     * 
     */
    @JsonProperty("dropoffShipmentReference")
    public void setDropoffShipmentReference(List<ShipmentIdentificationType> dropoffShipmentReference) {
        this.dropoffShipmentReference = dropoffShipmentReference;
    }

    public TransportLoadStopType withDropoffShipmentReference(List<ShipmentIdentificationType> dropoffShipmentReference) {
        this.dropoffShipmentReference = dropoffShipmentReference;
        return this;
    }

    /**
     * The total number of Shipments being dropped off at this stop.
     * 
     */
    @JsonProperty("dropoffShipmentCount")
    public Integer getDropoffShipmentCount() {
        return dropoffShipmentCount;
    }

    /**
     * The total number of Shipments being dropped off at this stop.
     * 
     */
    @JsonProperty("dropoffShipmentCount")
    public void setDropoffShipmentCount(Integer dropoffShipmentCount) {
        this.dropoffShipmentCount = dropoffShipmentCount;
    }

    public TransportLoadStopType withDropoffShipmentCount(Integer dropoffShipmentCount) {
        this.dropoffShipmentCount = dropoffShipmentCount;
        return this;
    }

    /**
     * The sets of characters that uniquely identify the specific Shipment Legs terminating at this stop.
     * 
     */
    @JsonProperty("dropoffShipmentLegId")
    public List<String> getDropoffShipmentLegId() {
        return dropoffShipmentLegId;
    }

    /**
     * The sets of characters that uniquely identify the specific Shipment Legs terminating at this stop.
     * 
     */
    @JsonProperty("dropoffShipmentLegId")
    public void setDropoffShipmentLegId(List<String> dropoffShipmentLegId) {
        this.dropoffShipmentLegId = dropoffShipmentLegId;
    }

    public TransportLoadStopType withDropoffShipmentLegId(List<String> dropoffShipmentLegId) {
        this.dropoffShipmentLegId = dropoffShipmentLegId;
        return this;
    }

    /**
     * NoCustomExtensionsType
     * <p>
     * 
     * 
     */
    @JsonProperty("extensions")
    public NoCustomExtensionsType getExtensions() {
        return extensions;
    }

    /**
     * NoCustomExtensionsType
     * <p>
     * 
     * 
     */
    @JsonProperty("extensions")
    public void setExtensions(NoCustomExtensionsType extensions) {
        this.extensions = extensions;
    }

    public TransportLoadStopType withExtensions(NoCustomExtensionsType extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Deprecated, use 'extensions' instead. The placeholder for non-standard data.
     * 
     */
    @JsonProperty("avpList")
    public List<EcomStringAttributeValuePairListType> getAvpList() {
        return avpList;
    }

    /**
     * Deprecated, use 'extensions' instead. The placeholder for non-standard data.
     * 
     */
    @JsonProperty("avpList")
    public void setAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
    }

    public TransportLoadStopType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
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

    public TransportLoadStopType withActionCode(SegmentActionEnumerationType actionCode) {
        this.actionCode = actionCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportLoadStopType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stopSequenceNumber");
        sb.append('=');
        sb.append(((this.stopSequenceNumber == null)?"<null>":this.stopSequenceNumber));
        sb.append(',');
        sb.append("stopId");
        sb.append('=');
        sb.append(((this.stopId == null)?"<null>":this.stopId));
        sb.append(',');
        sb.append("stopLocation");
        sb.append('=');
        sb.append(((this.stopLocation == null)?"<null>":this.stopLocation));
        sb.append(',');
        sb.append("stopLocationType");
        sb.append('=');
        sb.append(((this.stopLocationType == null)?"<null>":this.stopLocationType));
        sb.append(',');
        sb.append("stopLogisticEvent");
        sb.append('=');
        sb.append(((this.stopLogisticEvent == null)?"<null>":this.stopLogisticEvent));
        sb.append(',');
        sb.append("pickupTotal");
        sb.append('=');
        sb.append(((this.pickupTotal == null)?"<null>":this.pickupTotal));
        sb.append(',');
        sb.append("dropoffTotal");
        sb.append('=');
        sb.append(((this.dropoffTotal == null)?"<null>":this.dropoffTotal));
        sb.append(',');
        sb.append("distanceFromPreviousStop");
        sb.append('=');
        sb.append(((this.distanceFromPreviousStop == null)?"<null>":this.distanceFromPreviousStop));
        sb.append(',');
        sb.append("transitTimeFromPreviousStop");
        sb.append('=');
        sb.append(((this.transitTimeFromPreviousStop == null)?"<null>":this.transitTimeFromPreviousStop));
        sb.append(',');
        sb.append("transportReference");
        sb.append('=');
        sb.append(((this.transportReference == null)?"<null>":this.transportReference));
        sb.append(',');
        sb.append("tmReferenceNumber");
        sb.append('=');
        sb.append(((this.tmReferenceNumber == null)?"<null>":this.tmReferenceNumber));
        sb.append(',');
        sb.append("pickupShipmentReference");
        sb.append('=');
        sb.append(((this.pickupShipmentReference == null)?"<null>":this.pickupShipmentReference));
        sb.append(',');
        sb.append("pickupShipmentCount");
        sb.append('=');
        sb.append(((this.pickupShipmentCount == null)?"<null>":this.pickupShipmentCount));
        sb.append(',');
        sb.append("pickupShipmentLegId");
        sb.append('=');
        sb.append(((this.pickupShipmentLegId == null)?"<null>":this.pickupShipmentLegId));
        sb.append(',');
        sb.append("dropoffShipmentReference");
        sb.append('=');
        sb.append(((this.dropoffShipmentReference == null)?"<null>":this.dropoffShipmentReference));
        sb.append(',');
        sb.append("dropoffShipmentCount");
        sb.append('=');
        sb.append(((this.dropoffShipmentCount == null)?"<null>":this.dropoffShipmentCount));
        sb.append(',');
        sb.append("dropoffShipmentLegId");
        sb.append('=');
        sb.append(((this.dropoffShipmentLegId == null)?"<null>":this.dropoffShipmentLegId));
        sb.append(',');
        sb.append("extensions");
        sb.append('=');
        sb.append(((this.extensions == null)?"<null>":this.extensions));
        sb.append(',');
        sb.append("avpList");
        sb.append('=');
        sb.append(((this.avpList == null)?"<null>":this.avpList));
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
        result = ((result* 31)+((this.dropoffTotal == null)? 0 :this.dropoffTotal.hashCode()));
        result = ((result* 31)+((this.pickupTotal == null)? 0 :this.pickupTotal.hashCode()));
        result = ((result* 31)+((this.stopId == null)? 0 :this.stopId.hashCode()));
        result = ((result* 31)+((this.pickupShipmentReference == null)? 0 :this.pickupShipmentReference.hashCode()));
        result = ((result* 31)+((this.transitTimeFromPreviousStop == null)? 0 :this.transitTimeFromPreviousStop.hashCode()));
        result = ((result* 31)+((this.dropoffShipmentReference == null)? 0 :this.dropoffShipmentReference.hashCode()));
        result = ((result* 31)+((this.dropoffShipmentLegId == null)? 0 :this.dropoffShipmentLegId.hashCode()));
        result = ((result* 31)+((this.transportReference == null)? 0 :this.transportReference.hashCode()));
        result = ((result* 31)+((this.stopLogisticEvent == null)? 0 :this.stopLogisticEvent.hashCode()));
        result = ((result* 31)+((this.pickupShipmentCount == null)? 0 :this.pickupShipmentCount.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.stopLocationType == null)? 0 :this.stopLocationType.hashCode()));
        result = ((result* 31)+((this.distanceFromPreviousStop == null)? 0 :this.distanceFromPreviousStop.hashCode()));
        result = ((result* 31)+((this.dropoffShipmentCount == null)? 0 :this.dropoffShipmentCount.hashCode()));
        result = ((result* 31)+((this.pickupShipmentLegId == null)? 0 :this.pickupShipmentLegId.hashCode()));
        result = ((result* 31)+((this.stopLocation == null)? 0 :this.stopLocation.hashCode()));
        result = ((result* 31)+((this.actionCode == null)? 0 :this.actionCode.hashCode()));
        result = ((result* 31)+((this.tmReferenceNumber == null)? 0 :this.tmReferenceNumber.hashCode()));
        result = ((result* 31)+((this.stopSequenceNumber == null)? 0 :this.stopSequenceNumber.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportLoadStopType) == false) {
            return false;
        }
        TransportLoadStopType rhs = ((TransportLoadStopType) other);
        return (((((((((((((((((((((this.dropoffTotal == rhs.dropoffTotal)||((this.dropoffTotal!= null)&&this.dropoffTotal.equals(rhs.dropoffTotal)))&&((this.pickupTotal == rhs.pickupTotal)||((this.pickupTotal!= null)&&this.pickupTotal.equals(rhs.pickupTotal))))&&((this.stopId == rhs.stopId)||((this.stopId!= null)&&this.stopId.equals(rhs.stopId))))&&((this.pickupShipmentReference == rhs.pickupShipmentReference)||((this.pickupShipmentReference!= null)&&this.pickupShipmentReference.equals(rhs.pickupShipmentReference))))&&((this.transitTimeFromPreviousStop == rhs.transitTimeFromPreviousStop)||((this.transitTimeFromPreviousStop!= null)&&this.transitTimeFromPreviousStop.equals(rhs.transitTimeFromPreviousStop))))&&((this.dropoffShipmentReference == rhs.dropoffShipmentReference)||((this.dropoffShipmentReference!= null)&&this.dropoffShipmentReference.equals(rhs.dropoffShipmentReference))))&&((this.dropoffShipmentLegId == rhs.dropoffShipmentLegId)||((this.dropoffShipmentLegId!= null)&&this.dropoffShipmentLegId.equals(rhs.dropoffShipmentLegId))))&&((this.transportReference == rhs.transportReference)||((this.transportReference!= null)&&this.transportReference.equals(rhs.transportReference))))&&((this.stopLogisticEvent == rhs.stopLogisticEvent)||((this.stopLogisticEvent!= null)&&this.stopLogisticEvent.equals(rhs.stopLogisticEvent))))&&((this.pickupShipmentCount == rhs.pickupShipmentCount)||((this.pickupShipmentCount!= null)&&this.pickupShipmentCount.equals(rhs.pickupShipmentCount))))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.stopLocationType == rhs.stopLocationType)||((this.stopLocationType!= null)&&this.stopLocationType.equals(rhs.stopLocationType))))&&((this.distanceFromPreviousStop == rhs.distanceFromPreviousStop)||((this.distanceFromPreviousStop!= null)&&this.distanceFromPreviousStop.equals(rhs.distanceFromPreviousStop))))&&((this.dropoffShipmentCount == rhs.dropoffShipmentCount)||((this.dropoffShipmentCount!= null)&&this.dropoffShipmentCount.equals(rhs.dropoffShipmentCount))))&&((this.pickupShipmentLegId == rhs.pickupShipmentLegId)||((this.pickupShipmentLegId!= null)&&this.pickupShipmentLegId.equals(rhs.pickupShipmentLegId))))&&((this.stopLocation == rhs.stopLocation)||((this.stopLocation!= null)&&this.stopLocation.equals(rhs.stopLocation))))&&((this.actionCode == rhs.actionCode)||((this.actionCode!= null)&&this.actionCode.equals(rhs.actionCode))))&&((this.tmReferenceNumber == rhs.tmReferenceNumber)||((this.tmReferenceNumber!= null)&&this.tmReferenceNumber.equals(rhs.tmReferenceNumber))))&&((this.stopSequenceNumber == rhs.stopSequenceNumber)||((this.stopSequenceNumber!= null)&&this.stopSequenceNumber.equals(rhs.stopSequenceNumber))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
