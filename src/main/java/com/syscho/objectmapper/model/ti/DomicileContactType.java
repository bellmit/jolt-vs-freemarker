
package com.syscho.objectmapper.model.ti;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DomicileContactType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "contactTypeCode",
    "personName",
    "departmentName",
    "jobTitle",
    "communicationChannel",
    "companyName",
    "isPrimaryContact",
    "languageCode"
})
@Generated("jsonschema2pojo")
public class DomicileContactType {

    /**
     * ContactTypeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("contactTypeCode")
    private ContactTypeCode contactTypeCode;
    /**
     * The name of the individual that can be contacted to provide additional information
     * 
     */
    @JsonProperty("personName")
    @JsonPropertyDescription("The name of the individual that can be contacted to provide additional information")
    private String personName;
    /**
     * The name of the department that can be contacted to provide additional information
     * 
     */
    @JsonProperty("departmentName")
    @JsonPropertyDescription("The name of the department that can be contacted to provide additional information")
    private String departmentName;
    /**
     * The job title of the person that can be contacted.
     * 
     */
    @JsonProperty("jobTitle")
    @JsonPropertyDescription("The job title of the person that can be contacted.")
    private String jobTitle;
    /**
     * The channel or manner in which a communication can be made, such as telephone or email.
     * 
     */
    @JsonProperty("communicationChannel")
    @JsonPropertyDescription("The channel or manner in which a communication can be made, such as telephone or email.")
    private List<CommunicationChannelType> communicationChannel = new ArrayList<CommunicationChannelType>();
    /**
     * The name of the company of this contact.
     * 
     */
    @JsonProperty("companyName")
    @JsonPropertyDescription("The name of the company of this contact.")
    private String companyName;
    /**
     * An indicator that determines whether the contact is a primary contact.
     * 
     */
    @JsonProperty("isPrimaryContact")
    @JsonPropertyDescription("An indicator that determines whether the contact is a primary contact.")
    private Boolean isPrimaryContact;
    /**
     * LanguageCode
     * <p>
     * 
     * 
     */
    @JsonProperty("languageCode")
    private LanguageCode languageCode;

    /**
     * ContactTypeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("contactTypeCode")
    public ContactTypeCode getContactTypeCode() {
        return contactTypeCode;
    }

    /**
     * ContactTypeCode
     * <p>
     * 
     * 
     */
    @JsonProperty("contactTypeCode")
    public void setContactTypeCode(ContactTypeCode contactTypeCode) {
        this.contactTypeCode = contactTypeCode;
    }

    public DomicileContactType withContactTypeCode(ContactTypeCode contactTypeCode) {
        this.contactTypeCode = contactTypeCode;
        return this;
    }

    /**
     * The name of the individual that can be contacted to provide additional information
     * 
     */
    @JsonProperty("personName")
    public String getPersonName() {
        return personName;
    }

    /**
     * The name of the individual that can be contacted to provide additional information
     * 
     */
    @JsonProperty("personName")
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public DomicileContactType withPersonName(String personName) {
        this.personName = personName;
        return this;
    }

