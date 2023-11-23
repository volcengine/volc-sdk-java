package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveStreamUsageDataResResponseDataInfoListItem
 */
@lombok.Data
public final class DescribeLiveStreamUsageDataResResponseDataInfoListItem  {

    /**
     * <p>协议。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Protocol")
    private String protocol;

    /**
     * <p>请求数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Request")
    private Integer request;

    /**
     * <p>在线人数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OnlineUser")
    private Integer onlineUser;

    /**
     * <p>带宽，单位 kbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bandwidth")
    private Integer bandwidth;

    /**
     * <p>域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamName")
    private String streamName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
