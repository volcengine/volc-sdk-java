package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * GetPodMetricRes
 */
@lombok.Data
public final class GetPodMetricRes  {

    /**
     * <p>公共返回参数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private com.volcengine.model.acep.v20231030.ResponseResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetPodMetricResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
