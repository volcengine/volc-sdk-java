package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveAuditDataResResult
 */
@lombok.Data
public final class DescribeLiveAuditDataResResult  {

    /**
     * <p>域名列表。</p>
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
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>时间粒度，单位为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度。取值为 `Domain` 时，表示按域名拆分数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>所选域名的已经审核的截图总张数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalCount")
    private Integer totalCount;

    /**
     * <p>审核截图数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditDataList")
    private List<DescribeLiveAuditDataResResultAuditDataListItem> auditDataList;

    /**
     * <p>按维度拆分后的详细数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuditDetailDataList")
    private List<DescribeLiveAuditDataResResultAuditDetailDataListItem> auditDetailDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
