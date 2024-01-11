package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class RiskVConsoleResponse {

    @Data
    public static class GetUploadIdResult{
        @JSONField(name = "Result")
        private CommonResponse<GetUploadIdResponse> result;
    }

    @Data
    public static class UploadFileResult{
        @JSONField(name = "Result")
        private CommonResponse<String> result;
    }

    @Data
    public static class CompleteUploadFileResult{
        @JSONField(name = "Result")
        private CommonResponse<String> result;
    }

    @Data
    public static class GetUploadedPartListResult {
        @JSONField(name = "Result")
        private CommonResponse<List<Integer>> result;
    }


    @Data
    public static class CommonResponse<T>{
        @JSONField(name ="log_id")
        private String logId;
        @JSONField(name = "err_code")
        private String errCode;
        @JSONField(name = "err_msg")
        private String errMsg;

        @JSONField(name="timestamp")
        private Long timestamp;
        @JSONField(name = "data")
        private T data;
    }

    @Data
    public static class GetUploadIdResponse {
        @JSONField(name = "upload_id")
        private String uploadId;
        @JSONField(name = "status")
        private int status;
    }




}
