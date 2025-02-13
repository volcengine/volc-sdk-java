package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveSourceTrafficDataResResultTrafficDataListItem
 */
@lombok.Data
public final class DescribeLiveSourceTrafficDataResResultTrafficDataListItem  {

    /**
     * <p>数据按时间粒度聚合时，每个时间粒度的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>当前数据聚合时间粒度内产生的回源流量，单位 GB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Traffic")
    private Float traffic;

    /**
     * <p>当前数据聚合时间粒度内的回源峰值带宽，单位为 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bandwidth")
    private Float bandwidth;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
