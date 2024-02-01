package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXDomainTrafficDataResResultTrafficDataItem
 */
@lombok.Data
public final class DescribeImageXDomainTrafficDataResResultTrafficDataItem  {

    /**
     * <p>具体数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXDomainTrafficDataResResultTrafficDataItemDataItem> data;

    /**
     * <p>服务 ID，`GroupBy`包含`ServiceId`时有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>域名，`GroupBy`包含`DomainName`时有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainName")
    private String domainName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
