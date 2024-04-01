package com.volcengine.model.contentCustom;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UserDurationExport {
    @JSONField(name = "Date")
    String date;
}
