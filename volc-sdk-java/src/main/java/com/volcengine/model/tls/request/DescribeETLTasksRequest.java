package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeETLTasksRequest {
    @JSONField(name = PAGE_NUMBER)
    private Integer pageNumber;
    
    @JSONField(name = PAGE_SIZE)
    private Integer pageSize;
    
    @JSONField(name = PROJECT_ID)
    private String projectId;
    
    @JSONField(name = "TaskName")
    private String taskName;
    
    @JSONField(name = "TaskId")
    private String taskId;
    
    @JSONField(name = STATUS)
    private String status;
    
    @JSONField(name = "CreateTimeStart")
    private Long createTimeStart;
    
    @JSONField(name = "CreateTimeEnd")
    private Long createTimeEnd;
    
    public boolean CheckValidation() {
        return true;
    }
}