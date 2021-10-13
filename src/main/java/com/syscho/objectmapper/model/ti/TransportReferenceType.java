
package com.syscho.objectmapper.model.ti;

import java.time.OffsetDateTime;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TransportReferenceType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entityId",
    "creationDateTime",
    "lineItemNumber",
    "typeCode"
})
@Generated("jsonschema2pojo")
public class TransportReferenceType {

    /**
     * The unique identifier of the piece of information, such as the object identifier or the document identifier.
     * (Required)
     * 
     */
    @JsonProperty("entityId")
    @JsonPropertyDescription("The unique identifier of the piece of information, such as the object identifier or the document identifier.")
    private String entityId;
    /**
     * Date and time of creation of the referenced document.
     * 
     */
    @JsonProperty("creationDateTime")
    @JsonPropertyDescription("Date and time of creation of the referenced document.")
    private OffsetDateTime creationDateTime;
    /**
     * Number specifying a line in the referenced document.
     * 
     */
    @JsonProperty("lineItemNumber")
    @JsonPropertyDescription("Number specifying a line in the referenced document.")
    private Integer lineItemNumber;
    /**
     * TransportReferenceTypeCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("typeCode")
    private TransportReferenceTypeCode typeCode;

    /**
     * The unique identifier of the piece of information, such as the object identifier or the document identifier.
     * (Required)
     * 
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * The unique identifier of the piece of information, such as the object identifier or the document identifier.
     * (Required)
     * 
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public TransportReferenceType withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Date and time of creation of the referenced document.
     * 
     */
    @JsonProperty("creationDateTime")
    public OffsetDateTime getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Date and time of creation of the referenced document.
     * 
     */
    @JsonProperty("creationDateTime")
    public void setCreationDateTime(OffsetDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public TransportReferenceType withCreationDateTime(OffsetDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Number specifying a line in the referenced document.
     * 
     */
    @JsonProperty("lineItemNumber")
    public Integer getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Number specifying a line in the referenced document.
     * 
     */
    @JsonProperty("lineItemNumber")
    public void setLineItemNumber(Integer lineItemNumber) {
        this.lineItemNumber = lineItemNumber;
    }

    public TransportReferenceType withLineItemNumber(Integer lineItemNumber) {
        this.lineItemNumber = lineItemNumber;
        return this;
    }

    /**
     * TransportReferenceTypeCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("typeCode")
    public TransportReferenceTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * TransportReferenceTypeCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("typeCode")
    public void setTypeCode(TransportReferenceTypeCode typeCode) {
        this.typeCode = typeCode;
    }

    public TransportReferenceType withTypeCode(TransportReferenceTypeCode typeCode) {
        this.typeCode = typeCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportReferenceType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entityId");
        sb.append('=');
        sb.append(((this.entityId == null)?"<null>":this.entityId));
        sb.append(',');
        sb.append("creationDateTime");
        sb.append('=');
        sb.append(((this.creationDateTime == null)?"<null>":this.creationDateTime));
        sb.append(',');
        sb.append("lineItemNumber");
        sb.append('=');
        sb.append(((this.lineItemNumber == null)?"<null>":this.lineItemNumber));
        sb.append(',');
        sb.append("typeCode");
        sb.append('=');
        sb.append(((this.typeCode == null)?"<null>":this.typeCode));
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
        result = ((result* 31)+((this.entityId == null)? 0 :this.entityId.hashCode()));
        result = ((result* 31)+((this.lineItemNumber == null)? 0 :this.lineItemNumber.hashCode()));
        result = ((result* 31)+((this.creationDateTime == null)? 0 :this.creationDateTime.hashCode()));
        result = ((result* 31)+((this.typeCode == null)? 0 :this.typeCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportReferenceType) == false) {
            return false;
        }
        TransportReferenceType rhs = ((TransportReferenceType) other);
        return (((((this.entityId == rhs.entityId)||((this.entityId!= null)&&this.entityId.equals(rhs.entityId)))&&((this.lineItemNumber == rhs.lineItemNumber)||((this.lineItemNumber!= null)&&this.lineItemNumber.equals(rhs.lineItemNumber))))&&((this.creationDateTime == rhs.creationDateTime)||((this.creationDateTime!= null)&&this.creationDateTime.equals(rhs.creationDateTime))))&&((this.typeCode == rhs.typeCode)||((this.typeCode!= null)&&this.typeCode.equals(rhs.typeCode))));
    }

}
