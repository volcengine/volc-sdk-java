package com.volcengine.model.maas.api.v2;


import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;


@Data
public class CreateOrRefreshAPIKeyResp {
    @JSONField(name = "Result")
    Result Result;
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata ResponseMetadata;

//    @Data
//    public static class Result {
//        @JSONField(name = "ApiKey")
//        private String ApiKey;
//    }
}
