package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveSourceTrafficDataResResultTrafficDetailDataListItem
 */
@lombok.Data
public final class DescribeLiveSourceTrafficDataResResultTrafficDetailDataListItem  {

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
     * <p>回源总流量，单位为 GB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalTraffic")
    private Float totalTraffic;

    /**
     * <p>所有时间粒度数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TrafficDataList")
    private List<DescribeLiveSourceTrafficDataResResultTrafficDetailDataListItemTrafficDataListItem> trafficDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
