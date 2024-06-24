package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeClosedStreamInfoByPageResResultStreamInfoListItem
 */
@lombok.Data
public final class DescribeClosedStreamInfoByPageResResultStreamInfoListItem  {

    /**
     * <p>历史直播流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>历史直播流使用的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>历史直播流使用的应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>历史直播流使用的流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>直播流的开始时间，RFC3339 格式的 UTC 时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>直播流的结束时间，RFC3339 格式的 UTC 时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>历史直播流的来源类型，取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `push`：直推流；</p>
     *
     * <p>- `relay`：回源流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SourceType")
    private String sourceType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
