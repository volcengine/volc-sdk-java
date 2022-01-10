package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class RecommendCategoryUserResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;


    @Data
    public static class Result {
        @JSONField(name = "HasMore")
        boolean hasMore;
        @JSONField(name = "Users")
        List<RecommendRelatedUserResponse.Result> Users;
    }
}
