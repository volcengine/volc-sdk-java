package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXSourceRequestBandwidthResResultBpsDataItem
 */
@lombok.Data
public final class DescribeImageXSourceRequestBandwidthResResultBpsDataItem  {

    /**
     * <p>具体数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXSourceRequestBandwidthResResultBpsDataItemDataItem> data;

    /**
     * <p>域名，仅当`GroupBy`取值为`DomainName`时返回该参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainName")
    private String domainName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
