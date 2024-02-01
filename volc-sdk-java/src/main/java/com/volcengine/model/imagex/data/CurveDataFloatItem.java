package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CurveDataFloatItem {
    @JSONField(name = "Value")
    private Double value;
    @JSONField(name = "Count")
    private Long count;
    @JSONField(name = "Timestamp")
    private String timestamp;
}
