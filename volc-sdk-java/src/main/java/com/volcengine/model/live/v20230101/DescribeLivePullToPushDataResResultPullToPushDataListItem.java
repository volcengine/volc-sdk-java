package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePullToPushDataResResultPullToPushDataListItem
 */
@lombok.Data
public final class DescribeLivePullToPushDataResResultPullToPushDataListItem  {

    /**
     * <p>数据按时间粒度聚合时，每个时间粒度的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>当前数据聚合时间粒度内的拉流转推总时长，单位为分钟。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Float value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
