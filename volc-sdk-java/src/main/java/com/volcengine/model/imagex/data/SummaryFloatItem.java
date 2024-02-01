package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SummaryFloatItem {
    @JSONField(name = "Value")
    private Double value;
}
