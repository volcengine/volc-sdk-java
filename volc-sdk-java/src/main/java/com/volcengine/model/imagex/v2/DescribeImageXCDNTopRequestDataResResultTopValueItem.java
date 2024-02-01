package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXCDNTopRequestDataResResultTopValueItem
 */
@lombok.Data
public final class DescribeImageXCDNTopRequestDataResResultTopValueItem  {

    /**
     * <p>对应于参数`KeyType`的取值数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Key")
    private String key;

    /**
     * <p>指标值。取值如下所示：</p>
     *
     *
     *
     * <p>- 当`ValueType`取值为`Traffic`，表示流量，单位为 Byte；</p>
     *
     * <p>- 当`ValueType`取值为`RequestCnt`，表示请求次数，单位为次。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Double value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
