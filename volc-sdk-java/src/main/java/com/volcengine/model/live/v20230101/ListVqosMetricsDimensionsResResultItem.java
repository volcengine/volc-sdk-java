package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVqosMetricsDimensionsResResultItem
 */
@lombok.Data
public final class ListVqosMetricsDimensionsResResultItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Metrics")
    private List<ListVqosMetricsDimensionsResResultItemMetricsItem> metrics;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dimensions")
    private List<ListVqosMetricsDimensionsResResultItemDimensionsItem> dimensions;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Service")
    private String service;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
