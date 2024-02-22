package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * GetAppTokenBody
 */
@lombok.Data
public final class GetAppTokenBody  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>用户 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserId")
    private Long userId;

    /**
     * <p>Token 过期时间，unix 时间戳，单位为毫秒</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExpireTime")
    private Long expireTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
