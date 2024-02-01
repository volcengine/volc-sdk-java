package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BatchUpdateUserBody
 */
@lombok.Data
public final class BatchUpdateUserBody {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>用户资料。一次最多 10 个用户</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Users")
    private List<BatchUpdateUserItem> Users;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
