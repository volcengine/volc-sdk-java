package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchDeleteConversationParticipantResResult
 */
@lombok.Data
public final class BatchDeleteConversationParticipantResResult  {

    /**
     * <p>成功时为空，失败时返回失败用户 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedUserIds")
    private List<Long> failedUserIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
