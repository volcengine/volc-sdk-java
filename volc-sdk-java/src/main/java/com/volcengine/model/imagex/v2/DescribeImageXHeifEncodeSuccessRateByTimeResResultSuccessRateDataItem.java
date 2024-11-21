package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXHeifEncodeSuccessRateByTimeResResultSuccessRateDataItem
 */
@lombok.Data
public final class DescribeImageXHeifEncodeSuccessRateByTimeResResultSuccessRateDataItem  {

    /**
     * <p>数据类型。</p>
     *
     * <p>- 当`GroupBy`取值为空时，取值为：Total</p>
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
     * <p>对应的编码成功率数据列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXHeifEncodeSuccessRateByTimeResResultSuccessRateDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
