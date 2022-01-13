package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetFollowingListResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPo.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "HasMore")
        boolean hasMore;
        @JSONField(name = "Users")
        List<UserInfo> user;
        @JSONField(name = "Cursor")
        int cursor;
        @JSONField(name = "Total")
        int total;
    }

    @Data
    public static class UserInfo {
        @JSONField(name = "FollowTime")
        long followTime;
        @JSONField(name = "Info")
        Info info;
        @JSONField(name = "Relation")
        Relation relation;
        @JSONField(name = "RelationCount")
        RelationCount relationCount;
        @JSONField(name = "UpdateArticle")
        long updateArticle;
        @JSONField(name = "RecentVisitTime")
        long recentVisitTime;
    }

    @Data
    public static class Info {
        @JSONField(name = "AvatarUrl")
        String avatarUrl;
        @JSONField(name = "BanStatus")
        boolean banStatus;
        @JSONField(name = "Desc")
        String Desc;
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "Schema")
        String schema;
        @JSONField(name = "UserAuthInfo")
        String userAuthInfo;
        @JSONField(name = "UserId")
        long userId;
        @JSONField(name = "UserVerified")
        boolean userVerified;
        @JSONField(name = "VerifiedContent")
        String verifiedContent;
    }

    @Data
    public static class Relation {
        @JSONField(name = "IsFollowed")
        int isFollowed;
        @JSONField(name = "IsFollowing")
        int isFollowing;
        @JSONField(name = "IsFriend")
        int isFriend;
    }

    @Data
    public static class RelationCount {
        @JSONField(name = "FollowersCount")
        int followersCount;
        @JSONField(name = "FollowingsCount")
        int followingsCount;
    }
}
