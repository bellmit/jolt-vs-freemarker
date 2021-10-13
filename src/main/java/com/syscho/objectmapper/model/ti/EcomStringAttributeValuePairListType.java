
package com.syscho.objectmapper.model.ti;

import java.time.OffsetDateTime;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EcomStringAttributeValuePairListType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "qualifierCodeName",
    "qualifierCodeList",
    "actionCode",
    "value",
    "binaryValue",
    "date",
    "dateTime"
})
@Generated("jsonschema2pojo")
public class EcomStringAttributeValuePairListType {

    /**
     * The name of the temporary attribute being introduced as an attribute value pair.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the temporary attribute being introduced as an attribute value pair.")
    private String name;
    /**
     * The value of the attribute qualifier associated with the codeListName
     * 
     */
    @JsonProperty("qualifierCodeName")
    @JsonPropertyDescription("The value of the attribute qualifier associated with the codeListName")
    private String qualifierCodeName;
    /**
     * The code list qualifying the temporary attribute
     * 
     */
    @JsonProperty("qualifierCodeList")
    @JsonPropertyDescription("The code list qualifying the temporary attribute")
    private String qualifierCodeList;
    /**
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("actionCode")
    private SegmentActionEnumerationType actionCode;
    @JsonProperty("value")
    private String value;
    @JsonProperty("binaryValue")
    private String binaryValue;
    @JsonProperty("date")
    private String date;
    @JsonProperty("dateTime")
    private OffsetDateTime dateTime;

    /**
     * The name of the temporary attribute being introduced as an attribute value pair.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the temporary attribute being introduced as an attribute value pair.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public EcomStringAttributeValuePairListType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The value of the attribute qualifier associated with the codeListName
     * 
     */
    @JsonProperty("qualifierCodeName")
    public String getQualifierCodeName() {
        return qualifierCodeName;
    }

    /**
     * The value of the attribute qualifier associated with the codeListName
     * 
     */
    @JsonProperty("qualifierCodeName")
    public void setQualifierCodeName(String qualifierCodeName) {
        this.qualifierCodeName = qualifierCodeName;
    }

    public EcomStringAttributeValuePairListType withQualifierCodeName(String qualifierCodeName) {
        this.qualifierCodeName = qualifierCodeName;
        return this;
    }

    /**
     * The code list qualifying the temporary attribute
     * 
     */
    @JsonProperty("qualifierCodeList")
    public String getQualifierCodeList() {
        return qualifierCodeList;
    }

    /**
     * The code list qualifying the temporary attribute
     * 
     */
    @JsonProperty("qualifierCodeList")
    public void setQualifierCodeList(String qualifierCodeList) {
        this.qualifierCodeList = qualifierCodeList;
    }

    public EcomStringAttributeValuePairListType withQualifierCodeList(String qualifierCodeList) {
        this.qualifierCodeList = qualifierCodeList;
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

    public EcomStringAttributeValuePairListType withActionCode(SegmentActionEnumerationType actionCode) {
        this.actionCode = actionCode;
        return this;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public EcomStringAttributeValuePairListType withValue(String value) {
        this.value = value;
        return this;
    }

    @JsonProperty("binaryValue")
    public String getBinaryValue() {
        return binaryValue;
    }

    @JsonProperty("binaryValue")
    public void setBinaryValue(String binaryValue) {
        this.binaryValue = binaryValue;
    }

    public EcomStringAttributeValuePairListType withBinaryValue(String binaryValue) {
        this.binaryValue = binaryValue;
        return this;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public EcomStringAttributeValuePairListType withDate(String date) {
        this.date = date;
        return this;
    }

    @JsonProperty("dateTime")
    public OffsetDateTime getDateTime() {
        return dateTime;
    }

    @JsonProperty("dateTime")
    public void setDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public EcomStringAttributeValuePairListType withDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EcomStringAttributeValuePairListType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("qualifierCodeName");
        sb.append('=');
        sb.append(((this.qualifierCodeName == null)?"<null>":this.qualifierCodeName));
        sb.append(',');
        sb.append("qualifierCodeList");
        sb.append('=');
        sb.append(((this.qualifierCodeList == null)?"<null>":this.qualifierCodeList));
        sb.append(',');
        sb.append("actionCode");
        sb.append('=');
        sb.append(((this.actionCode == null)?"<null>":this.actionCode));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("binaryValue");
        sb.append('=');
        sb.append(((this.binaryValue == null)?"<null>":this.binaryValue));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("dateTime");
        sb.append('=');
        sb.append(((this.dateTime == null)?"<null>":this.dateTime));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.dateTime == null)? 0 :this.dateTime.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.qualifierCodeName == null)? 0 :this.qualifierCodeName.hashCode()));
        result = ((result* 31)+((this.actionCode == null)? 0 :this.actionCode.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.qualifierCodeList == null)? 0 :this.qualifierCodeList.hashCode()));
        result = ((result* 31)+((this.binaryValue == null)? 0 :this.binaryValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EcomStringAttributeValuePairListType) == false) {
            return false;
        }
        EcomStringAttributeValuePairListType rhs = ((EcomStringAttributeValuePairListType) other);
        return (((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.dateTime == rhs.dateTime)||((this.dateTime!= null)&&this.dateTime.equals(rhs.dateTime))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.qualifierCodeName == rhs.qualifierCodeName)||((this.qualifierCodeName!= null)&&this.qualifierCodeName.equals(rhs.qualifierCodeName))))&&((this.actionCode == rhs.actionCode)||((this.actionCode!= null)&&this.actionCode.equals(rhs.actionCode))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.qualifierCodeList == rhs.qualifierCodeList)||((this.qualifierCodeList!= null)&&this.qualifierCodeList.equals(rhs.qualifierCodeList))))&&((this.binaryValue == rhs.binaryValue)||((this.binaryValue!= null)&&this.binaryValue.equals(rhs.binaryValue))));
    }

}
