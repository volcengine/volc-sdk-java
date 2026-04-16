package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateHighLightTaskResResult
 */
@lombok.Data
public final class CreateHighLightTaskResResult  {

    /**
     * <p>包含任务相关数据的对象，其中 `TaskID` 字段表示任务的唯一标识符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private CreateHighLightTaskResResultData data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
