package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveSourceTrafficDataResResultTrafficDetailDataListItem
 */
@lombok.Data
public final class DescribeLiveSourceTrafficDataResResultTrafficDetailDataListItem  {

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
     * <p>按维度进行数据拆分后，当前维度的回源中总流量，单位为 GB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalTraffic")
    private Float totalTraffic;

    /**
     * <p>按维度进行数据拆分后，当前维度下所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TrafficDataList")
    private List<DescribeLiveSourceTrafficDataResResultTrafficDetailDataListItemTrafficDataListItem> trafficDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
