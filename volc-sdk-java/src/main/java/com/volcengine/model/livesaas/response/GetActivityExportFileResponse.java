package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetActivityExportFileResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityExportFileResponseBody result;

    @Data
    public static class GetActivityExportFileResponseBody {
        @JSONField(name = "Status")
        Integer Status;

        @JSONField(name = "FileUrl")
        String FileUrl;

        @JSONField(name = "DataType")
        Integer DataType;
    }
}