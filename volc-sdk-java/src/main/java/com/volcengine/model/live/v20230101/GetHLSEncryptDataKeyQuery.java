package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetHLSEncryptDataKeyQuery
 */
@lombok.Data
public final class GetHLSEncryptDataKeyQuery  {

    /**
     * <p>视频直播服务端生成的 M3U8 文件中写入的每个 TS 分片的密钥 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "KeyID")
    private String keyID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
