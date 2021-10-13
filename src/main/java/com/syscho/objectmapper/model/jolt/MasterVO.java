
package com.syscho.objectmapper.model.jolt;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "address",
        "contact",
        "comment",
        "context",
        "name",
        "ingredient",
        "dummyTest",
        "yield",
        "instructions"
})
public class MasterVO {

    @JsonProperty("address")
    private Address address;
    @JsonProperty("contact")
    private List<Contact> contact = null;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("context")
    private Context context;
    @JsonProperty("name")
    private String name;
    @JsonProperty("ingredient")
    private List<String> ingredient = null;
    @JsonProperty("dummyTest")
    private List<DummyTest> dummyTest = null;
    @JsonProperty("yield")
    private String yield;
    @JsonProperty("instructions")
    private List<Instruction> instructions = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("contact")
    public List<Contact> getContact() {
        return contact;
    }

    @JsonProperty("contact")
    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonProperty("context")
    public Context getContext() {
        return context;
    }

    @JsonProperty("context")
    public void setContext(Context context) {
        this.context = context;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("ingredient")
    public List<String> getIngredient() {
        return ingredient;
    }

    @JsonProperty("ingredient")
    public void setIngredient(List<String> ingredient) {
        this.ingredient = ingredient;
    }

    @JsonProperty("dummyTest")
    public List<DummyTest> getDummyTest() {
        return dummyTest;
    }

    @JsonProperty("dummyTest")
    public void setDummyTest(List<DummyTest> dummyTest) {
        this.dummyTest = dummyTest;
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
    public List<Instruction> getInstructions() {
        return instructions;
    }

    @JsonProperty("instructions")
    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
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
