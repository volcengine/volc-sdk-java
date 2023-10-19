package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveSourceTrafficDataResResultTrafficDataListItem
 */
@lombok.Data
public final class DescribeLiveSourceTrafficDataResResultTrafficDataListItem  {

    /**
     * <p>时间片起始时刻。RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>回源流量，单位 GB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Traffic")
    private Float traffic;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
