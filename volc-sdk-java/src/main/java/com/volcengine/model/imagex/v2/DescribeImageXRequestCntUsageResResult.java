package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXRequestCntUsageResResult
 */
@lombok.Data
public final class DescribeImageXRequestCntUsageResResult  {

    /**
     * <p>请求次数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestCntData")
    private List<DescribeImageXRequestCntUsageResResultRequestCntDataItem> requestCntData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
