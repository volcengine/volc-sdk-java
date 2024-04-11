
package com.volcengine.model.maas.api.v2;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TokenizeResp
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "total_tokens",
        "tokens",
        "token_ids",
        "offset_mapping",
        "error"
})
@Generated("jsonschema2pojo")
public class TokenizeResp {

    /**
     * Total Tokens
     * <p>
     *
     *
     */
    @JsonProperty("total_tokens")
    private Integer totalTokens;
    /**
     * Tokens
     * <p>
     *
     *
     */
    @JsonProperty("tokens")
    private List<String> tokens = new ArrayList<String>();
    /**
     * Token Ids
     * <p>
     *
     *
     */
    @JsonProperty("token_ids")
    private List<Integer> tokenIds = new ArrayList<Integer>();
    /**
     * Offset Mapping
     * <p>
     *
     *
     */
    @JsonProperty("offset_mapping")
    private List<List<Integer>> offsetMapping = new ArrayList<List<Integer>>();
    /**
     * Error
     * <p>
     *
     *
     */
    @JsonProperty("error")
    private Error error;

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

    public TokenizeResp withTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
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

    public TokenizeResp withTokens(List<String> tokens) {
        this.tokens = tokens;
        return this;
    }

    /**
     * Token Ids
     * <p>
     *
     *
     */
    @JsonProperty("token_ids")
    public List<Integer> getTokenIds() {
        return tokenIds;
    }

    /**
     * Token Ids
     * <p>
     *
     *
     */
    @JsonProperty("token_ids")
    public void setTokenIds(List<Integer> tokenIds) {
        this.tokenIds = tokenIds;
    }

    public TokenizeResp withTokenIds(List<Integer> tokenIds) {
        this.tokenIds = tokenIds;
        return this;
    }

    /**
     * Offset Mapping
     * <p>
     *
     *
     */
    @JsonProperty("offset_mapping")
    public List<List<Integer>> getOffsetMapping() {
        return offsetMapping;
    }

    /**
     * Offset Mapping
     * <p>
     *
     *
     */
    @JsonProperty("offset_mapping")
    public void setOffsetMapping(List<List<Integer>> offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public TokenizeResp withOffsetMapping(List<List<Integer>> offsetMapping) {
        this.offsetMapping = offsetMapping;
        return this;
    }

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

    public TokenizeResp withError(Error error) {
        this.error = error;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TokenizeResp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("totalTokens");
        sb.append('=');
        sb.append(((this.totalTokens == null)?"<null>":this.totalTokens));
        sb.append(',');
        sb.append("tokens");
        sb.append('=');
        sb.append(((this.tokens == null)?"<null>":this.tokens));
        sb.append(',');
        sb.append("tokenIds");
        sb.append('=');
        sb.append(((this.tokenIds == null)?"<null>":this.tokenIds));
        sb.append(',');
        sb.append("offsetMapping");
        sb.append('=');
        sb.append(((this.offsetMapping == null)?"<null>":this.offsetMapping));
        sb.append(',');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
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
        result = ((result* 31)+((this.offsetMapping == null)? 0 :this.offsetMapping.hashCode()));
        result = ((result* 31)+((this.tokenIds == null)? 0 :this.tokenIds.hashCode()));
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        result = ((result* 31)+((this.totalTokens == null)? 0 :this.totalTokens.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TokenizeResp) == false) {
            return false;
        }
        TokenizeResp rhs = ((TokenizeResp) other);
        return ((((((this.tokens == rhs.tokens)||((this.tokens!= null)&&this.tokens.equals(rhs.tokens)))&&((this.offsetMapping == rhs.offsetMapping)||((this.offsetMapping!= null)&&this.offsetMapping.equals(rhs.offsetMapping))))&&((this.tokenIds == rhs.tokenIds)||((this.tokenIds!= null)&&this.tokenIds.equals(rhs.tokenIds))))&&((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))))&&((this.totalTokens == rhs.totalTokens)||((this.totalTokens!= null)&&this.totalTokens.equals(rhs.totalTokens))));
    }

}
