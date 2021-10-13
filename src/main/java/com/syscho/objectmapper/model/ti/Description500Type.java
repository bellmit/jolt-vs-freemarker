
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Description500Type
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "languageCode",
    "value"
})
@Generated("jsonschema2pojo")
public class Description500Type {

    /**
     * LanguageCode
     * <p>
     * 
     * 
     */
    @JsonProperty("languageCode")
    private LanguageCode languageCode;
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

    public Description500Type withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
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

    public Description500Type withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Description500Type.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("languageCode");
        sb.append('=');
        sb.append(((this.languageCode == null)?"<null>":this.languageCode));
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
        result = ((result* 31)+((this.languageCode == null)? 0 :this.languageCode.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Description500Type) == false) {
            return false;
        }
        Description500Type rhs = ((Description500Type) other);
        return (((this.languageCode == rhs.languageCode)||((this.languageCode!= null)&&this.languageCode.equals(rhs.languageCode)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
