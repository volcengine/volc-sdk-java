package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ImportSourceInfo {
    @JSONField(name = TOS_SOURCE_INFO)
    private TosSourceInfo tosSourceInfo;
    
    @JSONField(name = KAFKA_SOURCE_INFO)
    private KafkaSourceInfo kafkaSourceInfo;
}
