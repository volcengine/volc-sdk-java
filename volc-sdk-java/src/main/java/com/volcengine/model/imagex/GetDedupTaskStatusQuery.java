package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetDedupTaskStatusQuery
 */
@lombok.Data
public final class GetDedupTaskStatusQuery  {

    /**
     * <p>任务 ID，您可以通过调用[使用图片去重获取结果值](https://www.volcengine.com/docs/508/138658)接口获取异步去重`TaskId`返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
