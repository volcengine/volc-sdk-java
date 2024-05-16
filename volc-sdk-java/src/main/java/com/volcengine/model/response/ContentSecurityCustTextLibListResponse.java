package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ContentSecurityCustTextLibListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CustTextLibResult result;

    @Data
    public static class CustTextLibResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private List<CustTextLibData> data;
        @JSONField(name = "TotalCnt")
        private Integer total;
    }

    @Data
    public static class CustTextLibData {
        @JSONField(name = "content")
        private String content;
        @JSONField(name = "originContent")
        private String originContent;
        @JSONField(name = "firstUploadTime")
        private Long firstUploadTime;
        @JSONField(name = "updateTime")
        private Long updateTime;
    }

}
