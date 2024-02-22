package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * GetMessagesResResultMessagesItemRefMsgInfo
 */
@lombok.Data
public final class GetMessagesResResultMessagesItemRefMsgInfo  {

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

    /**
     * <p>被引用的消息类型</p>
     *
     *
     *
     * <p>- `10001`：文本。</p>
     *
     * <p>- `10003`：图片。</p>
     *
     * <p>- `10004`：视频</p>
     *
     * <p>- `10005`：文件</p>
     *
     * <p>- `10006`：音频</p>
     *
     * <p>- `10012`：自定义消息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReferencedMessageType")
    private Integer referencedMessageType;

    /**
     * <p>被引用的消息状态</p>
     *
     *
     *
     * <p>- `0`：消息可见</p>
     *
     * <p>- `1`：消息已过期</p>
     *
     * <p>- `2`：消息（对用户）不可见</p>
     *
     * <p>- `3`：消息被撤回</p>
     *
     * <p>- `4`：消息本身可见，后因删除不可见</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
