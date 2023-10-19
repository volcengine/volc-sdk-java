package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveStreamSessionDataResResultSessionDetailDataListItem
 */
@lombok.Data
public final class DescribeLiveStreamSessionDataResResultSessionDetailDataListItem  {

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
     * <p>请求的 Referer。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Referer")
    private String referer;

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
    private List<DescribeLiveStreamSessionDataResResultSessionDetailDataListItemSessionDataListItem> sessionDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
