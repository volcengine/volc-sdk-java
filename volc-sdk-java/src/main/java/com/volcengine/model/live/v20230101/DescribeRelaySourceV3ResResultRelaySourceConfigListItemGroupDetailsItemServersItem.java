package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * DescribeRelaySourceV3ResResultRelaySourceConfigListItemGroupDetailsItemServersItem
 */
@lombok.Data
public final class DescribeRelaySourceV3ResResultRelaySourceConfigListItemGroupDetailsItemServersItem  {

    /**
     * <p>回源协议。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceProtocol")
    private String relaySourceProtocol;

    /**
     * <p>回源地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceDomain")
    private String relaySourceDomain;

    /**
     * <p>自定义回源参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceParams")
    private Map<String, String> relaySourceParams;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
