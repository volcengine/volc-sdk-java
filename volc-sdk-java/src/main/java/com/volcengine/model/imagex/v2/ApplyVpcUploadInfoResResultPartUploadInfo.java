package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ApplyVpcUploadInfoResResultPartUploadInfo
 */
@lombok.Data
public final class ApplyVpcUploadInfoResResultPartUploadInfo  {

    /**
     * <p>上传分片大小，默认为 200MB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PartSize")
    private Long partSize;

    /**
     * <p>分块上传 URL 列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PartPutURLs")
    private List<String> partPutURLs;

    /**
     * <p>合并分片的 URL。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CompletePartURL")
    private String completePartURL;

    /**
     * <p>上传分片请求头信息，用于合并分片请求。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CompletePartURLHeaders")
    private List<ApplyVpcUploadInfoResResultPartUploadInfoCompletePartURLHeadersItem> completePartURLHeaders;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
