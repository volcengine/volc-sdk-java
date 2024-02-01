package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchUpdateLiveParticipantsResResult
 */
@lombok.Data
public final class BatchUpdateLiveParticipantsResResult  {

    /**
     * <p>更新资料失败的群成员信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedInfos")
    private List<BatchUpdateLiveParticipantsResResultFailedInfosItem> failedInfos;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
