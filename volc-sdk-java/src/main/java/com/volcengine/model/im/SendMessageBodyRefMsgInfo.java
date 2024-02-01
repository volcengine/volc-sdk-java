package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * SendMessageBodyRefMsgInfo
 */
@lombok.Data
public final class SendMessageBodyRefMsgInfo  {

    /**
     * <p>被引用的消息 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReferencedMessageId")
    private Long referencedMessageId;

    /**
     * <p>消息引用时展示的文本内容</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Hint")
    private String hint;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
