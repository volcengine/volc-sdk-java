package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXHeifEncodeErrorCodeByTimeResResultErrorCodeDataItem
 */
@lombok.Data
public final class DescribeImageXHeifEncodeErrorCodeByTimeResResultErrorCodeDataItem  {

    /**
     * <p>错误码总量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>错误码对应的时序数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXHeifEncodeErrorCodeByTimeResResultErrorCodeDataItemDataItem> data;

    /**
     * <p>错误码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrorCode")
    private String errorCode;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
