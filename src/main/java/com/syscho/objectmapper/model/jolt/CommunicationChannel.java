
package com.syscho.objectmapper.model.jolt;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "communicationChannelCode",
        "communicationValue",
        "communicationChannelName"
})
public class CommunicationChannel {

    @JsonProperty("communicationChannelCode")
    private String communicationChannelCode;
    @JsonProperty("communicationValue")
    private String communicationValue;
    @JsonProperty("communicationChannelName")
    private String communicationChannelName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("communicationChannelCode")
    public String getCommunicationChannelCode() {
        return communicationChannelCode;
    }

    @JsonProperty("communicationChannelCode")
    public void setCommunicationChannelCode(String communicationChannelCode) {
        this.communicationChannelCode = communicationChannelCode;
    }

    @JsonProperty("communicationValue")
    public String getCommunicationValue() {
        return communicationValue;
    }

    @JsonProperty("communicationValue")
    public void setCommunicationValue(String communicationValue) {
        this.communicationValue = communicationValue;
    }

    @JsonProperty("communicationChannelName")
    public String getCommunicationChannelName() {
        return communicationChannelName;
    }

    @JsonProperty("communicationChannelName")
    public void setCommunicationChannelName(String communicationChannelName) {
        this.communicationChannelName = communicationChannelName;
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
