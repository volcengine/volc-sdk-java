package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.*;
import lombok.Data;

import java.util.List;

import static com.volcengine.model.tls.Const.*;
import static com.volcengine.model.tls.Const.CONTAINER_RULE;

@Data
public class CreateRuleRequest {
    @JSONField(name = TOPIC_ID)
    String topicId;
    @JSONField(name = RULE_NAME)
    String ruleName;
    @JSONField(name = PATHS)
    List<String> paths;
    @JSONField(name = LOG_TYPE)
    String logType;
    @JSONField(name = EXTRACT_RULE)
    ExtractRule extractRule;
    @JSONField(name = EXCLUDE_PATHS)
    List<ExcludePath> excludePaths;
    @JSONField(name = USER_DEFINE_RULE)
    UserDefineRule userDefineRule;
    @JSONField(name = LOG_SAMPLE)
    String logSample;
    @JSONField(name = INPUT_TYPE)
    int inputType;
    @JSONField(name = CONTAINER_RULE)
    ContainerRule containerRule;
}
