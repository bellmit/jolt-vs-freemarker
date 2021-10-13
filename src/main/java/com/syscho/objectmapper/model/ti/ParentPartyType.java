
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ParentPartyType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "primaryId",
    "additionalPartyId",
    "name",
    "parentRole"
})
@Generated("jsonschema2pojo")
public class ParentPartyType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("primaryId")
    private String primaryId;
    /**
     * Identifier of the party or location, specified in addition to the GLN.
     * 
     */
    @JsonProperty("additionalPartyId")
    @JsonPropertyDescription("Identifier of the party or location, specified in addition to the GLN.")
    private List<AdditionalPartyIdentificationType> additionalPartyId = new ArrayList<AdditionalPartyIdentificationType>();
    /**
     * Name of the party or location.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the party or location.")
    private String name;
    /**
     * PartyRoleCode
     * <p>
     * 
     * 
     */
    @JsonProperty("parentRole")
    private PartyRoleCode parentRole;

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

    public ParentPartyType withPrimaryId(String primaryId) {
        this.primaryId = primaryId;
        return this;
    }

    /**
     * Identifier of the party or location, specified in addition to the GLN.
     * 
     */
    @JsonProperty("additionalPartyId")
    public List<AdditionalPartyIdentificationType> getAdditionalPartyId() {
        return additionalPartyId;
    }

    /**
     * Identifier of the party or location, specified in addition to the GLN.
     * 
     */
    @JsonProperty("additionalPartyId")
    public void setAdditionalPartyId(List<AdditionalPartyIdentificationType> additionalPartyId) {
        this.additionalPartyId = additionalPartyId;
    }

    public ParentPartyType withAdditionalPartyId(List<AdditionalPartyIdentificationType> additionalPartyId) {
        this.additionalPartyId = additionalPartyId;
        return this;
    }

    /**
     * Name of the party or location.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the party or location.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public ParentPartyType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * PartyRoleCode
     * <p>
     * 
     * 
     */
    @JsonProperty("parentRole")
    public PartyRoleCode getParentRole() {
        return parentRole;
    }

    /**
     * PartyRoleCode
     * <p>
     * 
     * 
     */
    @JsonProperty("parentRole")
    public void setParentRole(PartyRoleCode parentRole) {
        this.parentRole = parentRole;
    }

    public ParentPartyType withParentRole(PartyRoleCode parentRole) {
        this.parentRole = parentRole;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ParentPartyType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("primaryId");
        sb.append('=');
        sb.append(((this.primaryId == null)?"<null>":this.primaryId));
        sb.append(',');
        sb.append("additionalPartyId");
        sb.append('=');
        sb.append(((this.additionalPartyId == null)?"<null>":this.additionalPartyId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("parentRole");
        sb.append('=');
        sb.append(((this.parentRole == null)?"<null>":this.parentRole));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalPartyId == null)? 0 :this.additionalPartyId.hashCode()));
        result = ((result* 31)+((this.parentRole == null)? 0 :this.parentRole.hashCode()));
        result = ((result* 31)+((this.primaryId == null)? 0 :this.primaryId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ParentPartyType) == false) {
            return false;
        }
        ParentPartyType rhs = ((ParentPartyType) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.additionalPartyId == rhs.additionalPartyId)||((this.additionalPartyId!= null)&&this.additionalPartyId.equals(rhs.additionalPartyId))))&&((this.parentRole == rhs.parentRole)||((this.parentRole!= null)&&this.parentRole.equals(rhs.parentRole))))&&((this.primaryId == rhs.primaryId)||((this.primaryId!= null)&&this.primaryId.equals(rhs.primaryId))));
    }

}
