package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveCallbackDataResResultCallbackInfoListItem
 */
@lombok.Data
public final class DescribeLiveCallbackDataResResultCallbackInfoListItem  {

    /**
     * <p>域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>回调发生时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackTime")
    private String callbackTime;

    /**
     * <p>回调事件类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackEventType")
    private String callbackEventType;

    /**
     * <p>回调地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackAddress")
    private String callbackAddress;

    /**
     * <p>回调状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackStatus")
    private String callbackStatus;

    /**
     * <p>回调请求体。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackBody")
    private String callbackBody;

    /**
     * <p>回调响应码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackResponseCode")
    private String callbackResponseCode;

    /**
     * <p>回调响应头信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackResponseHeader")
    private String callbackResponseHeader;

    /**
     * <p>回调响应体。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackResponseBody")
    private String callbackResponseBody;

    /**
     * <p>回调响应时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackResponseTime")
    private String callbackResponseTime;

    /**
     * <p>错误信息，当回调失败时返回。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackErrorMessage")
    private String callbackErrorMessage;

    /**
     * <p>回调错误说明。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackErrorCode")
    private String callbackErrorCode;

    /**
     * <p>回调请求方式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackMethod")
    private String callbackMethod;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
