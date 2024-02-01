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
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     *
     * <p>- 支持填写星号"*"，表示录制策略对该域名空间内的所有 AppName 生效；该策略即当前域名空间的全局策略；</p>
     *
     * <p>- 如果为某 AppName 同时配置了全局策略和单独的策略，则默认使用单独的策略进行录制。</p>
     *
     * <p>:::warning</p>
     *
     * <p>当 `App` 取值为 “*” 时，`Stream` 取值必须为 “\*”。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，支持填写星号"*"，表示录制策略对该域名空间内的所有 Stream 生效；该策略即当前域名空间的全局策略。</p>
     *
     *
     *
     * <p>:::warning</p>
     *
     * <p>当 `App` 取值为 “*” 时，`Stream` 取值必须为 “\*”。</p>
     *
     * <p>:::</p>
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
