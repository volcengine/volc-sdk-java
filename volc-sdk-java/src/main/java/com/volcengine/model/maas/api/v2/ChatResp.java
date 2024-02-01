
package com.volcengine.model.maas.api.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MaasChatResponse
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "error",
    "choices",
    "usage",
    "extra"
})
@Generated("jsonschema2pojo")
public class ChatResp {

    /**
     * Error
     * <p>
     * 
     * 
     */
    @JsonProperty("error")
    private Error error;
    /**
     * Choices
     * <p>
     * 
     * 
     */
    @JsonProperty("choices")
    private List<Choice> choices = new ArrayList<Choice>();
    /**
     * Usage
     * <p>
     * 
     * 
     */
    @JsonProperty("usage")
    private Usage usage;
    /**
     * Extra
     * <p>
     * 
     * 
     */
    @JsonProperty("extra")
    private Map<String, String> extra;

    /**
     * Error
     * <p>
     * 
     * 
     */
    @JsonProperty("error")
    public Error getError() {
        return error;
    }

    /**
     * Error
     * <p>
     * 
     * 
     */
    @JsonProperty("error")
    public void setError(Error error) {
        this.error = error;
    }

    public ChatResp withError(Error error) {
        this.error = error;
        return this;
    }

    /**
     * Choices
     * <p>
     * 
     * 
     */
    @JsonProperty("choices")
    public List<Choice> getChoices() {
        return choices;
    }

    /**
     * Choices
     * <p>
     * 
     * 
     */
    @JsonProperty("choices")
    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    public ChatResp withChoices(List<Choice> choices) {
        this.choices = choices;
        return this;
    }

    /**
     * Usage
     * <p>
     * 
     * 
     */
    @JsonProperty("usage")
    public Usage getUsage() {
        return usage;
    }

    /**
     * Usage
     * <p>
     * 
     * 
     */
    @JsonProperty("usage")
    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    public ChatResp withUsage(Usage usage) {
        this.usage = usage;
        return this;
    }

    /**
     * Extra
     * <p>
     * 
     * 
     */
    @JsonProperty("extra")
    public Map<String, String> getExtra() {
        return extra;
    }

    /**
     * Extra
     * <p>
     * 
     * 
     */
    @JsonProperty("extra")
    public void setExtra(Map<String, String> extra) {
        this.extra = extra;
    }

    public ChatResp withExtra(Map<String, String> extra) {
        this.extra = extra;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChatResp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
        sb.append(',');
        sb.append("choices");
        sb.append('=');
        sb.append(((this.choices == null)?"<null>":this.choices));
        sb.append(',');
        sb.append("usage");
        sb.append('=');
        sb.append(((this.usage == null)?"<null>":this.usage));
        sb.append(',');
        sb.append("extra");
        sb.append('=');
        sb.append(((this.extra == null)?"<null>":this.extra));
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
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        result = ((result* 31)+((this.choices == null)? 0 :this.choices.hashCode()));
        result = ((result* 31)+((this.usage == null)? 0 :this.usage.hashCode()));
        result = ((result* 31)+((this.extra == null)? 0 :this.extra.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChatResp) == false) {
            return false;
        }
        ChatResp rhs = ((ChatResp) other);
        return (((((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error)))&&((this.choices == rhs.choices)||((this.choices!= null)&&this.choices.equals(rhs.choices))))&&((this.usage == rhs.usage)||((this.usage!= null)&&this.usage.equals(rhs.usage))))&&((this.extra == rhs.extra)||((this.extra!= null)&&this.extra.equals(rhs.extra))));
    }

}
