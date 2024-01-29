package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXUploadDurationResResultDurationDataItem
 */
@lombok.Data
public final class DescribeImageXUploadDurationResResultDurationDataItem  {

    /**
     * <p>数据类型。</p>
     *
     * <p>* 当`GroupBy`为空或`Duration`时，取值为：pct25、pct50、pct90、pct99、avg。</p>
     *
     * <p>* 当`GroupBy`取值为`Phase`时，取值为：1001、1002、1003、1004、1005。</p>
     *
     * <p>* 除上述外取值为指定拆分维度的各个值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>对应的总次数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>上传耗时数据列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXUploadDurationResResultDurationDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
