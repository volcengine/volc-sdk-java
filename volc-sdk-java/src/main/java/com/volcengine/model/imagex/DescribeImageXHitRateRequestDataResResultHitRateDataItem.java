package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXHitRateRequestDataResResultHitRateDataItem
 */
@lombok.Data
public final class DescribeImageXHitRateRequestDataResResultHitRateDataItem  {

    /**
     * <p>具体数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXHitRateRequestDataResResultHitRateDataItemDataItem> data;

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
