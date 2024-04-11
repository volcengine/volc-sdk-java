package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteCallbackBody
 */
@lombok.Data
public final class DeleteCallbackBody  {

    /**
     * <p>域名空间，与创建回调时传的值一致。您可以调用 [DescribeCallback](https://www.volcengine.com/docs/6469/1126931) 接口查看待删除回调配置的 `Vhost` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>推流域名，与创建回调时传的值一致。您可以调用 [DescribeCallback](https://www.volcengine.com/docs/6469/1126931) 接口查看待删除回调配置的 `Domain` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>消息类型，与创建回调时传的值一致。您可以调用 [DescribeCallback](https://www.volcengine.com/docs/6469/1126931) 接口查看待删除回调配置的 `MessageType` 取值。</p>
     *
     *
     *
     * <p>缺省情况下为空，表示删除符合 Vhost、Domain、App 配置下的所有回调类型配置。包括以下类型。</p>
     *
     * <p>- push：推流开始回调；</p>
     *
     * <p>- push_end：推流结束回调；</p>
     *
     * <p>- snapshot：截图回调；</p>
     *
     * <p>- record：录制任务状态回调；</p>
     *
     * <p>- audit_snapshot：截图审核结果回调。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MessageType")
    private String messageType;

    /**
     * <p>应用名称，与创建回调时传的值一致。您可以调用 [DescribeCallback](https://www.volcengine.com/docs/6469/1126931) 接口查看待删除回调配置的 `App` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
