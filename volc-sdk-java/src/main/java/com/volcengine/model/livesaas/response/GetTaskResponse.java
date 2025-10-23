package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.Tag;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetTaskResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetTaskResponseBody result;

    @Data
    public static class GetTaskResponseBody {
        @JSONField(name = "TaskId")
        Long TaskId;
        @JSONField(name = "TaskName")
        String TaskName;
        @JSONField(name = "ProjectName")
        String ProjectName;
        @JSONField(name = "TaskType")
        Integer TaskType;
        @JSONField(name = "TaskTypeDesc")
        String TaskTypeDesc;
        @JSONField(name = "Status")
        Integer Status;
        @JSONField(name = "ScenarioId")
        Long ScenarioId;
        @JSONField(name = "LivePullURL")
        String LivePullURL;
        @JSONField(name = "CreatedTime")
        Long CreatedTime;
        @JSONField(name = "UpdatedTime")
        Long UpdatedTime;
        @JSONField(name = "CallbackURL")
        String CallbackURL;
        @JSONField(name = "Extra")
        String Extra;
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "Tags")
        List<Tag> Tags;
        @JSONField(name = "ActivityName")
        String ActivityName;
    }
}