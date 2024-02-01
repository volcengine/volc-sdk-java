package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * GetConversationMessagesResResult
 */
@lombok.Data
public final class GetConversationMessagesResResult  {

    /**
     * <p>是否还有下一页</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HasMore")
    private Boolean hasMore;

    /**
     * <p>下一页起始位置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NewCursor")
    private Long newCursor;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Messages")
    private List<GetConversationMessagesResResultMessagesItem> messages;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
