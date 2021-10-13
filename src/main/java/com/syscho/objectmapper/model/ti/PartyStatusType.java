
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PartyStatusType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "statusCode",
    "effectiveFromDate",
    "effectiveUpToDate",
    "extensions",
    "avpList"
})
@Generated("jsonschema2pojo")
public class PartyStatusType {

    /**
     * Indicates if a party is active/inactive.
     * (Required)
     * 
     */
    @JsonProperty("statusCode")
    @JsonPropertyDescription("Indicates if a party is active/inactive.")
    private String statusCode;
    /**
     * Date (inclusive of the day itself) that this party status begins.
     * 
     */
    @JsonProperty("effectiveFromDate")
    @JsonPropertyDescription("Date (inclusive of the day itself) that this party status begins.")
    private String effectiveFromDate;
    /**
     * The date up to which (exclusive of that day), the party status is effective.
     * 
     */
    @JsonProperty("effectiveUpToDate")
    @JsonPropertyDescription("The date up to which (exclusive of that day), the party status is effective.")
    private String effectiveUpToDate;
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
     * Indicates if a party is active/inactive.
     * (Required)
     * 
     */
    @JsonProperty("statusCode")
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Indicates if a party is active/inactive.
     * (Required)
     * 
     */
    @JsonProperty("statusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public PartyStatusType withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Date (inclusive of the day itself) that this party status begins.
     * 
     */
    @JsonProperty("effectiveFromDate")
    public String getEffectiveFromDate() {
        return effectiveFromDate;
    }

    /**
     * Date (inclusive of the day itself) that this party status begins.
     * 
     */
    @JsonProperty("effectiveFromDate")
    public void setEffectiveFromDate(String effectiveFromDate) {
        this.effectiveFromDate = effectiveFromDate;
    }

    public PartyStatusType withEffectiveFromDate(String effectiveFromDate) {
        this.effectiveFromDate = effectiveFromDate;
        return this;
    }

    /**
     * The date up to which (exclusive of that day), the party status is effective.
     * 
     */
    @JsonProperty("effectiveUpToDate")
    public String getEffectiveUpToDate() {
        return effectiveUpToDate;
    }

    /**
     * The date up to which (exclusive of that day), the party status is effective.
     * 
     */
    @JsonProperty("effectiveUpToDate")
    public void setEffectiveUpToDate(String effectiveUpToDate) {
        this.effectiveUpToDate = effectiveUpToDate;
    }

    public PartyStatusType withEffectiveUpToDate(String effectiveUpToDate) {
        this.effectiveUpToDate = effectiveUpToDate;
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

    public PartyStatusType withExtensions(NoCustomExtensionsType extensions) {
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

    public PartyStatusType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PartyStatusType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("statusCode");
        sb.append('=');
        sb.append(((this.statusCode == null)?"<null>":this.statusCode));
        sb.append(',');
        sb.append("effectiveFromDate");
        sb.append('=');
        sb.append(((this.effectiveFromDate == null)?"<null>":this.effectiveFromDate));
        sb.append(',');
        sb.append("effectiveUpToDate");
        sb.append('=');
        sb.append(((this.effectiveUpToDate == null)?"<null>":this.effectiveUpToDate));
        sb.append(',');
        sb.append("extensions");
        sb.append('=');
        sb.append(((this.extensions == null)?"<null>":this.extensions));
        sb.append(',');
        sb.append("avpList");
        sb.append('=');
        sb.append(((this.avpList == null)?"<null>":this.avpList));
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
        result = ((result* 31)+((this.effectiveUpToDate == null)? 0 :this.effectiveUpToDate.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.effectiveFromDate == null)? 0 :this.effectiveFromDate.hashCode()));
        result = ((result* 31)+((this.statusCode == null)? 0 :this.statusCode.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PartyStatusType) == false) {
            return false;
        }
        PartyStatusType rhs = ((PartyStatusType) other);
        return ((((((this.effectiveUpToDate == rhs.effectiveUpToDate)||((this.effectiveUpToDate!= null)&&this.effectiveUpToDate.equals(rhs.effectiveUpToDate)))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.effectiveFromDate == rhs.effectiveFromDate)||((this.effectiveFromDate!= null)&&this.effectiveFromDate.equals(rhs.effectiveFromDate))))&&((this.statusCode == rhs.statusCode)||((this.statusCode!= null)&&this.statusCode.equals(rhs.statusCode))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
