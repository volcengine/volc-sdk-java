package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXCubeUsageResResultCubeDataItem
 */
@lombok.Data
public final class DescribeImageXCubeUsageResResultCubeDataItem  {

    /**
     * <p>时序数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXCubeUsageResResultCubeDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
