package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXEdgeRequestRegionsQuery
 */
@lombok.Data
public final class DescribeImageXEdgeRequestRegionsQuery  {

    /**
     * <p>获取数据起始时间点。日期格式按照 ISO8601 表示法，格式为：YYYY-MM-DDThh:mm:ss±hh:mm。例如`2019-06-02T00:00:00+08:00`。<br>起始时间与结束时间间隔小于等于 90 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>获取数据结束时间点。日期格式按照 ISO8601 表示法，格式为：YYYY-MM-DDThh:mm:ss±hh:mm。例如`2019-06-02T00:00:00+08:00`。<br>起始时间与结束时间间隔小于等于 90 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
