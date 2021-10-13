
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CustomerDetailsType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customerClass",
    "priority",
    "statusVerificationCode",
    "itemValidationType",
    "itemFamilyGroup",
    "itemLevelDetailType",
    "shipmentEntryVersionCode",
    "shipmentEntryTypeCode",
    "logisticsGroupCode",
    "organisationalInformation",
    "extensions",
    "avpList"
})
@Generated("jsonschema2pojo")
public class CustomerDetailsType {

    /**
     * Customer Class for Party Customer.
     * 
     */
    @JsonProperty("customerClass")
    @JsonPropertyDescription("Customer Class for Party Customer.")
    private String customerClass;
    /**
     * A term used to express the importance of an order line for this customer in relation to all other customer order lines. If the priority for a specific customer order line or customer order has not been set, the system uses this priority when determining which demand to satisfy first. A value of 1 is most important and higher values are less important. A value of 0 means that no priority has been set, and the Master Planning process will use the priority for all customer order lines for this item.
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("A term used to express the importance of an order line for this customer in relation to all other customer order lines. If the priority for a specific customer order line or customer order has not been set, the system uses this priority when determining which demand to satisfy first. A value of 1 is most important and higher values are less important. A value of 0 means that no priority has been set, and the Master Planning process will use the priority for all customer order lines for this item.")
    private String priority;
    /**
     * CustomerStatusCodeEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("statusVerificationCode")
    private CustomerStatusCodeEnumerationType statusVerificationCode;
    /**
     * ItemValidationTypeEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("itemValidationType")
    private ItemValidationTypeEnumerationType itemValidationType;
    /**
     * A unique code that is used to group similar items together when defining facility policies. Typically, all of the items within a family/group have the same material handling characteristics.
     * 
     */
    @JsonProperty("itemFamilyGroup")
    @JsonPropertyDescription("A unique code that is used to group similar items together when defining facility policies. Typically, all of the items within a family/group have the same material handling characteristics.")
    private String itemFamilyGroup;
    /**
     * ItemLevelDetailEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("itemLevelDetailType")
    private ItemLevelDetailEnumerationType itemLevelDetailType;
    /**
     * ShipmentEntryVersionCode for Customer.
     * 
     */
    @JsonProperty("shipmentEntryVersionCode")
    @JsonPropertyDescription("ShipmentEntryVersionCode for Customer.")
    private String shipmentEntryVersionCode;
    /**
     * The default shipment entry version code. Cannot be changed for an existing Customer.
     * 
     */
    @JsonProperty("shipmentEntryTypeCode")
    @JsonPropertyDescription("The default shipment entry version code. Cannot be changed for an existing Customer.")
    private String shipmentEntryTypeCode;
    /**
     * A term used to classify the shipments being created for the customer. This value will be defaulted for all shipments created for the customer and can be overridden.
     * 
     */
    @JsonProperty("logisticsGroupCode")
    @JsonPropertyDescription("A term used to classify the shipments being created for the customer. This value will be defaulted for all shipments created for the customer and can be overridden.")
    private String logisticsGroupCode;
    /**
     * OrganizationInformationType
     * <p>
     * 
     * 
     */
    @JsonProperty("organisationalInformation")
    private OrganizationInformationType organisationalInformation;
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
     * Customer Class for Party Customer.
     * 
     */
    @JsonProperty("customerClass")
    public String getCustomerClass() {
        return customerClass;
    }

    /**
     * Customer Class for Party Customer.
     * 
     */
    @JsonProperty("customerClass")
    public void setCustomerClass(String customerClass) {
        this.customerClass = customerClass;
    }

    public CustomerDetailsType withCustomerClass(String customerClass) {
        this.customerClass = customerClass;
        return this;
    }

    /**
     * A term used to express the importance of an order line for this customer in relation to all other customer order lines. If the priority for a specific customer order line or customer order has not been set, the system uses this priority when determining which demand to satisfy first. A value of 1 is most important and higher values are less important. A value of 0 means that no priority has been set, and the Master Planning process will use the priority for all customer order lines for this item.
     * 
     */
    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    /**
     * A term used to express the importance of an order line for this customer in relation to all other customer order lines. If the priority for a specific customer order line or customer order has not been set, the system uses this priority when determining which demand to satisfy first. A value of 1 is most important and higher values are less important. A value of 0 means that no priority has been set, and the Master Planning process will use the priority for all customer order lines for this item.
     * 
     */
    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    public CustomerDetailsType withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * CustomerStatusCodeEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("statusVerificationCode")
    public CustomerStatusCodeEnumerationType getStatusVerificationCode() {
        return statusVerificationCode;
    }

