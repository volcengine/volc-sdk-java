package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateCarouselTaskBody
 */
@lombok.Data
public final class UpdateCarouselTaskBody  {

    /**
     * <p>待更新的轮播任务 ID，任务的唯一标识。调用 `CreateCarouselTask` 接口创建轮播任务时返回。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    /**
     * <p>轮播规则，用于指定轮播播放的素材和行为等。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rule")
    private UpdateCarouselTaskBodyRule rule;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
