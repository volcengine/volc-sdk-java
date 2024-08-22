package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * ListDcResResult
 */
@lombok.Data
public final class ListDcResResult  {

    /**
     * <p>查询结果总量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Long total;

    /**
     * <p>机房信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Row")
    private List<com.volcengine.model.acep.v20231030.ResultDcInfo> row;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
