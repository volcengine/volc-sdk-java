package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchGetWhitelistParticipantResResult
 */
@lombok.Data
public final class BatchGetWhitelistParticipantResResult  {

    /**
     * <p>下一批数据起始位置。`-1`表示无更多数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NextCursor")
    private Long nextCursor;

    /**
     * <p>是否还有更多数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HasMore")
    private Boolean hasMore;

    /**
     * <p>白名单成员信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Participants")
    private List<BatchGetWhitelistParticipantResResultParticipantsItem> participants;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
