
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ExtensionFieldWithQualifierType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "qualifierCodeList",
    "qualifierCodeName",
    "value"
})
@Generated("jsonschema2pojo")
public class ExtensionFieldWithQualifierType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("qualifierCodeList")
    private String qualifierCodeList;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("qualifierCodeName")
    private String qualifierCodeName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private Double value;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("qualifierCodeList")
    public String getQualifierCodeList() {
        return qualifierCodeList;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("qualifierCodeList")
    public void setQualifierCodeList(String qualifierCodeList) {
        this.qualifierCodeList = qualifierCodeList;
    }

    public ExtensionFieldWithQualifierType withQualifierCodeList(String qualifierCodeList) {
        this.qualifierCodeList = qualifierCodeList;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("qualifierCodeName")
    public String getQualifierCodeName() {
        return qualifierCodeName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("qualifierCodeName")
    public void setQualifierCodeName(String qualifierCodeName) {
        this.qualifierCodeName = qualifierCodeName;
    }

    public ExtensionFieldWithQualifierType withQualifierCodeName(String qualifierCodeName) {
        this.qualifierCodeName = qualifierCodeName;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    public ExtensionFieldWithQualifierType withValue(Double value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExtensionFieldWithQualifierType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("qualifierCodeList");
        sb.append('=');
        sb.append(((this.qualifierCodeList == null)?"<null>":this.qualifierCodeList));
        sb.append(',');
        sb.append("qualifierCodeName");
        sb.append('=');
        sb.append(((this.qualifierCodeName == null)?"<null>":this.qualifierCodeName));
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
        result = ((result* 31)+((this.qualifierCodeName == null)? 0 :this.qualifierCodeName.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.qualifierCodeList == null)? 0 :this.qualifierCodeList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExtensionFieldWithQualifierType) == false) {
            return false;
        }
        ExtensionFieldWithQualifierType rhs = ((ExtensionFieldWithQualifierType) other);
        return ((((this.qualifierCodeName == rhs.qualifierCodeName)||((this.qualifierCodeName!= null)&&this.qualifierCodeName.equals(rhs.qualifierCodeName)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.qualifierCodeList == rhs.qualifierCodeList)||((this.qualifierCodeList!= null)&&this.qualifierCodeList.equals(rhs.qualifierCodeList))));
    }

}
