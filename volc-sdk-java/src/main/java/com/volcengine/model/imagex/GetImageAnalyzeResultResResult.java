package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageAnalyzeResultResResult
 */
@lombok.Data
public final class GetImageAnalyzeResultResResult  {

    /**
     * <p>任务结果</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Results")
    private List<GetImageAnalyzeResultResResultResultsItem> results;

    /**
     * <p>查询到的总量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
