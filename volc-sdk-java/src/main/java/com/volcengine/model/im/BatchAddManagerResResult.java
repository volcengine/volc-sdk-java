package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchAddManagerResResult
 */
@lombok.Data
public final class BatchAddManagerResResult  {

    /**
     * <p>添加失败的 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FailedManagerUserIds")
    private List<Long> failedManagerUserIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
