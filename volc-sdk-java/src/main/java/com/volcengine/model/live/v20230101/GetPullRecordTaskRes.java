package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetPullRecordTaskRes
 */
@lombok.Data
public final class GetPullRecordTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetPullRecordTaskResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetPullRecordTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
