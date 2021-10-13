
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * HierarchyInformationType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "memberName",
    "hierarchyId",
    "hierarchyLevelId",
    "hierarchyLevelNumber",
    "ancestry"
})
@Generated("jsonschema2pojo")
public class HierarchyInformationType {

    /**
     * The term by which the member is commonly known by the business.
     * 
     */
    @JsonProperty("memberName")
    @JsonPropertyDescription("The term by which the member is commonly known by the business.")
    private String memberName;
    /**
     * The hierarchy the member belongs to.  If not passed, the value will default to the dimension's primary hierarchy. For example, if the hierarchyIdentifier is not passed for a member in the Item or ItemHiearchyLevelMember message, the hierarchyIdentifier will default to the primary hierarchy in the ITEM dimension.
     * 
     */
    @JsonProperty("hierarchyId")
    @JsonPropertyDescription("The hierarchy the member belongs to.  If not passed, the value will default to the dimension's primary hierarchy. For example, if the hierarchyIdentifier is not passed for a member in the Item or ItemHiearchyLevelMember message, the hierarchyIdentifier will default to the primary hierarchy in the ITEM dimension.")
    private String hierarchyId;
    /**
     * The hierarchy level the member belongs to.  If not passed, the value will default to the lowest Hierarchy Level.
     * 
     */
    @JsonProperty("hierarchyLevelId")
    @JsonPropertyDescription("The hierarchy level the member belongs to.  If not passed, the value will default to the lowest Hierarchy Level.")
    private String hierarchyLevelId;
    /**
     * The hierarchy level number that the member belongs to.  This element is not required.
     * 
     */
    @JsonProperty("hierarchyLevelNumber")
    @JsonPropertyDescription("The hierarchy level number that the member belongs to.  This element is not required.")
    private Integer hierarchyLevelNumber;
    /**
     * Information about the ancestry for this item. The requirement for ancestry content will vary based on the target applications in use, i.e., some applications require only the immediate ancestor, while other applications require the full ancestry to be sent for each member. If the full ancestry is required, ancestors must be loaded starting with the immediate ancestor and then in ascending order. If ancestors in more than one hierarchy need to be sent in the same document, all ancestors in one hierarchy should be sent before starting the ancestors in the next hierarchy.
     * 
     */
    @JsonProperty("ancestry")
    @JsonPropertyDescription("Information about the ancestry for this item. The requirement for ancestry content will vary based on the target applications in use, i.e., some applications require only the immediate ancestor, while other applications require the full ancestry to be sent for each member. If the full ancestry is required, ancestors must be loaded starting with the immediate ancestor and then in ascending order. If ancestors in more than one hierarchy need to be sent in the same document, all ancestors in one hierarchy should be sent before starting the ancestors in the next hierarchy.")
    private List<AncestryType> ancestry = new ArrayList<AncestryType>();

    /**
     * The term by which the member is commonly known by the business.
     * 
     */
    @JsonProperty("memberName")
    public String getMemberName() {
        return memberName;
    }

    /**
     * The term by which the member is commonly known by the business.
     * 
     */
    @JsonProperty("memberName")
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public HierarchyInformationType withMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    /**
     * The hierarchy the member belongs to.  If not passed, the value will default to the dimension's primary hierarchy. For example, if the hierarchyIdentifier is not passed for a member in the Item or ItemHiearchyLevelMember message, the hierarchyIdentifier will default to the primary hierarchy in the ITEM dimension.
     * 
     */
    @JsonProperty("hierarchyId")
    public String getHierarchyId() {
        return hierarchyId;
    }

    /**
     * The hierarchy the member belongs to.  If not passed, the value will default to the dimension's primary hierarchy. For example, if the hierarchyIdentifier is not passed for a member in the Item or ItemHiearchyLevelMember message, the hierarchyIdentifier will default to the primary hierarchy in the ITEM dimension.
     * 
     */
    @JsonProperty("hierarchyId")
    public void setHierarchyId(String hierarchyId) {
        this.hierarchyId = hierarchyId;
    }

    public HierarchyInformationType withHierarchyId(String hierarchyId) {
        this.hierarchyId = hierarchyId;
        return this;
    }

    /**
     * The hierarchy level the member belongs to.  If not passed, the value will default to the lowest Hierarchy Level.
     * 
     */
    @JsonProperty("hierarchyLevelId")
    public String getHierarchyLevelId() {
        return hierarchyLevelId;
    }

    /**
     * The hierarchy level the member belongs to.  If not passed, the value will default to the lowest Hierarchy Level.
     * 
     */
    @JsonProperty("hierarchyLevelId")
    public void setHierarchyLevelId(String hierarchyLevelId) {
        this.hierarchyLevelId = hierarchyLevelId;
    }

