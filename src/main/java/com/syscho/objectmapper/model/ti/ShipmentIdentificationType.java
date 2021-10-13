
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ShipmentIdentificationType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "primaryId",
    "additionalShipmentId",
    "actionCode"
})
@Generated("jsonschema2pojo")
public class ShipmentIdentificationType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primaryId")
    private String primaryId;
    /**
     * Additional identification key used to identify a shipment.
     * 
     */
    @JsonProperty("additionalShipmentId")
    @JsonPropertyDescription("Additional identification key used to identify a shipment.")
    private List<AdditionalShipmentIdentificationType> additionalShipmentId = new ArrayList<AdditionalShipmentIdentificationType>();
    /**
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("actionCode")
    private SegmentActionEnumerationType actionCode;

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

    public ShipmentIdentificationType withPrimaryId(String primaryId) {
        this.primaryId = primaryId;
        return this;
    }

    /**
     * Additional identification key used to identify a shipment.
     * 
     */
    @JsonProperty("additionalShipmentId")
    public List<AdditionalShipmentIdentificationType> getAdditionalShipmentId() {
        return additionalShipmentId;
    }

    /**
     * Additional identification key used to identify a shipment.
     * 
     */
    @JsonProperty("additionalShipmentId")
    public void setAdditionalShipmentId(List<AdditionalShipmentIdentificationType> additionalShipmentId) {
        this.additionalShipmentId = additionalShipmentId;
    }

    public ShipmentIdentificationType withAdditionalShipmentId(List<AdditionalShipmentIdentificationType> additionalShipmentId) {
        this.additionalShipmentId = additionalShipmentId;
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

    public ShipmentIdentificationType withActionCode(SegmentActionEnumerationType actionCode) {
        this.actionCode = actionCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ShipmentIdentificationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("primaryId");
        sb.append('=');
        sb.append(((this.primaryId == null)?"<null>":this.primaryId));
        sb.append(',');
        sb.append("additionalShipmentId");
        sb.append('=');
        sb.append(((this.additionalShipmentId == null)?"<null>":this.additionalShipmentId));
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
        result = ((result* 31)+((this.actionCode == null)? 0 :this.actionCode.hashCode()));
        result = ((result* 31)+((this.additionalShipmentId == null)? 0 :this.additionalShipmentId.hashCode()));
        result = ((result* 31)+((this.primaryId == null)? 0 :this.primaryId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShipmentIdentificationType) == false) {
            return false;
        }
        ShipmentIdentificationType rhs = ((ShipmentIdentificationType) other);
        return ((((this.actionCode == rhs.actionCode)||((this.actionCode!= null)&&this.actionCode.equals(rhs.actionCode)))&&((this.additionalShipmentId == rhs.additionalShipmentId)||((this.additionalShipmentId!= null)&&this.additionalShipmentId.equals(rhs.additionalShipmentId))))&&((this.primaryId == rhs.primaryId)||((this.primaryId!= null)&&this.primaryId.equals(rhs.primaryId))));
    }

}
