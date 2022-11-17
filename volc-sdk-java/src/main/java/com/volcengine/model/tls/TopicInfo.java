package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import com.sun.org.apache.xpath.internal.operations.Bool;
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
}
