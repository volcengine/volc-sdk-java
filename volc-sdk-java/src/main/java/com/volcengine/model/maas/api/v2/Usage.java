
package com.volcengine.model.maas.api.v2;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Usage
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "prompt_tokens",
    "completion_tokens",
    "total_tokens"
})
@Generated("jsonschema2pojo")
public class Usage {

    /**
     * Prompt Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("prompt_tokens")
    private Integer promptTokens = 0;
    /**
     * Completion Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("completion_tokens")
    private Integer completionTokens = 0;
    /**
     * Total Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("total_tokens")
    private Integer totalTokens = 0;

    /**
     * Prompt Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("prompt_tokens")
    public Integer getPromptTokens() {
        return promptTokens;
    }

    /**
     * Prompt Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("prompt_tokens")
    public void setPromptTokens(Integer promptTokens) {
        this.promptTokens = promptTokens;
    }

    public Usage withPromptTokens(Integer promptTokens) {
        this.promptTokens = promptTokens;
        return this;
    }

    /**
     * Completion Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("completion_tokens")
    public Integer getCompletionTokens() {
        return completionTokens;
    }

    /**
     * Completion Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("completion_tokens")
    public void setCompletionTokens(Integer completionTokens) {
        this.completionTokens = completionTokens;
    }

    public Usage withCompletionTokens(Integer completionTokens) {
        this.completionTokens = completionTokens;
        return this;
    }

    /**
     * Total Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("total_tokens")
    public Integer getTotalTokens() {
        return totalTokens;
    }

    /**
     * Total Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("total_tokens")
    public void setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
    }

    public Usage withTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Usage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("promptTokens");
        sb.append('=');
        sb.append(((this.promptTokens == null)?"<null>":this.promptTokens));
        sb.append(',');
        sb.append("completionTokens");
        sb.append('=');
        sb.append(((this.completionTokens == null)?"<null>":this.completionTokens));
        sb.append(',');
        sb.append("totalTokens");
        sb.append('=');
        sb.append(((this.totalTokens == null)?"<null>":this.totalTokens));
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
        result = ((result* 31)+((this.promptTokens == null)? 0 :this.promptTokens.hashCode()));
        result = ((result* 31)+((this.totalTokens == null)? 0 :this.totalTokens.hashCode()));
        result = ((result* 31)+((this.completionTokens == null)? 0 :this.completionTokens.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Usage) == false) {
            return false;
        }
        Usage rhs = ((Usage) other);
        return ((((this.promptTokens == rhs.promptTokens)||((this.promptTokens!= null)&&this.promptTokens.equals(rhs.promptTokens)))&&((this.totalTokens == rhs.totalTokens)||((this.totalTokens!= null)&&this.totalTokens.equals(rhs.totalTokens))))&&((this.completionTokens == rhs.completionTokens)||((this.completionTokens!= null)&&this.completionTokens.equals(rhs.completionTokens))));
    }

}
