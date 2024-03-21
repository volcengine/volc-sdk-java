
package com.volcengine.model.maas.api.v2;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Image
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "detail",
    "image_bytes"
})
@Generated("jsonschema2pojo")
public class Image {

    /**
     * Url
     * <p>
     * 
     * 
     */
    @JsonProperty("url")
    private String url;
    /**
     * Detail
     * <p>
     * 
     * 
     */
    @JsonProperty("detail")
    private String detail;
    /**
     * Image Bytes
     * <p>
     * 
     * 
     */
    @JsonProperty("image_bytes")
    private byte[] imageBytes;

    /**
     * Url
     * <p>
     * 
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Url
     * <p>
     * 
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Image withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Detail
     * <p>
     * 
     * 
     */
    @JsonProperty("detail")
    public String getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * 
     * 
     */
    @JsonProperty("detail")
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Image withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Image Bytes
     * <p>
     * 
     * 
     */
    @JsonProperty("image_bytes")
    public byte[] getImageBytes() {
        return imageBytes;
    }

    /**
     * Image Bytes
     * <p>
     * 
     * 
     */
    @JsonProperty("image_bytes")
    public void setImageBytes(byte[] imageBytes) {
        this.imageBytes = imageBytes;
    }

    public Image withImageBytes(byte[] imageBytes) {
        this.imageBytes = imageBytes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Image.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
        sb.append(',');
        sb.append("imageBytes");
        sb.append('=');
        sb.append(((this.imageBytes == null)?"<null>":this.imageBytes));
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
        result = ((result* 31)+((this.imageBytes == null)? 0 :this.imageBytes.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Image) == false) {
            return false;
        }
        Image rhs = ((Image) other);
        return ((((this.imageBytes == rhs.imageBytes)||((this.imageBytes!= null)&&this.imageBytes.equals(rhs.imageBytes)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))));
    }

}
