package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ApplyImageUploadResResultUploadAddress
 */
@lombok.Data
public final class ApplyImageUploadResResultUploadAddress  {

    /**
     * <p>上传 Uri</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>数量由请求参数中的 `UploadNum` 决定。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreInfos")
    private List<ApplyImageUploadResResultUploadAddressStoreInfosItem> storeInfos;

    /**
     * <p>上传域名列表，可以用于客户端容灾，并行上传等。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UploadHosts")
    private List<String> uploadHosts;

    /**
     * <p>一次上传会话 Key。</p>
     *
     * <p>上传完成上报时使用该值，该 Key 可以在解码后提取信息及参数校验。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SessionKey")
    private String sessionKey;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
