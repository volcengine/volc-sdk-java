package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXAIRequestCntUsageResResult
 */
@lombok.Data
public final class DescribeImageXAIRequestCntUsageResResult  {

    /**
     * <p>请求次数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestCntData")
    private List<DescribeImageXAIRequestCntUsageResResultRequestCntDataItem> requestCntData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
