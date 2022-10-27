package com.volcengine.model.stream.consumer;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.stream.CommonPo;
import lombok.Data;

import java.util.List;

@Data
public class FollowListResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPo.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "HasMore")
        boolean hasMore;
        @JSONField(name = "Data")
        List<Item> user;
        @JSONField(name = "Cursor")
        int cursor;
        @JSONField(name = "Total")
        int total;
    }

    @Data
    public static class Item {
        @JSONField(name = "Relation")
        Relation relation;
        @JSONField(name = "Info")
        Info info;
    }

    @Data
    public static class Info {
        @JSONField(name = "AuthType")
        String authType;
        @JSONField(name = "AvatarUrl")
        String avatarUrl;
        @JSONField(name = "Description")
        String description;
        @JSONField(name = "Follow")
        boolean follow;
        @JSONField(name = "FollowersCount")
        long followersCount;
        @JSONField(name = "UserVerified")
        boolean userVerified;
        @JSONField(name = "VerifiedContent")
        String verifiedContent;
        @JSONField(name = "HomePage")
        String homePage;
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "UserId")
        long userId;
        @JSONField(name = "MediaId")
        long mediaId;
    }

    @Data
    public static class Relation {
        @JSONField(name = "IsFollowing")
        int isFollowing;
        @JSONField(name = "FollowingsCount")
        long followingsCount;
        @JSONField(name = "FollowersCount")
        long followersCount;
        @JSONField(name = "FollowTime")
        long followTime;
        @JSONField(name = "UpdateArticleTime")
        long updateArticleTime;
    }

}
