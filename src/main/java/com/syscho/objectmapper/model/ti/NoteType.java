
package com.syscho.objectmapper.model.ti;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NoteType
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lineNumber",
    "text",
    "type",
    "isPrintable"
})
@Generated("jsonschema2pojo")
public class NoteType {

    /**
     * Line number for note text. Used to distinguish multiple lines of notes.
     * 
     */
    @JsonProperty("lineNumber")
    @JsonPropertyDescription("Line number for note text. Used to distinguish multiple lines of notes.")
    private String lineNumber;
    /**
     * Description500Type
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("text")
    private Description500Type text;
    /**
     * The note types GENERIC,EDI,NOTE, MEMO etc.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The note types GENERIC,EDI,NOTE, MEMO etc.")
    private String type;
    /**
     * The flag is used to indicate that text is to be printed. If this flag=1, text details is printable e.g. memo printable.
     * 
     */
    @JsonProperty("isPrintable")
    @JsonPropertyDescription("The flag is used to indicate that text is to be printed. If this flag=1, text details is printable e.g. memo printable.")
    private Boolean isPrintable;

    /**
     * Line number for note text. Used to distinguish multiple lines of notes.
     * 
     */
    @JsonProperty("lineNumber")
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Line number for note text. Used to distinguish multiple lines of notes.
     * 
     */
    @JsonProperty("lineNumber")
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public NoteType withLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    /**
     * Description500Type
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("text")
    public Description500Type getText() {
        return text;
    }

    /**
     * Description500Type
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("text")
    public void setText(Description500Type text) {
        this.text = text;
    }

    public NoteType withText(Description500Type text) {
        this.text = text;
        return this;
    }

    /**
     * The note types GENERIC,EDI,NOTE, MEMO etc.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The note types GENERIC,EDI,NOTE, MEMO etc.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public NoteType withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The flag is used to indicate that text is to be printed. If this flag=1, text details is printable e.g. memo printable.
     * 
     */
    @JsonProperty("isPrintable")
    public Boolean getIsPrintable() {
        return isPrintable;
    }

    /**
     * The flag is used to indicate that text is to be printed. If this flag=1, text details is printable e.g. memo printable.
     * 
     */
    @JsonProperty("isPrintable")
    public void setIsPrintable(Boolean isPrintable) {
        this.isPrintable = isPrintable;
    }

    public NoteType withIsPrintable(Boolean isPrintable) {
        this.isPrintable = isPrintable;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NoteType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lineNumber");
        sb.append('=');
        sb.append(((this.lineNumber == null)?"<null>":this.lineNumber));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("isPrintable");
        sb.append('=');
        sb.append(((this.isPrintable == null)?"<null>":this.isPrintable));
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
        result = ((result* 31)+((this.isPrintable == null)? 0 :this.isPrintable.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.lineNumber == null)? 0 :this.lineNumber.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NoteType) == false) {
            return false;
        }
        NoteType rhs = ((NoteType) other);
        return (((((this.isPrintable == rhs.isPrintable)||((this.isPrintable!= null)&&this.isPrintable.equals(rhs.isPrintable)))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.lineNumber == rhs.lineNumber)||((this.lineNumber!= null)&&this.lineNumber.equals(rhs.lineNumber))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
