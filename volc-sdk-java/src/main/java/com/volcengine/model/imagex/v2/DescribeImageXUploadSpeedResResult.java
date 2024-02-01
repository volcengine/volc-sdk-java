package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXUploadSpeedResResult
 */
@lombok.Data
public final class DescribeImageXUploadSpeedResResult  {

    /**
     * <p>上传速度数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SpeedData")
    private List<DescribeImageXUploadSpeedResResultSpeedDataItem> speedData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
