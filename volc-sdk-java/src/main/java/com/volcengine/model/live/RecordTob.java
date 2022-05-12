package com.volcengine.model.live;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class RecordTob {
    @JSONField(name = "Format")
    String format;
    @JSONField(name = "Duration")
    Long duration;
    @JSONField(name = "Splice")
    Long splice;
    @JSONField(name = "RecordObject")
    String recordObject;
}
