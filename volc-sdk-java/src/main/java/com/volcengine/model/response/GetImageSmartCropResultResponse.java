package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageSmartCropResultResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private GetImageSmartCropResultResponseBean result;

    @Data
    static public class GetImageSmartCropResultResponseBean {
        @JSONField(name = "ResUri")
        private String resUri;

        @JSONField(name = "Demotioned")
        private Boolean demotioned;
    }
}
