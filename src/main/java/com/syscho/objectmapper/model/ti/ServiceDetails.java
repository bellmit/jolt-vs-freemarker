
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ServiceDetails
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "serviceLevelCode",
    "carrierType",
    "extensions",
    "avpList"
})
@Generated("jsonschema2pojo")
public class ServiceDetails {

    /**
     * Service Level Code for Carrier.
     * (Required)
     * 
     */
    @JsonProperty("serviceLevelCode")
    @JsonPropertyDescription("Service Level Code for Carrier.")
    private String serviceLevelCode;
    /**
     * Carrier Type for Carrier.
     * (Required)
     * 
     */
    @JsonProperty("carrierType")
    @JsonPropertyDescription("Carrier Type for Carrier.")
    private String carrierType;
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
     * Service Level Code for Carrier.
     * (Required)
     * 
     */
    @JsonProperty("serviceLevelCode")
    public String getServiceLevelCode() {
        return serviceLevelCode;
    }

    /**
     * Service Level Code for Carrier.
     * (Required)
     * 
     */
    @JsonProperty("serviceLevelCode")
    public void setServiceLevelCode(String serviceLevelCode) {
        this.serviceLevelCode = serviceLevelCode;
    }

    public ServiceDetails withServiceLevelCode(String serviceLevelCode) {
        this.serviceLevelCode = serviceLevelCode;
        return this;
    }

    /**
     * Carrier Type for Carrier.
     * (Required)
     * 
     */
    @JsonProperty("carrierType")
    public String getCarrierType() {
        return carrierType;
    }

    /**
     * Carrier Type for Carrier.
     * (Required)
     * 
     */
    @JsonProperty("carrierType")
    public void setCarrierType(String carrierType) {
        this.carrierType = carrierType;
    }

    public ServiceDetails withCarrierType(String carrierType) {
        this.carrierType = carrierType;
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

    public ServiceDetails withExtensions(NoCustomExtensionsType extensions) {
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

    public ServiceDetails withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("serviceLevelCode");
        sb.append('=');
        sb.append(((this.serviceLevelCode == null)?"<null>":this.serviceLevelCode));
        sb.append(',');
        sb.append("carrierType");
        sb.append('=');
        sb.append(((this.carrierType == null)?"<null>":this.carrierType));
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
        result = ((result* 31)+((this.carrierType == null)? 0 :this.carrierType.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.serviceLevelCode == null)? 0 :this.serviceLevelCode.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceDetails) == false) {
            return false;
        }
        ServiceDetails rhs = ((ServiceDetails) other);
        return (((((this.carrierType == rhs.carrierType)||((this.carrierType!= null)&&this.carrierType.equals(rhs.carrierType)))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.serviceLevelCode == rhs.serviceLevelCode)||((this.serviceLevelCode!= null)&&this.serviceLevelCode.equals(rhs.serviceLevelCode))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
