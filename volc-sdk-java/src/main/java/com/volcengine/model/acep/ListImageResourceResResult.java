package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * ListImageResourceResResult
 */
@lombok.Data
public final class ListImageResourceResResult  {

    /**
     * <p>镜像分布信息，参看 [ImageResource](#imageresource) 数据结构。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Row")
    private List<com.volcengine.model.acep.v20231030.ResultImageResource> row;

    /**
     * <p>查询结果总组数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Long total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
