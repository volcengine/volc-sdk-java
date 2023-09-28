package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyTopicRequest {
    @JSONField(name = TOPIC_ID)
    String topicId;
    @JSONField(name = TOPIC_NAME)
    String topicName;
    @JSONField(name = TTL)
    Integer ttl;
    @JSONField(name = DESCRIPTION)
    String description;
    @JSONField(name = AUTO_SPLIT)
    Boolean autoSplit;
    @JSONField(name = MAX_SPLIT_SHARD)
    Integer maxSplitShard;
    @JSONField(name = ENABLE_TRACKING)
    Boolean enableTracking;

    /**
     * @return 日志主题 ID
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * @param topicId 日志主题 ID
     */
    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

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
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.topicId == null) {
            return false;
        }
        return true;
    }
}
