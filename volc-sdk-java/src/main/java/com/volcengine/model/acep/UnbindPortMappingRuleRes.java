package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * UnbindPortMappingRuleRes
 */
@lombok.Data
public final class UnbindPortMappingRuleRes  {

    /**
     * <p>公共返回参数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private com.volcengine.model.acep.v20231030.ResponseResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private UnbindPortMappingRuleResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
