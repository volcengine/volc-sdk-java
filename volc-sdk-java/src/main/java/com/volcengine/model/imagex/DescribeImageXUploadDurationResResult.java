package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXUploadDurationResResult
 */
@lombok.Data
public final class DescribeImageXUploadDurationResResult  {

    /**
     * <p>上传耗时数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DurationData")
    private List<DescribeImageXUploadDurationResResultDurationDataItem> durationData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
