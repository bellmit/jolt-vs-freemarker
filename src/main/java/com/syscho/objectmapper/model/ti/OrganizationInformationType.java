
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OrganizationInformationType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customerIdComponents",
    "componentDelimiter",
    "salesOrganisation",
    "channel",
    "division",
    "customerGroup",
    "accountGroup",
    "salesOffice",
    "preferredWarehouse",
    "extensions",
    "avpList"
})
@Generated("jsonschema2pojo")
public class OrganizationInformationType {

    /**
     * The customer identifier is often composed of concatenated source elements, this will describe the components that make up the identifier, e.g. "SalesOrg, Division"
     * 
     */
    @JsonProperty("customerIdComponents")
    @JsonPropertyDescription("The customer identifier is often composed of concatenated source elements, this will describe the components that make up the identifier, e.g. \"SalesOrg, Division\"")
    private String customerIdComponents;
    /**
     * The delimiter used to construct a multi-element customer identifier, e.g. "_".
     * 
     */
    @JsonProperty("componentDelimiter")
    @JsonPropertyDescription("The delimiter used to construct a multi-element customer identifier, e.g. \"_\".")
    private String componentDelimiter;
    /**
     * The legal entity responsible for the sale and distribution of goods and services in a region.
     * 
     */
    @JsonProperty("salesOrganisation")
    @JsonPropertyDescription("The legal entity responsible for the sale and distribution of goods and services in a region.")
    private String salesOrganisation;
    /**
     * Represents the channel through which materials or services reach customers.
     * 
     */
    @JsonProperty("channel")
    @JsonPropertyDescription("Represents the channel through which materials or services reach customers.")
    private String channel;
    /**
     * The business segment of an organization used to group similar items or product lines.
     * 
     */
    @JsonProperty("division")
    @JsonPropertyDescription("The business segment of an organization used to group similar items or product lines.")
    private String division;
    /**
     * A term used by the business to refer to a collection of similar customers.
     * 
     */
    @JsonProperty("customerGroup")
    @JsonPropertyDescription("A term used by the business to refer to a collection of similar customers.")
    private String customerGroup;
    /**
     * Determines the role of a customer and customer master data.
     * 
     */
    @JsonProperty("accountGroup")
    @JsonPropertyDescription("Determines the role of a customer and customer master data.")
    private String accountGroup;
    /**
     * Sales offices are set up by companies to reach the market in depth. These sales offices are often located in different geographical areas that is covered by a head office.
     * 
     */
    @JsonProperty("salesOffice")
    @JsonPropertyDescription("Sales offices are set up by companies to reach the market in depth. These sales offices are often located in different geographical areas that is covered by a head office.")
    private String salesOffice;
    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("preferredWarehouse")
    private PartyIdentificationType preferredWarehouse;
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
     * The customer identifier is often composed of concatenated source elements, this will describe the components that make up the identifier, e.g. "SalesOrg, Division"
     * 
     */
    @JsonProperty("customerIdComponents")
    public String getCustomerIdComponents() {
        return customerIdComponents;
    }

    /**
     * The customer identifier is often composed of concatenated source elements, this will describe the components that make up the identifier, e.g. "SalesOrg, Division"
     * 
     */
    @JsonProperty("customerIdComponents")
    public void setCustomerIdComponents(String customerIdComponents) {
        this.customerIdComponents = customerIdComponents;
    }

    public OrganizationInformationType withCustomerIdComponents(String customerIdComponents) {
        this.customerIdComponents = customerIdComponents;
        return this;
    }

    /**
     * The delimiter used to construct a multi-element customer identifier, e.g. "_".
     * 
     */
    @JsonProperty("componentDelimiter")
    public String getComponentDelimiter() {
        return componentDelimiter;
    }

    /**
     * The delimiter used to construct a multi-element customer identifier, e.g. "_".
     * 
     */
    @JsonProperty("componentDelimiter")
    public void setComponentDelimiter(String componentDelimiter) {
        this.componentDelimiter = componentDelimiter;
    }

    public OrganizationInformationType withComponentDelimiter(String componentDelimiter) {
        this.componentDelimiter = componentDelimiter;
        return this;
    }

    /**
     * The legal entity responsible for the sale and distribution of goods and services in a region.
     * 
     */
    @JsonProperty("salesOrganisation")
    public String getSalesOrganisation() {
        return salesOrganisation;
    }

    /**
     * The legal entity responsible for the sale and distribution of goods and services in a region.
     * 
     */
    @JsonProperty("salesOrganisation")
    public void setSalesOrganisation(String salesOrganisation) {
        this.salesOrganisation = salesOrganisation;
    }

    public OrganizationInformationType withSalesOrganisation(String salesOrganisation) {
        this.salesOrganisation = salesOrganisation;
        return this;
    }

    /**
     * Represents the channel through which materials or services reach customers.
     * 
     */
    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    /**
     * Represents the channel through which materials or services reach customers.
     * 
     */
    @JsonProperty("channel")
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public OrganizationInformationType withChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * The business segment of an organization used to group similar items or product lines.
     * 
     */
    @JsonProperty("division")
    public String getDivision() {
        return division;
    }

    /**
     * The business segment of an organization used to group similar items or product lines.
     * 
     */
    @JsonProperty("division")
    public void setDivision(String division) {
        this.division = division;
    }

    public OrganizationInformationType withDivision(String division) {
        this.division = division;
        return this;
    }

    /**
     * A term used by the business to refer to a collection of similar customers.
     * 
     */
    @JsonProperty("customerGroup")
    public String getCustomerGroup() {
        return customerGroup;
    }

    /**
     * A term used by the business to refer to a collection of similar customers.
     * 
     */
    @JsonProperty("customerGroup")
    public void setCustomerGroup(String customerGroup) {
        this.customerGroup = customerGroup;
    }

