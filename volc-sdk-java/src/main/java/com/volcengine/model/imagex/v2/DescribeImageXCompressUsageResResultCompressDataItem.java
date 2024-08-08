package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXCompressUsageResResultCompressDataItem
 */
@lombok.Data
public final class DescribeImageXCompressUsageResResultCompressDataItem  {

    /**
     * <p>压缩前大小，单位为 byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InSize")
    private List<DescribeImageXCompressUsageResResultCompressDataItemInSizeItem> inSize;

    /**
     * <p>压缩后大小，单位为 byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutSize")
    private List<DescribeImageXCompressUsageResResultCompressDataItemOutSizeItem> outSize;

    /**
     * <p>服务 ID。当 `GroupBy` 中包含 `ServiceId` 时，有返回值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
