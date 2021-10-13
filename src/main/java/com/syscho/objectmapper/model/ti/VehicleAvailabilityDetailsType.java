
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * VehicleAvailabilityDetailsType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transportEquipmentTypeCode",
    "vehicleCode",
    "vehicleAvailabilityInformation"
})
@Generated("jsonschema2pojo")
public class VehicleAvailabilityDetailsType {

    /**
     * CodeType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportEquipmentTypeCode")
    private CodeType transportEquipmentTypeCode;
    /**
     * Represents an actual vehicle ID for this resource pool or an artificial ID representing a group of vehicles
     * (Required)
     * 
     */
    @JsonProperty("vehicleCode")
    @JsonPropertyDescription("Represents an actual vehicle ID for this resource pool or an artificial ID representing a group of vehicles")
    private String vehicleCode;
    /**
     * DomicileVehicleAvailabilityInformationType
     * <p>
     * 
     * 
     */
    @JsonProperty("vehicleAvailabilityInformation")
    private DomicileVehicleAvailabilityInformationType vehicleAvailabilityInformation;

    /**
     * CodeType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportEquipmentTypeCode")
    public CodeType getTransportEquipmentTypeCode() {
        return transportEquipmentTypeCode;
    }

    /**
     * CodeType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportEquipmentTypeCode")
    public void setTransportEquipmentTypeCode(CodeType transportEquipmentTypeCode) {
        this.transportEquipmentTypeCode = transportEquipmentTypeCode;
    }

    public VehicleAvailabilityDetailsType withTransportEquipmentTypeCode(CodeType transportEquipmentTypeCode) {
        this.transportEquipmentTypeCode = transportEquipmentTypeCode;
        return this;
    }

    /**
     * Represents an actual vehicle ID for this resource pool or an artificial ID representing a group of vehicles
     * (Required)
     * 
     */
    @JsonProperty("vehicleCode")
    public String getVehicleCode() {
        return vehicleCode;
    }

    /**
     * Represents an actual vehicle ID for this resource pool or an artificial ID representing a group of vehicles
     * (Required)
     * 
     */
    @JsonProperty("vehicleCode")
    public void setVehicleCode(String vehicleCode) {
        this.vehicleCode = vehicleCode;
    }

    public VehicleAvailabilityDetailsType withVehicleCode(String vehicleCode) {
        this.vehicleCode = vehicleCode;
        return this;
    }

    /**
     * DomicileVehicleAvailabilityInformationType
     * <p>
     * 
     * 
     */
    @JsonProperty("vehicleAvailabilityInformation")
    public DomicileVehicleAvailabilityInformationType getVehicleAvailabilityInformation() {
        return vehicleAvailabilityInformation;
    }

    /**
     * DomicileVehicleAvailabilityInformationType
     * <p>
     * 
     * 
     */
    @JsonProperty("vehicleAvailabilityInformation")
    public void setVehicleAvailabilityInformation(DomicileVehicleAvailabilityInformationType vehicleAvailabilityInformation) {
        this.vehicleAvailabilityInformation = vehicleAvailabilityInformation;
    }

    public VehicleAvailabilityDetailsType withVehicleAvailabilityInformation(DomicileVehicleAvailabilityInformationType vehicleAvailabilityInformation) {
        this.vehicleAvailabilityInformation = vehicleAvailabilityInformation;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VehicleAvailabilityDetailsType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("transportEquipmentTypeCode");
        sb.append('=');
        sb.append(((this.transportEquipmentTypeCode == null)?"<null>":this.transportEquipmentTypeCode));
        sb.append(',');
        sb.append("vehicleCode");
        sb.append('=');
        sb.append(((this.vehicleCode == null)?"<null>":this.vehicleCode));
        sb.append(',');
        sb.append("vehicleAvailabilityInformation");
        sb.append('=');
        sb.append(((this.vehicleAvailabilityInformation == null)?"<null>":this.vehicleAvailabilityInformation));
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
        result = ((result* 31)+((this.vehicleCode == null)? 0 :this.vehicleCode.hashCode()));
        result = ((result* 31)+((this.transportEquipmentTypeCode == null)? 0 :this.transportEquipmentTypeCode.hashCode()));
        result = ((result* 31)+((this.vehicleAvailabilityInformation == null)? 0 :this.vehicleAvailabilityInformation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VehicleAvailabilityDetailsType) == false) {
            return false;
        }
        VehicleAvailabilityDetailsType rhs = ((VehicleAvailabilityDetailsType) other);
        return ((((this.vehicleCode == rhs.vehicleCode)||((this.vehicleCode!= null)&&this.vehicleCode.equals(rhs.vehicleCode)))&&((this.transportEquipmentTypeCode == rhs.transportEquipmentTypeCode)||((this.transportEquipmentTypeCode!= null)&&this.transportEquipmentTypeCode.equals(rhs.transportEquipmentTypeCode))))&&((this.vehicleAvailabilityInformation == rhs.vehicleAvailabilityInformation)||((this.vehicleAvailabilityInformation!= null)&&this.vehicleAvailabilityInformation.equals(rhs.vehicleAvailabilityInformation))));
    }

}
