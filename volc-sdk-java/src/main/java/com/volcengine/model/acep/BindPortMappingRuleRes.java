package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * BindPortMappingRuleRes
 */
@lombok.Data
public final class BindPortMappingRuleRes  {

    /**
     * <p>公共返回参数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private com.volcengine.model.acep.v20231030.ResponseResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private BindPortMappingRuleResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
