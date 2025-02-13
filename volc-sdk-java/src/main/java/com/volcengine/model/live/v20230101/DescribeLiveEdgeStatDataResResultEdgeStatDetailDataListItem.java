package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveEdgeStatDataResResultEdgeStatDetailDataListItem
 */
@lombok.Data
public final class DescribeLiveEdgeStatDataResResultEdgeStatDetailDataListItem  {

    /**
     * <p>按推拉流协议维度进行数据拆分时的协议信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Protocol")
    private String protocol;

    /**
     * <p>按域名维度进行数据拆分时的域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>按运营商维度进行数据拆分时的运营商信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISP")
    private String iSP;

    /**
     * <p>按维度进行数据拆分后，当前维度的上行总流量，单位为 GB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalUpTraffic")
    private Float totalUpTraffic;

    /**
     * <p>按维度进行数据拆分后，当前维度的下行总流量，单位为 GB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalDownTraffic")
    private Float totalDownTraffic;

    /**
     * <p>按维度进行数据拆分后，当前维度的上行峰值带宽，单位为 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakUpBandwidth")
    private Float peakUpBandwidth;

    /**
     * <p>按维度进行数据拆分后，当前维度的下行峰值带宽，单位为 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakDownBandwidth")
    private Float peakDownBandwidth;

    /**
     * <p>按维度进行数据拆分后，当前维度的请求数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalRequest")
    private Float totalRequest;

    /**
     * <p>按维度进行数据拆分后，当前维度下所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EdgeStatDataList")
    private List<DescribeLiveEdgeStatDataResResultEdgeStatDetailDataListItemEdgeStatDataListItem> edgeStatDataList;

    /**
     * <p>按 CDN 节点 IP 所属大区进行数据拆分时的大区信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Area")
    private String area;

    /**
     * <p>按 CDN 节点 IP 所属国家进行数据拆分时的国家信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Country")
    private String country;

    /**
     * <p>按 CDN 节点 IP 所属省份进行数据拆分时的省份信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Province")
    private String province;

    /**
     * <p>按客户端 IP 所属大区进行数据拆分时的大区信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserArea")
    private String userArea;

    /**
     * <p>按客户端 IP 所属国家进行数据拆分时的国家信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserCountry")
    private String userCountry;

    /**
     * <p>按客户端 IP 所属省份进行数据拆分的省份信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserProvince")
    private String userProvince;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
