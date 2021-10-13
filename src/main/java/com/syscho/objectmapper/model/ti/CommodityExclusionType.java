
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CommodityExclusionType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "commodityId",
    "transportEquipmentTypeCode",
    "equipmentCompartmentId",
    "extensions",
    "avpList"
})
@Generated("jsonschema2pojo")
public class CommodityExclusionType {

    /**
     * EntityIdentificationType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("commodityId")
    private EntityIdentificationType commodityId;
    /**
     * CodeType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportEquipmentTypeCode")
    private CodeType transportEquipmentTypeCode;
    /**
     * The unique identifier that specifies for which compartment in the specified equipment the exclusion is valid.
     * 
     */
    @JsonProperty("equipmentCompartmentId")
    @JsonPropertyDescription("The unique identifier that specifies for which compartment in the specified equipment the exclusion is valid.")
    private String equipmentCompartmentId;
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
     * EntityIdentificationType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("commodityId")
    public EntityIdentificationType getCommodityId() {
        return commodityId;
    }

    /**
     * EntityIdentificationType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("commodityId")
    public void setCommodityId(EntityIdentificationType commodityId) {
        this.commodityId = commodityId;
    }

    public CommodityExclusionType withCommodityId(EntityIdentificationType commodityId) {
        this.commodityId = commodityId;
        return this;
    }

    /**
     * CodeType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportEquipmentTypeCode")
    public CodeType getTransportEquipmentTypeCode() {
        return transportEquipmentTypeCode;
    }

    /**
     * CodeType
     * <p>
     * 
     * 
     */
    @JsonProperty("transportEquipmentTypeCode")
    public void setTransportEquipmentTypeCode(CodeType transportEquipmentTypeCode) {
        this.transportEquipmentTypeCode = transportEquipmentTypeCode;
    }

    public CommodityExclusionType withTransportEquipmentTypeCode(CodeType transportEquipmentTypeCode) {
        this.transportEquipmentTypeCode = transportEquipmentTypeCode;
        return this;
    }

    /**
     * The unique identifier that specifies for which compartment in the specified equipment the exclusion is valid.
     * 
     */
    @JsonProperty("equipmentCompartmentId")
    public String getEquipmentCompartmentId() {
        return equipmentCompartmentId;
    }

    /**
     * The unique identifier that specifies for which compartment in the specified equipment the exclusion is valid.
     * 
     */
    @JsonProperty("equipmentCompartmentId")
    public void setEquipmentCompartmentId(String equipmentCompartmentId) {
        this.equipmentCompartmentId = equipmentCompartmentId;
    }

    public CommodityExclusionType withEquipmentCompartmentId(String equipmentCompartmentId) {
        this.equipmentCompartmentId = equipmentCompartmentId;
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

    public CommodityExclusionType withExtensions(NoCustomExtensionsType extensions) {
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

    public CommodityExclusionType withAvpList(List<EcomStringAttributeValuePairListType> avpList) {
        this.avpList = avpList;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommodityExclusionType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("commodityId");
        sb.append('=');
        sb.append(((this.commodityId == null)?"<null>":this.commodityId));
        sb.append(',');
        sb.append("transportEquipmentTypeCode");
        sb.append('=');
        sb.append(((this.transportEquipmentTypeCode == null)?"<null>":this.transportEquipmentTypeCode));
        sb.append(',');
        sb.append("equipmentCompartmentId");
        sb.append('=');
        sb.append(((this.equipmentCompartmentId == null)?"<null>":this.equipmentCompartmentId));
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
        result = ((result* 31)+((this.equipmentCompartmentId == null)? 0 :this.equipmentCompartmentId.hashCode()));
        result = ((result* 31)+((this.transportEquipmentTypeCode == null)? 0 :this.transportEquipmentTypeCode.hashCode()));
        result = ((result* 31)+((this.extensions == null)? 0 :this.extensions.hashCode()));
        result = ((result* 31)+((this.commodityId == null)? 0 :this.commodityId.hashCode()));
        result = ((result* 31)+((this.avpList == null)? 0 :this.avpList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommodityExclusionType) == false) {
            return false;
        }
        CommodityExclusionType rhs = ((CommodityExclusionType) other);
        return ((((((this.equipmentCompartmentId == rhs.equipmentCompartmentId)||((this.equipmentCompartmentId!= null)&&this.equipmentCompartmentId.equals(rhs.equipmentCompartmentId)))&&((this.transportEquipmentTypeCode == rhs.transportEquipmentTypeCode)||((this.transportEquipmentTypeCode!= null)&&this.transportEquipmentTypeCode.equals(rhs.transportEquipmentTypeCode))))&&((this.extensions == rhs.extensions)||((this.extensions!= null)&&this.extensions.equals(rhs.extensions))))&&((this.commodityId == rhs.commodityId)||((this.commodityId!= null)&&this.commodityId.equals(rhs.commodityId))))&&((this.avpList == rhs.avpList)||((this.avpList!= null)&&this.avpList.equals(rhs.avpList))));
    }

}
