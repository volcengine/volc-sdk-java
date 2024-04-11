package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateCallbackBody
 */
@lombok.Data
public final class UpdateCallbackBody  {

    /**
     * <p>应用名称，取值与直播流地址中 AppName 字段取值相同，默认为空，表示查询所有应用名称。支持由大小写字母（A - Z、a - z）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>如果入参选择 `Domain`，则不可同时传 `App`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>回调消息发送是否开启鉴权，默认为 `false`，取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `false`：不开启；</p>
     *
     * <p>- `true`：开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthEnable")
    private Boolean authEnable;

    /**
     * <p>回调消息发送鉴权密钥。</p>
     *
     * <p>:::tip</p>
     *
     * <p>如果 `AuthEnable` 为 `true`，则密钥必填。</p>
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
     * <p>直播流使用的推流域名。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，查看直播流使用的域名。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>`Vhost` 和 `Domain` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>回调的消息类型，取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `push`：推流开始回调；</p>
     *
     * <p>- `push_end`：推流结束回调；</p>
     *
     * <p>- `snapshot`：截图回调；</p>
     *
     * <p>- `record`：录制任务状态回调；</p>
     *
     * <p>- `audit_snapshot`：截图审核结果回调。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MessageType")
    private String messageType;

    /**
     * <p>是否开启转码流回调，默认为 0。取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `0`：false，不开启；</p>
     *
     * <p>- `1`：true，开启。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>回调类型为推流开始或推流结束时生效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeCallback")
    private Integer transcodeCallback;

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，查看需要查询的直播流使用的域名所属的域名空间。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>`Vhost` 和 `Domain` 传且仅传一个。</p>
     *
     * <p>:::</p>
     *
     *
     *
     *
     *
     *
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
