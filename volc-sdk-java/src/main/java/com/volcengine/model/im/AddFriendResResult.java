package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * AddFriendResResult
 */
@lombok.Data
public final class AddFriendResResult  {

    /**
     * <p>添加失败的好友信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedInfos")
    private List<AddFriendResResultFailedInfosItem> failedInfos;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
