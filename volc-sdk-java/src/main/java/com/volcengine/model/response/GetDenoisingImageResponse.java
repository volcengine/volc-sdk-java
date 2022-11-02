package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetDenoisingImageResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private GetDenoisingImageResponseBean result;

    @Data
    static public class GetDenoisingImageResponseBean {
        @JSONField(name = "ResUri")
        private String resUri;

        @JSONField(name = "Demotion")
        private Boolean demotion;
    }
}
