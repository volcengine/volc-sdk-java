package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * GetUserConversationsResResult
 */
@lombok.Data
public final class GetUserConversationsResResult  {

    /**
     * <p>会话详细信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConversationInfos")
    private List<GetUserConversationsResResultConversationInfosItem> conversationInfos;

    /**
     * <p>是否还有更多的数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HasMore")
    private Boolean hasMore;

    /**
     * <p>下一批数据起始位置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NextCursor")
    private Long nextCursor;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
