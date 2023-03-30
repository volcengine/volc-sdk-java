package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class SdkVerItem {
    @JSONField(name = "SdkVer")
    private String sdkVer;
    @JSONField(name = "Count")
    private Long count;
    @JSONField(name = "Data")
    private List<CurveDataIntItem> data;
}
