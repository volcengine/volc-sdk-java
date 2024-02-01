package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXClientSdkVerByTimeResResultSdkVerDataItem
 */
@lombok.Data
public final class DescribeImageXClientSdkVerByTimeResResultSdkVerDataItem  {

    /**
     * <p>SDK 版本号。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SdkVer")
    private String sdkVer;

    /**
     * <p>该 SDK 版本对应的总上报量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>对应的版本数据列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Data")
    private List<DescribeImageXClientSdkVerByTimeResResultSdkVerDataItemDataItem> data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
