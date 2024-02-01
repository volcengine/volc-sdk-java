package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXUploadErrorCodeByTimeResResult
 */
@lombok.Data
public final class DescribeImageXUploadErrorCodeByTimeResResult  {

    /**
     * <p>所有错误码数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrorCodeData")
    private List<DescribeImageXUploadErrorCodeByTimeResResultErrorCodeDataItem> errorCodeData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
