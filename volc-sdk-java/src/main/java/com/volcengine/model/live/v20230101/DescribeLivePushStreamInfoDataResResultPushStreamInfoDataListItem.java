package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePushStreamInfoDataResResultPushStreamInfoDataListItem
 */
@lombok.Data
public final class DescribeLivePushStreamInfoDataResResultPushStreamInfoDataListItem  {

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>当前流的推流开始时间，RFC3339 格式的时间字符串，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>当前流的推流结束时间，RFC3339 格式的时间字符串，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>推流开始到结束的时长，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Integer duration;

    /**
     * <p>推流客户端的 IP 地址，没有 IP 信息时返回为空。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IP")
    private String iP;

    /**
     * <p>推流断开原因，常见的断流原因参见[回调内容说明-断流错误原因](https://www.volcengine.com/docs/6469/1126932)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamBreakReason")
    private String streamBreakReason;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
