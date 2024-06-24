package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeIpInfoResResultListItem
 */
@lombok.Data
public final class DescribeIpInfoResResultListItem  {

    /**
     * <p>IP 地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ip")
    private String ip;

    /**
     * <p>当前 IP 地址是否是归属于火山引擎的 CDN 节点 IP。</p>
     *
     * <p>- `true`：属于；</p>
     *
     * <p>- `false`：不属于。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LiveCdnIp")
    private Boolean liveCdnIp;

    /**
     * <p>CDN 节点所属国家或地区信息。非归属火山引擎的 CDN 节点 IP 时，返回“-”。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Location")
    private String location;

    /**
     * <p>CDN 节点所属省份信息。非归属火山引擎 CDN 节点的 IP 时，返回“-”。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Province")
    private String province;

    /**
     * <p>CDN 节点所属城市信息。非归属火山引擎的 CDN 节点 IP 时，返回“-”。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "City")
    private String city;

    /**
     * <p>CDN 节点所属网络运营商。非归属火山引擎 CDN 节点的 IP 时，返回”-“。您可以通过 [DescribeLiveISPData](https://www.volcengine.com/docs/6469/1133974) 接口查看运营商标识符对应的运营商名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Isp")
    private String isp;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
