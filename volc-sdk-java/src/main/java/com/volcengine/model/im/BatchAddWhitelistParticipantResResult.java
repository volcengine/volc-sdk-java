package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchAddWhitelistParticipantResResult
 */
@lombok.Data
public final class BatchAddWhitelistParticipantResResult  {

    /**
     * <p>添加失败的 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedUserIds")
    private List<Long> failedUserIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
