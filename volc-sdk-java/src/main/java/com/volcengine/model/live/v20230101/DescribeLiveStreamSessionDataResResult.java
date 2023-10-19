package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveStreamSessionDataResResult
 */
@lombok.Data
public final class DescribeLiveStreamSessionDataResResult  {

    /**
     * <p>域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

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
     * <p>直播流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>推拉流协议。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProtocolList")
    private List<String> protocolList;

    /**
     * <p>运营商。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISPList")
    private List<String> iSPList;

    /**
     * <p>请求的 Referer。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RefererList")
    private List<String> refererList;

    /**
     * <p>区域。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionList")
    private List<DescribeLiveStreamSessionDataResResultRegionListItem> regionList;

    /**
     * <p>开始时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>结束时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>时间粒度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>总的请求数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalRequest")
    private Integer totalRequest;

    /**
     * <p>在线人数峰值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakOnlineUser")
    private Integer peakOnlineUser;

    /**
     * <p>查询范围内的汇总信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SessionDataList")
    private List<DescribeLiveStreamSessionDataResResultSessionDataListItem> sessionDataList;

    /**
     * <p>按维度拆分后的详细数据。</p>
     *
     * <p>:::tip</p>
     *
     * <p>请求时，`DomainList`、`RefererList`、`ProtocolList` 和 `ISPList` 至少有一个参数传入了多个值时，会返回该参数；否则不返回该参数。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SessionDetailDataList")
    private List<DescribeLiveStreamSessionDataResResultSessionDetailDataListItem> sessionDetailDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
