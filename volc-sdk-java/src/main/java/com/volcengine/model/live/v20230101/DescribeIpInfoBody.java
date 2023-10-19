package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeIpInfoBody
 */
@lombok.Data
public final class DescribeIpInfoBody  {

    /**
     * <p>待查询的 IP 地址列表。支持 IPv4 和 IPv6 地址，一次最多查询 50 个 IP 地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ips")
    private List<String> ips;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
