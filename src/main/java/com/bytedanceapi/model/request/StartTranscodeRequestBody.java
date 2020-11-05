package com.bytedanceapi.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Map;

@Data
public class StartTranscodeRequestBody {

    @JSONField(name = "Vid")
    private String vid;
    @JSONField(name = "Input")
    private Map<String, Object> input;
    @JSONField(name = "Priority")
    private int priority;
}
