
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TransportationAddressType
 * <p>
 * 
 * 
 */
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
    "addressRegion",
    "note",
    "areGeographicalCoordinatesOverridden",
    "areGeographicalCoordinatesRecalculated",
    "isResidentialAddress"
})
@Generated("jsonschema2pojo")
public class TransportationAddressType {

    /**
     * Text specifying the name of the city.
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("Text specifying the name of the city.")
    private String city;
    /**
     * Identifier for a city, expressed as a short code rather than the full name
     * 
     */
    @JsonProperty("cityCode")
    @JsonPropertyDescription("Identifier for a city, expressed as a short code rather than the full name")
    private String cityCode;
    /**
     * CountryCode
     * <p>
     * 
     * 
     */
    @JsonProperty("countryCode")
    private CountryCode countryCode;
    /**
     * CurrencyCode
     * <p>
     * 
     * 
     */
    @JsonProperty("currencyOfPartyCode")
    private CurrencyCode currencyOfPartyCode;
    /**
     * LanguageCode
     * <p>
     * 
     * 
     */
    @JsonProperty("languageOfThePartyCode")
    private LanguageCode languageOfThePartyCode;
    /**
     * The name of the party expressed in text.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the party expressed in text.")
    private String name;
    /**
     * The number that identifies a PO box. A PO box is a box in a post office or other postal service location assigned to an organization where postal items may be kept.
     * 
     */
    @JsonProperty("pOBoxNumber")
    @JsonPropertyDescription("The number that identifies a PO box. A PO box is a box in a post office or other postal service location assigned to an organization where postal items may be kept.")
    private String pOBoxNumber;
    /**
     * Text specifying the postal code for an address.
     * 
     */
    @JsonProperty("postalCode")
    @JsonPropertyDescription("Text specifying the postal code for an address.")
    private String postalCode;
    /**
     * One of the constituent units of a nation having a federal government.
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("One of the constituent units of a nation having a federal government.")
    private String state;
    /**
     * The first free form line of an address. This first part is printed on paper as the first line below the name. For example, the name of the street and the number in the street or the name of a building.
     * 
     */
    @JsonProperty("streetAddressOne")
    @JsonPropertyDescription("The first free form line of an address. This first part is printed on paper as the first line below the name. For example, the name of the street and the number in the street or the name of a building.")
    private String streetAddressOne;
    /**
     * The second free form line of an address. This second part is printed on paper as the second line below the name. The second free form line complements the first free form line to locate the party e.g. floor number, name of a building, suite number or
     * 
     */
    @JsonProperty("streetAddressTwo")
    @JsonPropertyDescription("The second free form line of an address. This second part is printed on paper as the second line below the name. The second free form line complements the first free form line to locate the party e.g. floor number, name of a building, suite number or")
    private String streetAddressTwo;
    /**
     * The third free form line of an address. This third part is printed on paper as the third line below the name. The third free form line complements the first and second free form lines where necessary.
     * 
     */
    @JsonProperty("streetAddressThree")
    @JsonPropertyDescription("The third free form line of an address. This third part is printed on paper as the third line below the name. The third free form line complements the first and second free form lines where necessary.")
    private String streetAddressThree;
    /**
     * GeographicalCoordinatesType
     * <p>
     * 
     * 
     */
    @JsonProperty("geographicalCoordinates")
    private GeographicalCoordinatesType geographicalCoordinates;
    /**
     * The district of the address.
     * 
     */
    @JsonProperty("addressDistrict")
    @JsonPropertyDescription("The district of the address.")
    private String addressDistrict;
    /**
     * The region of the address.
     * 
     */
    @JsonProperty("addressRegion")
    @JsonPropertyDescription("The region of the address.")
    private String addressRegion;
    /**
     * Description500Type
     * <p>
     * 
     * 
     */
    @JsonProperty("note")
    private Description500Type note;
    /**
     * An indicator that determines whether the latitude or longitude values have been manually overridden.
     * 
     */
    @JsonProperty("areGeographicalCoordinatesOverridden")
    @JsonPropertyDescription("An indicator that determines whether the latitude or longitude values have been manually overridden.")
    private Boolean areGeographicalCoordinatesOverridden;
    /**
     * An indicator that determines whether latitude and longitude values are to be recalculated using a distance engine.
     * 
     */
    @JsonProperty("areGeographicalCoordinatesRecalculated")
    @JsonPropertyDescription("An indicator that determines whether latitude and longitude values are to be recalculated using a distance engine.")
    private Boolean areGeographicalCoordinatesRecalculated;
    /**
     * An indicator that determines whether the address is a residential address. If omitted from input, false will be assumed.
     * 
     */
    @JsonProperty("isResidentialAddress")
    @JsonPropertyDescription("An indicator that determines whether the address is a residential address. If omitted from input, false will be assumed.")
    private Boolean isResidentialAddress;

