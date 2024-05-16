package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ContentSecurityCustImgLibListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CustImgLibResult result;

    @Data
    public static class CustImgLibResult {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Code")
        private Integer code;
        @JSONField(name = "Message")
        private String message;
        @JSONField(name = "Data")
        private List<CustImgLibData> data;
        @JSONField(name = "TotalCnt")
        private Integer total;
    }

    @Data
    public static class CustImgLibData {
        @JSONField(name = "content")
        private String content;
        @JSONField(name = "imageName")
        private String imageName;
        @JSONField(name = "imageId")
        private String imageId;
        @JSONField(name = "uploadTime")
        private Long updateTime;
    }

}
