package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageBgFillResultResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private GetImageBgFillResultResponseBean result;

    @Data
    static public class GetImageBgFillResultResponseBean {
        @JSONField(name = "ResUri")
        private String resUri;
    }
}
