package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListLiveVideoQualityAnalysisTasksBody
 */
@lombok.Data
public final class ListLiveVideoQualityAnalysisTasksBody  {

    /**
     * <p>查询的任务名称列表，默认为空，表示查询结果不对任务名称进行筛选。</p>
     *
     * <p>:::tip</p>
     *
     * <p>Name 和 ID 不可同时传入。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Names")
    private List<String> names;

    /**
     * <p>查询数据的页码，取值范围为正整数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>每页显示的数据条数，最大是为 1000。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>查询的任务 ID 列表，默认为空，表示查询结果不对任务 ID 进行筛选。 </p>
     *
     * <p>:::tip</p>
     *
     * <p>Name 和 ID 不可同时传入。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IDs")
    private List<String> iDs;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
