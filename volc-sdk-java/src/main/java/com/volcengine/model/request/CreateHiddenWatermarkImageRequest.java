package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateHiddenWatermarkImageRequest {
    @JSONField(name = "ServiceId")
    String ServiceId;
    @JSONField(name = "Strength")
    String Strength;
    @JSONField(name = "Algorithm")
    String Algorithm;
    @JSONField(name = "Info")
    String Info;
}
