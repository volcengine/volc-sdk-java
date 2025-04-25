package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetCarouselDetailBody
 */
@lombok.Data
public final class GetCarouselDetailBody  {

    /**
     * <p>待查询的轮播任务 ID，任务的唯一标识。调用 `CreateCarouselTask` 接口创建轮播任务时返回。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
