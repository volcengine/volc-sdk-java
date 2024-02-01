
package com.volcengine.model.maas.api.v2;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MaasChatChoiceLog
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "input",
    "content"
})
@Generated("jsonschema2pojo")
public class ChoiceLog {

    /**
     * Input
     * <p>
     * 
     * 
     */
    @JsonProperty("input")
    private String input;
    /**
     * Content
     * <p>
     * 
     * 
     */
    @JsonProperty("content")
    private String content;

    /**
     * Input
     * <p>
     * 
     * 
     */
    @JsonProperty("input")
    public String getInput() {
        return input;
    }

    /**
     * Input
     * <p>
     * 
     * 
     */
    @JsonProperty("input")
    public void setInput(String input) {
        this.input = input;
    }

    public ChoiceLog withInput(String input) {
        this.input = input;
        return this;
    }

    /**
     * Content
     * <p>
     * 
     * 
     */
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    /**
     * Content
     * <p>
     * 
     * 
     */
    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    public ChoiceLog withContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChoiceLog.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("input");
        sb.append('=');
        sb.append(((this.input == null)?"<null>":this.input));
        sb.append(',');
        sb.append("content");
        sb.append('=');
        sb.append(((this.content == null)?"<null>":this.content));
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
        result = ((result* 31)+((this.input == null)? 0 :this.input.hashCode()));
        result = ((result* 31)+((this.content == null)? 0 :this.content.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChoiceLog) == false) {
            return false;
        }
        ChoiceLog rhs = ((ChoiceLog) other);
        return (((this.input == rhs.input)||((this.input!= null)&&this.input.equals(rhs.input)))&&((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content))));
    }

}
