package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetLiveVideoQualityAnalysisTaskDetailResResultTaskScoringResultVQScoreLiveItem
 */
@lombok.Data
public final class GetLiveVideoQualityAnalysisTaskDetailResResultTaskScoringResultVQScoreLiveItem  {

    /**
     * <p>测评打点的时间，Unix 时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Timestamp")
    private Integer timestamp;

    /**
     * <p>测评点的画质得分，画质评分范围为 0 到 100，评分越高表示视频画面色彩越好。不同的评分段对应不同的视频质量感受：</p>
     *
     * <p>- 0～60：主观感受较差。</p>
     *
     * <p>- 60～70：主观感受良好。</p>
     *
     * <p>- 70～100：主观感受清晰。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Float value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
