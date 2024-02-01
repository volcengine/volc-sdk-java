package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeClosedStreamInfoByPageQuery
 */
@lombok.Data
public final class DescribeClosedStreamInfoByPageQuery  {

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
     * <p>视频直播服务的配置空间。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 如果同时传入 `Domain` 和对应的 `Vhost`，会返回 `Domain` 下的历史流列表；</p>
     *
     * <p>- 如果 `Domain` 和 `Vhost` 同时缺省，会返回当前 AccountID 下的历史流列表。</p>
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
     * <p>- 如果同时传入 `Domain` 和对应的 `Vhost`，会返回 `Domain` 下的历史流列表；</p>
     *
     * <p>- 如果 `Domain` 和 `Vhost` 同时缺省，会返回当前 AccountID 下的历史流列表。</p>
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
     * <p>流名称，默认查询所有流名称，由 1 到 100 位数字、字母、下划线及"-"和"."组成，如果指定`Stream`，必须同时指定`App`的值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>排列方式，根据结束时间排序。支持两种形式。缺省情况下为 desc。</p>
     *
     *
     *
     * <p>- asc：按从小到大升序排列；</p>
     *
     * <p>- desc：按从大到小降序排列。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Sort")
    private String sort;

    /**
     * <p>查询的起始时间，以 RFC3339 格式表示的 UTC 时间戳，精度为 s。筛选结束推流时间符合查询条件的历史流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTimeFrom")
    private String endTimeFrom;

    /**
     * <p>查询的结束时间，以 RFC3339 格式表示的 UTC 时间戳，精度为 s。筛选结束推流时间符合查询条件的历史流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTimeTo")
    private String endTimeTo;

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

    /**
     * <p>指定是否模糊匹配流名称，缺省情况为精准匹配。支持如下取值。</p>
     *
     *
     *
     * <p>- fuzzy：模糊匹配；</p>
     *
     * <p>- strict：精准匹配。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueryType")
    private String queryType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
