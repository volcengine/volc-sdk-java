package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCarouselTaskResResultData
 */
@lombok.Data
public final class CreateCarouselTaskResResultData  {

    /**
     * <p>轮播任务的唯一标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
