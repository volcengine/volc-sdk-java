package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Map;

@Data
public class SubmitDirectEditTaskRequest {
    @JSONField(name = "Uploader")
    String uploader;
    @JSONField(name = "Application") 
    String application;
    @JSONField(name = "VideoName")
    String videoName;
    @JSONField(name = "EditParam")
    Map<String, Object> EditParam; 
    @JSONField(name = "Priority")      
    Integer priority; 
    @JSONField(name = "CallbackUri")    
    String callbackUri;    
    @JSONField(name = "CallbackArgs")
	String callbackArgs;
}
