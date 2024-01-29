package com.volcengine.model.imagex;


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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
