package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchDeleteBlockParticipantsResResult
 */
@lombok.Data
public final class BatchDeleteBlockParticipantsResResult  {

    /**
     * <p>取消禁言或者取消拉黑失败的会话成员 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedParticipantUserIds")
    private List<Long> failedParticipantUserIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
