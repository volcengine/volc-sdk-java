package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * ListPodResourceResResult
 */
@lombok.Data
public final class ListPodResourceResResult  {

    /**
     * <p>查询到的实例资源组信息列表，详请参看 `PodResource` 定义。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Row")
    private List<com.volcengine.model.acep.v20231030.ResultPodResource> row;

    /**
     * <p>查询结果总量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
