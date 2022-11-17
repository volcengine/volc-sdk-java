package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class RecommendRelatedUserResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPo.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    List<Result> result;

    @Data
    public static class Result {
        @JSONField(name = "ChannelId")
        int channelId;
        @JSONField(name = "Description")
        String description;
        @JSONField(name = "Intro")
        int intro;
        @JSONField(name = "RecommendReason")
        String recommendReason;
        @JSONField(name = "User")
        CommonPo.UserInfo user;
        @JSONField(name = "FilterWords")
        List<FollowArticlesResponse.FilterWords> filterWords;
    }
}
