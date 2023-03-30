package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.imagex.data.CurveFloatItem;
import lombok.Data;

import java.util.List;

@Data
public class DescribeImageXClientLoadDurationResp {
    @JSONField(name = "DurationData")
    private List<CurveFloatItem> durationData;
}
