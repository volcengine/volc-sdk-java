package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateLiveVideoQualityAnalysisTaskRes
 */
@lombok.Data
public final class CreateLiveVideoQualityAnalysisTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateLiveVideoQualityAnalysisTaskResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateLiveVideoQualityAnalysisTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
