
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TransportInstructionTermsType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transportServiceCategoryType",
    "freightTermsCode",
    "transportServiceLevelCode",
    "logisticServiceRequirementCode"
})
@Generated("jsonschema2pojo")
public class TransportInstructionTermsType {

    /**
     * TransportServiceCategoryCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportServiceCategoryType")
    private TransportServiceCategoryCode transportServiceCategoryType;
    /**
     * TransportPaymentMethodCode
     * <p>
     * 
     * 
     */
    @JsonProperty("freightTermsCode")
    private TransportPaymentMethodCode freightTermsCode;
    /**
     * TransportServiceLevelCode
     * <p>
     * 
     * 
     */
    @JsonProperty("transportServiceLevelCode")
    private TransportServiceLevelCode transportServiceLevelCode;
    /**
     * Code specifying the type of service required.
     * 
     */
    @JsonProperty("logisticServiceRequirementCode")
    @JsonPropertyDescription("Code specifying the type of service required.")
    private List<LogisticServiceRequirementCode> logisticServiceRequirementCode = new ArrayList<LogisticServiceRequirementCode>();

    /**
     * TransportServiceCategoryCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportServiceCategoryType")
    public TransportServiceCategoryCode getTransportServiceCategoryType() {
        return transportServiceCategoryType;
    }

    /**
     * TransportServiceCategoryCode
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("transportServiceCategoryType")
    public void setTransportServiceCategoryType(TransportServiceCategoryCode transportServiceCategoryType) {
        this.transportServiceCategoryType = transportServiceCategoryType;
    }

    public TransportInstructionTermsType withTransportServiceCategoryType(TransportServiceCategoryCode transportServiceCategoryType) {
        this.transportServiceCategoryType = transportServiceCategoryType;
        return this;
    }

    /**
     * TransportPaymentMethodCode
     * <p>
     * 
     * 
     */
    @JsonProperty("freightTermsCode")
    public TransportPaymentMethodCode getFreightTermsCode() {
        return freightTermsCode;
    }

    /**
     * TransportPaymentMethodCode
     * <p>
     * 
     * 
     */
    @JsonProperty("freightTermsCode")
    public void setFreightTermsCode(TransportPaymentMethodCode freightTermsCode) {
        this.freightTermsCode = freightTermsCode;
    }

    public TransportInstructionTermsType withFreightTermsCode(TransportPaymentMethodCode freightTermsCode) {
        this.freightTermsCode = freightTermsCode;
        return this;
    }

    /**
     * TransportServiceLevelCode
     * <p>
     * 
     * 
     */
    @JsonProperty("transportServiceLevelCode")
    public TransportServiceLevelCode getTransportServiceLevelCode() {
        return transportServiceLevelCode;
    }

    /**
     * TransportServiceLevelCode
     * <p>
     * 
     * 
     */
    @JsonProperty("transportServiceLevelCode")
    public void setTransportServiceLevelCode(TransportServiceLevelCode transportServiceLevelCode) {
        this.transportServiceLevelCode = transportServiceLevelCode;
    }

    public TransportInstructionTermsType withTransportServiceLevelCode(TransportServiceLevelCode transportServiceLevelCode) {
        this.transportServiceLevelCode = transportServiceLevelCode;
        return this;
    }

    /**
     * Code specifying the type of service required.
     * 
     */
    @JsonProperty("logisticServiceRequirementCode")
    public List<LogisticServiceRequirementCode> getLogisticServiceRequirementCode() {
        return logisticServiceRequirementCode;
    }

    /**
     * Code specifying the type of service required.
     * 
     */
    @JsonProperty("logisticServiceRequirementCode")
    public void setLogisticServiceRequirementCode(List<LogisticServiceRequirementCode> logisticServiceRequirementCode) {
        this.logisticServiceRequirementCode = logisticServiceRequirementCode;
    }

    public TransportInstructionTermsType withLogisticServiceRequirementCode(List<LogisticServiceRequirementCode> logisticServiceRequirementCode) {
        this.logisticServiceRequirementCode = logisticServiceRequirementCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportInstructionTermsType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("transportServiceCategoryType");
        sb.append('=');
        sb.append(((this.transportServiceCategoryType == null)?"<null>":this.transportServiceCategoryType));
        sb.append(',');
        sb.append("freightTermsCode");
        sb.append('=');
        sb.append(((this.freightTermsCode == null)?"<null>":this.freightTermsCode));
        sb.append(',');
        sb.append("transportServiceLevelCode");
        sb.append('=');
        sb.append(((this.transportServiceLevelCode == null)?"<null>":this.transportServiceLevelCode));
        sb.append(',');
        sb.append("logisticServiceRequirementCode");
        sb.append('=');
        sb.append(((this.logisticServiceRequirementCode == null)?"<null>":this.logisticServiceRequirementCode));
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
        result = ((result* 31)+((this.transportServiceCategoryType == null)? 0 :this.transportServiceCategoryType.hashCode()));
        result = ((result* 31)+((this.freightTermsCode == null)? 0 :this.freightTermsCode.hashCode()));
        result = ((result* 31)+((this.logisticServiceRequirementCode == null)? 0 :this.logisticServiceRequirementCode.hashCode()));
        result = ((result* 31)+((this.transportServiceLevelCode == null)? 0 :this.transportServiceLevelCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportInstructionTermsType) == false) {
            return false;
        }
        TransportInstructionTermsType rhs = ((TransportInstructionTermsType) other);
        return (((((this.transportServiceCategoryType == rhs.transportServiceCategoryType)||((this.transportServiceCategoryType!= null)&&this.transportServiceCategoryType.equals(rhs.transportServiceCategoryType)))&&((this.freightTermsCode == rhs.freightTermsCode)||((this.freightTermsCode!= null)&&this.freightTermsCode.equals(rhs.freightTermsCode))))&&((this.logisticServiceRequirementCode == rhs.logisticServiceRequirementCode)||((this.logisticServiceRequirementCode!= null)&&this.logisticServiceRequirementCode.equals(rhs.logisticServiceRequirementCode))))&&((this.transportServiceLevelCode == rhs.transportServiceLevelCode)||((this.transportServiceLevelCode!= null)&&this.transportServiceLevelCode.equals(rhs.transportServiceLevelCode))));
    }

}
