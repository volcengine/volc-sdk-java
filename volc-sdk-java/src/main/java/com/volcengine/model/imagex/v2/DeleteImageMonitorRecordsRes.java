package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DeleteImageMonitorRecordsRes
 */
@lombok.Data
public final class DeleteImageMonitorRecordsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DeleteImageMonitorRecordsResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DeleteImageMonitorRecordsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
