
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TransportInstructionConsignmentType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "primaryId",
    "additionalConsignmentId",
    "consignor",
    "consignee",
    "transportInstructionTerms",
    "transportCargoCharacteristics",
    "transportInstructionTransportMovement",
    "containedShipmentReference"
})
@Generated("jsonschema2pojo")
public class TransportInstructionConsignmentType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primaryId")
    private String primaryId;
    /**
     * Additional identification key used to identify a consignment.
     * 
     */
    @JsonProperty("additionalConsignmentId")
    @JsonPropertyDescription("Additional identification key used to identify a consignment.")
    private List<AdditionalConsignmentIdentificationType> additionalConsignmentId = new ArrayList<AdditionalConsignmentIdentificationType>();
    /**
     * TransactionalPartyType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("consignor")
    private TransactionalPartyType consignor;
    /**
     * TransactionalPartyType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("consignee")
    private TransactionalPartyType consignee;
    /**
     * TransportInstructionTermsType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportInstructionTerms")
    private TransportInstructionTermsType transportInstructionTerms;
    /**
     * TransportCargoCharacteristicsType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportCargoCharacteristics")
    private TransportCargoCharacteristicsType transportCargoCharacteristics;
    /**
     * The transport movement information specifies details of the movement of goods such as mode and means of transport, locations, departure, and arrival date(s) and time(s).
     * (Required)
     * 
     */
    @JsonProperty("transportInstructionTransportMovement")
    @JsonPropertyDescription("The transport movement information specifies details of the movement of goods such as mode and means of transport, locations, departure, and arrival date(s) and time(s).")
    private List<TransportInstructionTransportMovementType> transportInstructionTransportMovement = new ArrayList<TransportInstructionTransportMovementType>();
    /**
     * Information used to identify a shipment.
     * 
     */
    @JsonProperty("containedShipmentReference")
    @JsonPropertyDescription("Information used to identify a shipment.")
    private List<ShipmentIdentificationType> containedShipmentReference = new ArrayList<ShipmentIdentificationType>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primaryId")
    public String getPrimaryId() {
        return primaryId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primaryId")
    public void setPrimaryId(String primaryId) {
        this.primaryId = primaryId;
    }

    public TransportInstructionConsignmentType withPrimaryId(String primaryId) {
        this.primaryId = primaryId;
        return this;
    }

    /**
     * Additional identification key used to identify a consignment.
     * 
     */
    @JsonProperty("additionalConsignmentId")
    public List<AdditionalConsignmentIdentificationType> getAdditionalConsignmentId() {
        return additionalConsignmentId;
    }

    /**
     * Additional identification key used to identify a consignment.
     * 
     */
    @JsonProperty("additionalConsignmentId")
    public void setAdditionalConsignmentId(List<AdditionalConsignmentIdentificationType> additionalConsignmentId) {
        this.additionalConsignmentId = additionalConsignmentId;
    }

    public TransportInstructionConsignmentType withAdditionalConsignmentId(List<AdditionalConsignmentIdentificationType> additionalConsignmentId) {
        this.additionalConsignmentId = additionalConsignmentId;
        return this;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("consignor")
    public TransactionalPartyType getConsignor() {
        return consignor;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("consignor")
    public void setConsignor(TransactionalPartyType consignor) {
        this.consignor = consignor;
    }

    public TransportInstructionConsignmentType withConsignor(TransactionalPartyType consignor) {
        this.consignor = consignor;
        return this;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("consignee")
    public TransactionalPartyType getConsignee() {
        return consignee;
    }

    /**
     * TransactionalPartyType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("consignee")
    public void setConsignee(TransactionalPartyType consignee) {
        this.consignee = consignee;
    }

    public TransportInstructionConsignmentType withConsignee(TransactionalPartyType consignee) {
        this.consignee = consignee;
        return this;
    }

    /**
     * TransportInstructionTermsType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportInstructionTerms")
    public TransportInstructionTermsType getTransportInstructionTerms() {
        return transportInstructionTerms;
    }

    /**
     * TransportInstructionTermsType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportInstructionTerms")
    public void setTransportInstructionTerms(TransportInstructionTermsType transportInstructionTerms) {
        this.transportInstructionTerms = transportInstructionTerms;
    }

    public TransportInstructionConsignmentType withTransportInstructionTerms(TransportInstructionTermsType transportInstructionTerms) {
        this.transportInstructionTerms = transportInstructionTerms;
        return this;
    }

    /**
     * TransportCargoCharacteristicsType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportCargoCharacteristics")
    public TransportCargoCharacteristicsType getTransportCargoCharacteristics() {
        return transportCargoCharacteristics;
    }

    /**
     * TransportCargoCharacteristicsType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportCargoCharacteristics")
    public void setTransportCargoCharacteristics(TransportCargoCharacteristicsType transportCargoCharacteristics) {
        this.transportCargoCharacteristics = transportCargoCharacteristics;
    }

    public TransportInstructionConsignmentType withTransportCargoCharacteristics(TransportCargoCharacteristicsType transportCargoCharacteristics) {
        this.transportCargoCharacteristics = transportCargoCharacteristics;
        return this;
    }

    /**
     * The transport movement information specifies details of the movement of goods such as mode and means of transport, locations, departure, and arrival date(s) and time(s).
     * (Required)
     * 
     */
    @JsonProperty("transportInstructionTransportMovement")
    public List<TransportInstructionTransportMovementType> getTransportInstructionTransportMovement() {
        return transportInstructionTransportMovement;
    }

    /**
     * The transport movement information specifies details of the movement of goods such as mode and means of transport, locations, departure, and arrival date(s) and time(s).
     * (Required)
     * 
     */
    @JsonProperty("transportInstructionTransportMovement")
    public void setTransportInstructionTransportMovement(List<TransportInstructionTransportMovementType> transportInstructionTransportMovement) {
        this.transportInstructionTransportMovement = transportInstructionTransportMovement;
    }

    public TransportInstructionConsignmentType withTransportInstructionTransportMovement(List<TransportInstructionTransportMovementType> transportInstructionTransportMovement) {
        this.transportInstructionTransportMovement = transportInstructionTransportMovement;
        return this;
    }

    /**
     * Information used to identify a shipment.
     * 
     */
    @JsonProperty("containedShipmentReference")
    public List<ShipmentIdentificationType> getContainedShipmentReference() {
        return containedShipmentReference;
    }

    /**
     * Information used to identify a shipment.
     * 
     */
    @JsonProperty("containedShipmentReference")
    public void setContainedShipmentReference(List<ShipmentIdentificationType> containedShipmentReference) {
        this.containedShipmentReference = containedShipmentReference;
    }

    public TransportInstructionConsignmentType withContainedShipmentReference(List<ShipmentIdentificationType> containedShipmentReference) {
        this.containedShipmentReference = containedShipmentReference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportInstructionConsignmentType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("primaryId");
        sb.append('=');
        sb.append(((this.primaryId == null)?"<null>":this.primaryId));
        sb.append(',');
        sb.append("additionalConsignmentId");
        sb.append('=');
        sb.append(((this.additionalConsignmentId == null)?"<null>":this.additionalConsignmentId));
        sb.append(',');
        sb.append("consignor");
        sb.append('=');
        sb.append(((this.consignor == null)?"<null>":this.consignor));
        sb.append(',');
        sb.append("consignee");
        sb.append('=');
        sb.append(((this.consignee == null)?"<null>":this.consignee));
        sb.append(',');
        sb.append("transportInstructionTerms");
        sb.append('=');
        sb.append(((this.transportInstructionTerms == null)?"<null>":this.transportInstructionTerms));
        sb.append(',');
        sb.append("transportCargoCharacteristics");
        sb.append('=');
        sb.append(((this.transportCargoCharacteristics == null)?"<null>":this.transportCargoCharacteristics));
        sb.append(',');
        sb.append("transportInstructionTransportMovement");
        sb.append('=');
        sb.append(((this.transportInstructionTransportMovement == null)?"<null>":this.transportInstructionTransportMovement));
        sb.append(',');
        sb.append("containedShipmentReference");
        sb.append('=');
        sb.append(((this.containedShipmentReference == null)?"<null>":this.containedShipmentReference));
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
        result = ((result* 31)+((this.containedShipmentReference == null)? 0 :this.containedShipmentReference.hashCode()));
        result = ((result* 31)+((this.consignee == null)? 0 :this.consignee.hashCode()));
        result = ((result* 31)+((this.transportCargoCharacteristics == null)? 0 :this.transportCargoCharacteristics.hashCode()));
        result = ((result* 31)+((this.transportInstructionTerms == null)? 0 :this.transportInstructionTerms.hashCode()));
        result = ((result* 31)+((this.additionalConsignmentId == null)? 0 :this.additionalConsignmentId.hashCode()));
        result = ((result* 31)+((this.primaryId == null)? 0 :this.primaryId.hashCode()));
        result = ((result* 31)+((this.transportInstructionTransportMovement == null)? 0 :this.transportInstructionTransportMovement.hashCode()));
        result = ((result* 31)+((this.consignor == null)? 0 :this.consignor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportInstructionConsignmentType) == false) {
            return false;
        }
        TransportInstructionConsignmentType rhs = ((TransportInstructionConsignmentType) other);
        return (((((((((this.containedShipmentReference == rhs.containedShipmentReference)||((this.containedShipmentReference!= null)&&this.containedShipmentReference.equals(rhs.containedShipmentReference)))&&((this.consignee == rhs.consignee)||((this.consignee!= null)&&this.consignee.equals(rhs.consignee))))&&((this.transportCargoCharacteristics == rhs.transportCargoCharacteristics)||((this.transportCargoCharacteristics!= null)&&this.transportCargoCharacteristics.equals(rhs.transportCargoCharacteristics))))&&((this.transportInstructionTerms == rhs.transportInstructionTerms)||((this.transportInstructionTerms!= null)&&this.transportInstructionTerms.equals(rhs.transportInstructionTerms))))&&((this.additionalConsignmentId == rhs.additionalConsignmentId)||((this.additionalConsignmentId!= null)&&this.additionalConsignmentId.equals(rhs.additionalConsignmentId))))&&((this.primaryId == rhs.primaryId)||((this.primaryId!= null)&&this.primaryId.equals(rhs.primaryId))))&&((this.transportInstructionTransportMovement == rhs.transportInstructionTransportMovement)||((this.transportInstructionTransportMovement!= null)&&this.transportInstructionTransportMovement.equals(rhs.transportInstructionTransportMovement))))&&((this.consignor == rhs.consignor)||((this.consignor!= null)&&this.consignor.equals(rhs.consignor))));
    }

}
