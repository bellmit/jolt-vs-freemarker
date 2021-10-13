
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AncestryType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "actionCode",
    "hierarchyId",
    "hierarchyLevelId",
    "memberId",
    "memberName"
})
@Generated("jsonschema2pojo")
public class AncestryType {

    /**
     * SegmentActionEnumerationType
     * <p>
     * 
     * 
     */
    @JsonProperty("actionCode")
    private SegmentActionEnumerationType actionCode;
    /**
     * The hierarchy to which the ancestry member belongs. If not passed, the value will default to the hierarchyIdentifier assigned to the member.
     * 
     */
    @JsonProperty("hierarchyId")
    @JsonPropertyDescription("The hierarchy to which the ancestry member belongs. If not passed, the value will default to the hierarchyIdentifier assigned to the member.")
    private String hierarchyId;
    /**
     * The hierarchy level identifier to which the ancestry member belongs.
     * (Required)
     * 
     */
    @JsonProperty("hierarchyLevelId")
    @JsonPropertyDescription("The hierarchy level identifier to which the ancestry member belongs.")
    private String hierarchyLevelId;
    /**
     * The set of characters that uniquely references a member of a hierarchy.
     * (Required)
     * 
     */
    @JsonProperty("memberId")
    @JsonPropertyDescription("The set of characters that uniquely references a member of a hierarchy.")
    private String memberId;
    /**
     * The term by which the member is commonly known by the business.
     * 
     */
    @JsonProperty("memberName")
    @JsonPropertyDescription("The term by which the member is commonly known by the business.")
    private String memberName;

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

    public AncestryType withActionCode(SegmentActionEnumerationType actionCode) {
        this.actionCode = actionCode;
        return this;
    }

    /**
     * The hierarchy to which the ancestry member belongs. If not passed, the value will default to the hierarchyIdentifier assigned to the member.
     * 
     */
    @JsonProperty("hierarchyId")
    public String getHierarchyId() {
        return hierarchyId;
    }

    /**
     * The hierarchy to which the ancestry member belongs. If not passed, the value will default to the hierarchyIdentifier assigned to the member.
     * 
     */
    @JsonProperty("hierarchyId")
    public void setHierarchyId(String hierarchyId) {
        this.hierarchyId = hierarchyId;
    }

    public AncestryType withHierarchyId(String hierarchyId) {
        this.hierarchyId = hierarchyId;
        return this;
    }

    /**
     * The hierarchy level identifier to which the ancestry member belongs.
     * (Required)
     * 
     */
    @JsonProperty("hierarchyLevelId")
    public String getHierarchyLevelId() {
        return hierarchyLevelId;
    }

    /**
     * The hierarchy level identifier to which the ancestry member belongs.
     * (Required)
     * 
     */
    @JsonProperty("hierarchyLevelId")
    public void setHierarchyLevelId(String hierarchyLevelId) {
        this.hierarchyLevelId = hierarchyLevelId;
    }

    public AncestryType withHierarchyLevelId(String hierarchyLevelId) {
        this.hierarchyLevelId = hierarchyLevelId;
        return this;
    }

    /**
     * The set of characters that uniquely references a member of a hierarchy.
     * (Required)
     * 
     */
    @JsonProperty("memberId")
    public String getMemberId() {
        return memberId;
    }

    /**
     * The set of characters that uniquely references a member of a hierarchy.
     * (Required)
     * 
     */
    @JsonProperty("memberId")
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public AncestryType withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

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

    public AncestryType withMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AncestryType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("actionCode");
        sb.append('=');
        sb.append(((this.actionCode == null)?"<null>":this.actionCode));
        sb.append(',');
        sb.append("hierarchyId");
        sb.append('=');
        sb.append(((this.hierarchyId == null)?"<null>":this.hierarchyId));
        sb.append(',');
        sb.append("hierarchyLevelId");
        sb.append('=');
        sb.append(((this.hierarchyLevelId == null)?"<null>":this.hierarchyLevelId));
        sb.append(',');
        sb.append("memberId");
        sb.append('=');
        sb.append(((this.memberId == null)?"<null>":this.memberId));
        sb.append(',');
        sb.append("memberName");
        sb.append('=');
        sb.append(((this.memberName == null)?"<null>":this.memberName));
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
        result = ((result* 31)+((this.actionCode == null)? 0 :this.actionCode.hashCode()));
        result = ((result* 31)+((this.hierarchyId == null)? 0 :this.hierarchyId.hashCode()));
        result = ((result* 31)+((this.hierarchyLevelId == null)? 0 :this.hierarchyLevelId.hashCode()));
        result = ((result* 31)+((this.memberId == null)? 0 :this.memberId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AncestryType) == false) {
            return false;
        }
        AncestryType rhs = ((AncestryType) other);
        return ((((((this.memberName == rhs.memberName)||((this.memberName!= null)&&this.memberName.equals(rhs.memberName)))&&((this.actionCode == rhs.actionCode)||((this.actionCode!= null)&&this.actionCode.equals(rhs.actionCode))))&&((this.hierarchyId == rhs.hierarchyId)||((this.hierarchyId!= null)&&this.hierarchyId.equals(rhs.hierarchyId))))&&((this.hierarchyLevelId == rhs.hierarchyLevelId)||((this.hierarchyLevelId!= null)&&this.hierarchyLevelId.equals(rhs.hierarchyLevelId))))&&((this.memberId == rhs.memberId)||((this.memberId!= null)&&this.memberId.equals(rhs.memberId))));
    }

}