    public OrganizationInformationType withCustomerGroup(String customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     * Determines the role of a customer and customer master data.
     * 
     */
    @JsonProperty("accountGroup")
    public String getAccountGroup() {
        return accountGroup;
    }

    /**
     * Determines the role of a customer and customer master data.
     * 
     */
    @JsonProperty("accountGroup")
    public void setAccountGroup(String accountGroup) {
        this.accountGroup = accountGroup;
    }

    public OrganizationInformationType withAccountGroup(String accountGroup) {
        this.accountGroup = accountGroup;
        return this;
    }

    /**
     * Sales offices are set up by companies to reach the market in depth. These sales offices are often located in different geographical areas that is covered by a head office.
     * 
     */
    @JsonProperty("salesOffice")
    public String getSalesOffice() {
        return salesOffice;
    }

    /**
     * Sales offices are set up by companies to reach the market in depth. These sales offices are often located in different geographical areas that is covered by a head office.
     * 
     */
    @JsonProperty("salesOffice")
    public void setSalesOffice(String salesOffice) {
        this.salesOffice = salesOffice;
    }

    public OrganizationInformationType withSalesOffice(String salesOffice) {
        this.salesOffice = salesOffice;
        return this;
    }

    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("preferredWarehouse")
    public PartyIdentificationType getPreferredWarehouse() {
        return preferredWarehouse;
    }

    /**
     * PartyIdentificationType
     * <p>
     * 
     * 
     */
    @JsonProperty("preferredWarehouse")
    public void setPreferredWarehouse(PartyIdentificationType preferredWarehouse) {
        this.preferredWarehouse = preferredWarehouse;
    }

    public OrganizationInformationType withPreferredWarehouse(PartyIdentificationType preferredWarehouse) {
        this.preferredWarehouse = preferredWarehouse;
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

    public OrganizationInformationType withExtensions(NoCustomExtensionsType extensions) {
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

    public OrganizationInformationType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrganizationInformationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customerIdComponents");
        sb.append('=');
        sb.append(((this.customerIdComponents == null)?"<null>":this.customerIdComponents));
        sb.append(',');
        sb.append("componentDelimiter");
        sb.append('=');
        sb.append(((this.componentDelimiter == null)?"<null>":this.componentDelimiter));
        sb.append(',');
        sb.append("salesOrganisation");
        sb.append('=');
        sb.append(((this.salesOrganisation == null)?"<null>":this.salesOrganisation));
        sb.append(',');
        sb.append("channel");
        sb.append('=');
        sb.append(((this.channel == null)?"<null>":this.channel));
        sb.append(',');
        sb.append("division");
        sb.append('=');
        sb.append(((this.division == null)?"<null>":this.division));
        sb.append(',');
        sb.append("customerGroup");
        sb.append('=');
        sb.append(((this.customerGroup == null)?"<null>":this.customerGroup));
        sb.append(',');
        sb.append("accountGroup");
        sb.append('=');
        sb.append(((this.accountGroup == null)?"<null>":this.accountGroup));
        sb.append(',');
        sb.append("salesOffice");
        sb.append('=');
        sb.append(((this.salesOffice == null)?"<null>":this.salesOffice));
        sb.append(',');
        sb.append("preferredWarehouse");
        sb.append('=');
        sb.append(((this.preferredWarehouse == null)?"<null>":this.preferredWarehouse));
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
        result = ((result* 31)+((this.division == null)? 0 :this.division.hashCode()));
        result = ((result* 31)+((this.customerIdComponents == null)? 0 :this.customerIdComponents.hashCode()));
        result = ((result* 31)+((this.componentDelimiter == null)? 0 :this.componentDelimiter.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.preferredWarehouse == null)? 0 :this.preferredWarehouse.hashCode()));
        result = ((result* 31)+((this.customerGroup == null)? 0 :this.customerGroup.hashCode()));
        result = ((result* 31)+((this.salesOffice == null)? 0 :this.salesOffice.hashCode()));
        result = ((result* 31)+((this.channel == null)? 0 :this.channel.hashCode()));
        result = ((result* 31)+((this.accountGroup == null)? 0 :this.accountGroup.hashCode()));
        result = ((result* 31)+((this.salesOrganisation == null)? 0 :this.salesOrganisation.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrganizationInformationType) == false) {
            return false;
        }
        OrganizationInformationType rhs = ((OrganizationInformationType) other);
        return ((((((((((((this.division == rhs.division)||((this.division!= null)&&this.division.equals(rhs.division)))&&((this.customerIdComponents == rhs.customerIdComponents)||((this.customerIdComponents!= null)&&this.customerIdComponents.equals(rhs.customerIdComponents))))&&((this.componentDelimiter == rhs.componentDelimiter)||((this.componentDelimiter!= null)&&this.componentDelimiter.equals(rhs.componentDelimiter))))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.preferredWarehouse == rhs.preferredWarehouse)||((this.preferredWarehouse!= null)&&this.preferredWarehouse.equals(rhs.preferredWarehouse))))&&((this.customerGroup == rhs.customerGroup)||((this.customerGroup!= null)&&this.customerGroup.equals(rhs.customerGroup))))&&((this.salesOffice == rhs.salesOffice)||((this.salesOffice!= null)&&this.salesOffice.equals(rhs.salesOffice))))&&((this.channel == rhs.channel)||((this.channel!= null)&&this.channel.equals(rhs.channel))))&&((this.accountGroup == rhs.accountGroup)||((this.accountGroup!= null)&&this.accountGroup.equals(rhs.accountGroup))))&&((this.salesOrganisation == rhs.salesOrganisation)||((this.salesOrganisation!= null)&&this.salesOrganisation.equals(rhs.salesOrganisation))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
