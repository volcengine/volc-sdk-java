package com.volcengine.model.tls.request;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.EncryptConf;
import com.volcengine.model.tls.TagInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class CreateTopicRequest {
    @JSONField(name = TOPIC_NAME)
    String topicName;
    @JSONField(name = PROJECT_ID)
    String projectId;
    @JSONField(name = TTL)
    Integer ttl;
    @JSONField(name = DESCRIPTION)
    String description;
    @JSONField(name = SHARD_COUNT)
    Integer shardCount;
    @JSONField(name = AUTO_SPLIT)
    Boolean autoSplit = true;
    @JSONField(name = MAX_SPLIT_SHARD)
    Integer maxSplitShard = 50;
    @JSONField(name = ENABLE_TRACKING)
    Boolean enableTracking;
    @JSONField(name = TIME_KEY)
    String timeKey;
    @JSONField(name = TIME_FORMAT)
    String timeFormat;
    @JSONField(name = TAGS)
    List<TagInfo> tags;
    @JSONField(name = LOG_PUBLIC_IP)
    Boolean logPublicIP;
    @JSONField(name = ENABLE_HOT_TTL)
    boolean enableHotTtl;
    @JSONField(name = HOT_TTL)
    Integer hotTtl;
    @JSONField(name = COLD_TTL)
    Integer coldTtl;
    @JSONField(name = ARCHIVE_TTL)
    Integer archiveTtl;
    @JSONField(name = KMS_ENCRYPT_CONF)
    EncryptConf encryptConf;

    /**
     * @return 日志主题名称
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * @param topicName 日志主题名称
     */
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * @return 日志主题所属的日志项目 ID
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * @param projectId 日志主题所属的日志项目 ID
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @return 日志在日志服务中的保存时间, 单位天。默认30天
     */
    public Integer getTtl() {
        return ttl;
    }

    /**
     * @param ttl 日志在日志服务中的保存时间,单位天。默认30天
     */
    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    /**
     * @return 日志主题描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description 日志主题描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return 日志分区的数量，默认创建 1 个分区，取值范围为 1～10
     */
    public Integer getShardCount() {
        return shardCount;
    }

    /**
     * @param shardCount 日志分区的数量，默认创建 1 个分区，取值范围为 1～10
     */
    public void setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
    }

    /**
     * @return 是否开启分区的自动分裂功能，默认true
     */
    public Boolean getAutoSplit() {
        return autoSplit;
    }

    /**
     * @param autoSplit 是否开启分区的自动分裂功能，默认true
     */
    public void setAutoSplit(Boolean autoSplit) {
        this.autoSplit = autoSplit;
    }

    /**
     * @return 分区的最大分裂数
     */
    public Integer getMaxSplitShard() {
        return maxSplitShard;
    }

    /**
     * @param maxSplitShard 分区的最大分裂数
     */
    public void setMaxSplitShard(Integer maxSplitShard) {
        this.maxSplitShard = maxSplitShard;
    }

    /**
     * @return 是否开启 WebTracking 功能，默认false
     */
    public Boolean getEnableTracking() {
        return enableTracking;
    }

    /**
     * @param enableTracking 是否开启 WebTracking 功能，默认false
     */
    public void setEnableTracking(Boolean enableTracking) {
        this.enableTracking = enableTracking;
    }

    /**
     * @return 日志时间字段的字段名称
     */
    public String getTimeKey() {
        return timeKey;
    }

    /**
     * @param timeKey 日志时间字段的字段名称
     */
    public void setTimeKey(String timeKey) {
        this.timeKey = timeKey;
    }

    /**
     * @return 时间字段的解析格式
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    /**
     * @param timeFormat 时间字段的解析格式
     */
    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    /**
     * @return 日志主题标签信息
     */
    public List<TagInfo> getTags() {
        return tags;
    }

    /**
     * @param tags 日志主题标签信息
     */
    public void setTags(List<TagInfo> tags) {
        this.tags = tags;
    }

    /**
     * @return 是否开启记录外网IP功能
     */
    public Boolean getLogPublicIP() {
        return logPublicIP;
    }

    /**
     * @param logPublicIP 是否开启记录外网IP功能
     */
    public void setLogPublicIP(Boolean logPublicIP) {
        this.logPublicIP = logPublicIP;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.topicName == null || this.topicName.isEmpty() || this.projectId == null || this.projectId.isEmpty()) {
            return false;
        }
        return true;
    }
}
