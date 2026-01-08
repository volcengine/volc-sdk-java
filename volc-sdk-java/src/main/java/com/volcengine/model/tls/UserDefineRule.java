package com.volcengine.model.tls;

import java.util.Map;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class UserDefineRule {
    @JSONField(name = PARSE_PATH_RULE)
    ParsePathRule parsePathRule;
    @JSONField(name = SHARD_HASH_KEY)
    ShardHashKey shardHashKey;
    @JSONField(name = ENABLE_RAW_LOG)
    Boolean enableRawLog;
    @JSONField(name = FIELDS)
    Map<String, String> fields;
    @JSONField(name = PLUGIN)
    Plugin plugin;
    @JSONField(name = ADVANCED)
    Advanced advanced;
    @JSONField(name = TAIL_FILES)
    Boolean tailFiles;
    @JSONField(name = HOSTNAME_KEY)
    String hostnameKey;
    @JSONField(name = ENABLE_HOSTNAME)
    Boolean enableHostname;
    @JSONField(name = HOST_GROUP_LABEL_KEY)
    String hostGroupLabelKey;
    @JSONField(name = ENABLE_HOST_GROUP_LABEL)
    Boolean enableHostGroupLabel;
    @JSONField(name = TAIL_SIZE_KB)
    Integer tailSizeKb;
    @JSONField(name = IGNORE_OLDER)
    Integer ignoreOlder;
    @JSONField(name = MULTI_COLLECTS_TYPE)
    String multiCollectsType;
    @JSONField(name = RAW_LOG_KEY)
    String rawLogKey;

    /**
     * @param parsePathRule 解析采集路径的规则
     * @param shardHashKey  路由日志分区的规则
     * @param enableRawLog  是否上传原始日志
     * @param fields        为日志添加常量字段
     */
    public UserDefineRule(ParsePathRule parsePathRule, ShardHashKey shardHashKey, Boolean enableRawLog, Map<String, String> fields) {
        this.parsePathRule = parsePathRule;
        this.shardHashKey = shardHashKey;
        this.enableRawLog = enableRawLog;
        this.fields = fields;
    }

    /**
     * @return 解析采集路径的规则
     */
    public ParsePathRule getParsePathRule() {
        return parsePathRule;
    }

    /**
     * @param parsePathRule 解析采集路径的规则
     */
    public void setParsePathRule(ParsePathRule parsePathRule) {
        this.parsePathRule = parsePathRule;
    }

    /**
     * @return 路由日志分区的规则
     */
    public ShardHashKey getShardHashKey() {
        return shardHashKey;
    }

    /**
     * @param shardHashKey 路由日志分区的规则
     */
    public void setShardHashKey(ShardHashKey shardHashKey) {
        this.shardHashKey = shardHashKey;
    }

    /**
     * @return 是否上传原始日志
     */
    public Boolean getEnableRawLog() {
        return enableRawLog;
    }

    /**
     * @param enableRawLog 是否上传原始日志
     */
    public void setEnableRawLog(Boolean enableRawLog) {
        this.enableRawLog = enableRawLog;
    }

    /**
     * @return 为日志添加常量字段
     */
    public Map<String, String> getFields() {
        return fields;
    }

    /**
     * @param fields 为日志添加常量字段
     */
    public void setFields(Map<String, String> fields) {
        this.fields = fields;
    }

    /**
     * @return LogCollector插件配置
     */
    public Plugin getPlugin() {
        return plugin;
    }

    /**
     * @param plugin LogCollector插件配置
     */
    public void setPlugin(Plugin plugin) {
        this.plugin = plugin;
    }

    /**
     * @return LogCollector扩展配置
     */
    public Advanced getAdvanced() {
        return advanced;
    }

    /**
     * @param advanced LogCollector扩展配置
     */
    public void setAdvanced(Advanced advanced) {
        this.advanced = advanced;
    }

    /**
     * @return LogCollector采集策略，即指定LogCollector采集增量日志还是全量日志
     */
    public Boolean getTailFiles() {
        return tailFiles;
    }

    /**
     * @param tailFiles LogCollector采集策略，即指定LogCollector采集增量日志还是全量日志
     */
    public void setTailFiles(Boolean tailFiles) {
        this.tailFiles = tailFiles;
    }

    /**
     * @return hostname字段名称
     */
    public String getHostnameKey() {
        return hostnameKey;
    }

    /**
     * @param hostnameKey hostname字段名称
     */
    public void setHostnameKey(String hostnameKey) {
        this.hostnameKey = hostnameKey;
    }

    /**
     * @return 是否上传hostname字段
     */
    public Boolean getEnableHostname() {
        return enableHostname;
    }

    /**
     * @param enableHostname 是否上传hostname字段
     */
    public void setEnableHostname(Boolean enableHostname) {
        this.enableHostname = enableHostname;
    }

    /**
     * @return 用于存储机器组Label信息的字段名称
     */
    public String getHostGroupLabelKey() {
        return hostGroupLabelKey;
    }

    /**
     * @param hostGroupLabelKey 用于存储机器组Label信息的字段名称
     */
    public void setHostGroupLabelKey(String hostGroupLabelKey) {
        this.hostGroupLabelKey = hostGroupLabelKey;
    }

    /**
     * @return 是否将机器组的Label信息上传到日志服务
     */
    public Boolean getEnableHostGroupLabel() {
        return enableHostGroupLabel;
    }

    /**
     * @param enableHostGroupLabel 是否将机器组的Label信息上传到日志服务
     */
    public void setEnableHostGroupLabel(Boolean enableHostGroupLabel) {
        this.enableHostGroupLabel = enableHostGroupLabel;
    }

    /**
     * @return 增量采集的回溯阈值
     */
    public Integer getTailSizeKb() {
        return tailSizeKb;
    }

    /**
     * @param tailSizeKb 增量采集的回溯阈值
     */
    public void setTailSizeKb(Integer tailSizeKb) {
        this.tailSizeKb = tailSizeKb;
    }

    /**
     * @return 忽略多久没有更新的日志文件
     */
    public Integer getIgnoreOlder() {
        return ignoreOlder;
    }

    /**
     * @param ignoreOlder 忽略多久没有更新的日志文件
     */
    public void setIgnoreOlder(Integer ignoreOlder) {
        this.ignoreOlder = ignoreOlder;
    }

    /**
     * @return 允许多次采集日志文件
     */
    public String getMultiCollectsType() {
        return multiCollectsType;
    }

    /**
     * @param multiCollectsType 允许多次采集日志文件
     */
    public void setMultiCollectsType(String multiCollectsType) {
        this.multiCollectsType = multiCollectsType;
    }

    /**
     * @return 原始日志字段名称
     */
    public String getRawLogKey() {
        return rawLogKey;
    }

    /**
     * @param rawLogKey 原始日志字段名称
     */
    public void setRawLogKey(String rawLogKey) {
        this.rawLogKey = rawLogKey;
    }
}
