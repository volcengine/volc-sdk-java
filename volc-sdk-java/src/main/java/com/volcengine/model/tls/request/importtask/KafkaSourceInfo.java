package com.volcengine.model.tls.request.importtask;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class KafkaSourceInfo {
    @JSONField(name = KAFKA_TOPIC)
    private String topic;
    
    @JSONField(name = ENCODE)
    private String encode;
    
    @JSONField(name = PASSWORD)
    private String password;
    
    @JSONField(name = PROTOCOL)
    private String protocol;
    
    @JSONField(name = USERNAME)
    private String username;
    
    @JSONField(name = MECHANISM)
    private String mechanism;
    
    @JSONField(name = INSTANCE_ID)
    private String instanceId;
    
    @JSONField(name = IS_NEED_AUTH)
    private Boolean isNeedAuth;
    
    @JSONField(name = INITIAL_OFFSET)
    private Integer initialOffset;
    
    @JSONField(name = TIME_SOURCE_DEFAULT)
    private Integer timeSourceDefault;
}