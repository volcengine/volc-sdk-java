package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class CreateVideoTaskResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CreateVideoTaskResponseBody result;

    @Data
    public static class CreateVideoTaskResponseBody {
        @JSONField(name = "TotalCount")
        Integer TotalCount;
        @JSONField(name = "SuccessCount")
        Integer SuccessCount;
        @JSONField(name = "FailedCount")
        Integer FailedCount;
        @JSONField(name = "SuccessTasks")
        List<SuccessTask> SuccessTasks;
        @JSONField(name = "FailedTasks")
        List<FailedTask> FailedTasks;
    }

    @Data
    public static class SuccessTask {
        @JSONField(name = "Index")
        Integer Index;
        @JSONField(name = "SourceId")
        String SourceId;
        @JSONField(name = "TaskId")
        Long TaskId;
    }

    @Data
    public static class FailedTask {
        @JSONField(name = "Index")
        Integer Index;
        @JSONField(name = "SourceId")
        String SourceId;
        @JSONField(name = "ErrorCode")
        String ErrorCode;
        @JSONField(name = "ErrorMessage")
        String ErrorMessage;
    }
}
