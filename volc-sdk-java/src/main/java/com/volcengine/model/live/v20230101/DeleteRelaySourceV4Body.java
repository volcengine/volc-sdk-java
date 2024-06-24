package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteRelaySourceV4Body
 */
@lombok.Data
public final class DeleteRelaySourceV4Body  {

    /**
     * <p>应用名称，您可以调用 [ListRelaySourceV4](https://www.volcengine.com/docs/6469/1126878) 接口，获取待删除固定回源配置的 App 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，您可以调用 [ListRelaySourceV4](https://www.volcengine.com/docs/6469/1126878) 接口，获取待删除固定回源配置的 Stream 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>拉流域名，您可以调用 [ListRelaySourceV4](https://www.volcengine.com/docs/6469/1126878) 接口，获取待删除固定回源配置的 Domain 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
