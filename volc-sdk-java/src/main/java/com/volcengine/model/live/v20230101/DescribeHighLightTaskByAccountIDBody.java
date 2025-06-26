package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeHighLightTaskByAccountIDBody
 */
@lombok.Data
public final class DescribeHighLightTaskByAccountIDBody  {

    /**
     * <p>创建高光剪辑任务时返回的任务唯一标识符，用于后续查询任务状态或结果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    /**
     * <p>是否返回高光剪辑生产结果，默认值为 `false`。支持的取值如下所示。</p>
     *
     * <p>- `true`：返回高光剪辑生产结果；</p>
     *
     * <p>- `false`：不返回高光剪辑生产结果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NeedResult")
    private Boolean needResult;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
