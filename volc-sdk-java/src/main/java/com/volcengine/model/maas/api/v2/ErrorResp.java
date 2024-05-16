
package com.volcengine.model.maas.api.v2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * MaasErrorResponse
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "error",
})
@Generated("jsonschema2pojo")
public class ErrorResp extends BaseResponse {

    /**
     * Error
     * <p>
     * 
     * 
     */
    @JsonProperty("error")
    private Error error;

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

    public ErrorResp withError(Error error) {
        this.error = error;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ErrorResp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ErrorResp) == false) {
            return false;
        }
        ErrorResp rhs = ((ErrorResp) other);
        return (((((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))))));
    }

}
