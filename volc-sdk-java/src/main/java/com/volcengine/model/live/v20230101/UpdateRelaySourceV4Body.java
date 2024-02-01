package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateRelaySourceV4Body
 */
@lombok.Data
public final class UpdateRelaySourceV4Body  {

    /**
     * <p>开始时间，Unix 时间戳，单位为秒。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 回源开始到结束最大时间跨度为 7 天；</p>
     *
     * <p>- 开始时间与结束时间同时缺省，表示永久回源。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Integer startTime;

    /**
     * <p>结束时间，Unix 时间戳，单位为秒。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 回源开始到结束最大时间跨度为 7 天；</p>
     *
     * <p>- 开始时间与结束时间同时缺省，表示永久回源。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Integer endTime;

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，由 1 到 100 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>推流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>回源地址列表，支持输入 RTMP、FLV、HLS 和 SRT 协议的直播地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SrcAddrS")
    private List<String> srcAddrS;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
