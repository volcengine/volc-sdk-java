package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchGetUserResResult
 */
@lombok.Data
public final class BatchGetUserResResult  {

    /**
     * <p>用户详细信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Users")
    private List<BatchGetUserResResultUsersItem> users;

    /**
     * <p>用户详细信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NotFoundUsers")
    private List<Long> notFoundUsers;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