    public HierarchyInformationType withHierarchyLevelId(String hierarchyLevelId) {
        this.hierarchyLevelId = hierarchyLevelId;
        return this;
    }

    /**
     * The hierarchy level number that the member belongs to.  This element is not required.
     * 
     */
    @JsonProperty("hierarchyLevelNumber")
    public Integer getHierarchyLevelNumber() {
        return hierarchyLevelNumber;
    }

    /**
     * The hierarchy level number that the member belongs to.  This element is not required.
     * 
     */
    @JsonProperty("hierarchyLevelNumber")
    public void setHierarchyLevelNumber(Integer hierarchyLevelNumber) {
        this.hierarchyLevelNumber = hierarchyLevelNumber;
    }

    public HierarchyInformationType withHierarchyLevelNumber(Integer hierarchyLevelNumber) {
        this.hierarchyLevelNumber = hierarchyLevelNumber;
        return this;
    }

    /**
     * Information about the ancestry for this item. The requirement for ancestry content will vary based on the target applications in use, i.e., some applications require only the immediate ancestor, while other applications require the full ancestry to be sent for each member. If the full ancestry is required, ancestors must be loaded starting with the immediate ancestor and then in ascending order. If ancestors in more than one hierarchy need to be sent in the same document, all ancestors in one hierarchy should be sent before starting the ancestors in the next hierarchy.
     * 
     */
    @JsonProperty("ancestry")
    public List<AncestryType> getAncestry() {
        return ancestry;
    }

    /**
     * Information about the ancestry for this item. The requirement for ancestry content will vary based on the target applications in use, i.e., some applications require only the immediate ancestor, while other applications require the full ancestry to be sent for each member. If the full ancestry is required, ancestors must be loaded starting with the immediate ancestor and then in ascending order. If ancestors in more than one hierarchy need to be sent in the same document, all ancestors in one hierarchy should be sent before starting the ancestors in the next hierarchy.
     * 
     */
    @JsonProperty("ancestry")
    public void setAncestry(List<AncestryType> ancestry) {
        this.ancestry = ancestry;
    }

    public HierarchyInformationType withAncestry(List<AncestryType> ancestry) {
        this.ancestry = ancestry;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HierarchyInformationType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("memberName");
        sb.append('=');
        sb.append(((this.memberName == null)?"<null>":this.memberName));
        sb.append(',');
        sb.append("hierarchyId");
        sb.append('=');
        sb.append(((this.hierarchyId == null)?"<null>":this.hierarchyId));
        sb.append(',');
        sb.append("hierarchyLevelId");
        sb.append('=');
        sb.append(((this.hierarchyLevelId == null)?"<null>":this.hierarchyLevelId));
        sb.append(',');
        sb.append("hierarchyLevelNumber");
        sb.append('=');
        sb.append(((this.hierarchyLevelNumber == null)?"<null>":this.hierarchyLevelNumber));
        sb.append(',');
        sb.append("ancestry");
        sb.append('=');
        sb.append(((this.ancestry == null)?"<null>":this.ancestry));
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
        result = ((result* 31)+((this.memberName == null)? 0 :this.memberName.hashCode()));
        result = ((result* 31)+((this.ancestry == null)? 0 :this.ancestry.hashCode()));
        result = ((result* 31)+((this.hierarchyLevelNumber == null)? 0 :this.hierarchyLevelNumber.hashCode()));
        result = ((result* 31)+((this.hierarchyId == null)? 0 :this.hierarchyId.hashCode()));
        result = ((result* 31)+((this.hierarchyLevelId == null)? 0 :this.hierarchyLevelId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HierarchyInformationType) == false) {
            return false;
        }
        HierarchyInformationType rhs = ((HierarchyInformationType) other);
        return ((((((this.memberName == rhs.memberName)||((this.memberName!= null)&&this.memberName.equals(rhs.memberName)))&&((this.ancestry == rhs.ancestry)||((this.ancestry!= null)&&this.ancestry.equals(rhs.ancestry))))&&((this.hierarchyLevelNumber == rhs.hierarchyLevelNumber)||((this.hierarchyLevelNumber!= null)&&this.hierarchyLevelNumber.equals(rhs.hierarchyLevelNumber))))&&((this.hierarchyId == rhs.hierarchyId)||((this.hierarchyId!= null)&&this.hierarchyId.equals(rhs.hierarchyId))))&&((this.hierarchyLevelId == rhs.hierarchyLevelId)||((this.hierarchyLevelId!= null)&&this.hierarchyLevelId.equals(rhs.hierarchyLevelId))));
    }

}
