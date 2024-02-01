package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXUploadSegmentSpeedByTimeResResultSpeedDataItem
 */
@lombok.Data
public final class DescribeImageXUploadSegmentSpeedByTimeResResultSpeedDataItem  {

    /**
     * <p>数据类型。</p>
     *
     * <p>- `GroupBy`为空或`Duration`时，取值为：pct25、pct50、pct90、pct99、avg</p>
     *
     * <p>- `GroupBy`取值为其他时，表示指定拆分维度的各个值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>总上传次数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>具体数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXUploadSegmentSpeedByTimeResResultSpeedDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
