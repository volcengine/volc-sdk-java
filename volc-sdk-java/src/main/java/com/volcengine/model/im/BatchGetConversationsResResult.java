package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchGetConversationsResResult
 */
@lombok.Data
public final class BatchGetConversationsResResult  {

    /**
     * <p>会话详细信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationCoreInfos")
    private List<BatchGetConversationsResResultConversationCoreInfosItem> conversationCoreInfos;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
