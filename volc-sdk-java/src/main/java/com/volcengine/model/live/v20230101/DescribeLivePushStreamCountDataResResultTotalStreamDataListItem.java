package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePushStreamCountDataResResultTotalStreamDataListItem
 */
@lombok.Data
public final class DescribeLivePushStreamCountDataResResultTotalStreamDataListItem  {

    /**
     * <p>时间片的开始时间，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>峰值流数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakCount")
    private Integer peakCount;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
