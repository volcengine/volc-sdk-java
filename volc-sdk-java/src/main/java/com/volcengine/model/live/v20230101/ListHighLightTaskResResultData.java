package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListHighLightTaskResResultData
 */
@lombok.Data
public final class ListHighLightTaskResResultData  {

    /**
     * <p>遍历任务总数，表示当前账号下高光剪辑任务的总数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>高光剪辑任务的详情列表，包含每个任务的基本信息和状态。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private List<ListHighLightTaskResResultDataResultItem> result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
