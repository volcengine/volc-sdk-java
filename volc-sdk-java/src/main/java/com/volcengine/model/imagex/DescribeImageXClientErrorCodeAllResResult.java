package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXClientErrorCodeAllResResult
 */
@lombok.Data
public final class DescribeImageXClientErrorCodeAllResResult  {

    /**
     * <p>错误码数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrorCodeData")
    private List<DescribeImageXClientErrorCodeAllResResultErrorCodeDataItem> errorCodeData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
