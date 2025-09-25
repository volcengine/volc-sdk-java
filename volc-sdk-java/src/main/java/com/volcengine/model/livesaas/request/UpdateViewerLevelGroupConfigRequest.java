package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateViewerLevelGroupConfigRequest {
    @JSONField(name = "ViewerLevelGroupId")
    Long ViewerLevelGroupId;
    
    @JSONField(name = "GroupName")
    String GroupName;
    
    @JSONField(name = "GroupDescription")
    String GroupDescription;
}