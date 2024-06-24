package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteWatermarkPresetBody
 */
@lombok.Data
public final class DeleteWatermarkPresetBody  {

    /**
     * <p>应用名称，您可以调用 [ListVhostWatermarkPreset](https://www.volcengine.com/docs/6469/1126889) 接口，查看待删除水印配置的 App 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>域名空间，您可以调用 [ListVhostWatermarkPreset](https://www.volcengine.com/docs/6469/1126889) 接口，查看待删除水印配置的 Vhost 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
