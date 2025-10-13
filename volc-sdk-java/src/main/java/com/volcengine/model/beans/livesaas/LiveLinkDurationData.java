package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class LiveLinkDurationData {
    @JSONField(name = "ActivityId")
    private Long ActivityId;

    @JSONField(name = "DurationMinute")
    private Integer DurationMinute;

    @JSONField(name = "ActivityCreator")
    private ActivityCreatorForm ActivityCreator;
}
