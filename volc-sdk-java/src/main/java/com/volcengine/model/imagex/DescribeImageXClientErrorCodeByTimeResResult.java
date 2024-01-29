package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXClientErrorCodeByTimeResResult
 */
@lombok.Data
public final class DescribeImageXClientErrorCodeByTimeResResult  {

    /**
     * <p>所有错误码数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrorCodeData")
    private List<DescribeImageXClientErrorCodeByTimeResResultErrorCodeDataItem> errorCodeData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
