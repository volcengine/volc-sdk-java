
package com.volcengine.model.maas.api.v2;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MaasEmbeddingsRequest
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "input",
    "encoding_format",
    "user"
})
@Generated("jsonschema2pojo")
public class EmbeddingsReq {

    /**
     * Input
     * <p>
     * 
     * 
     */
    @JsonProperty("input")
    private List<String> input = new ArrayList<String>();
    /**
     * Encoding Format
     * <p>
     * 
     * 
     */
    @JsonProperty("encoding_format")
    private String encodingFormat;
    /**
     * User
     * <p>
     * 
     * 
     */
    @JsonProperty("user")
    private String user;

    /**
     * Input
     * <p>
     * 
     * 
     */
    @JsonProperty("input")
    public List<String> getInput() {
        return input;
    }

    /**
     * Input
     * <p>
     * 
     * 
     */
    @JsonProperty("input")
    public void setInput(List<String> input) {
        this.input = input;
    }

    public EmbeddingsReq withInput(List<String> input) {
        this.input = input;
        return this;
    }

    /**
     * Encoding Format
     * <p>
     * 
     * 
     */
    @JsonProperty("encoding_format")
    public String getEncodingFormat() {
        return encodingFormat;
    }

    /**
     * Encoding Format
     * <p>
     * 
     * 
     */
    @JsonProperty("encoding_format")
    public void setEncodingFormat(String encodingFormat) {
        this.encodingFormat = encodingFormat;
    }

    public EmbeddingsReq withEncodingFormat(String encodingFormat) {
        this.encodingFormat = encodingFormat;
        return this;
    }

    /**
     * User
     * <p>
     * 
     * 
     */
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * User
     * <p>
     * 
     * 
     */
    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public EmbeddingsReq withUser(String user) {
        this.user = user;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmbeddingsReq.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("input");
        sb.append('=');
        sb.append(((this.input == null)?"<null>":this.input));
        sb.append(',');
        sb.append("encodingFormat");
        sb.append('=');
        sb.append(((this.encodingFormat == null)?"<null>":this.encodingFormat));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
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
        result = ((result* 31)+((this.encodingFormat == null)? 0 :this.encodingFormat.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmbeddingsReq) == false) {
            return false;
        }
        EmbeddingsReq rhs = ((EmbeddingsReq) other);
        return ((((this.input == rhs.input)||((this.input!= null)&&this.input.equals(rhs.input)))&&((this.encodingFormat == rhs.encodingFormat)||((this.encodingFormat!= null)&&this.encodingFormat.equals(rhs.encodingFormat))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))));
    }

}
