package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class TargetInfo {
    @JSONField(name = REGION)
    private String region;
    
    @JSONField(name = LOG_TYPE)
    private String logType;
    
    @JSONField(name = LOG_SAMPLE)
    private String logSample;
    
    @JSONField(name = EXTRACT_RULE)
    private ExtractRule extractRule;
}