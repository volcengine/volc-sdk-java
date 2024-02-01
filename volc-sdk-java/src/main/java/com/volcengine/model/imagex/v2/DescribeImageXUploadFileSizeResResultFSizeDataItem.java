package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXUploadFileSizeResResultFSizeDataItem
 */
@lombok.Data
public final class DescribeImageXUploadFileSizeResResultFSizeDataItem  {

    /**
     * <p>数据类型。</p>
     *
     * <p>* `GroupBy`为空或`Druation`时，取值为：pct25、pct50、pct90、pct99、avg。</p>
     *
     * <p>* `GroupBy`取值为其他时，则指定拆分维度的各个值。</p>
     *
     * <p>:::tip</p>
     *
     * <p>pct25 表示 25% 的用户上传文件大小分布数据。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>对应的总次数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>对应的文件大小数据列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXUploadFileSizeResResultFSizeDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
