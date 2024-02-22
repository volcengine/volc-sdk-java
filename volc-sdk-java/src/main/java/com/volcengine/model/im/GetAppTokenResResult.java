package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * GetAppTokenResResult
 */
@lombok.Data
public final class GetAppTokenResResult  {

    /**
     * <p>应用的唯一标志</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private Integer appId;

    /**
     * <p>用户UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserId")
    private Long userId;

    /**
     * <p>生成的 Token</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Token")
    private String token;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
