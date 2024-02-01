package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * UpdateFriendResResult
 */
@lombok.Data
public final class UpdateFriendResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedInfos")
    private UpdateFriendResResultFailedInfos failedInfos;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
