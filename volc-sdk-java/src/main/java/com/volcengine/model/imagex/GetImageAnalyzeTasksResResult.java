package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageAnalyzeTasksResResult
 */
@lombok.Data
public final class GetImageAnalyzeTasksResResult  {

    /**
     * <p>任务</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tasks")
    private List<GetImageAnalyzeTasksResResultTasksItem> tasks;

    /**
     * <p>查询到任务数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Long total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
