package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * GetConversationMessagesBody
 */
@lombok.Data
public final class GetConversationMessagesBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>会话 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationShortId")
    private Long conversationShortId;

    /**
     * <p>查询起始位置，即查询起始消息的 Index</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Cursor")
    private Long cursor;

    /**
     * <p>查询条数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Long limit;

    /**
     * <p>查询方向。</p>
     *
     *
     *
     * <p>- `0`：正向查询</p>
     *
     * <p>- `1`：反向查询</p>
     *
     *
     *
     * <p>默认值为 `0`。值不合法时自动调整为默认值。</p>
     *
     * <p>直播群只能取 `1`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Reverse")
    private Integer reverse;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
