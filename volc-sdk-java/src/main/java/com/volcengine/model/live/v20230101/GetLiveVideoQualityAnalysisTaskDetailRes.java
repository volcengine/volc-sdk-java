package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetLiveVideoQualityAnalysisTaskDetailRes
 */
@lombok.Data
public final class GetLiveVideoQualityAnalysisTaskDetailRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetLiveVideoQualityAnalysisTaskDetailResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetLiveVideoQualityAnalysisTaskDetailResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
