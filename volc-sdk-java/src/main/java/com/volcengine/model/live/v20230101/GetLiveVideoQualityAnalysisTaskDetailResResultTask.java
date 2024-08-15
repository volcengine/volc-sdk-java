package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetLiveVideoQualityAnalysisTaskDetailResResultTask
 */
@lombok.Data
public final class GetLiveVideoQualityAnalysisTaskDetailResResultTask  {

    /**
     * <p>任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    /**
     * <p>任务名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>测试流的播放地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SrcURL")
    private String srcURL;

    /**
     * <p>画质测评的打点间隔。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private Integer interval;

    /**
     * <p>测试任务的持续时长。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Integer duration;

    /**
     * <p>画质测评结果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ScoringResult")
    private GetLiveVideoQualityAnalysisTaskDetailResResultTaskScoringResult scoringResult;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
