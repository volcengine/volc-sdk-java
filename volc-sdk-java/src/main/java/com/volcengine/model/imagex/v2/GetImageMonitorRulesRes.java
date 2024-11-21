package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageMonitorRulesRes
 */
@lombok.Data
public final class GetImageMonitorRulesRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageMonitorRulesResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageMonitorRulesResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
