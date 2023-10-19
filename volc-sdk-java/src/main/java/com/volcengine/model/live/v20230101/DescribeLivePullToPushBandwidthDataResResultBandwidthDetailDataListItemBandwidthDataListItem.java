package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePullToPushBandwidthDataResResultBandwidthDetailDataListItemBandwidthDataListItem
 */
@lombok.Data
public final class DescribeLivePullToPushBandwidthDataResResultBandwidthDetailDataListItemBandwidthDataListItem  {

    /**
     * <p>时间片起始时刻。RFC3339 格式的 UTC 时间，精度为 s，例如，2022-04-13T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>转推带宽，单位为 Mbps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpBandwidth")
    private Float upBandwidth;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
