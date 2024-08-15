package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListLiveVideoQualityAnalysisTasksResResult
 */
@lombok.Data
public final class ListLiveVideoQualityAnalysisTasksResResult  {

    /**
     * <p>画质测评任务列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Tasks")
    private List<ListLiveVideoQualityAnalysisTasksResResultTasksItem> tasks;

    /**
     * <p>查询的数据的页码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>每页显示的数据条数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
