package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
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
        @JSONField(name = "Source")
        String source;
        @JSONField(name = "ArticleUrl")
        String articleUrl;
        @JSONField(name = "ArticleClass")
        String articleClass;
        @JSONField(name = "PublishTime")
        long publishTime;
        @JSONField(name = "Abstract")
        String abstracts;
        @JSONField(name = "ShareUrl")
        String shareUrl;
        @JSONField(name = "ShareCount")
        long shareCount;
        @JSONField(name = "HasVideo")
        boolean hasVideo;
        @JSONField(name = "VideoWatchCount")
        long videoWatchCount;
        @JSONField(name = "VideoDuration")
        long videoDuration;
        @JSONField(name = "Label")
        String label;
        @JSONField(name = "DiggCount")
        long diggCount;
        @JSONField(name = "BuryCount")
        long buryCount;
        @JSONField(name = "CommentCount")
        long commentCount;
        @JSONField(name = "CommentUrl")
        String commentUrl;
        @JSONField(name = "CoverMode")
        long coverMode;
        @JSONField(name = "CoverImageList")
        List<CommonPo.Image> coverImageList;
        @JSONField(name = "FilterWords")
        List<FilterWords> filterWords;
        @JSONField(name = "IsStick")
        boolean isStick;
        @JSONField(name = "ProfileTags")
        List<String> profileTags;
        @JSONField(name = "UserInfo")
        List<CommonPo.UserInfo> userInfo;
        @JSONField(name = "MiddleImage")
        CommonPo.Image middleImage;
        @JSONField(name = "LargeImageList")
        List<CommonPo.Image> LargeImageList;
        @JSONField(name = "ArticleReadCount")
        long articleReadCount;
        @JSONField(name = "articleType")
        int articleType;
        @JSONField(name = "CellType")
        int cellType;
        @JSONField(name = "ImageList")
        List<CommonPo.Image> imageList;
    }

    @Data
    public static class FilterWords {
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "Id")
        String id;
    }
}
