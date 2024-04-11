package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GeneratePlayURLResResultURLListItem
 */
@lombok.Data
public final class GeneratePlayURLResResultURLListItem  {

    /**
     * <p>生成的拉流地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URL")
    private String uRL;

    /**
     * <p>CDN 类型。</p>
     *
     * <p>- `fcdn`：火山引擎流媒体直播 CDN；</p>
     *
     * <p>- `3rd`：第三方 CDN。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CDN")
    private String cDN;

    /**
     * <p>协议类型，包括 hls、flv、rtmp、udp 和 cmaf。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Protocol")
    private String protocol;

    /**
     * <p>地址类型，取值及含义如下所示。</p>
     *
     * <p>- `pull`：拉流地址；</p>
     *
     * <p>- `3rd_play(relay_source)`：第三方回源地址，当配置了回源且 CDN 类型为第三方 CDN 时返回；</p>
     *
     * <p>- `3rd_play(relay_sink)`：第三方转推地址，当配置了拉流转推且 CDN 类型为第三方 CDN 时返回。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
