package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * DeleteFriendResResult
 */
@lombok.Data
public final class DeleteFriendResResult  {

    /**
     * <p>删除失败的好友信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedInfos")
    private List<DeleteFriendResResultFailedInfosItem> failedInfos;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
