package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

public class RiskResultResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ApplyImageUploadResponse.UploadImageResult result;

    @Data
    public static class RiskDetectionResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private List<Map<String, Object>> data;
        @JSONField(name = "Page")
        private Page page;
    }

    @Data
    public static class Page {
        @JSONField(name = "PageNum")
        Integer pageNum;
        @JSONField(name = "PageSize")
        Integer pageSize;
        @JSONField(name = "Total")
        Integer total;
    }
}
