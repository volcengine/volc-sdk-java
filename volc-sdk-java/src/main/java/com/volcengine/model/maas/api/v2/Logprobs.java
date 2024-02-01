
package com.volcengine.model.maas.api.v2;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Logprobs
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "text_offset",
    "token_logprobs",
    "tokens",
    "top_logprobs"
})
@Generated("jsonschema2pojo")
public class Logprobs {

    /**
     * Text Offset
     * <p>
     * 
     * 
     */
    @JsonProperty("text_offset")
    private List<Integer> textOffset = new ArrayList<Integer>();
    /**
     * Token Logprobs
     * <p>
     * 
     * 
     */
    @JsonProperty("token_logprobs")
    private List<Double> tokenLogprobs = new ArrayList<Double>();
    /**
     * Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("tokens")
    private List<String> tokens = new ArrayList<String>();
    /**
     * Top Logprobs
     * <p>
     * 
     * 
     */
    @JsonProperty("top_logprobs")
    private List<TopLogprob> topLogprobs = new ArrayList<TopLogprob>();

    /**
     * Text Offset
     * <p>
     * 
     * 
     */
    @JsonProperty("text_offset")
    public List<Integer> getTextOffset() {
        return textOffset;
    }

    /**
     * Text Offset
     * <p>
     * 
     * 
     */
    @JsonProperty("text_offset")
    public void setTextOffset(List<Integer> textOffset) {
        this.textOffset = textOffset;
    }

    public Logprobs withTextOffset(List<Integer> textOffset) {
        this.textOffset = textOffset;
        return this;
    }

    /**
     * Token Logprobs
     * <p>
     * 
     * 
     */
    @JsonProperty("token_logprobs")
    public List<Double> getTokenLogprobs() {
        return tokenLogprobs;
    }

    /**
     * Token Logprobs
     * <p>
     * 
     * 
     */
    @JsonProperty("token_logprobs")
    public void setTokenLogprobs(List<Double> tokenLogprobs) {
        this.tokenLogprobs = tokenLogprobs;
    }

    public Logprobs withTokenLogprobs(List<Double> tokenLogprobs) {
        this.tokenLogprobs = tokenLogprobs;
        return this;
    }

    /**
     * Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("tokens")
    public List<String> getTokens() {
        return tokens;
    }

    /**
     * Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("tokens")
    public void setTokens(List<String> tokens) {
        this.tokens = tokens;
    }

    public Logprobs withTokens(List<String> tokens) {
        this.tokens = tokens;
        return this;
    }

    /**
     * Top Logprobs
     * <p>
     * 
     * 
     */
    @JsonProperty("top_logprobs")
    public List<TopLogprob> getTopLogprobs() {
        return topLogprobs;
    }

    /**
     * Top Logprobs
     * <p>
     * 
     * 
     */
    @JsonProperty("top_logprobs")
    public void setTopLogprobs(List<TopLogprob> topLogprobs) {
        this.topLogprobs = topLogprobs;
    }

    public Logprobs withTopLogprobs(List<TopLogprob> topLogprobs) {
        this.topLogprobs = topLogprobs;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Logprobs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("textOffset");
        sb.append('=');
        sb.append(((this.textOffset == null)?"<null>":this.textOffset));
        sb.append(',');
        sb.append("tokenLogprobs");
        sb.append('=');
        sb.append(((this.tokenLogprobs == null)?"<null>":this.tokenLogprobs));
        sb.append(',');
        sb.append("tokens");
        sb.append('=');
        sb.append(((this.tokens == null)?"<null>":this.tokens));
        sb.append(',');
        sb.append("topLogprobs");
        sb.append('=');
        sb.append(((this.topLogprobs == null)?"<null>":this.topLogprobs));
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
        result = ((result* 31)+((this.tokens == null)? 0 :this.tokens.hashCode()));
        result = ((result* 31)+((this.textOffset == null)? 0 :this.textOffset.hashCode()));
        result = ((result* 31)+((this.tokenLogprobs == null)? 0 :this.tokenLogprobs.hashCode()));
        result = ((result* 31)+((this.topLogprobs == null)? 0 :this.topLogprobs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Logprobs) == false) {
            return false;
        }
        Logprobs rhs = ((Logprobs) other);
        return (((((this.tokens == rhs.tokens)||((this.tokens!= null)&&this.tokens.equals(rhs.tokens)))&&((this.textOffset == rhs.textOffset)||((this.textOffset!= null)&&this.textOffset.equals(rhs.textOffset))))&&((this.tokenLogprobs == rhs.tokenLogprobs)||((this.tokenLogprobs!= null)&&this.tokenLogprobs.equals(rhs.tokenLogprobs))))&&((this.topLogprobs == rhs.topLogprobs)||((this.topLogprobs!= null)&&this.topLogprobs.equals(rhs.topLogprobs))));
    }

}
