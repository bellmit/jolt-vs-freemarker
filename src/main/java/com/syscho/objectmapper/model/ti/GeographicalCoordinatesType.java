
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GeographicalCoordinatesType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "latitude",
    "longitude"
})
@Generated("jsonschema2pojo")
public class GeographicalCoordinatesType {

    /**
     * Angular distance North or South from the earthâ€™s equator measured through 90 degrees.
     * (Required)
     * 
     */
    @JsonProperty("latitude")
    @JsonPropertyDescription("Angular distance North or South from the earth\u00e2\u20ac\u2122s equator measured through 90 degrees.")
    private String latitude;
    /**
     * The arc or portion of the earthâ€™s equator intersected between the meridian of a given place and the prime meridian and expressed either in degrees or in time.
     * (Required)
     * 
     */
    @JsonProperty("longitude")
    @JsonPropertyDescription("The arc or portion of the earth\u00e2\u20ac\u2122s equator intersected between the meridian of a given place and the prime meridian and expressed either in degrees or in time.")
    private String longitude;

    /**
     * Angular distance North or South from the earthâ€™s equator measured through 90 degrees.
     * (Required)
     * 
     */
    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    /**
     * Angular distance North or South from the earthâ€™s equator measured through 90 degrees.
     * (Required)
     * 
     */
    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public GeographicalCoordinatesType withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * The arc or portion of the earthâ€™s equator intersected between the meridian of a given place and the prime meridian and expressed either in degrees or in time.
     * (Required)
     * 
     */
    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    /**
     * The arc or portion of the earthâ€™s equator intersected between the meridian of a given place and the prime meridian and expressed either in degrees or in time.
     * (Required)
     * 
     */
    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public GeographicalCoordinatesType withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeographicalCoordinatesType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("latitude");
        sb.append('=');
        sb.append(((this.latitude == null)?"<null>":this.latitude));
        sb.append(',');
        sb.append("longitude");
        sb.append('=');
        sb.append(((this.longitude == null)?"<null>":this.longitude));
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
        result = ((result* 31)+((this.latitude == null)? 0 :this.latitude.hashCode()));
        result = ((result* 31)+((this.longitude == null)? 0 :this.longitude.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeographicalCoordinatesType) == false) {
            return false;
        }
        GeographicalCoordinatesType rhs = ((GeographicalCoordinatesType) other);
        return (((this.latitude == rhs.latitude)||((this.latitude!= null)&&this.latitude.equals(rhs.latitude)))&&((this.longitude == rhs.longitude)||((this.longitude!= null)&&this.longitude.equals(rhs.longitude))));
    }

}
