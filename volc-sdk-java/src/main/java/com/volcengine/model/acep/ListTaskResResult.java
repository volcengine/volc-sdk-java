package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * ListTaskResResult
 */
@lombok.Data
public final class ListTaskResResult  {

    /**
     * <p>查询结果总量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    /**
     * <p>查询到的任务信息列表，详情参看 `Task` 数据类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Row")
    private List<com.volcengine.model.acep.v20231030.ResultTask> row;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
