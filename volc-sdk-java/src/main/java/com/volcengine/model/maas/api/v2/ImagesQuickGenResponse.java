
package com.volcengine.model.maas.api.v2;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MaasImagesQuickGenResponse
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "req_id",
    "data",
    "error"
})
@Generated("jsonschema2pojo")
public class ImagesQuickGenResponse extends BaseResponse {

    /**
     * Req Id
     * <p>
     * 
     * 
     */
    @JsonProperty("req_id")
    private String reqId;
    /**
     * Data
     * <p>
     * 
     * 
     */
    @JsonProperty("data")
    private List<Image> data = new ArrayList<Image>();
    /**
     * Error
     * <p>
     * 
     * 
     */
    @JsonProperty("error")
    private Error error;

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

    public ImagesQuickGenResponse withReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }

    /**
     * Data
     * <p>
     * 
     * 
     */
    @JsonProperty("data")
    public List<Image> getData() {
        return data;
    }

    /**
     * Data
     * <p>
     * 
     * 
     */
    @JsonProperty("data")
    public void setData(List<Image> data) {
        this.data = data;
    }

    public ImagesQuickGenResponse withData(List<Image> data) {
        this.data = data;
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

    public ImagesQuickGenResponse withError(Error error) {
        this.error = error;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ImagesQuickGenResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reqId");
        sb.append('=');
        sb.append(((this.reqId == null)?"<null>":this.reqId));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
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
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        result = ((result* 31)+((this.reqId == null)? 0 :this.reqId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImagesQuickGenResponse) == false) {
            return false;
        }
        ImagesQuickGenResponse rhs = ((ImagesQuickGenResponse) other);
        return ((((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data)))&&((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))))&&((this.reqId == rhs.reqId)||((this.reqId!= null)&&this.reqId.equals(rhs.reqId))));
    }

}
