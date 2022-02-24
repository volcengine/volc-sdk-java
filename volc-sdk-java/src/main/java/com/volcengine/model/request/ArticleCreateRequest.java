package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ArticleCreateRequest {
    @JSONField(name = "Articles")
    List<ArticleModel> articles;

    @Data
    public static class ArticleModel {
        @JSONField(name = "OpenId")
        String openId;
        @JSONField(name = "Title")
        String title;
        @JSONField(name = "Abstract")
        String articleAbstract;
        @JSONField(name = "GroupType")
        String groupType;
        @JSONField(name = "GroupSource")
        String groupSource;
        @JSONField(name = "Tags")
        List<String> tags;
        @JSONField(name = "Author")
        ArticleAuthorModel author;
        @JSONField(name = "PublishTime")
        long publishTime;
        @JSONField(name = "Content")
        String content;
        @JSONField(name = "Extra")
        String extra;
        @JSONField(name = "SourceName")
        String sourceName;
        @JSONField(name = "GenerateType")
        String generateType;
        @JSONField(name = "Link")
        String link;
        @JSONField(name = "ContentCntw")
        Integer contentCntw;
        @JSONField(name = "CoverImages")
        List<ArticleImageModel> coverImages;
        @JSONField(name = "GroupImages")
        List<ArticleImageModel> groupImages;
        @JSONField(name = "GroupVideos")
        List<ArticleVideoModel> groupVideos;
    }

    @Data
    public static class ArticleAuthorModel {
        @JSONField(name = "AuthorName")
        String authorName;
        @JSONField(name = "AuthorAvatarUrl")
        String authorAvatarUrl;
        @JSONField(name = "AuthorTags")
        List<String> authorTags;
        @JSONField(name = "Description")
        String description;
        @JSONField(name = "AuthorOpenId")
        String authorOpenId;
        @JSONField(name = "FollowerCount")
        Long followerCount;
    }

    @Data
    public static class ArticleImageModel {
        @JSONField(name = "Height")
        Integer height;
        @JSONField(name = "Width")
        Integer width;
        @JSONField(name = "Url")
        String url;
    }

    @Data
    public static class ArticleVideoModel {
        @JSONField(name = "Id")
        String id;
        @JSONField(name = "VideoSize")
        Long videoSize;
        @JSONField(name = "Duration")
        Double duration;
        @JSONField(name = "Url")
        String url;
        @JSONField(name = "CoverImage")
        ArticleImageModel coverImage;
    }
}
