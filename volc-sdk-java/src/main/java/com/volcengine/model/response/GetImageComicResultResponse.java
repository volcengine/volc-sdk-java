package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageComicResultResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private GetImageComicResultResponseBean result;

    @Data
    static public class GetImageComicResultResponseBean {
        @JSONField(name = "ResUri")
        private String resUri;
    }
}
