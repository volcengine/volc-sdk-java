package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeForbiddenStreamInfoByPageQuery
 */
@lombok.Data
public final class DescribeForbiddenStreamInfoByPageQuery  {

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
     * <p>域名空间名称，由 1 到 60 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，默认查询所有应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，默认查询所有流名称，由 1 到 100 位数字、字母、下划线及"-"和"."组成，如果指定 `Stream`，必须同时指定 `App` 的值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>排列方式，根据推流结束时间排序。支持两种形式。缺省情况下为 desc。</p>
     *
     * <p>- asc：按从小到大升序排列；</p>
     *
     * <p>- desc：按从大到小降序排列。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Sort")
    private String sort;

    /**
     * <p>指定是否模糊匹配流名称。缺省情况为精准匹配，支持以下取值。</p>
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
