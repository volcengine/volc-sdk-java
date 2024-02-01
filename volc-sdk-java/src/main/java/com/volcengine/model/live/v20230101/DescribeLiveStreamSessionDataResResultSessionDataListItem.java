package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveStreamSessionDataResResultSessionDataListItem
 */
@lombok.Data
public final class DescribeLiveStreamSessionDataResResultSessionDataListItem  {

    /**
     * <p>数据按时间粒度聚合时，诶个时间粒度的开始时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>当前数据聚合时间粒度内的请求数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Request")
    private Integer request;

    /**
     * <p>当前数据聚合时间粒度内的在线人数最大值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OnlineUser")
    private Integer onlineUser;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
