package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * ScanConversationParticipantListResResult
 */
@lombok.Data
public final class ScanConversationParticipantListResResult  {

    /**
     * <p>群成员详细信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Participants")
    private List<ScanConversationParticipantListResResultParticipantsItem> participants;

    /**
     * <p>是否还有下一页</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HasMore")
    private Boolean hasMore;

    /**
     * <p>下一页起始位置。为负时表示后续没有成员数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NextCursor")
    private Integer nextCursor;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
