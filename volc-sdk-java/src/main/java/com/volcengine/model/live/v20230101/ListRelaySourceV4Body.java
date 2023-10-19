package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListRelaySourceV4Body
 */
@lombok.Data
public final class ListRelaySourceV4Body  {

    /**
     * <p>推流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>页码，默认值为 1，取值范围为正整数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Page")
    private Integer page;

    /**
     * <p>每页数量，取值范围为 [1,500]，默认值为 20。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Size")
    private Integer size;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
