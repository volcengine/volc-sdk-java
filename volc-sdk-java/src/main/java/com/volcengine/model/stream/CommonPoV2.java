package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CommonPoV2 {
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
        @JSONField(name = "HomePage")
        String homePage;
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "UserId")
        long userId;
        @JSONField(name = "UserVerified")
        boolean userVerified;
        @JSONField(name = "VerifiedContent")
        String verifiedContent;
    }

    @Data
    public static class ImageUrl {
        @JSONField(name = "Url")
        String url;
        @JSONField(name = "Width")
        long width;
        @JSONField(name = "Height")
        long height;
    }

    @Data
    public static class VideoDetail {
        @JSONField(name = "VideoDuration")
        double videoDuration;
        @JSONField(name = "VideoList")
        List<VideoInfo> videoList;
    }

    @Data
    public static class VideoInfo {
        @JSONField(name = "Url")
        String url;
        @JSONField(name = "Width")
        long width;
        @JSONField(name = "Height")
        long height;
        @JSONField(name = "Definition")
        String definition;
    }

    @Data
    public static class ResponseMetadata  {
        @JSONField(name = "RequestId")
        private String requestId;
        @JSONField(name = "Action")
        private String action;
        @JSONField(name = "Version")
        private String version;
        @JSONField(name = "Service")
        private String service;
        @JSONField(name = "Region")
        private String region;
        @JSONField(name = "Error")
        private Error error;

        @Data
        public static class Error {
            @JSONField(name = "CodeN")
            private long codeN;
            @JSONField(name = "Code")
            private String code;
            @JSONField(name = "Message")
            private String message;
        }
    }
}
