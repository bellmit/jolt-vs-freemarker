
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CompetitionType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "competitionName",
    "distanceFromCompetition"
})
@Generated("jsonschema2pojo")
public class CompetitionType {

    /**
     * Name of the competitor.
     * 
     */
    @JsonProperty("competitionName")
    @JsonPropertyDescription("Name of the competitor.")
    private String competitionName;
    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("distanceFromCompetition")
    private MeasurementType distanceFromCompetition;

    /**
     * Name of the competitor.
     * 
     */
    @JsonProperty("competitionName")
    public String getCompetitionName() {
        return competitionName;
    }

    /**
     * Name of the competitor.
     * 
     */
    @JsonProperty("competitionName")
    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public CompetitionType withCompetitionName(String competitionName) {
        this.competitionName = competitionName;
        return this;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("distanceFromCompetition")
    public MeasurementType getDistanceFromCompetition() {
        return distanceFromCompetition;
    }

    /**
     * MeasurementType
     * <p>
     * 
     * 
     */
    @JsonProperty("distanceFromCompetition")
    public void setDistanceFromCompetition(MeasurementType distanceFromCompetition) {
        this.distanceFromCompetition = distanceFromCompetition;
    }

    public CompetitionType withDistanceFromCompetition(MeasurementType distanceFromCompetition) {
        this.distanceFromCompetition = distanceFromCompetition;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CompetitionType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("competitionName");
        sb.append('=');
        sb.append(((this.competitionName == null)?"<null>":this.competitionName));
        sb.append(',');
        sb.append("distanceFromCompetition");
        sb.append('=');
        sb.append(((this.distanceFromCompetition == null)?"<null>":this.distanceFromCompetition));
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
        result = ((result* 31)+((this.distanceFromCompetition == null)? 0 :this.distanceFromCompetition.hashCode()));
        result = ((result* 31)+((this.competitionName == null)? 0 :this.competitionName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CompetitionType) == false) {
            return false;
        }
        CompetitionType rhs = ((CompetitionType) other);
        return (((this.distanceFromCompetition == rhs.distanceFromCompetition)||((this.distanceFromCompetition!= null)&&this.distanceFromCompetition.equals(rhs.distanceFromCompetition)))&&((this.competitionName == rhs.competitionName)||((this.competitionName!= null)&&this.competitionName.equals(rhs.competitionName))));
    }

}
