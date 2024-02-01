package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * BatchGetWhitelistParticipantBody
 */
@lombok.Data
public final class BatchGetWhitelistParticipantBody  {

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
     * <p>查询起始位置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Cursor")
    private Long cursor;

    /**
     * <p>每批查询条数。最大值为 `20`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Long limit;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
