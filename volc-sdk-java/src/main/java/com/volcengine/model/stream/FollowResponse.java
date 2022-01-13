package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class FollowResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPo.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "Create")
        boolean create;
        @JSONField(name = "User")
        CommonPo.UserInfo user;
        @JSONField(name = "IsFollowing")
        boolean isFollowing;
        @JSONField(name = "IsFollowed")
        boolean isFollowed;
        @JSONField(name = "UserVerified")
        boolean userVerified;
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "UserId")
        String userId;
        @JSONField(name = "ScreenName")
        String screenName;
        @JSONField(name = "AvatarUrl")
        String avatarUrl;
        @JSONField(name = "Type")
        int type;
        @JSONField(name = "Description")
        String description;
    }
}
