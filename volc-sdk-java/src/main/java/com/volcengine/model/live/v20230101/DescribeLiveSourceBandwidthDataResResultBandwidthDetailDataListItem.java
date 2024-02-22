package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveSourceBandwidthDataResResultBandwidthDetailDataListItem
 */
@lombok.Data
public final class DescribeLiveSourceBandwidthDataResResultBandwidthDetailDataListItem  {

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
     * <p>按维度进行数据拆分后，当前维度的回源峰值带宽，单位为 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakBandwidth")
    private Float peakBandwidth;

    /**
     * <p>按维度进行数据拆分后，当前维度下所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthDataList")
    private List<DescribeLiveSourceBandwidthDataResResultBandwidthDetailDataListItemBandwidthDataListItem> bandwidthDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
