package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * DetailDNSRuleRes
 */
@lombok.Data
public final class DetailDNSRuleRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private com.volcengine.model.acep.v20231030.ResponseResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DetailDNSRuleResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
