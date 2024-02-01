package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchAddBlockParticipantsResResult
 */
@lombok.Data
public final class BatchAddBlockParticipantsResResult  {

    /**
     * <p>禁言或者拉黑失败的会话成员 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedParticipantUserIds")
    private List<Long> failedParticipantUserIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
