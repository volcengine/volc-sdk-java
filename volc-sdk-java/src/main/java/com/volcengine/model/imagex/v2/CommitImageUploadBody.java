package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CommitImageUploadBody
 */
@lombok.Data
public final class CommitImageUploadBody  {

    /**
     * <p>一次上传会话 Key。您可参考[获取文件上传地址](https://www.volcengine.com/docs/508/9397)获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SessionKey")
    private String sessionKey;

    /**
     * <p>上传成功的资源 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuccessOids")
    private List<String> successOids;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DecryptKeys")
    private List<String> decryptKeys;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
