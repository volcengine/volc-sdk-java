package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResourceTag {
    @JSONField(name = "TagKey")
    private String tagKey;
    
    @JSONField(name = "TagValue")
    private String tagValue;
    
    @JSONField(name = "ResourceId")
    private String resourceId;
    
    @JSONField(name = "ResourceType")
    private String resourceType;
}