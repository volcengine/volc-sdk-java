package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateCallbackBody
 */
@lombok.Data
public final class UpdateCallbackBody  {

    /**
     * <p>应用名称，默认查询所有应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     *
     * <p>如果入参选择 `Domain`，则不可同时传 `App`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>是否开启鉴权，默认为 false。取值及含义如下所示。</p>
     *
     *
     *
     * <p>- false：不开启；</p>
     *
     * <p>- true：开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthEnable")
    private Boolean authEnable;

    /**
     * <p>密钥。</p>
     *
     * <p>:::tip</p>
     *
     * <p>如果 AuthEnable 为 true，则密钥必填。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthKeyPrimary")
    private String authKeyPrimary;

    /**
     * <p>回调信息列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackDetailList")
    private List<UpdateCallbackBodyCallbackDetailListItem> callbackDetailList;

    /**
     * <p>推流域名。`Vhost` 和 `Domain` 传且仅传一个。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>消息类型。包括以下类型。</p>
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
     * <p>是否开启转码流回调，默认为 0。取值及含义如下所示。</p>
     *
     *
     *
     * <p>- 0：false，不开启；</p>
     *
     * <p>- 1：true，开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeCallback")
    private Integer transcodeCallback;

    /**
     * <p>域名空间名称。`Vhost` 和 `Domain` 传且仅传一个。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
