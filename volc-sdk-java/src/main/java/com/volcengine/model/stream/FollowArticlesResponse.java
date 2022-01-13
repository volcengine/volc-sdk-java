package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class FollowArticlesResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPo.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "HasMore")
        boolean hasMore;
        @JSONField(name = "Articles")
        List<ArticleInfos> articles;
    }

    @Data
    public static class ArticleInfos {
        @JSONField(name = "ArticleUrl")
        String articleUrl;
        @JSONField(name = "CommentCount")
        long commentCount;
        @JSONField(name = "CommentUrl")
        String commentUrl;
        @JSONField(name = "CreateTime")
        long createTime;
        @JSONField(name = "DiggCount")
        long diggCount;
        @JSONField(name = "FilterWords")
        List<FilterWords> filterWords;
        @JSONField(name = "GroupId")
        String groupId;
        @JSONField(name = "GroupSource")
        int groupSource;
        @JSONField(name = "HasVideo")
        boolean hasVideo;
        @JSONField(name = "ImageList")
        List<CommonPo.Image> imageList;
        @JSONField(name = "ItemId")
        String itemId;
        @JSONField(name = "LargeImageList")
        List<CommonPo.Image> largeImageList;
        @JSONField(name = "MiddleImage")
        List<CommonPo.Image> middleImage;
        @JSONField(name = "PublishTime")
        long publishTime;
        @JSONField(name = "PushId")
        long pushId;
        @JSONField(name = "ReportUrl")
        String reportUrl;
        @JSONField(name = "ShareCount")
        long shareCount;
        @JSONField(name = "ShareUrl")
        String shareUrl;
        @JSONField(name = "Source")
        String source;
        @JSONField(name = "Summary")
        String summary;
        @JSONField(name = "Title")
        String title;
        @JSONField(name = "UserId")
        long userId;
        @JSONField(name = "UserInfo")
        CommonPo.UserInfo userInfo;
    }

    @Data
    public static class FilterWords {
        @JSONField(name = "Id")
        String id;
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "IsSelect")
        boolean isSelect;
    }
}
