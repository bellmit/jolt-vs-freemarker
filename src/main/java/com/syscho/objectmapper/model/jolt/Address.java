
package com.syscho.objectmapper.model.jolt;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "city",
        "cityCode",
        "countryCode",
        "currencyOfPartyCode",
        "languageOfThePartyCode",
        "name",
        "pOBoxNumber",
        "postalCode",
        "state",
        "streetAddressOne",
        "streetAddressTwo",
        "streetAddressThree",
        "geographicalCoordinates",
        "addressDistrict",
        "addressRegion"
})
public class Address {

    @JsonProperty("city")
    private String city;
    @JsonProperty("cityCode")
    private String cityCode;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("currencyOfPartyCode")
    private String currencyOfPartyCode;
    @JsonProperty("languageOfThePartyCode")
    private String languageOfThePartyCode;
    @JsonProperty("name")
    private String name;
    @JsonProperty("pOBoxNumber")
    private String pOBoxNumber;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("state")
    private String state;
    @JsonProperty("streetAddressOne")
    private String streetAddressOne;
    @JsonProperty("streetAddressTwo")
    private String streetAddressTwo;
    @JsonProperty("streetAddressThree")
    private String streetAddressThree;
    @JsonProperty("geographicalCoordinates")
    private GeographicalCoordinates geographicalCoordinates;
    @JsonProperty("addressDistrict")
    private String addressDistrict;
    @JsonProperty("addressRegion")
    private String addressRegion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("cityCode")
    public String getCityCode() {
        return cityCode;
    }

    @JsonProperty("cityCode")
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("currencyOfPartyCode")
    public String getCurrencyOfPartyCode() {
        return currencyOfPartyCode;
    }

    @JsonProperty("currencyOfPartyCode")
    public void setCurrencyOfPartyCode(String currencyOfPartyCode) {
        this.currencyOfPartyCode = currencyOfPartyCode;
    }

    @JsonProperty("languageOfThePartyCode")
    public String getLanguageOfThePartyCode() {
        return languageOfThePartyCode;
    }

    @JsonProperty("languageOfThePartyCode")
    public void setLanguageOfThePartyCode(String languageOfThePartyCode) {
        this.languageOfThePartyCode = languageOfThePartyCode;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("pOBoxNumber")
    public String getpOBoxNumber() {
        return pOBoxNumber;
    }

    @JsonProperty("pOBoxNumber")
    public void setpOBoxNumber(String pOBoxNumber) {
        this.pOBoxNumber = pOBoxNumber;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("streetAddressOne")
    public String getStreetAddressOne() {
        return streetAddressOne;
    }

    @JsonProperty("streetAddressOne")
    public void setStreetAddressOne(String streetAddressOne) {
        this.streetAddressOne = streetAddressOne;
    }

    @JsonProperty("streetAddressTwo")
    public String getStreetAddressTwo() {
        return streetAddressTwo;
    }

    @JsonProperty("streetAddressTwo")
    public void setStreetAddressTwo(String streetAddressTwo) {
        this.streetAddressTwo = streetAddressTwo;
    }

    @JsonProperty("streetAddressThree")
    public String getStreetAddressThree() {
        return streetAddressThree;
    }

    @JsonProperty("streetAddressThree")
    public void setStreetAddressThree(String streetAddressThree) {
        this.streetAddressThree = streetAddressThree;
    }

    @JsonProperty("geographicalCoordinates")
    public GeographicalCoordinates getGeographicalCoordinates() {
        return geographicalCoordinates;
    }

    @JsonProperty("geographicalCoordinates")
    public void setGeographicalCoordinates(GeographicalCoordinates geographicalCoordinates) {
        this.geographicalCoordinates = geographicalCoordinates;
    }

    @JsonProperty("addressDistrict")
    public String getAddressDistrict() {
        return addressDistrict;
    }

    @JsonProperty("addressDistrict")
    public void setAddressDistrict(String addressDistrict) {
        this.addressDistrict = addressDistrict;
    }

    @JsonProperty("addressRegion")
    public String getAddressRegion() {
        return addressRegion;
    }

    @JsonProperty("addressRegion")
    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
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
