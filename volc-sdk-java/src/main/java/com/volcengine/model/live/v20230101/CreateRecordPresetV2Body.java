package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateRecordPresetV2Body
 */
@lombok.Data
public final class CreateRecordPresetV2Body  {

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>录制模板详细配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordPresetConfig")
    private CreateRecordPresetV2BodyRecordPresetConfig recordPresetConfig;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
