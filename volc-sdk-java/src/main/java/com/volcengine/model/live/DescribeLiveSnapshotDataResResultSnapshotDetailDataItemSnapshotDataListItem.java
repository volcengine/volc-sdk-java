package com.volcengine.model.live;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveSnapshotDataResResultSnapshotDetailDataItemSnapshotDataListItem
 */
@lombok.Data
public final class DescribeLiveSnapshotDataResResultSnapshotDetailDataItemSnapshotDataListItem  {

    /**
     * <p>时间片起始时刻。RFC3339 格式的 UTC 时间，精度为 s；例如，2022-04-13T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>截图总张数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Integer value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
