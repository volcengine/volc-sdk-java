
package com.volcengine.model.maas.api.v2;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Reference
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "idx",
    "logo_url",
    "pc_url",
    "site_name"
})
@Generated("jsonschema2pojo")
public class Reference {

    /**
     * Url
     * <p>
     * 
     * 
     */
    @JsonProperty("url")
    private String url;
    /**
     * Idx
     * <p>
     * 
     * 
     */
    @JsonProperty("idx")
    private Integer idx;
    /**
     * Logo Url
     * <p>
     * 
     * 
     */
    @JsonProperty("logo_url")
    private String logoUrl;
    /**
     * Pc Url
     * <p>
     * 
     * 
     */
    @JsonProperty("pc_url")
    private String pcUrl;
    /**
     * Site Name
     * <p>
     * 
     * 
     */
    @JsonProperty("site_name")
    private String siteName;

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

    public Reference withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Idx
     * <p>
     * 
     * 
     */
    @JsonProperty("idx")
    public Integer getIdx() {
        return idx;
    }

    /**
     * Idx
     * <p>
     * 
     * 
     */
    @JsonProperty("idx")
    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Reference withIdx(Integer idx) {
        this.idx = idx;
        return this;
    }

    /**
     * Logo Url
     * <p>
     * 
     * 
     */
    @JsonProperty("logo_url")
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * Logo Url
     * <p>
     * 
     * 
     */
    @JsonProperty("logo_url")
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Reference withLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    /**
     * Pc Url
     * <p>
     * 
     * 
     */
    @JsonProperty("pc_url")
    public String getPcUrl() {
        return pcUrl;
    }

    /**
     * Pc Url
     * <p>
     * 
     * 
     */
    @JsonProperty("pc_url")
    public void setPcUrl(String pcUrl) {
        this.pcUrl = pcUrl;
    }

    public Reference withPcUrl(String pcUrl) {
        this.pcUrl = pcUrl;
        return this;
    }

    /**
     * Site Name
     * <p>
     * 
     * 
     */
    @JsonProperty("site_name")
    public String getSiteName() {
        return siteName;
    }

    /**
     * Site Name
     * <p>
     * 
     * 
     */
    @JsonProperty("site_name")
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public Reference withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("idx");
        sb.append('=');
        sb.append(((this.idx == null)?"<null>":this.idx));
        sb.append(',');
        sb.append("logoUrl");
        sb.append('=');
        sb.append(((this.logoUrl == null)?"<null>":this.logoUrl));
        sb.append(',');
        sb.append("pcUrl");
        sb.append('=');
        sb.append(((this.pcUrl == null)?"<null>":this.pcUrl));
        sb.append(',');
        sb.append("siteName");
        sb.append('=');
        sb.append(((this.siteName == null)?"<null>":this.siteName));
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
        result = ((result* 31)+((this.siteName == null)? 0 :this.siteName.hashCode()));
        result = ((result* 31)+((this.idx == null)? 0 :this.idx.hashCode()));
        result = ((result* 31)+((this.pcUrl == null)? 0 :this.pcUrl.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.logoUrl == null)? 0 :this.logoUrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Reference) == false) {
            return false;
        }
        Reference rhs = ((Reference) other);
        return ((((((this.siteName == rhs.siteName)||((this.siteName!= null)&&this.siteName.equals(rhs.siteName)))&&((this.idx == rhs.idx)||((this.idx!= null)&&this.idx.equals(rhs.idx))))&&((this.pcUrl == rhs.pcUrl)||((this.pcUrl!= null)&&this.pcUrl.equals(rhs.pcUrl))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.logoUrl == rhs.logoUrl)||((this.logoUrl!= null)&&this.logoUrl.equals(rhs.logoUrl))));
    }

}
