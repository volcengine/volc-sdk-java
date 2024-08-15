package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteLiveVideoQualityAnalysisTaskBody
 */
@lombok.Data
public final class DeleteLiveVideoQualityAnalysisTaskBody  {

    /**
     * <p>待删除任务的任务名称。</p>
     *
     * <p>:::tip</p>
     *
     * <p>Name 和 ID 二选一必填。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>待删除任务的任务 ID。</p>
     *
     * <p>:::tip</p>
     *
     * <p>Name 和 ID 二选一必填。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private String iD;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
