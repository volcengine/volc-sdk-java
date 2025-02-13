package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveStreamSessionDataResResultSessionDetailDataListItem
 */
@lombok.Data
public final class DescribeLiveStreamSessionDataResResultSessionDetailDataListItem  {

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
     * <p>按维度进行数据拆分后，当前维度的请求数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalRequest")
    private Integer totalRequest;

    /**
     * <p>按维度进行数据拆分后，当前维度的在线人数峰值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PeakOnlineUser")
    private Integer peakOnlineUser;

    /**
     * <p>按维度进行数据拆分后，当前维度下所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SessionDataList")
    private List<DescribeLiveStreamSessionDataResResultSessionDetailDataListItemSessionDataListItem> sessionDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
