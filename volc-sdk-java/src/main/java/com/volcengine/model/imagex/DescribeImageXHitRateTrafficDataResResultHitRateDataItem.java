package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXHitRateTrafficDataResResultHitRateDataItem
 */
@lombok.Data
public final class DescribeImageXHitRateTrafficDataResResultHitRateDataItem  {

    /**
     * <p>具体数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXHitRateTrafficDataResResultHitRateDataItemDataItem> data;

    /**
     * <p>域名，当`GroupBy`指定了`DomainName`时有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainName")
    private String domainName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
