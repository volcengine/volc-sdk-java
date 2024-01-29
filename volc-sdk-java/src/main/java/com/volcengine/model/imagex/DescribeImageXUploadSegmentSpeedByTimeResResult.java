package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXUploadSegmentSpeedByTimeResResult
 */
@lombok.Data
public final class DescribeImageXUploadSegmentSpeedByTimeResResult  {

    /**
     * <p>上传速度数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SpeedData")
    private List<DescribeImageXUploadSegmentSpeedByTimeResResultSpeedDataItem> speedData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
