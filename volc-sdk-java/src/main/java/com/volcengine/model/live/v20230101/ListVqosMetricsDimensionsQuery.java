package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVqosMetricsDimensionsQuery
 */
@lombok.Data
public final class ListVqosMetricsDimensionsQuery  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VqosService")
    private String vqosService;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
