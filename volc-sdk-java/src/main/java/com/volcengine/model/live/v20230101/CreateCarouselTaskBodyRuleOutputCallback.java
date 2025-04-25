package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCarouselTaskBodyRuleOutputCallback
 */
@lombok.Data
public final class CreateCarouselTaskBodyRuleOutputCallback  {

    /**
     * <p>回调地址。该字段需准确配置，用于接收系统回调信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
