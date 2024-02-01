package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * RegisterUsersBody
 */
@lombok.Data
public final class RegisterUsersBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>注册用户的信息。一次最多注册 10 个用户。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Users")
    private List<RegisterUsersBodyUsersItem> users;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
