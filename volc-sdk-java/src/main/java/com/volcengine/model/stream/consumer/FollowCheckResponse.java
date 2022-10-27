package com.volcengine.model.stream.consumer;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.stream.CommonPo;
import lombok.Data;

@Data
public class FollowCheckResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPo.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "Followed")
        boolean followed;
        @JSONField(name = "Following")
        boolean following;
    }
}
