package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchRemoveWhitelistParticipantResResult
 */
@lombok.Data
public final class BatchRemoveWhitelistParticipantResResult  {

    /**
     * <p>移除失败的 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedUserIds")
    private List<Long> failedUserIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
