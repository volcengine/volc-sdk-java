package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetLiveVideoQualityAnalysisTaskDetailResResultTaskScoringResult
 */
@lombok.Data
public final class GetLiveVideoQualityAnalysisTaskDetailResResultTaskScoringResult  {

    /**
     * <p>画质测评结果详细信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VQScoreLive")
    private List<GetLiveVideoQualityAnalysisTaskDetailResResultTaskScoringResultVQScoreLiveItem> vQScoreLive;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
