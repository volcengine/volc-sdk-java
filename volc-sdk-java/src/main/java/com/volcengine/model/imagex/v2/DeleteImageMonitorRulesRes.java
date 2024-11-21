package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DeleteImageMonitorRulesRes
 */
@lombok.Data
public final class DeleteImageMonitorRulesRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DeleteImageMonitorRulesResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DeleteImageMonitorRulesResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
