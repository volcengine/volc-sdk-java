package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePushStreamCountDataResResultStreamDetailDataListItemTotalStreamDataListItem
 */
@lombok.Data
public final class DescribeLivePushStreamCountDataResResultStreamDetailDataListItemTotalStreamDataListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakCount")
    private Integer peakCount;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
