package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class RuleInfo {
    @JSONField(name=TOPIC_NAME)
    private String topicName;
    @JSONField(name=TOPIC_ID)
    String topicId;
    @JSONField(name=RULE_ID)
    String ruleId;
    @JSONField(name=RULE_NAME)
    String ruleName;
    @JSONField(name=PATHS)
    List<String> paths;
    @JSONField(name=LOG_TYPE)
    String logType;
    @JSONField(name=EXTRACT_RULE)
    ExtractRule extractRule;
    @JSONField(name=EXCLUDE_PATHS)
    List<ExcludePath> excludePaths;
    @JSONField(name=USER_DEFINE_RULE)
    UserDefineRule userDefineRule;
    @JSONField(name=LOG_SAMPLE)
    String logSample;
    @JSONField(name=INPUT_TYPE)
    int inputType;
    @JSONField(name=CONTAINER_RULE)
    ContainerRule containerRule;
    @JSONField(name=CREATE_TIME)
    String createTime;
    @JSONField(name=PAUSE)
    Integer pause;
    @JSONField(name=MODIFY_TIME)
    String modifyTime;
}
