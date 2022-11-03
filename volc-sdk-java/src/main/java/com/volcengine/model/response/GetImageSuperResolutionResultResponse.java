package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageSuperResolutionResultResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private GetImageSuperResolutionResultResponseBean result;

    @Data
    static public class GetImageSuperResolutionResultResponseBean {
        @JSONField(name = "ResUri")
        private String resUri;
    }
}
