
package com.syscho.objectmapper.model.jolt;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "ingredient",
        "yield",
        "instructions",
        "step",
        "description",
        "xsd"
})
public class Context {

    @JsonProperty("name")
    private String name;
    @JsonProperty("ingredient")
    private String ingredient;
    @JsonProperty("yield")
    private String yield;
    @JsonProperty("instructions")
    private String instructions;
    @JsonProperty("step")
    private Step step;
    @JsonProperty("description")
    private String description;
    @JsonProperty("xsd")
    private String xsd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("ingredient")
    public String getIngredient() {
        return ingredient;
    }

    @JsonProperty("ingredient")
    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    @JsonProperty("yield")
    public String getYield() {
        return yield;
    }

    @JsonProperty("yield")
    public void setYield(String yield) {
        this.yield = yield;
    }

    @JsonProperty("instructions")
    public String getInstructions() {
        return instructions;
    }

    @JsonProperty("instructions")
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @JsonProperty("step")
    public Step getStep() {
        return step;
    }

    @JsonProperty("step")
    public void setStep(Step step) {
        this.step = step;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("xsd")
    public String getXsd() {
        return xsd;
    }

    @JsonProperty("xsd")
    public void setXsd(String xsd) {
        this.xsd = xsd;
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
