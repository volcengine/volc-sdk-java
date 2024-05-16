
package com.volcengine.model.maas.api.v2;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MaasEmbeddingsResponse
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "usage",
    "error",
    "object",
    "data"
})
@Generated("jsonschema2pojo")
public class EmbeddingsResp extends BaseResponse {

    /**
     * Usage
     * <p>
     * 
     * 
     */
    @JsonProperty("usage")
    private Usage usage;
    /**
     * Error
     * <p>
     * 
     * 
     */
    @JsonProperty("error")
    private Error error;
    /**
     * Object
     * <p>
     * 
     * 
     */
    @JsonProperty("object")
    private String object;
    /**
     * Data
     * <p>
     * 
     * 
     */
    @JsonProperty("data")
    private List<Embedding> data = new ArrayList<Embedding>();

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

    public EmbeddingsResp withUsage(Usage usage) {
        this.usage = usage;
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

    public EmbeddingsResp withError(Error error) {
        this.error = error;
        return this;
    }

    /**
     * Object
     * <p>
     * 
     * 
     */
    @JsonProperty("object")
    public String getObject() {
        return object;
    }

    /**
     * Object
     * <p>
     * 
     * 
     */
    @JsonProperty("object")
    public void setObject(String object) {
        this.object = object;
    }

    public EmbeddingsResp withObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Data
     * <p>
     * 
     * 
     */
    @JsonProperty("data")
    public List<Embedding> getData() {
        return data;
    }

    /**
     * Data
     * <p>
     * 
     * 
     */
    @JsonProperty("data")
    public void setData(List<Embedding> data) {
        this.data = data;
    }

    public EmbeddingsResp withData(List<Embedding> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmbeddingsResp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("usage");
        sb.append('=');
        sb.append(((this.usage == null)?"<null>":this.usage));
        sb.append(',');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
        sb.append(',');
        sb.append("object");
        sb.append('=');
        sb.append(((this.object == null)?"<null>":this.object));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
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
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.usage == null)? 0 :this.usage.hashCode()));
        result = ((result* 31)+((this.object == null)? 0 :this.object.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmbeddingsResp) == false) {
            return false;
        }
        EmbeddingsResp rhs = ((EmbeddingsResp) other);
        return (((((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error)))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.usage == rhs.usage)||((this.usage!= null)&&this.usage.equals(rhs.usage))))&&((this.object == rhs.object)||((this.object!= null)&&this.object.equals(rhs.object))));
    }

}
