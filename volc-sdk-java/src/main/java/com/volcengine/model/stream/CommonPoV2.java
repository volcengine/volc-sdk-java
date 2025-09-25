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
        @JSONField(name = "Avatar")
        String avatar;
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
        @JSONField(name = "UserVerifiedInt")
        int userVerifiedInt;
        @JSONField(name = "VerifiedContent")
        String verifiedContent;
        @JSONField(name = "AuthType")
        String authType;
        @JSONField(name = "OtherAuth")
        OtherAuth otherAuth;
        @JSONField(name = "FollowCount")
        long followCount;
        @JSONField(name = "Block")
        boolean block;
        @JSONField(name = "VideoCount")
        long videoCount;
        @JSONField(name = "VideoTotalCount")
        long videoTotalCount;
        @JSONField(name = "Location")
        Location location;
    }

    @Data
    public static class OtherAuth {
        @JSONField(name = "Interest")
        String interest;
    }

    @Data
    public static class Location {
        @JSONField(name = "City")
        String city;
        @JSONField(name = "Province")
        String province;
        @JSONField(name = "Country")
        String country;
    }

    @Data
    public static class ImageUrl {
        @JSONField(name = "Url")
        String url;
        @JSONField(name = "Uri")
        String uri;
        @JSONField(name = "Width")
        long width;
        @JSONField(name = "Height")
        long height;
    }

    @Data
    public static class VideoDetail {
        @JSONField(name = "Status")
        long status;
        @JSONField(name = "VideoDuration")
        double videoDuration;
        @JSONField(name = "VideoList")
        List<VideoInfo> videoList;
        @JSONField(name = "PosterURL")
        String posterURL;
        @JSONField(name = "VideoID")
        String videoID;
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
        @JSONField(name = "MainURL")
        String mainURL;
        @JSONField(name = "BackupURL")
        String backupURL;
        @JSONField(name = "URLExpire")
        long uRLExpire;
        @JSONField(name = "FileID")
        String fileID;
        @JSONField(name = "MainHTTPURL")
        String mainHTTPURL;
        @JSONField(name = "BackupHTTPURL")
        String backupHTTPURL;
        @JSONField(name = "Bitrate")
        long bitrate;
        @JSONField(name = "CodecType")
        String codecType;
        @JSONField(name = "LogoType")
        String logoType;
        @JSONField(name = "Size")
        long size;
        @JSONField(name = "Fps")
        long fps;
        @JSONField(name = "Quality")
        String quality;
        @JSONField(name = "Encrypt")
        boolean encrypt;
        @JSONField(name = "FileHash")
        String fileHash;
        @JSONField(name = "Vtype")
        String vtype;
        @JSONField(name = "Redirect")
        boolean redirect;
        @JSONField(name = "AudioURL")
        String audioURL;
        @JSONField(name = "VideoURL")
        String videoURL;
        @JSONField(name = "MeanVolume")
        double meanVolume;
        @JSONField(name = "MaxVolume")
        double maxVolume;
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
