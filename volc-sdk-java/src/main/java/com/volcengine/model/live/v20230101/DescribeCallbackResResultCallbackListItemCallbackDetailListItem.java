package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCallbackResResultCallbackListItemCallbackDetailListItem
 */
@lombok.Data
public final class DescribeCallbackResResultCallbackListItemCallbackDetailListItem  {

    /**
     * <p>回调类型，返回 HTTP，表示可以使用 HTTP 和 HTTPS 地址接收回调消息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackType")
    private String callbackType;

    /**
     * <p>回调消息接收地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URL")
    private String uRL;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
