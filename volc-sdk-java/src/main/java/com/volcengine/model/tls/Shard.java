package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class Shard {
    @JSONField(name = TOPIC_ID)
    String topicId;
    @JSONField(name = SHARD_ID)
    int shardId;
    @JSONField(name = INCLUSIVE_BEGIN_KEY)
    String inclusiveBeginKey;
    @JSONField(name = EXCLUSIVE_END_KEY)
    String exclusiveEndKey;
    @JSONField(name = STATUS)
    String status;
    @JSONField(name = MODIFY_TIME)
    String modifyTime;
}
