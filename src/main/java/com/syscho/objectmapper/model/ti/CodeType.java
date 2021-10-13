
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CodeType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "codeListName",
    "value"
})
@Generated("jsonschema2pojo")
public class CodeType {

    /**
     * The name of the code list which provides the code value.
     * 
     */
    @JsonProperty("codeListName")
    @JsonPropertyDescription("The name of the code list which provides the code value.")
    private String codeListName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private String value;

    /**
     * The name of the code list which provides the code value.
     * 
     */
    @JsonProperty("codeListName")
    public String getCodeListName() {
        return codeListName;
    }

    /**
     * The name of the code list which provides the code value.
     * 
     */
    @JsonProperty("codeListName")
    public void setCodeListName(String codeListName) {
        this.codeListName = codeListName;
    }

    public CodeType withCodeListName(String codeListName) {
        this.codeListName = codeListName;
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

    public CodeType withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CodeType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("codeListName");
        sb.append('=');
        sb.append(((this.codeListName == null)?"<null>":this.codeListName));
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
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.codeListName == null)? 0 :this.codeListName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CodeType) == false) {
            return false;
        }
        CodeType rhs = ((CodeType) other);
        return (((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value)))&&((this.codeListName == rhs.codeListName)||((this.codeListName!= null)&&this.codeListName.equals(rhs.codeListName))));
    }

}
