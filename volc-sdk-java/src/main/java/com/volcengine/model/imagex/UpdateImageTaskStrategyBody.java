package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageTaskStrategyBody
 */
@lombok.Data
public final class UpdateImageTaskStrategyBody  {

    /**
     * <p>调整后的迁移策略</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RunStrategy")
    private UpdateImageTaskStrategyBodyRunStrategy runStrategy;

    /**
     * <p>任务ID，请参考[CreateImageMigrateTask](https://www.volcengine.com/docs/508/1009929)获取返回的任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
