package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveAuditDataBody
 */
@lombok.Data
public final class DescribeLiveAuditDataBody  {

    /**
     * <p>域名列表，缺省情况表示该用户的所有域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询的起始时间。RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间。RFC3339 格式的 UTC 时间，精度为 s。</p>
     *
     *
     *
     * <p>支持查询 366 天以内的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>时间粒度，单位为 s，支持天粒度，默认为 86400。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>用于指定数据拆分的维度。缺省情况下，表示只显示截图总张数，不做数据拆维展示。支持的取值为 `Domain`，表示按域名拆分数据。</p>
     *
     *
     *
     * <p>例如，`"DetailField":["Domain"]`，则返回 `DomainList` 中每个域名的截图张数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
