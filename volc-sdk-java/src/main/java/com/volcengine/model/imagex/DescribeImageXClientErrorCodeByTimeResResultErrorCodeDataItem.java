package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXClientErrorCodeByTimeResResultErrorCodeDataItem
 */
@lombok.Data
public final class DescribeImageXClientErrorCodeByTimeResResultErrorCodeDataItem  {

    /**
     * <p>错误码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrorCode")
    private String errorCode;

    /**
     * <p>错误码总量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>错误码对应的时序数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXClientErrorCodeByTimeResResultErrorCodeDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
