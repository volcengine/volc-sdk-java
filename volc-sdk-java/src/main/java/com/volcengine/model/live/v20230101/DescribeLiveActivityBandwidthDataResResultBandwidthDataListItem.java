package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveActivityBandwidthDataResResultBandwidthDataListItem
 */
@lombok.Data
public final class DescribeLiveActivityBandwidthDataResResultBandwidthDataListItem  {

    /**
     * <p>时间片起始时刻。RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>带宽，单位为 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bandwidth")
    private Integer bandwidth;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
