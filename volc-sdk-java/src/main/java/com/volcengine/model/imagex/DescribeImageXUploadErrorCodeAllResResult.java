package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXUploadErrorCodeAllResResult
 */
@lombok.Data
public final class DescribeImageXUploadErrorCodeAllResResult  {

    /**
     * <p>错误码数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrorCodeData")
    private List<DescribeImageXUploadErrorCodeAllResResultErrorCodeDataItem> errorCodeData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
