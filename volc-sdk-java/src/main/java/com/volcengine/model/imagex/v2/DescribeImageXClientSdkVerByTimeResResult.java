package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXClientSdkVerByTimeResResult
 */
@lombok.Data
public final class DescribeImageXClientSdkVerByTimeResResult  {

    /**
     * <p>SDK 版本数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SdkVerData")
    private List<DescribeImageXClientSdkVerByTimeResResultSdkVerDataItem> sdkVerData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
