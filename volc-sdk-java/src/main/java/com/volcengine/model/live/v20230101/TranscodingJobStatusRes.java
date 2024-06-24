package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * TranscodingJobStatusRes
 */
@lombok.Data
public final class TranscodingJobStatusRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private TranscodingJobStatusResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private TranscodingJobStatusResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
