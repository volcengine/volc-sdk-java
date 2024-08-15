package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateEncryptHLSBody
 */
@lombok.Data
public final class UpdateEncryptHLSBody  {

    /**
     * <p>客户自建密钥管理服务后，客户端向密钥管理服务请求获取密钥的地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URL")
    private String uRL;

    /**
     * <p>视频直播服务端生成密钥的更新周期，单位为秒，取值范围为 [60,604800]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CycleTime")
    private String cycleTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
