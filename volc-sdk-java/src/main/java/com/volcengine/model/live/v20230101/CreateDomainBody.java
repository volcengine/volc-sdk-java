package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateDomainBody
 */
@lombok.Data
public final class CreateDomainBody  {

    /**
     * <p>待添加到视频直播服务进行加速的域名，域名只能由数字（0 - 9）、字母（A - Z、a -z）和连字符（-） 组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>域名类型，包含两种类型。</p>
     *
     *
     *
     * <p>- `push`：推流域名；</p>
     *
     * <p>- `pull-flv`：拉流域名，包含 RTMP、FLV、HLS 格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>域名加速区域，默认值为 `cn`，包含以下类型。</p>
     *
     *
     *
     * <p>- `cn`：中国内地；</p>
     *
     * <p>- `cn-global`：全球加速；</p>
     *
     * <p>- `cn-oversea`：海外及港澳台。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
