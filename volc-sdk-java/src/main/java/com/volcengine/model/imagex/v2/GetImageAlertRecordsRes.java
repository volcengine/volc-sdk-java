package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAlertRecordsRes
 */
@lombok.Data
public final class GetImageAlertRecordsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageAlertRecordsResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageAlertRecordsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
