package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVqosMetricsDimensionsResResultItemDimensionsItem
 */
@lombok.Data
public final class ListVqosMetricsDimensionsResResultItemDimensionsItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Alias")
    private String alias;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Attribute")
    private String attribute;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