    /**
     * The name of the department that can be contacted to provide additional information
     * 
     */
    @JsonProperty("departmentName")
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * The name of the department that can be contacted to provide additional information
     * 
     */
    @JsonProperty("departmentName")
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public DomicileContactType withDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }

    /**
     * The job title of the person that can be contacted.
     * 
     */
    @JsonProperty("jobTitle")
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * The job title of the person that can be contacted.
     * 
     */
    @JsonProperty("jobTitle")
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public DomicileContactType withJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * The channel or manner in which a communication can be made, such as telephone or email.
     * 
     */
    @JsonProperty("communicationChannel")
    public List<CommunicationChannelType> getCommunicationChannel() {
        return communicationChannel;
    }

    /**
     * The channel or manner in which a communication can be made, such as telephone or email.
     * 
     */
    @JsonProperty("communicationChannel")
    public void setCommunicationChannel(List<CommunicationChannelType> communicationChannel) {
        this.communicationChannel = communicationChannel;
    }

    public DomicileContactType withCommunicationChannel(List<CommunicationChannelType> communicationChannel) {
        this.communicationChannel = communicationChannel;
        return this;
    }

    /**
     * The name of the company of this contact.
     * 
     */
    @JsonProperty("companyName")
    public String getCompanyName() {
        return companyName;
    }

    /**
     * The name of the company of this contact.
     * 
     */
    @JsonProperty("companyName")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public DomicileContactType withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * An indicator that determines whether the contact is a primary contact.
     * 
     */
    @JsonProperty("isPrimaryContact")
    public Boolean getIsPrimaryContact() {
        return isPrimaryContact;
    }

    /**
     * An indicator that determines whether the contact is a primary contact.
     * 
     */
    @JsonProperty("isPrimaryContact")
    public void setIsPrimaryContact(Boolean isPrimaryContact) {
        this.isPrimaryContact = isPrimaryContact;
    }

    public DomicileContactType withIsPrimaryContact(Boolean isPrimaryContact) {
        this.isPrimaryContact = isPrimaryContact;
        return this;
    }

    /**
     * LanguageCode
     * <p>
     * 
     * 
     */
    @JsonProperty("languageCode")
    public LanguageCode getLanguageCode() {
        return languageCode;
    }

    /**
     * LanguageCode
     * <p>
     * 
     * 
     */
    @JsonProperty("languageCode")
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
    }

    public DomicileContactType withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DomicileContactType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("contactTypeCode");
        sb.append('=');
        sb.append(((this.contactTypeCode == null)?"<null>":this.contactTypeCode));
        sb.append(',');
        sb.append("personName");
        sb.append('=');
        sb.append(((this.personName == null)?"<null>":this.personName));
        sb.append(',');
        sb.append("departmentName");
        sb.append('=');
        sb.append(((this.departmentName == null)?"<null>":this.departmentName));
        sb.append(',');
        sb.append("jobTitle");
        sb.append('=');
        sb.append(((this.jobTitle == null)?"<null>":this.jobTitle));
        sb.append(',');
        sb.append("communicationChannel");
        sb.append('=');
        sb.append(((this.communicationChannel == null)?"<null>":this.communicationChannel));
        sb.append(',');
        sb.append("companyName");
        sb.append('=');
        sb.append(((this.companyName == null)?"<null>":this.companyName));
        sb.append(',');
        sb.append("isPrimaryContact");
        sb.append('=');
        sb.append(((this.isPrimaryContact == null)?"<null>":this.isPrimaryContact));
        sb.append(',');
        sb.append("languageCode");
        sb.append('=');
        sb.append(((this.languageCode == null)?"<null>":this.languageCode));
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
        result = ((result* 31)+((this.personName == null)? 0 :this.personName.hashCode()));
        result = ((result* 31)+((this.departmentName == null)? 0 :this.departmentName.hashCode()));
        result = ((result* 31)+((this.communicationChannel == null)? 0 :this.communicationChannel.hashCode()));
        result = ((result* 31)+((this.contactTypeCode == null)? 0 :this.contactTypeCode.hashCode()));
        result = ((result* 31)+((this.jobTitle == null)? 0 :this.jobTitle.hashCode()));
        result = ((result* 31)+((this.companyName == null)? 0 :this.companyName.hashCode()));
        result = ((result* 31)+((this.isPrimaryContact == null)? 0 :this.isPrimaryContact.hashCode()));
        result = ((result* 31)+((this.languageCode == null)? 0 :this.languageCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomicileContactType) == false) {
            return false;
        }
        DomicileContactType rhs = ((DomicileContactType) other);
        return (((((((((this.personName == rhs.personName)||((this.personName!= null)&&this.personName.equals(rhs.personName)))&&((this.departmentName == rhs.departmentName)||((this.departmentName!= null)&&this.departmentName.equals(rhs.departmentName))))&&((this.communicationChannel == rhs.communicationChannel)||((this.communicationChannel!= null)&&this.communicationChannel.equals(rhs.communicationChannel))))&&((this.contactTypeCode == rhs.contactTypeCode)||((this.contactTypeCode!= null)&&this.contactTypeCode.equals(rhs.contactTypeCode))))&&((this.jobTitle == rhs.jobTitle)||((this.jobTitle!= null)&&this.jobTitle.equals(rhs.jobTitle))))&&((this.companyName == rhs.companyName)||((this.companyName!= null)&&this.companyName.equals(rhs.companyName))))&&((this.isPrimaryContact == rhs.isPrimaryContact)||((this.isPrimaryContact!= null)&&this.isPrimaryContact.equals(rhs.isPrimaryContact))))&&((this.languageCode == rhs.languageCode)||((this.languageCode!= null)&&this.languageCode.equals(rhs.languageCode))));
    }

}
