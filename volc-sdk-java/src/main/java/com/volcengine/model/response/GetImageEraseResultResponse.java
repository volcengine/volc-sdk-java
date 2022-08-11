package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageEraseResultResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetImageEraseResultResponse.GetImageEraseResultBean result;

    @Data
    public static class GetImageEraseResultBean {
        @JSONField(name = "ResUri")
        String ResUri;
    }
}
