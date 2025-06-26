package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListHighLightTaskResResult
 */
@lombok.Data
public final class ListHighLightTaskResResult  {

    /**
     * <p>返回的高光剪辑任务数据，包含任务总数和任务详情列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private ListHighLightTaskResResultData data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
