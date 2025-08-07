package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXAddOnQPSUsageResResultQPSDataItem
 */
@lombok.Data
public final class DescribeImageXAddOnQPSUsageResResultQPSDataItem  {

    /**
     * <p>时序数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXAddOnQPSUsageResResultQPSDataItemDataItem> data;

    /**
     * <p>附加组件模型。</p>
     *
     *
     *
     * <p>- 取值为`total`：表示总请求QPS。</p>
     *
     * <p>- 取值不为`total`：表示附加组件使用模型的请求QPS。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Model")
    private String model;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
