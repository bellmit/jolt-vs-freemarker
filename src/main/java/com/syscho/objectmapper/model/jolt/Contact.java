
package com.syscho.objectmapper.model.jolt;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "contactTypeCode",
        "personName",
        "departmentName",
        "jobTitle",
        "communicationChannel",
        "companyName"
})
public class Contact {

    @JsonProperty("contactTypeCode")
    private String contactTypeCode;
    @JsonProperty("personName")
    private String personName;
    @JsonProperty("departmentName")
    private String departmentName;
    @JsonProperty("jobTitle")
    private String jobTitle;
    @JsonProperty("communicationChannel")
    private List<CommunicationChannel> communicationChannel = null;
    @JsonProperty("companyName")
    private String companyName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("contactTypeCode")
    public String getContactTypeCode() {
        return contactTypeCode;
    }

    @JsonProperty("contactTypeCode")
    public void setContactTypeCode(String contactTypeCode) {
        this.contactTypeCode = contactTypeCode;
    }

    @JsonProperty("personName")
    public String getPersonName() {
        return personName;
    }

    @JsonProperty("personName")
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @JsonProperty("departmentName")
    public String getDepartmentName() {
        return departmentName;
    }

    @JsonProperty("departmentName")
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @JsonProperty("jobTitle")
    public String getJobTitle() {
        return jobTitle;
    }

    @JsonProperty("jobTitle")
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @JsonProperty("communicationChannel")
    public List<CommunicationChannel> getCommunicationChannel() {
        return communicationChannel;
    }

    @JsonProperty("communicationChannel")
    public void setCommunicationChannel(List<CommunicationChannel> communicationChannel) {
        this.communicationChannel = communicationChannel;
    }

    @JsonProperty("companyName")
    public String getCompanyName() {
        return companyName;
    }

    @JsonProperty("companyName")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
