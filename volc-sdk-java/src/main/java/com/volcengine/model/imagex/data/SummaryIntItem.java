package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SummaryIntItem {
    @JSONField(name = "Value")
    private Long value;
}
