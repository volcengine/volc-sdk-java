package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * CommitImageUploadResResultResultsItemEncryption
 */
@lombok.Data
public final class CommitImageUploadResResultResultsItemEncryption  {

    /**
     * <p>加密图片的 Uri。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Uri")
    private String uri;

    /**
     * <p>加密私钥。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SecretKey")
    private String secretKey;

    /**
     * <p>加密算法。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Algorithm")
    private String algorithm;

    /**
     * <p>加密版本。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Version")
    private String version;

    /**
     * <p>加密源 MD5。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SourceMd5")
    private String sourceMd5;

    /**
     * <p>额外信息，键值均为 String。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Extra")
    private Map<String, String> extra;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
