package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveSnapshotDataResResult
 */
@lombok.Data
public final class DescribeLiveSnapshotDataResResult  {

    /**
     * <p>域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

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
     * <p>查询的起始时间，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>时间粒度，单位为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>所选域名的截图总张数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    /**
     * <p>每个聚合时间片的截图张数详情。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SnapshotDataList")
    private List<DescribeLiveSnapshotDataResResultSnapshotDataListItem> snapshotDataList;

    /**
     * <p>按维度拆分后的详细数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SnapshotDetailData")
    private List<DescribeLiveSnapshotDataResResultSnapshotDetailDataItem> snapshotDetailData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
