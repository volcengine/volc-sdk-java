package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXUploadSpeedResResultSpeedDataItem
 */
@lombok.Data
public final class DescribeImageXUploadSpeedResResultSpeedDataItem  {

    /**
     * <p>数据类型。</p>
     *
     * <p>* 当`GroupBy`为空或`Duration`时，取值为：pct25、pct50、pct90、pct99、avg，表示各个分位的取值。</p>
     *
     * <p>* 当`GroupBy`取值为其他值时，拆分时为具体的维度值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>对应的总次数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>对应的上传速度数据列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXUploadSpeedResResultSpeedDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
