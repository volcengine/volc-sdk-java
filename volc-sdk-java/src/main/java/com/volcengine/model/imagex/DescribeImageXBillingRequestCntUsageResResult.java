package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXBillingRequestCntUsageResResult
 */
@lombok.Data
public final class DescribeImageXBillingRequestCntUsageResResult  {

    /**
     * <p>附加组件通用请求次数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestCntData")
    private List<DescribeImageXBillingRequestCntUsageResResultRequestCntDataItem> requestCntData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
