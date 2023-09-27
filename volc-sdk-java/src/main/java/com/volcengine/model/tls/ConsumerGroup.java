package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static com.volcengine.model.tls.Const.*;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class ConsumerGroup {
    @JSONField(name = PROJECT_ID_UPPERCASE)
    String projectID;
    @JSONField(name = CONSUMER_GROUP_NAME)
    String consumerGroupName;
    @JSONField(name = HEARTBEAT_TTL)
    int heartbeatTTL;
    @JSONField(name = ORDERED_CONSUME)
    boolean orderedConsume;
}
