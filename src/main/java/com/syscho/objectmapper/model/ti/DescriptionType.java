
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DescriptionType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "languageCode",
    "descriptionType",
    "actionCode",
    "value"
})
@Generated("jsonschema2pojo")
public class DescriptionType {

    /**
     * LanguageCode
     * <p>
     * 
     * 
     */
    @JsonProperty("languageCode")
    private LanguageCode languageCode;
    /**
     * Type of description, eg Long, Short, Mobile, etc.
     * 
     */
    @JsonProperty("descriptionType")
    @JsonPropertyDescription("Type of description, eg Long, Short, Mobile, etc.")
    private String descriptionType;
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
    @JsonProperty("value")
    private String value;

    /**
     * LanguageCode
     * <p>
     * 
     * 
     */
    @JsonProperty("languageCode")
    public LanguageCode getLanguageCode() {
        return languageCode;
    }

    /**
     * LanguageCode
     * <p>
     * 
     * 
     */
    @JsonProperty("languageCode")
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
    }

    public DescriptionType withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Type of description, eg Long, Short, Mobile, etc.
     * 
     */
    @JsonProperty("descriptionType")
    public String getDescriptionType() {
        return descriptionType;
    }

    /**
     * Type of description, eg Long, Short, Mobile, etc.
     * 
     */
    @JsonProperty("descriptionType")
    public void setDescriptionType(String descriptionType) {
        this.descriptionType = descriptionType;
    }

    public DescriptionType withDescriptionType(String descriptionType) {
        this.descriptionType = descriptionType;
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

    public DescriptionType withActionCode(SegmentActionEnumerationType actionCode) {
        this.actionCode = actionCode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public DescriptionType withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DescriptionType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("languageCode");
        sb.append('=');
        sb.append(((this.languageCode == null)?"<null>":this.languageCode));
        sb.append(',');
        sb.append("descriptionType");
        sb.append('=');
        sb.append(((this.descriptionType == null)?"<null>":this.descriptionType));
        sb.append(',');
        sb.append("actionCode");
        sb.append('=');
        sb.append(((this.actionCode == null)?"<null>":this.actionCode));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.languageCode == null)? 0 :this.languageCode.hashCode()));
        result = ((result* 31)+((this.descriptionType == null)? 0 :this.descriptionType.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DescriptionType) == false) {
            return false;
        }
        DescriptionType rhs = ((DescriptionType) other);
        return (((((this.actionCode == rhs.actionCode)||((this.actionCode!= null)&&this.actionCode.equals(rhs.actionCode)))&&((this.languageCode == rhs.languageCode)||((this.languageCode!= null)&&this.languageCode.equals(rhs.languageCode))))&&((this.descriptionType == rhs.descriptionType)||((this.descriptionType!= null)&&this.descriptionType.equals(rhs.descriptionType))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
