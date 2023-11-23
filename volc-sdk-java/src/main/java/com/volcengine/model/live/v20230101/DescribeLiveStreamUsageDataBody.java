package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveStreamUsageDataBody
 */
@lombok.Data
public final class DescribeLiveStreamUsageDataBody  {

    /**
     * <p>域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamName")
    private String streamName;

    /**
     * <p>查询时间，格式为 yyyy-mm-dd HH:MM。 例如：查询时间 2023-01-01 10:00 时表示查询时间范围为 10:00 到 10:01。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 未填写查询时间时，默认查询时间为当前时间减 5 分钟。</p>
     *
     * <p>- 最长支持查询的历史时间范围为 31 天。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueryTime")
    private String queryTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
