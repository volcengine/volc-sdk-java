package com.volcengine.model.tls.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class IETLTaskInfo {
    @JSONField(name = "TaskId")
    private String taskId;
    
    @JSONField(name = NAME)
    private String taskName;
    
    @JSONField(name = PROJECT_ID)
    private String projectId;
    
    @JSONField(name = DESCRIPTION)
    private String description;
    
    @JSONField(name = ETL_STATUS)
    private String status;
    
    @JSONField(name = CREATE_TIME)
    private String createTime;
    
    @JSONField(name = MODIFY_TIME)
    private String modifyTime;
    
    @JSONField(name = "TaskConfig")
    private Map<String, Object> taskConfig;
    
    @JSONField(name = "ErrorMessage")
    private String errorMessage;
}