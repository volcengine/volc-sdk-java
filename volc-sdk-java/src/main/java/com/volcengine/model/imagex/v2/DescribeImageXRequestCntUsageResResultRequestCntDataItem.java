package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXRequestCntUsageResResultRequestCntDataItem
 */
@lombok.Data
public final class DescribeImageXRequestCntUsageResResultRequestCntDataItem  {

    /**
     * <p>附加组件类型，`GroupBy`包含`AdvFeat`时有返回值。如：enhance，smartcut。取值为`total`，表示包含所选`AdvFeat`实际请求次数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AdvFeat")
    private String advFeat;

    /**
     * <p>服务 ID，`GroupBy`包含`ServiceId`时有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>具体数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXRequestCntUsageResResultRequestCntDataItemDataItem> data;

    /**
     * <p>模型名称，`GroupBy`包含`Model`时有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Model")
    private String model;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
