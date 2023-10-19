package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVqosDimensionValuesRes
 */
@lombok.Data
public final class ListVqosDimensionValuesRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListVqosDimensionValuesResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private List<ListVqosDimensionValuesResResultItem> result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
