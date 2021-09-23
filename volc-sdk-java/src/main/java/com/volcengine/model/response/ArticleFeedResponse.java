package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ArticleFeedResponse {
    @JSONField(name = "BaseResp")
    BaseResp baseResp;
    @JSONField(name = "Data")
    FeedResult data;

    @Data
    public static class BaseResp {
        @JSONField(name = "StatusMessage")
        String statusMessage;
        @JSONField(name = "StatusCode")
        int statusCode;
    }

    @Data
    public static class FeedResult {
        @JSONField(name = "RequestId")
        String requestId;
        @JSONField(name = "ArticleList")
        List<Article> articleList;
    }

    @Data
    public static class Article {
        @JSONField(name = "GroupId")
        String groupId;
        @JSONField(name = "Title")
        String title;
        @JSONField(name = "Author")
        Author author;
        @JSONField(name = "GroupType")
        String groupType;
        @JSONField(name = "GenerateType")
        String generateType;
        @JSONField(name = "PublishTime")
        long publishTime;
        @JSONField(name = "Top")
        boolean top;
        @JSONField(name = "Link")
        String link;
        @JSONField(name = "OpenId")
        String openId;
        @JSONField(name = "Abstract")
        String articleAbstract;
        @JSONField(name = "Tags")
        List<String> tags;
        @JSONField(name = "Extra")
        String extra;
        @JSONField(name = "CoverImages")
        List<Image> coverImages;
        @JSONField(name = "GroupVideos")
        List<Video> groupVideos;
        @JSONField(name = "DisplayTag")
        Map<String, String> displayTag;
        @JSONField(name = "DiggCount")
        Long diggCount;
        @JSONField(name = "CommentCount")
        Long commentCount;
        @JSONField(name = "CommentUrl")
        String commentUrl;
    }

    @Data
    public static class Author {
        @JSONField(name = "AuthorName")
        String authorName;
        @JSONField(name = "AuthorId")
        String authorId;
        @JSONField(name = "AuthorAvatarUrl")
        String authorAvatarUrl;
        @JSONField(name = "AuthorTags")
        List<String> authorTags;
        @JSONField(name = "Description")
        String description;
        @JSONField(name = "HomePage")
        String homePage;
        @JSONField(name = "FollowerCount")
        Long followerCount;
        @JSONField(name = "AuthorBizId")
        String authorBizId;
    }

    @Data
    public static class Image {
        @JSONField(name = "Url")
        String url;
        @JSONField(name = "Height")
        Integer height;
        @JSONField(name = "Width")
        Integer width;
    }

    @Data
    public static class Video {
        @JSONField(name = "Url")
        String url;
        @JSONField(name = "Vid")
        String vid;
        @JSONField(name = "VideoSize")
        Long videoSize;
        @JSONField(name = "VideoDuration")
        Double videoDuration;
        @JSONField(name = "CoverImages")
        Image coverImage;
    }
}
