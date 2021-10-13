
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EntityIdentificationType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entityId"
})
@Generated("jsonschema2pojo")
public class EntityIdentificationType {

    /**
     * The unique identifier of the piece of information, such as the object identifier or the document identifier.
     * (Required)
     * 
     */
    @JsonProperty("entityId")
    @JsonPropertyDescription("The unique identifier of the piece of information, such as the object identifier or the document identifier.")
    private String entityId;

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

    public EntityIdentificationType withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EntityIdentificationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entityId");
        sb.append('=');
        sb.append(((this.entityId == null)?"<null>":this.entityId));
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntityIdentificationType) == false) {
            return false;
        }
        EntityIdentificationType rhs = ((EntityIdentificationType) other);
        return ((this.entityId == rhs.entityId)||((this.entityId!= null)&&this.entityId.equals(rhs.entityId)));
    }

}
