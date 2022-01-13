package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class RelatedArticleResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPo.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    List<Result> result;

    @Data
    public static class Result {
        @JSONField(name = "GroupId")
        String groupId;
        @JSONField(name = "VideoId")
        String videoId;
        @JSONField(name = "Tag")
        String tag;
        @JSONField(name = "Title")
        String title;
        @JSONField(name = "ArticleUrl")
        String articleUrl;
        @JSONField(name = "PublishTime")
        long publishTime;
        @JSONField(name = "Abstract")
        String abstracts;
        @JSONField(name = "ArticleClass")
        String articleClass;
        @JSONField(name = "ShareUrl")
        String shareUrl;
        @JSONField(name = "UserInfo")
        UserInfo userInfo;
        @JSONField(name = "HasVideo")
        boolean hasVideo;
        @JSONField(name = "BuryCount")
        long buryCount;
        @JSONField(name = "CommentCount")
        long commentCount;
        @JSONField(name = "CommentUrl")
        String commentUrl;
        @JSONField(name = "BanComment")
        long banComment;
        @JSONField(name = "DiggCount")
        long diggCount;
        @JSONField(name = "ImageList")
        List<CommonPo.Image> imageList;
        @JSONField(name = "MiddleImage")
        List<CommonPo.Image> middleImage;
        @JSONField(name = "BanAction")
        boolean banAction;
        @JSONField(name = "BanBury")
        boolean BanBury;
        @JSONField(name = "FilterWords")
        List<String> filterWords;
        @JSONField(name = "Source")
        String source;
        @JSONField(name = "VideoWatchCount")
        long videoWatchCount;
        @JSONField(name = "VideoDuration")
        long videoDuration;
        @JSONField(name = "Url")
        String url;
    }


    @Data
    public static class UserInfo {
        @JSONField(name = "AvatarUrl")
        String avatarUrl;
        @JSONField(name = "Description")
        String description;
        @JSONField(name = "FollowersCount")
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
    }
}
