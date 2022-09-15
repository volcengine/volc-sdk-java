package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.ContainerRule;
import com.volcengine.model.tls.ExcludePath;
import com.volcengine.model.tls.ExtractRule;
import com.volcengine.model.tls.UserDefineRule;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyRuleRequest {
    @JSONField(name = RULE_ID)
    String ruleId;
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
    @JSONField(name = LOG_SAMPLE)
    String logSample;
    @JSONField(name = USER_DEFINE_RULE)
    UserDefineRule userDefineRule;
    @JSONField(name = INPUT_TYPE)
    int inputType;
    @JSONField(name = CONTAINER_RULE)
    ContainerRule containerRule;
}
