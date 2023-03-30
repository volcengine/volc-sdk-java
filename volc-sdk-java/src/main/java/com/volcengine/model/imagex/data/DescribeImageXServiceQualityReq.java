package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribeImageXServiceQualityReq {
    @JSONField(name = "Region")
    private String region;
}
