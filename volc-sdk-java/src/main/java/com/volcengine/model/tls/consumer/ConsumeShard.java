package com.volcengine.model.tls.consumer;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

import static com.volcengine.model.tls.Const.*;

@Getter
@Setter
public class ConsumeShard {
    @JSONField(name = TOPIC_ID_UPPERCASE)
    String topicID;
    @JSONField(name = SHARD_ID_UPPERCASE)
    int shardID;

    public ConsumeShard(String topicID, int shardID) {
        this.topicID = topicID;
        this.shardID = shardID;
    }
}
