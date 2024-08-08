package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXExceedFileSizeResResultFSizeDataItem
 */
@lombok.Data
public final class DescribeImageXExceedFileSizeResResultFSizeDataItem  {

    /**
     * <p>数据类型。当`GroupBy`为空或`Duration`时，取值avg/pct25/pct50/pct90/pct99/min/max，否则取值为指定拆分维度的各个值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>该数据类型对应的总上报量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>对应的文件大小数据列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXExceedFileSizeResResultFSizeDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
