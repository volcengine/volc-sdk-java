package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * UnRegisterUsersBody
 */
@lombok.Data
public final class UnRegisterUsersBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>注销用户 UserId。一次最多注销 10 个用户。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserIds")
    private List<Long> userIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
