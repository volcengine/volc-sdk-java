package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ShortUrlConfig {
    @JSONField(name = "IsEnabled")
    String isEnable;

    @JSONField(name = "IsNeedClickDetails")
    String isNeedClickDetails;

    @JSONField(name = "RawUrl")
    String rawUrl;
}
