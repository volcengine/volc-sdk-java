package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXCdnErrorCodeByTimeResResult
 */
@lombok.Data
public final class DescribeImageXCdnErrorCodeByTimeResResult  {

    /**
     * <p>所有错误码数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrorCodeData")
    private List<DescribeImageXCdnErrorCodeByTimeResResultErrorCodeDataItem> errorCodeData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
