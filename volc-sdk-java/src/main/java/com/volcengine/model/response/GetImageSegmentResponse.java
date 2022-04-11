package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;


public class GetImageSegmentResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetImageSegmentResultBean result;

    @Data
    public static class GetImageSegmentResultBean{
        @JSONField(name = "ResUri")
        String ResUri;
    }
}
