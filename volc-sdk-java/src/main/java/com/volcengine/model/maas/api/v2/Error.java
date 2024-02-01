
package com.volcengine.model.maas.api.v2;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Error
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "code_n",
    "message"
})
@Generated("jsonschema2pojo")
public class Error {

    /**
     * Code
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("code")
    private String code;
    /**
     * Code N
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("code_n")
    private Integer codeN;
    /**
     * Message
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("message")
    private String message;

    /**
     * Code
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public Error withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Code N
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("code_n")
    public Integer getCodeN() {
        return codeN;
    }

    /**
     * Code N
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("code_n")
    public void setCodeN(Integer codeN) {
        this.codeN = codeN;
    }

    public Error withCodeN(Integer codeN) {
        this.codeN = codeN;
        return this;
    }

    /**
     * Message
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Message
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public Error withMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Error.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("codeN");
        sb.append('=');
        sb.append(((this.codeN == null)?"<null>":this.codeN));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.codeN == null)? 0 :this.codeN.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Error) == false) {
            return false;
        }
        Error rhs = ((Error) other);
        return ((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.codeN == rhs.codeN)||((this.codeN!= null)&&this.codeN.equals(rhs.codeN))));
    }

}
