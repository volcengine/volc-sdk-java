package com.volcengine.model.tls.request.importtask;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ExtractRule {
    @JSONField(name = KEYS)
    private List<String> keys;
    
    @JSONField(name = QUOTE)
    private String quote;
    
    @JSONField(name = TIME_KEY)
    private String timeKey;
    
    @JSONField(name = TIME_ZONE)
    private String timeZone;
    
    @JSONField(name = DELIMITER)
    private String delimiter;
    
    @JSONField(name = BEGIN_REGEX)
    private String beginRegex;
    
    @JSONField(name = TIME_FORMAT)
    private String timeFormat;
    
    @JSONField(name = SKIP_LINE_COUNT)
    private Integer skipLineCount;
    
    @JSONField(name = UN_MATCH_LOG_KEY)
    private String unMatchLogKey;
    
    @JSONField(name = TIME_EXTRACT_REGEX)
    private String timeExtractRegex;
    
    @JSONField(name = UN_MATCH_UP_LOAD_SWITCH)
    private Boolean unMatchUpLoadSwitch;
    
    @JSONField(name = TIME_SAMPLE)
    private String timeSample;
}