package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CommonPo {
    @Data
    public static class UserInfo {
        @JSONField(name = "AvatarUrl")
        String avatarUrl;
        @JSONField(name = "Description")
        String description;
        @JSONField(name = "Follow")
        boolean follow;
        @JSONField(name = "FollowerCount")
        long followerCount;
        @JSONField(name = "UserVerified")
        boolean userVerified;
        @JSONField(name = "VerifiedContent")
        String verifiedContent;
        @JSONField(name = "HomePage")
        String homePage;
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "UserId")
        String userId;
        @JSONField(name = "CreateTime")
        long createTime;
        @JSONField(name = "IsFollowed")
        boolean isFollowed;
        @JSONField(name = "IsFollowing")
        boolean isFollowing;
        @JSONField(name = "LastUpdate")
        String lastUpdate;
        @JSONField(name = "MediaId")
        long mediaId;
        @JSONField(name = "ScreenName")
        String screenName;
        @JSONField(name = "Type")
        int type;
        @JSONField(name = "UserAuthInfo")
        String userAuthInfo;
        @JSONField(name = "Desc")
        String desc;
    }

    @Data
    public static class Image {
        @JSONField(name = "Url")
        String Url;
        @JSONField(name = "Uri")
        String Uri;
        @JSONField(name = "Width")
        long Width;
        @JSONField(name = "Height")
        long Height;
        @JSONField(name = "UrlList")
        List<Url> UrlList;
        @JSONField(name = "Mimetype")
        String mimetype;
    }

    @Data
    public static class Url {
        @JSONField(name = "Url")
        String Url;
    }
}
