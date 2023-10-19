package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveStreamInfoByPageResResultStreamInfoListItem
 */
@lombok.Data
public final class DescribeLiveStreamInfoByPageResResultStreamInfoListItem  {

    /**
     * <p>流 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Long iD;

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>域名。</p>
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
     * <p>开始推流时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SessionStartTime")
    private String sessionStartTime;

    /**
     * <p>表示推流方式，缺省情况查询全部推流方式。支持如下取值。</p>
     *
     *
     *
     * <p>- push：直推流；</p>
     *
     * <p>- relay：回源流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SourceType")
    private String sourceType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
