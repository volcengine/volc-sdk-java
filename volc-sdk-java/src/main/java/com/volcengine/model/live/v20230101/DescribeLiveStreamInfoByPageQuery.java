package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveStreamInfoByPageQuery
 */
@lombok.Data
public final class DescribeLiveStreamInfoByPageQuery  {

    /**
     * <p>当前页码，取值范围 ≥1。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>分页大小，取值范围为 [1,1000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>域名空间名称。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 如果同时传入 `Domain` 和对应的 `Vhost`，会返回 `Domain` 下的在线流列表；</p>
     *
     * <p>- 如果 `Domain` 和 `Vhost` 同时缺省，会返回当前 AccountID 下的在线流列表。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>推流域名（含删除域名）。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 如果同时传入 `Domain` 和对应的 `Vhost`，会返回 `Domain` 下的在线流列表；</p>
     *
     * <p>- 如果 `Domain` 和 `Vhost` 同时缺省，会返回当前 AccountID 下的在线流列表。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称，默认查询所有应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，缺省情况下，查询所有流名称，由 1 到 100 位数字、字母、下划线及"-"和"."组成，如果指定 `Stream`，必须同时指定 `App` 的值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>流类型，缺省情况下表示全选。支持如下取值。</p>
     *
     * <p>- Origin：原始流；</p>
     *
     * <p>- trans：转码流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamType")
    private String streamType;

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
