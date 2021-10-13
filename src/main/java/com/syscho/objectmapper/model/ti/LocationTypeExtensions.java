
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LocationTypeExtensions
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Test",
    "sizeCode"
})
@Generated("jsonschema2pojo")
public class LocationTypeExtensions {

    /**
     * TestDesc
     * (Required)
     * 
     */
    @JsonProperty("Test")
    @JsonPropertyDescription("TestDesc")
    private String test;
    /**
     * Size assigned to location from Corp
     * (Required)
     * 
     */
    @JsonProperty("sizeCode")
    @JsonPropertyDescription("Size assigned to location from Corp")
    private String sizeCode;

    /**
     * TestDesc
     * (Required)
     * 
     */
    @JsonProperty("Test")
    public String getTest() {
        return test;
    }

    /**
     * TestDesc
     * (Required)
     * 
     */
    @JsonProperty("Test")
    public void setTest(String test) {
        this.test = test;
    }

    public LocationTypeExtensions withTest(String test) {
        this.test = test;
        return this;
    }

    /**
     * Size assigned to location from Corp
     * (Required)
     * 
     */
    @JsonProperty("sizeCode")
    public String getSizeCode() {
        return sizeCode;
    }

    /**
     * Size assigned to location from Corp
     * (Required)
     * 
     */
    @JsonProperty("sizeCode")
    public void setSizeCode(String sizeCode) {
        this.sizeCode = sizeCode;
    }

    public LocationTypeExtensions withSizeCode(String sizeCode) {
        this.sizeCode = sizeCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocationTypeExtensions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("test");
        sb.append('=');
        sb.append(((this.test == null)?"<null>":this.test));
        sb.append(',');
        sb.append("sizeCode");
        sb.append('=');
        sb.append(((this.sizeCode == null)?"<null>":this.sizeCode));
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
        result = ((result* 31)+((this.test == null)? 0 :this.test.hashCode()));
        result = ((result* 31)+((this.sizeCode == null)? 0 :this.sizeCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocationTypeExtensions) == false) {
            return false;
        }
        LocationTypeExtensions rhs = ((LocationTypeExtensions) other);
        return (((this.test == rhs.test)||((this.test!= null)&&this.test.equals(rhs.test)))&&((this.sizeCode == rhs.sizeCode)||((this.sizeCode!= null)&&this.sizeCode.equals(rhs.sizeCode))));
    }

}
