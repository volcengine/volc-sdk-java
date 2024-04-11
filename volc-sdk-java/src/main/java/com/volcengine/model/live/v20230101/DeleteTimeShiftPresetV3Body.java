package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteTimeShiftPresetV3Body
 */
@lombok.Data
public final class DeleteTimeShiftPresetV3Body  {

    /**
     * <p>域名空间名称，您可以调用[ListTimeShiftPresetV2](https://www.volcengine.com/docs/6469/1126883) 接口，获取待删除时移配置的 `Vhost` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，您可以调用[ListTimeShiftPresetV2](https://www.volcengine.com/docs/6469/1126883) 接口，获取待删除时移配置的 `App` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