    /**
     * CustomerStatusCodeEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("statusVerificationCode")
    public void setStatusVerificationCode(CustomerStatusCodeEnumerationType statusVerificationCode) {
        this.statusVerificationCode = statusVerificationCode;
    }

    public CustomerDetailsType withStatusVerificationCode(CustomerStatusCodeEnumerationType statusVerificationCode) {
        this.statusVerificationCode = statusVerificationCode;
        return this;
    }

    /**
     * ItemValidationTypeEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("itemValidationType")
    public ItemValidationTypeEnumerationType getItemValidationType() {
        return itemValidationType;
    }

    /**
     * ItemValidationTypeEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("itemValidationType")
    public void setItemValidationType(ItemValidationTypeEnumerationType itemValidationType) {
        this.itemValidationType = itemValidationType;
    }

    public CustomerDetailsType withItemValidationType(ItemValidationTypeEnumerationType itemValidationType) {
        this.itemValidationType = itemValidationType;
        return this;
    }

    /**
     * A unique code that is used to group similar items together when defining facility policies. Typically, all of the items within a family/group have the same material handling characteristics.
     * 
     */
    @JsonProperty("itemFamilyGroup")
    public String getItemFamilyGroup() {
        return itemFamilyGroup;
    }

    /**
     * A unique code that is used to group similar items together when defining facility policies. Typically, all of the items within a family/group have the same material handling characteristics.
     * 
     */
    @JsonProperty("itemFamilyGroup")
    public void setItemFamilyGroup(String itemFamilyGroup) {
        this.itemFamilyGroup = itemFamilyGroup;
    }

    public CustomerDetailsType withItemFamilyGroup(String itemFamilyGroup) {
        this.itemFamilyGroup = itemFamilyGroup;
        return this;
    }

    /**
     * ItemLevelDetailEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("itemLevelDetailType")
    public ItemLevelDetailEnumerationType getItemLevelDetailType() {
        return itemLevelDetailType;
    }

    /**
     * ItemLevelDetailEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("itemLevelDetailType")
    public void setItemLevelDetailType(ItemLevelDetailEnumerationType itemLevelDetailType) {
        this.itemLevelDetailType = itemLevelDetailType;
    }

    public CustomerDetailsType withItemLevelDetailType(ItemLevelDetailEnumerationType itemLevelDetailType) {
        this.itemLevelDetailType = itemLevelDetailType;
        return this;
    }

    /**
     * ShipmentEntryVersionCode for Customer.
     * 
     */
    @JsonProperty("shipmentEntryVersionCode")
    public String getShipmentEntryVersionCode() {
        return shipmentEntryVersionCode;
    }

    /**
     * ShipmentEntryVersionCode for Customer.
     * 
     */
    @JsonProperty("shipmentEntryVersionCode")
    public void setShipmentEntryVersionCode(String shipmentEntryVersionCode) {
        this.shipmentEntryVersionCode = shipmentEntryVersionCode;
    }

    public CustomerDetailsType withShipmentEntryVersionCode(String shipmentEntryVersionCode) {
        this.shipmentEntryVersionCode = shipmentEntryVersionCode;
        return this;
    }

    /**
     * The default shipment entry version code. Cannot be changed for an existing Customer.
     * 
     */
    @JsonProperty("shipmentEntryTypeCode")
    public String getShipmentEntryTypeCode() {
        return shipmentEntryTypeCode;
    }

    /**
     * The default shipment entry version code. Cannot be changed for an existing Customer.
     * 
     */
    @JsonProperty("shipmentEntryTypeCode")
    public void setShipmentEntryTypeCode(String shipmentEntryTypeCode) {
        this.shipmentEntryTypeCode = shipmentEntryTypeCode;
    }

    public CustomerDetailsType withShipmentEntryTypeCode(String shipmentEntryTypeCode) {
        this.shipmentEntryTypeCode = shipmentEntryTypeCode;
        return this;
    }

    /**
     * A term used to classify the shipments being created for the customer. This value will be defaulted for all shipments created for the customer and can be overridden.
     * 
     */
    @JsonProperty("logisticsGroupCode")
    public String getLogisticsGroupCode() {
        return logisticsGroupCode;
    }

    /**
     * A term used to classify the shipments being created for the customer. This value will be defaulted for all shipments created for the customer and can be overridden.
     * 
     */
    @JsonProperty("logisticsGroupCode")
    public void setLogisticsGroupCode(String logisticsGroupCode) {
        this.logisticsGroupCode = logisticsGroupCode;
    }

    public CustomerDetailsType withLogisticsGroupCode(String logisticsGroupCode) {
        this.logisticsGroupCode = logisticsGroupCode;
        return this;
    }

    /**
     * OrganizationInformationType
     * <p>
     * 
     * 
     */
    @JsonProperty("organisationalInformation")
    public OrganizationInformationType getOrganisationalInformation() {
        return organisationalInformation;
    }

    /**
     * OrganizationInformationType
     * <p>
     * 
     * 
     */
    @JsonProperty("organisationalInformation")
    public void setOrganisationalInformation(OrganizationInformationType organisationalInformation) {
        this.organisationalInformation = organisationalInformation;
    }

