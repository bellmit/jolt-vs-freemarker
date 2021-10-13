
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SupplierDetailsType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "supplierSegment",
    "supplierType",
    "supplierGroup",
    "scopeOfService",
    "supplierRiskProfile"
})
@Generated("jsonschema2pojo")
public class SupplierDetailsType {

    /**
     * The term used by the business to refer to a subset of the overall portfolio of suppliers based on specified criteria. The criteria can be the nature of partnership with supplier, the time horizon of the contract, etc.
     * 
     */
    @JsonProperty("supplierSegment")
    @JsonPropertyDescription("The term used by the business to refer to a subset of the overall portfolio of suppliers based on specified criteria. The criteria can be the nature of partnership with supplier, the time horizon of the contract, etc.")
    private String supplierSegment;
    /**
     * The term used by the business to tag a supplier based on well-defined criteria. Examples of valid values are CONTRACTUAL / NON-CONTRACTUAL etc.
     * 
     */
    @JsonProperty("supplierType")
    @JsonPropertyDescription("The term used by the business to tag a supplier based on well-defined criteria. Examples of valid values are CONTRACTUAL / NON-CONTRACTUAL etc.")
    private String supplierType;
    /**
     * The name of the supplier at a certain hierarchy level. This is the term by which the business entity is known in the community at that hierarchy level.
     * 
     */
    @JsonProperty("supplierGroup")
    @JsonPropertyDescription("The name of the supplier at a certain hierarchy level. This is the term by which the business entity is known in the community at that hierarchy level.")
    private String supplierGroup;
    /**
     * Defines the extent or range of services provided by the supplier in terms of a specific factor. For example, geographical coverage. Valid values can be "LOCAL" or "GLOBAL" etc.
     * 
     */
    @JsonProperty("scopeOfService")
    @JsonPropertyDescription("Defines the extent or range of services provided by the supplier in terms of a specific factor. For example, geographical coverage. Valid values can be \"LOCAL\" or \"GLOBAL\" etc.")
    private String scopeOfService;
    /**
     * This term indicates the reliability of the supplier in terms of order fulfillment, business sustainability etc.
     * 
     */
    @JsonProperty("supplierRiskProfile")
    @JsonPropertyDescription("This term indicates the reliability of the supplier in terms of order fulfillment, business sustainability etc.")
    private String supplierRiskProfile;

    /**
     * The term used by the business to refer to a subset of the overall portfolio of suppliers based on specified criteria. The criteria can be the nature of partnership with supplier, the time horizon of the contract, etc.
     * 
     */
    @JsonProperty("supplierSegment")
    public String getSupplierSegment() {
        return supplierSegment;
    }

    /**
     * The term used by the business to refer to a subset of the overall portfolio of suppliers based on specified criteria. The criteria can be the nature of partnership with supplier, the time horizon of the contract, etc.
     * 
     */
    @JsonProperty("supplierSegment")
    public void setSupplierSegment(String supplierSegment) {
        this.supplierSegment = supplierSegment;
    }

    public SupplierDetailsType withSupplierSegment(String supplierSegment) {
        this.supplierSegment = supplierSegment;
        return this;
    }

    /**
     * The term used by the business to tag a supplier based on well-defined criteria. Examples of valid values are CONTRACTUAL / NON-CONTRACTUAL etc.
     * 
     */
    @JsonProperty("supplierType")
    public String getSupplierType() {
        return supplierType;
    }

