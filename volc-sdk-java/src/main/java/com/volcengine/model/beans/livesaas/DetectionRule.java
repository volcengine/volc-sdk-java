package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DetectionRule {
    @JSONField(name = "MinTime")
    Long MinTime;
}
