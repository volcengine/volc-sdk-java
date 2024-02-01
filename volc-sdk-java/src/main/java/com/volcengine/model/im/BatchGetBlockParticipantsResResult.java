package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchGetBlockParticipantsResResult
 */
@lombok.Data
public final class BatchGetBlockParticipantsResResult  {

    /**
     * <p>是否还有更多数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HasMore")
    private Boolean hasMore;

    /**
     * <p>下一批数据起始位置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NextCursor")
    private Long nextCursor;

    /**
     * <p>禁言/拉黑成员列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Participants")
    private List<BatchGetBlockParticipantsResResultParticipantsItem> participants;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
