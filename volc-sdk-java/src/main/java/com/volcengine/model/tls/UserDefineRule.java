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
    boolean tailFiles;

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
    public boolean isTailFiles() {
        return tailFiles;
    }

    /**
     * @param tailFiles LogCollector采集策略，即指定LogCollector采集增量日志还是全量日志
     */
    public void setTailFiles(boolean tailFiles) {
        this.tailFiles = tailFiles;
    }
}
