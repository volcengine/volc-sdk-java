package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAnalyzeTasksQuery
 */
@lombok.Data
public final class GetImageAnalyzeTasksQuery  {

    /**
     * <p>任务地区。默认为 `cn`，表示国内。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>返回任务名称或描述中包含该值的任务。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SearchPtn")
    private String searchPtn;

    /**
     * <p>分页条数。取值范围为 (0,100]，默认值为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Integer limit;

    /**
     * <p>分页偏移量，默认为 0。取值为 1 时，表示跳过第一条数据，从第二条数据取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Integer offset;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
