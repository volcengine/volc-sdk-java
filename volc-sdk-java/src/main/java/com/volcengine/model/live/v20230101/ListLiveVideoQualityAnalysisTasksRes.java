package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListLiveVideoQualityAnalysisTasksRes
 */
@lombok.Data
public final class ListLiveVideoQualityAnalysisTasksRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListLiveVideoQualityAnalysisTasksResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListLiveVideoQualityAnalysisTasksResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
