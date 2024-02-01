package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchRemoveManagerResResult
 */
@lombok.Data
public final class BatchRemoveManagerResResult  {

    /**
     * <p>移除失败的管理员 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedManagerUserIds")
    private List<Long> failedManagerUserIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
