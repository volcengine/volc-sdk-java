package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXUploadCountByTimeResResultUploadCountDataItem
 */
@lombok.Data
public final class DescribeImageXUploadCountByTimeResResultUploadCountDataItem  {

    /**
     * <p>数据类型。不拆分时值为`Total`，拆分时为具体的维度值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>对应的总上传有效次数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>对应的上传有效次数数据列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXUploadCountByTimeResResultUploadCountDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
