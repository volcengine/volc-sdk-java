package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePullToPushBandwidthDataResResultBandwidthDetailDataListItem
 */
@lombok.Data
public final class DescribeLivePullToPushBandwidthDataResResultBandwidthDetailDataListItem  {

    /**
     * <p>推流地址类型。</p>
     *
     * <p>- Live：非第三方；</p>
     *
     * <p>- Third：第三方。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DstAddrType")
    private String dstAddrType;

    /**
     * <p>域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>转推带宽峰值，单位为 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakUpBandwidth")
    private Float peakUpBandwidth;

    /**
     * <p>所有时间粒度数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BandwidthDataList")
    private List<DescribeLivePullToPushBandwidthDataResResultBandwidthDetailDataListItemBandwidthDataListItem> bandwidthDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
