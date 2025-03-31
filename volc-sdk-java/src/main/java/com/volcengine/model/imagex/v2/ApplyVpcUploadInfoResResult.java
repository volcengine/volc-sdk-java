package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ApplyVpcUploadInfoResResult
 */
@lombok.Data
public final class ApplyVpcUploadInfoResResult  {

    /**
     * <p>上传模式。</p>
     *
     * <p>- `direct`：直接上传</p>
     *
     * <p>- `part`：分片上传</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UploadMode")
    private String uploadMode;

    /**
     * <p>分片上传信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PartUploadInfo")
    private ApplyVpcUploadInfoResResultPartUploadInfo partUploadInfo;

    /**
     * <p>一次上传会话 Key。</p>
     *
     * <p>上传完成上报时使用该值，该 Key 可以在解码后提取信息及参数校验。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SessionKey")
    private String sessionKey;

    /**
     * <p>参数的唯一标识符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Oid")
    private String oid;

    /**
     * <p>直接上传的 URL。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PutURL")
    private String putURL;

    /**
     * <p>直接上传的请求头。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PutURLHeaders")
    private List<ApplyVpcUploadInfoResResultPutURLHeadersItem> putURLHeaders;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
