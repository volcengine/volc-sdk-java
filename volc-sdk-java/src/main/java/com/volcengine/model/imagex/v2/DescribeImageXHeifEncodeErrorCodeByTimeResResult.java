package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXHeifEncodeErrorCodeByTimeResResult
 */
@lombok.Data
public final class DescribeImageXHeifEncodeErrorCodeByTimeResResult  {

    /**
     * <p>编码错误码数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrorCodeData")
    private List<DescribeImageXHeifEncodeErrorCodeByTimeResResultErrorCodeDataItem> errorCodeData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
