package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CurveDataIntItem {
    @JSONField(name = "Value")
    private Long value;
    @JSONField(name = "Count")
    private Long count;
    @JSONField(name = "Timestamp")
    private String timestamp;
}
