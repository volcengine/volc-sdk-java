package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListRelaySourceV4ResResultListItem
 */
@lombok.Data
public final class ListRelaySourceV4ResResultListItem  {

    /**
     * <p>直播流的使用的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

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
     * <p>回源开始时间，`StartTime` 和 `EndTime` 同时缺省的情况下，表示永久回源。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Integer startTime;

    /**
     * <p>回源结束时间，`StartTime` 和 `EndTime` 同时缺省的情况下，表示永久回源。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Integer endTime;

    /**
     * <p>回源地址列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SrcAddrS")
    private List<String> srcAddrS;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
