package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXUploadFileSizeResResult
 */
@lombok.Data
public final class DescribeImageXUploadFileSizeResResult  {

    /**
     * <p>上传文件大小分布数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FSizeData")
    private List<DescribeImageXUploadFileSizeResResultFSizeDataItem> fSizeData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
