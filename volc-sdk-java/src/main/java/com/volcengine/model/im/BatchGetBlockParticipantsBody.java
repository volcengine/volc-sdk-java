package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * BatchGetBlockParticipantsBody
 */
@lombok.Data
public final class BatchGetBlockParticipantsBody  {

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
     * <p>操作行为</p>
     *
     *
     *
     * <p>- `0`：获取禁言列表</p>
     *
     * <p>- `1`：获取拉黑列表</p>
     *
     *
     *
     * <p>默认为 `0`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlockAction")
    private Integer blockAction;

    /**
     * <p>分批起始位置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Cursor")
    private Long cursor;

    /**
     * <p>每批查询条数，最大值为 `20`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Long limit;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
