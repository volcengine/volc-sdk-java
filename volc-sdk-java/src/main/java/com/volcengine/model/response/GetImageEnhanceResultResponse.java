package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageEnhanceResultResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private GetImageEnhanceResultResponseBean result;

    @Data
    static public class GetImageEnhanceResultResponseBean {
        @JSONField(name = "ResUri")
        private String resUri;

        @JSONField(name = "Method")
        private String method;
    }
}
