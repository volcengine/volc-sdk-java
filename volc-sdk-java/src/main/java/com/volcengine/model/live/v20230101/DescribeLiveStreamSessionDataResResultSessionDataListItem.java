package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveStreamSessionDataResResultSessionDataListItem
 */
@lombok.Data
public final class DescribeLiveStreamSessionDataResResultSessionDataListItem  {

    /**
     * <p>时间片开始时刻。RFC3339 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