    public CustomerDetailsType withOrganisationalInformation(OrganizationInformationType organisationalInformation) {
        this.organisationalInformation = organisationalInformation;
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

    public CustomerDetailsType withExtensions(NoCustomExtensionsType extensions) {
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

    public CustomerDetailsType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomerDetailsType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customerClass");
        sb.append('=');
        sb.append(((this.customerClass == null)?"<null>":this.customerClass));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("statusVerificationCode");
        sb.append('=');
        sb.append(((this.statusVerificationCode == null)?"<null>":this.statusVerificationCode));
        sb.append(',');
        sb.append("itemValidationType");
        sb.append('=');
        sb.append(((this.itemValidationType == null)?"<null>":this.itemValidationType));
        sb.append(',');
        sb.append("itemFamilyGroup");
        sb.append('=');
        sb.append(((this.itemFamilyGroup == null)?"<null>":this.itemFamilyGroup));
        sb.append(',');
        sb.append("itemLevelDetailType");
        sb.append('=');
        sb.append(((this.itemLevelDetailType == null)?"<null>":this.itemLevelDetailType));
        sb.append(',');
        sb.append("shipmentEntryVersionCode");
        sb.append('=');
        sb.append(((this.shipmentEntryVersionCode == null)?"<null>":this.shipmentEntryVersionCode));
        sb.append(',');
        sb.append("shipmentEntryTypeCode");
        sb.append('=');
        sb.append(((this.shipmentEntryTypeCode == null)?"<null>":this.shipmentEntryTypeCode));
        sb.append(',');
        sb.append("logisticsGroupCode");
        sb.append('=');
        sb.append(((this.logisticsGroupCode == null)?"<null>":this.logisticsGroupCode));
        sb.append(',');
        sb.append("organisationalInformation");
        sb.append('=');
        sb.append(((this.organisationalInformation == null)?"<null>":this.organisationalInformation));
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
        result = ((result* 31)+((this.itemValidationType == null)? 0 :this.itemValidationType.hashCode()));
        result = ((result* 31)+((this.organisationalInformation == null)? 0 :this.organisationalInformation.hashCode()));
        result = ((result* 31)+((this.logisticsGroupCode == null)? 0 :this.logisticsGroupCode.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.shipmentEntryVersionCode == null)? 0 :this.shipmentEntryVersionCode.hashCode()));
        result = ((result* 31)+((this.itemFamilyGroup == null)? 0 :this.itemFamilyGroup.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.statusVerificationCode == null)? 0 :this.statusVerificationCode.hashCode()));
        result = ((result* 31)+((this.customerClass == null)? 0 :this.customerClass.hashCode()));
        result = ((result* 31)+((this.shipmentEntryTypeCode == null)? 0 :this.shipmentEntryTypeCode.hashCode()));
        result = ((result* 31)+((this.itemLevelDetailType == null)? 0 :this.itemLevelDetailType.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomerDetailsType) == false) {
            return false;
        }
        CustomerDetailsType rhs = ((CustomerDetailsType) other);
        return (((((((((((((this.itemValidationType == rhs.itemValidationType)||((this.itemValidationType!= null)&&this.itemValidationType.equals(rhs.itemValidationType)))&&((this.organisationalInformation == rhs.organisationalInformation)||((this.organisationalInformation!= null)&&this.organisationalInformation.equals(rhs.organisationalInformation))))&&((this.logisticsGroupCode == rhs.logisticsGroupCode)||((this.logisticsGroupCode!= null)&&this.logisticsGroupCode.equals(rhs.logisticsGroupCode))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.shipmentEntryVersionCode == rhs.shipmentEntryVersionCode)||((this.shipmentEntryVersionCode!= null)&&this.shipmentEntryVersionCode.equals(rhs.shipmentEntryVersionCode))))&&((this.itemFamilyGroup == rhs.itemFamilyGroup)||((this.itemFamilyGroup!= null)&&this.itemFamilyGroup.equals(rhs.itemFamilyGroup))))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.statusVerificationCode == rhs.statusVerificationCode)||((this.statusVerificationCode!= null)&&this.statusVerificationCode.equals(rhs.statusVerificationCode))))&&((this.customerClass == rhs.customerClass)||((this.customerClass!= null)&&this.customerClass.equals(rhs.customerClass))))&&((this.shipmentEntryTypeCode == rhs.shipmentEntryTypeCode)||((this.shipmentEntryTypeCode!= null)&&this.shipmentEntryTypeCode.equals(rhs.shipmentEntryTypeCode))))&&((this.itemLevelDetailType == rhs.itemLevelDetailType)||((this.itemLevelDetailType!= null)&&this.itemLevelDetailType.equals(rhs.itemLevelDetailType))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
