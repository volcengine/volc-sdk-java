package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * ListAppVersionDeployResResult
 */
@lombok.Data
public final class ListAppVersionDeployResResult  {

    /**
     * <p>查询到的应用版本部署情况。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Row")
    private List<com.volcengine.model.acep.v20231030.ResultAppVersionDeploy> row;

    /**
     * <p>查询结果总数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Long total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
