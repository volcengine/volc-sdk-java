
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
    "image_url",
    "site_name",
    "title",
    "summary",
    "publish_time",
    "doc_id",
    "chunk_id",
    "text",
    "text_type",
    "page_nums",
    "origin_text_token_len",
    "file_name"
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
     * Image Url
     * <p>
     * 
     * 
     */
    @JsonProperty("image_url")
    private String imageUrl;
    /**
     * Site Name
     * <p>
     * 
     * 
     */
    @JsonProperty("site_name")
    private String siteName;
    /**
     * Title
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    private String title;
    /**
     * Summary
     * <p>
     * 
     * 
     */
    @JsonProperty("summary")
    private String summary;
    /**
     * Publish Time
     * <p>
     * 
     * 
     */
    @JsonProperty("publish_time")
    private String publishTime;
    /**
     * Doc Id
     * <p>
     * 
     * 
     */
    @JsonProperty("doc_id")
    private String docId;
    /**
     * Chunk Id
     * <p>
     * 
     * 
     */
    @JsonProperty("chunk_id")
    private String chunkId;
    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("text")
    private String text;
    /**
     * Text Type
     * <p>
     * 
     * 
     */
    @JsonProperty("text_type")
    private String textType;
    /**
     * Page Nums
     * <p>
     * 
     * 
     */
    @JsonProperty("page_nums")
    private String pageNums;
    /**
     * Origin Text Token Len
     * <p>
     * 
     * 
     */
    @JsonProperty("origin_text_token_len")
    private Integer originTextTokenLen;
    /**
     * File Name
     * <p>
     * 
     * 
     */
    @JsonProperty("file_name")
    private String fileName;

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
     * Image Url
     * <p>
     * 
     * 
     */
    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Image Url
     * <p>
     * 
     * 
     */
    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Reference withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

    /**
     * Title
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * 
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Reference withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Summary
     * <p>
     * 
     * 
     */
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    /**
     * Summary
     * <p>
     * 
     * 
     */
    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Reference withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Publish Time
     * <p>
     * 
     * 
     */
    @JsonProperty("publish_time")
    public String getPublishTime() {
        return publishTime;
    }

    /**
     * Publish Time
     * <p>
     * 
     * 
     */
    @JsonProperty("publish_time")
    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public Reference withPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    /**
     * Doc Id
     * <p>
     * 
     * 
     */
    @JsonProperty("doc_id")
    public String getDocId() {
        return docId;
    }

    /**
     * Doc Id
     * <p>
     * 
     * 
     */
    @JsonProperty("doc_id")
    public void setDocId(String docId) {
        this.docId = docId;
    }

    public Reference withDocId(String docId) {
        this.docId = docId;
        return this;
    }

    /**
     * Chunk Id
     * <p>
     * 
     * 
     */
    @JsonProperty("chunk_id")
    public String getChunkId() {
        return chunkId;
    }

    /**
     * Chunk Id
     * <p>
     * 
     * 
     */
    @JsonProperty("chunk_id")
    public void setChunkId(String chunkId) {
        this.chunkId = chunkId;
    }

    public Reference withChunkId(String chunkId) {
        this.chunkId = chunkId;
        return this;
    }

    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public Reference withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Text Type
     * <p>
     * 
     * 
     */
    @JsonProperty("text_type")
    public String getTextType() {
        return textType;
    }

    /**
     * Text Type
     * <p>
     * 
     * 
     */
    @JsonProperty("text_type")
    public void setTextType(String textType) {
        this.textType = textType;
    }

    public Reference withTextType(String textType) {
        this.textType = textType;
        return this;
    }

    /**
     * Page Nums
     * <p>
     * 
     * 
     */
    @JsonProperty("page_nums")
    public String getPageNums() {
        return pageNums;
    }

    /**
     * Page Nums
     * <p>
     * 
     * 
     */
    @JsonProperty("page_nums")
    public void setPageNums(String pageNums) {
        this.pageNums = pageNums;
    }

    public Reference withPageNums(String pageNums) {
        this.pageNums = pageNums;
        return this;
    }

    /**
     * Origin Text Token Len
     * <p>
     * 
     * 
     */
    @JsonProperty("origin_text_token_len")
    public Integer getOriginTextTokenLen() {
        return originTextTokenLen;
    }

    /**
     * Origin Text Token Len
     * <p>
     * 
     * 
     */
    @JsonProperty("origin_text_token_len")
    public void setOriginTextTokenLen(Integer originTextTokenLen) {
        this.originTextTokenLen = originTextTokenLen;
    }

    public Reference withOriginTextTokenLen(Integer originTextTokenLen) {
        this.originTextTokenLen = originTextTokenLen;
        return this;
    }

    /**
     * File Name
     * <p>
     * 
     * 
     */
    @JsonProperty("file_name")
    public String getFileName() {
        return fileName;
    }

    /**
     * File Name
     * <p>
     * 
     * 
     */
    @JsonProperty("file_name")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Reference withFileName(String fileName) {
        this.fileName = fileName;
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
        sb.append("imageUrl");
        sb.append('=');
        sb.append(((this.imageUrl == null)?"<null>":this.imageUrl));
        sb.append(',');
        sb.append("siteName");
        sb.append('=');
        sb.append(((this.siteName == null)?"<null>":this.siteName));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null)?"<null>":this.summary));
        sb.append(',');
        sb.append("publishTime");
        sb.append('=');
        sb.append(((this.publishTime == null)?"<null>":this.publishTime));
        sb.append(',');
        sb.append("docId");
        sb.append('=');
        sb.append(((this.docId == null)?"<null>":this.docId));
        sb.append(',');
        sb.append("chunkId");
        sb.append('=');
        sb.append(((this.chunkId == null)?"<null>":this.chunkId));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("textType");
        sb.append('=');
        sb.append(((this.textType == null)?"<null>":this.textType));
        sb.append(',');
        sb.append("pageNums");
        sb.append('=');
        sb.append(((this.pageNums == null)?"<null>":this.pageNums));
        sb.append(',');
        sb.append("originTextTokenLen");
        sb.append('=');
        sb.append(((this.originTextTokenLen == null)?"<null>":this.originTextTokenLen));
        sb.append(',');
        sb.append("fileName");
        sb.append('=');
        sb.append(((this.fileName == null)?"<null>":this.fileName));
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
        result = ((result* 31)+((this.summary == null)? 0 :this.summary.hashCode()));
        result = ((result* 31)+((this.publishTime == null)? 0 :this.publishTime.hashCode()));
        result = ((result* 31)+((this.fileName == null)? 0 :this.fileName.hashCode()));
        result = ((result* 31)+((this.pcUrl == null)? 0 :this.pcUrl.hashCode()));
        result = ((result* 31)+((this.docId == null)? 0 :this.docId.hashCode()));
        result = ((result* 31)+((this.originTextTokenLen == null)? 0 :this.originTextTokenLen.hashCode()));
        result = ((result* 31)+((this.siteName == null)? 0 :this.siteName.hashCode()));
        result = ((result* 31)+((this.textType == null)? 0 :this.textType.hashCode()));
        result = ((result* 31)+((this.pageNums == null)? 0 :this.pageNums.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.chunkId == null)? 0 :this.chunkId.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.logoUrl == null)? 0 :this.logoUrl.hashCode()));
        result = ((result* 31)+((this.imageUrl == null)? 0 :this.imageUrl.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.idx == null)? 0 :this.idx.hashCode()));
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
        return (((((((((((((((((this.summary == rhs.summary)||((this.summary!= null)&&this.summary.equals(rhs.summary)))&&((this.publishTime == rhs.publishTime)||((this.publishTime!= null)&&this.publishTime.equals(rhs.publishTime))))&&((this.fileName == rhs.fileName)||((this.fileName!= null)&&this.fileName.equals(rhs.fileName))))&&((this.pcUrl == rhs.pcUrl)||((this.pcUrl!= null)&&this.pcUrl.equals(rhs.pcUrl))))&&((this.docId == rhs.docId)||((this.docId!= null)&&this.docId.equals(rhs.docId))))&&((this.originTextTokenLen == rhs.originTextTokenLen)||((this.originTextTokenLen!= null)&&this.originTextTokenLen.equals(rhs.originTextTokenLen))))&&((this.siteName == rhs.siteName)||((this.siteName!= null)&&this.siteName.equals(rhs.siteName))))&&((this.textType == rhs.textType)||((this.textType!= null)&&this.textType.equals(rhs.textType))))&&((this.pageNums == rhs.pageNums)||((this.pageNums!= null)&&this.pageNums.equals(rhs.pageNums))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.chunkId == rhs.chunkId)||((this.chunkId!= null)&&this.chunkId.equals(rhs.chunkId))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.logoUrl == rhs.logoUrl)||((this.logoUrl!= null)&&this.logoUrl.equals(rhs.logoUrl))))&&((this.imageUrl == rhs.imageUrl)||((this.imageUrl!= null)&&this.imageUrl.equals(rhs.imageUrl))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.idx == rhs.idx)||((this.idx!= null)&&this.idx.equals(rhs.idx))));
    }

}
