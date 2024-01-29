package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXCDNTopRequestDataResResult
 */
@lombok.Data
public final class DescribeImageXCDNTopRequestDataResResult  {

    /**
     * <p>可展示的数据总数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>数据列表，按`Value`降序排列。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TopValue")
    private List<DescribeImageXCDNTopRequestDataResResultTopValueItem> topValue;

    /**
     * <p>总流量或总请求次数，取值如下所示：</p>
     *
     *
     *
     * <p>- 当`ValueType`取值为`Traffic`，表示总流量，单位为 Byte；</p>
     *
     * <p>- 当`ValueType`取值为`RequestCnt`，表示总请求次数，单位为次。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalValue")
    private Double totalValue;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
