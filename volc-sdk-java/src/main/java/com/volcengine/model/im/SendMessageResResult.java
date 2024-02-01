package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * SendMessageResResult
 */
@lombok.Data
public final class SendMessageResResult  {

    /**
     * <p>消息Id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MessageId")
    private Long messageId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
