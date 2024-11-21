package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageMonitorRuleRes
 */
@lombok.Data
public final class CreateImageMonitorRuleRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateImageMonitorRuleResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateImageMonitorRuleResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
