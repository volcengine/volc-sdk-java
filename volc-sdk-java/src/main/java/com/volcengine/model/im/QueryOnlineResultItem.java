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
    private String connId;

    /**
     * <p>设备 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DeviceId")
    private Long deviceId;

    /**
     * <p>客户端版本号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ClientVersion")
    private Long clientVersion;

    /**
     * <p>设备平台，目前支持 Android、iOS和 Web。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Platform")
    private String platform;

    /**
     * <p>用户的 UserId</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserId")
    private Long userId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
