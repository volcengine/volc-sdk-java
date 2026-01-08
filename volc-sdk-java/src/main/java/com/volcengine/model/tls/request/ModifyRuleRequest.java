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
    @JSONField(name = PAUSE)
    Integer pause;

    /**
     * @return 采集配置的 ID
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * @param ruleId 采集配置的 ID
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * @return 采集配置的名称
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * @param ruleName 采集配置的名称
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * @return 采集路径列表
     */
    public List<String> getPaths() {
        return paths;
    }

    /**
     * @param paths 采集路径列表
     */
    public void setPaths(List<String> paths) {
        this.paths = paths;
    }

    /**
     * @return 采集模式
     */
    public String getLogType() {
        return logType;
    }

    /**
     * @param logType 采集模式
     */
    public void setLogType(String logType) {
        this.logType = logType;
    }

    /**
     * @return 日志提取规则
     */
    public ExtractRule getExtractRule() {
        return extractRule;
    }

    /**
     * @param extractRule 日志提取规则
     */
    public void setExtractRule(ExtractRule extractRule) {
        this.extractRule = extractRule;
    }

    /**
     * @return 采集黑名单列表
     */
    public List<ExcludePath> getExcludePaths() {
        return excludePaths;
    }

    /**
     * @param excludePaths 采集黑名单列表
     */
    public void setExcludePaths(List<ExcludePath> excludePaths) {
        this.excludePaths = excludePaths;
    }

    /**
     * @return 用户自定义的采集规则
     */
    public UserDefineRule getUserDefineRule() {
        return userDefineRule;
    }

    /**
     * @param userDefineRule 用户自定义的采集规则
     */
    public void setUserDefineRule(UserDefineRule userDefineRule) {
        this.userDefineRule = userDefineRule;
    }

    /**
     * @return 日志样例
     */
    public String getLogSample() {
        return logSample;
    }

    /**
     * @param logSample 日志样例
     */
    public void setLogSample(String logSample) {
        this.logSample = logSample;
    }

    /**
     * @return 采集类型 0：（默认）宿主机日志文件，1：K8s 容器标准输出，2：K8s 容器内日志文件
     */
    public int getInputType() {
        return inputType;
    }

    /**
     * @param inputType 采集类型 采集类型 0：（默认）宿主机日志文件，1：K8s 容器标准输出，2：K8s 容器内日志文件
     */
    public void setInputType(int inputType) {
        this.inputType = inputType;
    }

    /**
     * @return 容器采集规则
     */
    public ContainerRule getContainerRule() {
        return containerRule;
    }

    /**
     * @param containerRule 容器采集规则
     */
    public void setContainerRule(ContainerRule containerRule) {
        this.containerRule = containerRule;
    }

    /**
     * @return 是否暂停采集配置
     */
    public Integer getPause() {
        return pause;
    }

    /**
     * @param pause 是否暂停采集配置
     */
    public void setPause(Integer pause) {
        this.pause = pause;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.ruleId == null) {
            return false;
        }
        return true;
    }
}
