package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXSensibleCountByTimeResp {
    @JSONField(name = "SensibleCountData")
    private List<CurveIntItem> sensibleCountData;
}