    /**
     * Text specifying the name of the city.
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * Text specifying the name of the city.
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public TransportationAddressType withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Identifier for a city, expressed as a short code rather than the full name
     * 
     */
    @JsonProperty("cityCode")
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Identifier for a city, expressed as a short code rather than the full name
     * 
     */
    @JsonProperty("cityCode")
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public TransportationAddressType withCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }

    /**
     * CountryCode
     * <p>
     * 
     * 
     */
    @JsonProperty("countryCode")
    public CountryCode getCountryCode() {
        return countryCode;
    }

    /**
     * CountryCode
     * <p>
     * 
     * 
     */
    @JsonProperty("countryCode")
    public void setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
    }

    public TransportationAddressType withCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * CurrencyCode
     * <p>
     * 
     * 
     */
    @JsonProperty("currencyOfPartyCode")
    public CurrencyCode getCurrencyOfPartyCode() {
        return currencyOfPartyCode;
    }

    /**
     * CurrencyCode
     * <p>
     * 
     * 
     */
    @JsonProperty("currencyOfPartyCode")
    public void setCurrencyOfPartyCode(CurrencyCode currencyOfPartyCode) {
        this.currencyOfPartyCode = currencyOfPartyCode;
    }

    public TransportationAddressType withCurrencyOfPartyCode(CurrencyCode currencyOfPartyCode) {
        this.currencyOfPartyCode = currencyOfPartyCode;
        return this;
    }

    /**
     * LanguageCode
     * <p>
     * 
     * 
     */
    @JsonProperty("languageOfThePartyCode")
    public LanguageCode getLanguageOfThePartyCode() {
        return languageOfThePartyCode;
    }

    /**
     * LanguageCode
     * <p>
     * 
     * 
     */
    @JsonProperty("languageOfThePartyCode")
    public void setLanguageOfThePartyCode(LanguageCode languageOfThePartyCode) {
        this.languageOfThePartyCode = languageOfThePartyCode;
    }

    public TransportationAddressType withLanguageOfThePartyCode(LanguageCode languageOfThePartyCode) {
        this.languageOfThePartyCode = languageOfThePartyCode;
        return this;
    }

    /**
     * The name of the party expressed in text.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the party expressed in text.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public TransportationAddressType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The number that identifies a PO box. A PO box is a box in a post office or other postal service location assigned to an organization where postal items may be kept.
     * 
     */
    @JsonProperty("pOBoxNumber")
    public String getpOBoxNumber() {
        return pOBoxNumber;
    }

    /**
     * The number that identifies a PO box. A PO box is a box in a post office or other postal service location assigned to an organization where postal items may be kept.
     * 
     */
    @JsonProperty("pOBoxNumber")
    public void setpOBoxNumber(String pOBoxNumber) {
        this.pOBoxNumber = pOBoxNumber;
    }

    public TransportationAddressType withpOBoxNumber(String pOBoxNumber) {
        this.pOBoxNumber = pOBoxNumber;
        return this;
    }

    /**
     * Text specifying the postal code for an address.
     * 
     */
    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Text specifying the postal code for an address.
     * 
     */
    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public TransportationAddressType withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * One of the constituent units of a nation having a federal government.
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * One of the constituent units of a nation having a federal government.
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public TransportationAddressType withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The first free form line of an address. This first part is printed on paper as the first line below the name. For example, the name of the street and the number in the street or the name of a building.
     * 
     */
    @JsonProperty("streetAddressOne")
    public String getStreetAddressOne() {
        return streetAddressOne;
    }

    /**
     * The first free form line of an address. This first part is printed on paper as the first line below the name. For example, the name of the street and the number in the street or the name of a building.
     * 
     */
    @JsonProperty("streetAddressOne")
    public void setStreetAddressOne(String streetAddressOne) {
        this.streetAddressOne = streetAddressOne;
    }

    public TransportationAddressType withStreetAddressOne(String streetAddressOne) {
        this.streetAddressOne = streetAddressOne;
        return this;
    }

    /**
     * The second free form line of an address. This second part is printed on paper as the second line below the name. The second free form line complements the first free form line to locate the party e.g. floor number, name of a building, suite number or
     * 
     */
    @JsonProperty("streetAddressTwo")
    public String getStreetAddressTwo() {
        return streetAddressTwo;
    }

    /**
     * The second free form line of an address. This second part is printed on paper as the second line below the name. The second free form line complements the first free form line to locate the party e.g. floor number, name of a building, suite number or
     * 
     */
    @JsonProperty("streetAddressTwo")
    public void setStreetAddressTwo(String streetAddressTwo) {
        this.streetAddressTwo = streetAddressTwo;
    }

    public TransportationAddressType withStreetAddressTwo(String streetAddressTwo) {
        this.streetAddressTwo = streetAddressTwo;
        return this;
    }

    /**
     * The third free form line of an address. This third part is printed on paper as the third line below the name. The third free form line complements the first and second free form lines where necessary.
     * 
     */
    @JsonProperty("streetAddressThree")
    public String getStreetAddressThree() {
        return streetAddressThree;
    }

    /**
     * The third free form line of an address. This third part is printed on paper as the third line below the name. The third free form line complements the first and second free form lines where necessary.
     * 
     */
    @JsonProperty("streetAddressThree")
    public void setStreetAddressThree(String streetAddressThree) {
        this.streetAddressThree = streetAddressThree;
    }

    public TransportationAddressType withStreetAddressThree(String streetAddressThree) {
        this.streetAddressThree = streetAddressThree;
        return this;
    }

    /**
     * GeographicalCoordinatesType
     * <p>
     * 
     * 
     */
    @JsonProperty("geographicalCoordinates")
    public GeographicalCoordinatesType getGeographicalCoordinates() {
        return geographicalCoordinates;
    }

    /**
     * GeographicalCoordinatesType
     * <p>
     * 
     * 
     */
    @JsonProperty("geographicalCoordinates")
    public void setGeographicalCoordinates(GeographicalCoordinatesType geographicalCoordinates) {
        this.geographicalCoordinates = geographicalCoordinates;
    }

    public TransportationAddressType withGeographicalCoordinates(GeographicalCoordinatesType geographicalCoordinates) {
        this.geographicalCoordinates = geographicalCoordinates;
        return this;
    }

    /**
     * The district of the address.
     * 
     */
    @JsonProperty("addressDistrict")
    public String getAddressDistrict() {
        return addressDistrict;
    }

    /**
     * The district of the address.
     * 
     */
    @JsonProperty("addressDistrict")
    public void setAddressDistrict(String addressDistrict) {
        this.addressDistrict = addressDistrict;
    }

    public TransportationAddressType withAddressDistrict(String addressDistrict) {
        this.addressDistrict = addressDistrict;
        return this;
    }

    /**
     * The region of the address.
     * 
     */
    @JsonProperty("addressRegion")
    public String getAddressRegion() {
        return addressRegion;
    }

    /**
     * The region of the address.
     * 
     */
    @JsonProperty("addressRegion")
    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    public TransportationAddressType withAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
        return this;
    }

    /**
     * Description500Type
     * <p>
     * 
     * 
     */
    @JsonProperty("note")
    public Description500Type getNote() {
        return note;
    }

    /**
     * Description500Type
     * <p>
     * 
     * 
     */
    @JsonProperty("note")
    public void setNote(Description500Type note) {
        this.note = note;
    }

    public TransportationAddressType withNote(Description500Type note) {
        this.note = note;
        return this;
    }

    /**
     * An indicator that determines whether the latitude or longitude values have been manually overridden.
     * 
     */
    @JsonProperty("areGeographicalCoordinatesOverridden")
    public Boolean getAreGeographicalCoordinatesOverridden() {
        return areGeographicalCoordinatesOverridden;
    }

    /**
     * An indicator that determines whether the latitude or longitude values have been manually overridden.
     * 
     */
    @JsonProperty("areGeographicalCoordinatesOverridden")
    public void setAreGeographicalCoordinatesOverridden(Boolean areGeographicalCoordinatesOverridden) {
        this.areGeographicalCoordinatesOverridden = areGeographicalCoordinatesOverridden;
    }

    public TransportationAddressType withAreGeographicalCoordinatesOverridden(Boolean areGeographicalCoordinatesOverridden) {
        this.areGeographicalCoordinatesOverridden = areGeographicalCoordinatesOverridden;
        return this;
    }

    /**
     * An indicator that determines whether latitude and longitude values are to be recalculated using a distance engine.
     * 
     */
    @JsonProperty("areGeographicalCoordinatesRecalculated")
    public Boolean getAreGeographicalCoordinatesRecalculated() {
        return areGeographicalCoordinatesRecalculated;
    }

    /**
     * An indicator that determines whether latitude and longitude values are to be recalculated using a distance engine.
     * 
     */
    @JsonProperty("areGeographicalCoordinatesRecalculated")
    public void setAreGeographicalCoordinatesRecalculated(Boolean areGeographicalCoordinatesRecalculated) {
        this.areGeographicalCoordinatesRecalculated = areGeographicalCoordinatesRecalculated;
    }

    public TransportationAddressType withAreGeographicalCoordinatesRecalculated(Boolean areGeographicalCoordinatesRecalculated) {
        this.areGeographicalCoordinatesRecalculated = areGeographicalCoordinatesRecalculated;
        return this;
    }

    /**
     * An indicator that determines whether the address is a residential address. If omitted from input, false will be assumed.
     * 
     */
    @JsonProperty("isResidentialAddress")
    public Boolean getIsResidentialAddress() {
        return isResidentialAddress;
    }

    /**
     * An indicator that determines whether the address is a residential address. If omitted from input, false will be assumed.
     * 
     */
    @JsonProperty("isResidentialAddress")
    public void setIsResidentialAddress(Boolean isResidentialAddress) {
        this.isResidentialAddress = isResidentialAddress;
    }

    public TransportationAddressType withIsResidentialAddress(Boolean isResidentialAddress) {
        this.isResidentialAddress = isResidentialAddress;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportationAddressType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("cityCode");
        sb.append('=');
        sb.append(((this.cityCode == null)?"<null>":this.cityCode));
        sb.append(',');
        sb.append("countryCode");
        sb.append('=');
        sb.append(((this.countryCode == null)?"<null>":this.countryCode));
        sb.append(',');
        sb.append("currencyOfPartyCode");
        sb.append('=');
        sb.append(((this.currencyOfPartyCode == null)?"<null>":this.currencyOfPartyCode));
        sb.append(',');
        sb.append("languageOfThePartyCode");
        sb.append('=');
        sb.append(((this.languageOfThePartyCode == null)?"<null>":this.languageOfThePartyCode));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("pOBoxNumber");
        sb.append('=');
        sb.append(((this.pOBoxNumber == null)?"<null>":this.pOBoxNumber));
        sb.append(',');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("streetAddressOne");
        sb.append('=');
        sb.append(((this.streetAddressOne == null)?"<null>":this.streetAddressOne));
        sb.append(',');
        sb.append("streetAddressTwo");
        sb.append('=');
        sb.append(((this.streetAddressTwo == null)?"<null>":this.streetAddressTwo));
        sb.append(',');
        sb.append("streetAddressThree");
        sb.append('=');
        sb.append(((this.streetAddressThree == null)?"<null>":this.streetAddressThree));
        sb.append(',');
        sb.append("geographicalCoordinates");
        sb.append('=');
        sb.append(((this.geographicalCoordinates == null)?"<null>":this.geographicalCoordinates));
        sb.append(',');
        sb.append("addressDistrict");
        sb.append('=');
        sb.append(((this.addressDistrict == null)?"<null>":this.addressDistrict));
        sb.append(',');
        sb.append("addressRegion");
        sb.append('=');
        sb.append(((this.addressRegion == null)?"<null>":this.addressRegion));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("areGeographicalCoordinatesOverridden");
        sb.append('=');
        sb.append(((this.areGeographicalCoordinatesOverridden == null)?"<null>":this.areGeographicalCoordinatesOverridden));
        sb.append(',');
        sb.append("areGeographicalCoordinatesRecalculated");
        sb.append('=');
        sb.append(((this.areGeographicalCoordinatesRecalculated == null)?"<null>":this.areGeographicalCoordinatesRecalculated));
        sb.append(',');
        sb.append("isResidentialAddress");
        sb.append('=');
        sb.append(((this.isResidentialAddress == null)?"<null>":this.isResidentialAddress));
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
        result = ((result* 31)+((this.geographicalCoordinates == null)? 0 :this.geographicalCoordinates.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.streetAddressTwo == null)? 0 :this.streetAddressTwo.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.cityCode == null)? 0 :this.cityCode.hashCode()));
        result = ((result* 31)+((this.postalCode == null)? 0 :this.postalCode.hashCode()));
        result = ((result* 31)+((this.areGeographicalCoordinatesOverridden == null)? 0 :this.areGeographicalCoordinatesOverridden.hashCode()));
        result = ((result* 31)+((this.streetAddressOne == null)? 0 :this.streetAddressOne.hashCode()));
        result = ((result* 31)+((this.isResidentialAddress == null)? 0 :this.isResidentialAddress.hashCode()));
        result = ((result* 31)+((this.areGeographicalCoordinatesRecalculated == null)? 0 :this.areGeographicalCoordinatesRecalculated.hashCode()));
        result = ((result* 31)+((this.countryCode == null)? 0 :this.countryCode.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.languageOfThePartyCode == null)? 0 :this.languageOfThePartyCode.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.addressDistrict == null)? 0 :this.addressDistrict.hashCode()));
        result = ((result* 31)+((this.addressRegion == null)? 0 :this.addressRegion.hashCode()));
        result = ((result* 31)+((this.currencyOfPartyCode == null)? 0 :this.currencyOfPartyCode.hashCode()));
        result = ((result* 31)+((this.pOBoxNumber == null)? 0 :this.pOBoxNumber.hashCode()));
        result = ((result* 31)+((this.streetAddressThree == null)? 0 :this.streetAddressThree.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportationAddressType) == false) {
            return false;
        }
        TransportationAddressType rhs = ((TransportationAddressType) other);
        return ((((((((((((((((((((this.geographicalCoordinates == rhs.geographicalCoordinates)||((this.geographicalCoordinates!= null)&&this.geographicalCoordinates.equals(rhs.geographicalCoordinates)))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.streetAddressTwo == rhs.streetAddressTwo)||((this.streetAddressTwo!= null)&&this.streetAddressTwo.equals(rhs.streetAddressTwo))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.cityCode == rhs.cityCode)||((this.cityCode!= null)&&this.cityCode.equals(rhs.cityCode))))&&((this.postalCode == rhs.postalCode)||((this.postalCode!= null)&&this.postalCode.equals(rhs.postalCode))))&&((this.areGeographicalCoordinatesOverridden == rhs.areGeographicalCoordinatesOverridden)||((this.areGeographicalCoordinatesOverridden!= null)&&this.areGeographicalCoordinatesOverridden.equals(rhs.areGeographicalCoordinatesOverridden))))&&((this.streetAddressOne == rhs.streetAddressOne)||((this.streetAddressOne!= null)&&this.streetAddressOne.equals(rhs.streetAddressOne))))&&((this.isResidentialAddress == rhs.isResidentialAddress)||((this.isResidentialAddress!= null)&&this.isResidentialAddress.equals(rhs.isResidentialAddress))))&&((this.areGeographicalCoordinatesRecalculated == rhs.areGeographicalCoordinatesRecalculated)||((this.areGeographicalCoordinatesRecalculated!= null)&&this.areGeographicalCoordinatesRecalculated.equals(rhs.areGeographicalCoordinatesRecalculated))))&&((this.countryCode == rhs.countryCode)||((this.countryCode!= null)&&this.countryCode.equals(rhs.countryCode))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.languageOfThePartyCode == rhs.languageOfThePartyCode)||((this.languageOfThePartyCode!= null)&&this.languageOfThePartyCode.equals(rhs.languageOfThePartyCode))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.addressDistrict == rhs.addressDistrict)||((this.addressDistrict!= null)&&this.addressDistrict.equals(rhs.addressDistrict))))&&((this.addressRegion == rhs.addressRegion)||((this.addressRegion!= null)&&this.addressRegion.equals(rhs.addressRegion))))&&((this.currencyOfPartyCode == rhs.currencyOfPartyCode)||((this.currencyOfPartyCode!= null)&&this.currencyOfPartyCode.equals(rhs.currencyOfPartyCode))))&&((this.pOBoxNumber == rhs.pOBoxNumber)||((this.pOBoxNumber!= null)&&this.pOBoxNumber.equals(rhs.pOBoxNumber))))&&((this.streetAddressThree == rhs.streetAddressThree)||((this.streetAddressThree!= null)&&this.streetAddressThree.equals(rhs.streetAddressThree))));
    }

}
