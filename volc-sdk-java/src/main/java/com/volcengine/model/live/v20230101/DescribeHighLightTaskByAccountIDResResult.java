package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeHighLightTaskByAccountIDResResult
 */
@lombok.Data
public final class DescribeHighLightTaskByAccountIDResResult  {

    /**
     * <p>高光剪辑任务的详情数据，包含任务所属账号、任务参数配置、任务状态、任务唯一标识符以及生产结果列表等信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private DescribeHighLightTaskByAccountIDResResultData data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
