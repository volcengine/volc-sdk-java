package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetLiveVideoQualityAnalysisTaskDetailResResultTaskScoringResultVQScoreLiveItem
 */
@lombok.Data
public final class GetLiveVideoQualityAnalysisTaskDetailResResultTaskScoringResultVQScoreLiveItem  {

    /**
     * <p>测试打点的时间，Unix 时间戳。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Timestamp")
    private Integer timestamp;

    /**
     * <p>测评点的画质得分。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Float value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
