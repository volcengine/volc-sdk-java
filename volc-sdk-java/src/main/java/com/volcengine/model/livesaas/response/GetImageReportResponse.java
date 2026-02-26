package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ImageReportDetail;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetImageReportResponse {
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
        @JSONField(name = "ImageReportDetails")
        List<ImageReportDetail> imageReportDetails;
        @JSONField(name = "Extra")
        String extra;
    }
}