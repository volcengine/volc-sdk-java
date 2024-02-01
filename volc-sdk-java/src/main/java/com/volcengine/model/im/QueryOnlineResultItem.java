package com.volcengine.model.im;

import com.alibaba.fastjson.JSON;

/**
 * QueryOnlineStatusResultItem
 */
@lombok.Data
public class QueryOnlineResultItem {
    /**
     * <p>连接的唯一标识</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConnId")
    private String ConnID;

    /**
     * <p>用户的 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserID")
    private Long UserID;

    /**
     * <p>设备 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DeviceID")
    private Long DeviceID;

    /**
     * <p>客户端版本号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ClientVersion")
    private Long ClientVersion;

    /**
     * <p>设备平台，目前支持 Android、iOS和 Web。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Platform")
    private String Platform;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
