package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveSourceTrafficDataResResultTrafficDetailDataListItemTrafficDataListItem
 */
@lombok.Data
public final class DescribeLiveSourceTrafficDataResResultTrafficDetailDataListItemTrafficDataListItem  {

    /**
     * <p>时间片起始时刻。RFC3339 格式的 UTC 时间，精度为 s，例如，`2022-04-13T00:00:00+08:00`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>回源流量，单位 GB</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Traffic")
    private Float traffic;

    /**
     * <p>带宽。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bandwidth")
    private Float bandwidth;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
