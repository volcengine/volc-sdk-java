package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class SubmitTemplateTaskRequest {
    @JSONField(name = "TemplateId")
    String templateId;
    @JSONField(name = "Space") 
    String space;
    @JSONField(name = "VideoName")
    List<String> videoName;
    @JSONField(name = "Params")
    List<List<TemplateParamItem>> params; 
    @JSONField(name = "Priority")      
    Integer priority; 
    @JSONField(name = "CallbackUri")    
    String callbackUri;    
    @JSONField(name = "CallbackArgs")
    String callbackArgs;
    
    @Data
    public static class TemplateParamItem {
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "Type")
        String type;
        @JSONField(name = "Position")
        String position;
        @JSONField(name = "Source")
        String source;
        @JSONField(name = "Text")
        String text;
    }
}
