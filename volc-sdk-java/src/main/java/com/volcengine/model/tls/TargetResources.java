package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class TargetResources {
    @JSONField(name = ALIAS)
    private String alias;
    
    @JSONField(name = TOPIC_ID)
    private String topicId;
    
    @JSONField(name = PROJECT_ID)
    private String projectId;
    
    @JSONField(name = PROJECT_NAME)
    private String projectName;
    
    @JSONField(name = REGION)
    private String region;
    
    @JSONField(name = TOPIC_NAME)
    private String topicName;
    
    @JSONField(name = ROLE_TRN)
    private String roleTrn;
}