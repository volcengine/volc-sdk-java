package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXHeifEncodeDurationByTimeResResultDurationDataItem
 */
@lombok.Data
public final class DescribeImageXHeifEncodeDurationByTimeResResultDurationDataItem  {

    /**
     * <p>数据类型。</p>
     *
     * <p>- 当`GroupBy`取值为空时，取值为：Total</p>
     *
     * <p>- 当`GroupBy`取值为`Duration`时，取值为：avg、min、max、pct25、pct50、pct90、pct99</p>
     *
     * <p>- 除上述外取值为指定拆分维度的各个值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>数据上报总量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>对应的网络耗时数据列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXHeifEncodeDurationByTimeResResultDurationDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
