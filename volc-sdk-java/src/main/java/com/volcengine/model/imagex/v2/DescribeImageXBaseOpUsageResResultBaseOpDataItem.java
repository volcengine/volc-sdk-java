package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXBaseOpUsageResResultBaseOpDataItem
 */
@lombok.Data
public final class DescribeImageXBaseOpUsageResResultBaseOpDataItem  {

    /**
     * <p>计量数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXBaseOpUsageResResultBaseOpDataItemDataItem> data;

    /**
     * <p>服务 ID。当 `GroupBy` 中包含 `ServiceId` 时，有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
