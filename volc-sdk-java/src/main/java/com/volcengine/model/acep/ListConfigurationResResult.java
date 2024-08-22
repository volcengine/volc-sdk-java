package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * ListConfigurationResResult
 */
@lombok.Data
public final class ListConfigurationResResult  {

    /**
     * <p>查询到的套餐信息总量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Long total;

    /**
     * <p>资源套餐信息，详请参考 `Configuration` 定义。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Row")
    private List<com.volcengine.model.acep.v20231030.ResultConfiguration> row;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
