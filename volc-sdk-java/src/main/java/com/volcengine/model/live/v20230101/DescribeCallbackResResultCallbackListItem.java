package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeCallbackResResultCallbackListItem
 */
@lombok.Data
public final class DescribeCallbackResResultCallbackListItem  {

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>开启鉴权。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthEnable")
    private Boolean authEnable;

    /**
     * <p>密钥。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthKeyPrimary")
    private String authKeyPrimary;

    /**
     * <p>回调数据列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackDetailList")
    private List<DescribeCallbackResResultCallbackListItemCallbackDetailListItem> callbackDetailList;

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
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>创建时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
