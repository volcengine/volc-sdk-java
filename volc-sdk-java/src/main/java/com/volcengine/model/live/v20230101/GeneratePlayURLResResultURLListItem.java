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
     * <p>- fcdn：火山引擎流媒体直播 CDN；</p>
     *
     * <p>- 3rd：第三方 CDN。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CDN")
    private String cDN;

    /**
     * <p>协议类型，包括 hls、flv 和 rtmp。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Protocol")
    private String protocol;

    /**
     * <p>地址类型，可能的值为：</p>
     *
     * <p>- push：推流；</p>
     *
     * <p>- pull：拉流；</p>
     *
     * <p>- 3rd_play(relay_source)：第三方回源；</p>
     *
     * <p>- 3rd_play(relay_sink)：第三方转推。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
