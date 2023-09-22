package com.volcengine.model.live;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * DescribeLiveMetricBandwidthDataResResultBandwidthDetailDataListItem
 */
@lombok.Data
public final class DescribeLiveMetricBandwidthDataResResultBandwidthDetailDataListItem {

    /**
     * <p>推拉流协议。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Protocol")
    private String protocol;

    /**
     * <p>域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>运营商。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ISP")
    private String iSP;

    /**
     * <p>IP 地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IP")
    private String iP;

    /**
     * <p>上行峰值，单位为 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakUpBandwidth")
    private Float peakUpBandwidth;

    /**
     * <p>下行峰值，单位为 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakDownBandwidth")
    private Float peakDownBandwidth;

    /**
     * <p>时间粒度数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthDataList")
    private List<DescribeLiveMetricBandwidthDataResResultBandwidthDetailDataListItemBandwidthDataListItem> bandwidthDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
