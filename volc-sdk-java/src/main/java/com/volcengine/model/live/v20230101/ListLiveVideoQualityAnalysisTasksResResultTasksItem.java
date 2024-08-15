package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListLiveVideoQualityAnalysisTasksResResultTasksItem
 */
@lombok.Data
public final class ListLiveVideoQualityAnalysisTasksResResultTasksItem  {

    /**
     * <p>任务名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>进行画质测评的直播流地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SrcURL")
    private String srcURL;

    /**
     * <p>画质测评的打点间隔。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private Integer interval;

    /**
     * <p>测评任务持续时长。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Integer duration;

    /**
     * <p>任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private String iD;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
