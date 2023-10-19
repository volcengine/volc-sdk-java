package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCallbackBody
 */
@lombok.Data
public final class DescribeCallbackBody  {

    /**
     * <p>应用名称，缺省情况下表示查询全部。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>推流域名。`Vhost` 和 `Domain` 传且仅传一个。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>消息类型，缺省情况下表示查询全部。包括以下类型。</p>
     *
     *
     *
     * <p>- push：推流开始回调；</p>
     *
     * <p>- push\_end：推流结束回调；</p>
     *
     * <p>- snapshot：截图回调；</p>
     *
     * <p>- record：录制回调；</p>
     *
     * <p>- audit\_snapshot：截图审核回调。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MessageType")
    private String messageType;

    /**
     * <p>域名空间名称，`Vhost` 和 `Domain` 传且仅传一个。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
