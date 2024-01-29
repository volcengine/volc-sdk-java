package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXUploadErrorCodeByTimeResResultErrorCodeDataItem
 */
@lombok.Data
public final class DescribeImageXUploadErrorCodeByTimeResResultErrorCodeDataItem  {

    /**
     * <p>错误码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrorCode")
    private String errorCode;

    /**
     * <p>错误码数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>错误码对应的时序数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXUploadErrorCodeByTimeResResultErrorCodeDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
