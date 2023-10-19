package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVqosMetricsDimensionsRes
 */
@lombok.Data
public final class ListVqosMetricsDimensionsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListVqosMetricsDimensionsResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private List<ListVqosMetricsDimensionsResResultItem> result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
