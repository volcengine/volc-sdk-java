package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateDomainBody
 */
@lombok.Data
public final class CreateDomainBody  {

    /**
     * <p>推/拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>域名类型，包含两种类型。</p>
     *
     * <p>- push：推流域名；</p>
     *
     * <p>- pull-flv：拉流域名，包含 RTMP、FLV、HLS 格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>区域，默认指为 cn，包含 3 种类型。</p>
     *
     * <p>- cn：中国大陆；</p>
     *
     * <p>- cn-global：全球；</p>
     *
     * <p>- cn-oversea：海外及港澳台。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
