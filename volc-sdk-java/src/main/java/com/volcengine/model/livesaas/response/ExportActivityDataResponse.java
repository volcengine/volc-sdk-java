package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class ExportActivityDataResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ExportActivityDataResponseBody result;

    @Data
    public static class ExportActivityDataResponseBody {
        @JSONField(name = "ExportId")
        Long ExportId;
    }
}