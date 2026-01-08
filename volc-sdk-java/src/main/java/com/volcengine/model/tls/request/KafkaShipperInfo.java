package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;
import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class KafkaShipperInfo {
    @JSONField(name = SHIPPER_COMPRESS)
    private String compress;

    @JSONField(name = KAFKA_INSTANCE)
    private String instance;

    @JSONField(name = KAFKA_TOPIC_NAME)
    private String kafkaTopic;

    @JSONField(name = END_TIME)
    private Long endTime;
    
    @JSONField(name = START_TIME)
    private Long startTime;
}
