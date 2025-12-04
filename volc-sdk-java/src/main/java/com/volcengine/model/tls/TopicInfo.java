package com.volcengine.model.tls;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static com.volcengine.model.tls.Const.*;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class TopicInfo {
    @JSONField(name = TOPIC_NAME)
    String topicName;
    @JSONField(name = PROJECT_ID)
    String projectId;
    @JSONField(name = TOPIC_ID)
    String topicId;
    @JSONField(name = TTL)
    int ttl;
    @JSONField(name = CREATE_TIME)
    String createTime;
    @JSONField(name = MODIFY_TIME)
    String modifyTime;
    @JSONField(name = SHARD_COUNT)
    int shardCount;
    @JSONField(name = DESCRIPTION)
    String description;
    @JSONField(name = AUTO_SPLIT)
    Boolean autoSplit;
    @JSONField(name = MAX_SPLIT_SHARD)
    Integer maxSplitShard;
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
}
