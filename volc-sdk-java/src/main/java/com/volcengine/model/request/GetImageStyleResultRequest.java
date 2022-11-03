package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Map;

@Data
public class GetImageStyleResultRequest {
    @JSONField(name = "ServiceId")
    private String serviceId;

    @JSONField(name = "StyleId")
    private String styleId;

    @JSONField(name = "Params")
    private Map<String, String> params;

    @JSONField(name = "OutputFormat")
    private String outputFormat;

    @JSONField(name = "OutputQuality")
    private Integer outputQuality;
}
