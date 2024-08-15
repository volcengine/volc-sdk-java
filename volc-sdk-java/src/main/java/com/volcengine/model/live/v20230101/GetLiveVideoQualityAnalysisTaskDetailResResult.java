package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetLiveVideoQualityAnalysisTaskDetailResResult
 */
@lombok.Data
public final class GetLiveVideoQualityAnalysisTaskDetailResResult  {

    /**
     * <p>测评任务详细信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Task")
    private GetLiveVideoQualityAnalysisTaskDetailResResultTask task;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
