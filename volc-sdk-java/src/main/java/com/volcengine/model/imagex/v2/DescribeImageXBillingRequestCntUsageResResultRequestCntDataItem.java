package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXBillingRequestCntUsageResResultRequestCntDataItem
 */
@lombok.Data
public final class DescribeImageXBillingRequestCntUsageResResultRequestCntDataItem  {

    /**
     * <p>附加组件类型，如：enhance，smartcut。</p>
     *
     * <p>取值为`total`，表示包含所选`AdvFeat`请求次数相加。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AdvFeat")
    private String advFeat;

    /**
     * <p>时序数据列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXBillingRequestCntUsageResResultRequestCntDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
