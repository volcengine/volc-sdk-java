package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AutoStartConfig {
    @JSONField(name = "RepeatType")
    Integer RepeatType;

    @JSONField(name = "RecurrenceRule")
    String RecurrenceRule;

    @JSONField(name = "RepeatDeadline")
    Long RepeatDeadline;
}