    /**
     * The term used by the business to tag a supplier based on well-defined criteria. Examples of valid values are CONTRACTUAL / NON-CONTRACTUAL etc.
     * 
     */
    @JsonProperty("supplierType")
    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }

    public SupplierDetailsType withSupplierType(String supplierType) {
        this.supplierType = supplierType;
        return this;
    }

    /**
     * The name of the supplier at a certain hierarchy level. This is the term by which the business entity is known in the community at that hierarchy level.
     * 
     */
    @JsonProperty("supplierGroup")
    public String getSupplierGroup() {
        return supplierGroup;
    }

    /**
     * The name of the supplier at a certain hierarchy level. This is the term by which the business entity is known in the community at that hierarchy level.
     * 
     */
    @JsonProperty("supplierGroup")
    public void setSupplierGroup(String supplierGroup) {
        this.supplierGroup = supplierGroup;
    }

    public SupplierDetailsType withSupplierGroup(String supplierGroup) {
        this.supplierGroup = supplierGroup;
        return this;
    }

    /**
     * Defines the extent or range of services provided by the supplier in terms of a specific factor. For example, geographical coverage. Valid values can be "LOCAL" or "GLOBAL" etc.
     * 
     */
    @JsonProperty("scopeOfService")
    public String getScopeOfService() {
        return scopeOfService;
    }

    /**
     * Defines the extent or range of services provided by the supplier in terms of a specific factor. For example, geographical coverage. Valid values can be "LOCAL" or "GLOBAL" etc.
     * 
     */
    @JsonProperty("scopeOfService")
    public void setScopeOfService(String scopeOfService) {
        this.scopeOfService = scopeOfService;
    }

    public SupplierDetailsType withScopeOfService(String scopeOfService) {
        this.scopeOfService = scopeOfService;
        return this;
    }

    /**
     * This term indicates the reliability of the supplier in terms of order fulfillment, business sustainability etc.
     * 
     */
    @JsonProperty("supplierRiskProfile")
    public String getSupplierRiskProfile() {
        return supplierRiskProfile;
    }

    /**
     * This term indicates the reliability of the supplier in terms of order fulfillment, business sustainability etc.
     * 
     */
    @JsonProperty("supplierRiskProfile")
    public void setSupplierRiskProfile(String supplierRiskProfile) {
        this.supplierRiskProfile = supplierRiskProfile;
    }

    public SupplierDetailsType withSupplierRiskProfile(String supplierRiskProfile) {
        this.supplierRiskProfile = supplierRiskProfile;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SupplierDetailsType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("supplierSegment");
        sb.append('=');
        sb.append(((this.supplierSegment == null)?"<null>":this.supplierSegment));
        sb.append(',');
        sb.append("supplierType");
        sb.append('=');
        sb.append(((this.supplierType == null)?"<null>":this.supplierType));
        sb.append(',');
        sb.append("supplierGroup");
        sb.append('=');
        sb.append(((this.supplierGroup == null)?"<null>":this.supplierGroup));
        sb.append(',');
        sb.append("scopeOfService");
        sb.append('=');
        sb.append(((this.scopeOfService == null)?"<null>":this.scopeOfService));
        sb.append(',');
        sb.append("supplierRiskProfile");
        sb.append('=');
        sb.append(((this.supplierRiskProfile == null)?"<null>":this.supplierRiskProfile));
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
        result = ((result* 31)+((this.supplierSegment == null)? 0 :this.supplierSegment.hashCode()));
        result = ((result* 31)+((this.supplierGroup == null)? 0 :this.supplierGroup.hashCode()));
        result = ((result* 31)+((this.supplierType == null)? 0 :this.supplierType.hashCode()));
        result = ((result* 31)+((this.scopeOfService == null)? 0 :this.scopeOfService.hashCode()));
        result = ((result* 31)+((this.supplierRiskProfile == null)? 0 :this.supplierRiskProfile.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SupplierDetailsType) == false) {
            return false;
        }
        SupplierDetailsType rhs = ((SupplierDetailsType) other);
        return ((((((this.supplierSegment == rhs.supplierSegment)||((this.supplierSegment!= null)&&this.supplierSegment.equals(rhs.supplierSegment)))&&((this.supplierGroup == rhs.supplierGroup)||((this.supplierGroup!= null)&&this.supplierGroup.equals(rhs.supplierGroup))))&&((this.supplierType == rhs.supplierType)||((this.supplierType!= null)&&this.supplierType.equals(rhs.supplierType))))&&((this.scopeOfService == rhs.scopeOfService)||((this.scopeOfService!= null)&&this.scopeOfService.equals(rhs.scopeOfService))))&&((this.supplierRiskProfile == rhs.supplierRiskProfile)||((this.supplierRiskProfile!= null)&&this.supplierRiskProfile.equals(rhs.supplierRiskProfile))));
    }

}
