package com.volcengine.service.vikingDB.common;

import java.util.HashMap;

import com.volcengine.service.vikingDB.VikingDBException;

import lombok.Data;
@Data
public class CreateTaskParam {
    private String taskType = "";
    private HashMap<String, Object> taskParams = null;
    private Integer isBuild = 0;
    public CreateTaskParam setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public CreateTaskParam setTaskParams(HashMap<String, Object> taskParams) {
        this.taskParams = taskParams;
        return this;
    }
    public CreateTaskParam build() throws Exception{
        VikingDBException vikingDBException = new VikingDBException(1000030, null, "Params does not exist");
        if(this.taskType == null){
            throw vikingDBException.getErrorCodeException(1000030, null, "TaskType does not exist");
        } else if(this.taskParams == null){
            throw vikingDBException.getErrorCodeException(1000030, null, "TaskParams does not exist");
        } else {
            this.isBuild = 1;
            return this;
        }
    }
}
