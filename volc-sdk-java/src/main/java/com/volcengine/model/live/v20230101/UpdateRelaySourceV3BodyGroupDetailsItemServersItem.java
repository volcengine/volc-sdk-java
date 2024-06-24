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
     * <p>- `rtmp`：RTMP 回源协议；</p>
     *
     * <p>- `flv`：FLV 回源协议。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceProtocol")
    private String relaySourceProtocol;

    /**
     * <p>直播源服务器的地址，支持填写回源服务的域名或 IP 地址。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 当源站使用了非默认端口时，支持在回源地址中以`域名:端口`或 `IP:端口`的形式配置端口。</p>
     *
     * <p>- 最多支持添加 10 个回源地址，回源失败时，将按照您添加的地址顺序轮循尝试。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceDomain")
    private String relaySourceDomain;

    /**
     * <p>自定义回源参数，缺省情况下为空。格式为 `"Key":"Value"`，例如，`"domain":"live.push.net"`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelaySourceParams")
    private Map<String, String> relaySourceParams;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
