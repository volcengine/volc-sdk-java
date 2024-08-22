package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * ListDisplayLayoutMiniResResult
 */
@lombok.Data
public final class ListDisplayLayoutMiniResResult  {

    /**
     * <p>查询到的屏幕布局信息列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Row")
    private List<com.volcengine.model.acep.v20231030.ResultDisplayLayoutMini> row;

    /**
     * <p>查询总数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Long total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
