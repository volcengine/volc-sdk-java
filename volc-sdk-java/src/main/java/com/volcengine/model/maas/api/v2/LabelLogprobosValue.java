
package com.volcengine.model.maas.api.v2;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LabelLogprobosValue
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tokens",
    "token_logprobs",
    "req_id"
})
@Generated("jsonschema2pojo")
public class LabelLogprobosValue {

    /**
     * Tokens
     * <p>
     * 
     * 
     */
    @JsonProperty("tokens")
    private List<String> tokens = new ArrayList<String>();
    /**
     * Token Logprobs
     * <p>
     * 
     * 
     */
    @JsonProperty("token_logprobs")
    private List<Double> tokenLogprobs = new ArrayList<Double>();
    /**
     * Req Id
     * <p>
     * 
     * 
     */
    @JsonProperty("req_id")
    private String reqId;

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

    public LabelLogprobosValue withTokens(List<String> tokens) {
        this.tokens = tokens;
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

    public LabelLogprobosValue withTokenLogprobs(List<Double> tokenLogprobs) {
        this.tokenLogprobs = tokenLogprobs;
        return this;
    }

    /**
     * Req Id
     * <p>
     * 
     * 
     */
    @JsonProperty("req_id")
    public String getReqId() {
        return reqId;
    }

    /**
     * Req Id
     * <p>
     * 
     * 
     */
    @JsonProperty("req_id")
    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public LabelLogprobosValue withReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LabelLogprobosValue.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tokens");
        sb.append('=');
        sb.append(((this.tokens == null)?"<null>":this.tokens));
        sb.append(',');
        sb.append("tokenLogprobs");
        sb.append('=');
        sb.append(((this.tokenLogprobs == null)?"<null>":this.tokenLogprobs));
        sb.append(',');
        sb.append("reqId");
        sb.append('=');
        sb.append(((this.reqId == null)?"<null>":this.reqId));
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
        result = ((result* 31)+((this.tokenLogprobs == null)? 0 :this.tokenLogprobs.hashCode()));
        result = ((result* 31)+((this.reqId == null)? 0 :this.reqId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LabelLogprobosValue) == false) {
            return false;
        }
        LabelLogprobosValue rhs = ((LabelLogprobosValue) other);
        return ((((this.tokens == rhs.tokens)||((this.tokens!= null)&&this.tokens.equals(rhs.tokens)))&&((this.tokenLogprobs == rhs.tokenLogprobs)||((this.tokenLogprobs!= null)&&this.tokenLogprobs.equals(rhs.tokenLogprobs))))&&((this.reqId == rhs.reqId)||((this.reqId!= null)&&this.reqId.equals(rhs.reqId))));
    }

}
