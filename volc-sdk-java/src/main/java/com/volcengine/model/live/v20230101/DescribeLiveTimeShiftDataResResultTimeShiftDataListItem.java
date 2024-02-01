package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveTimeShiftDataResResultTimeShiftDataListItem
 */
@lombok.Data
public final class DescribeLiveTimeShiftDataResResultTimeShiftDataListItem  {

    /**
     * <p>数据按时间粒度聚合时，每个时间粒度的开始时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>当前数据聚合时间粒度内的时移文件存储用量，单位为 GB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Storage")
    private Float storage;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
