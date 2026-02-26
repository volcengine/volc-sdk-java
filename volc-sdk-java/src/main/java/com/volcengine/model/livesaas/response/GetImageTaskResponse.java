package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ImageItem;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetImageTaskResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetImageTaskResponseBody result;

    @Data
    public static class GetImageTaskResponseBody {
        @JSONField(name = "TaskId")
        Long taskId;
        @JSONField(name = "TaskName")
        String taskName;
        @JSONField(name = "Status")
        String status;
        @JSONField(name = "CreatedTime")
        Long createdTime;
        @JSONField(name = "FinishedTime")
        Long finishedTime;
        @JSONField(name = "InputImages")
        List<ImageItem> inputImages;
        @JSONField(name = "CallbackURL")
        String callbackURL;
        @JSONField(name = "Extra")
        String extra;
    }
}