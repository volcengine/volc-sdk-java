package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXCdnProtocolRateByTimeResResultProtocolRateDataItem
 */
@lombok.Data
public final class DescribeImageXCdnProtocolRateByTimeResResultProtocolRateDataItem  {

    /**
     * <p>网络协议类型。</p>
     *
     * <p>取值为：http、https</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>上报数据总量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>对应的协议占比数据列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXCdnProtocolRateByTimeResResultProtocolRateDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
