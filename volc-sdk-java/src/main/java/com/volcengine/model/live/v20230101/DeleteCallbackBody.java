package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteCallbackBody
 */
@lombok.Data
public final class DeleteCallbackBody  {

    /**
     * <p>域名空间名称。如创建回调 [UpdateCallback](https://www.volcengine.com/docs/6469/78553) 时传了参数 `Vhost`，删除时需要传 `Vhost`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>推流域名。如创建回调 [UpdateCallback](https://www.volcengine.com/docs/6469/78553) 时传了参数 `Domain`，删除时需要传 `Domain`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>消息类型。缺省情况下表示删除所有消息类型。包括以下类型。</p>
     *
     * <p>- push：推流开始回调；</p>
     *
     * <p>- push_end：推流结束回调；</p>
     *
     * <p>- snapshot：截图回调；</p>
     *
     * <p>- record：录制回调；</p>
     *
     * <p>- audit_snapshot：截图审核回调。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MessageType")
    private String messageType;

    /**
     * <p>应用名称。缺省情况下表示删除 Vhost 下的所有回调配置。如果入参选择 `Domain`，则不可同时传 `App`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
