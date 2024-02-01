package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeIpInfoResResultListItem
 */
@lombok.Data
public final class DescribeIpInfoResResultListItem  {

    /**
     * <p>IP 地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ip")
    private String ip;

    /**
     * <p>是否归属于火山引擎 CDN 节点。</p>
     *
     *
     *
     * <p>- true：属于；</p>
     *
     * <p>- false：不属于。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LiveCdnIp")
    private Boolean liveCdnIp;

    /**
     * <p>IP 所属国家或地区。非归属火山引擎视频直播的 IP，返回“-”。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Location")
    private String location;

    /**
     * <p>IP 所属省。非归属火山引擎视频直播的 IP，返回“-”。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Province")
    private String province;

    /**
     * <p>IP 所属地区。非归属火山引擎视频直播的 IP，返回“-”。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "City")
    private String city;

    /**
     * <p>IP 所属运营商。非归属火山引擎视频直播的 IP，返回”-“。</p>
     *
     * <p>您可以通过 [DescribeLiveISPData](https://www.volcengine.com/docs/6469/1133974) 接口查看运营商标识符对应的运营商名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Isp")
    private String isp;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
