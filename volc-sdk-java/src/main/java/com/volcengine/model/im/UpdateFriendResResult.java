package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * UpdateFriendResResult
 */
@lombok.Data
public final class UpdateFriendResResult  {

    /**
     * <p>更新失败的好友信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedInfos")
    private UpdateFriendResResultFailedInfos failedInfos;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
