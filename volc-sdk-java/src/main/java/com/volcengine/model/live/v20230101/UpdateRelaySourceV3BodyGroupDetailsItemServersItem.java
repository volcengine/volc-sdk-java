package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * UpdateRelaySourceV3BodyGroupDetailsItemServersItem
 */
@lombok.Data
public final class UpdateRelaySourceV3BodyGroupDetailsItemServersItem  {

    /**
     * <p>回源协议，支持两种回源协议。</p>
     *
     *
     *
     * <p>- rtmp：RTMP 回源协议；</p>
     *
     * <p>- flv：FLV 回源协议。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceProtocol")
    private String relaySourceProtocol;

    /**
     * <p>回源地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceDomain")
    private String relaySourceDomain;

    /**
     * <p>自定义回源参数，缺省情况下为空。格式为 `"Key":"Value"`，例如，`"domain":"live.push.net"`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceParams")
    private Map<String, Object> relaySourceParams;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
