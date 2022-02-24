package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetDiggListResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPo.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "HasMore")
        boolean hasMore;
        @JSONField(name = "Data")
        List<ArticleInfo> data;
    }

    @Data
    public static class ArticleInfo {
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
        @JSONField(name = "ArticleClass")
        String articleClass;
        @JSONField(name = "PublishTime")
        long publishTime;
        @JSONField(name = "Abstract")
        String abstracts;
        @JSONField(name = "ShareUrl")
        String shareUrl;
        @JSONField(name = "UserInfo")
        CommonPo.UserInfo userInfo;
        @JSONField(name = "HasVideo")
        boolean hasVideo;
        @JSONField(name = "WatchCount")
        long watchCount;
        @JSONField(name = "Duration")
        long duration;
        @JSONField(name = "Label")
        String label;
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
        @JSONField(name = "DetailSource")
        String detailSource;
        @JSONField(name = "DiggCount")
        long diggCount;
        @JSONField(name = "ImageList")
        List<CommonPo.Image> imageList;
        @JSONField(name = "ItemIdStr")
        String itemIdStr;
        @JSONField(name = "LargeImageList")
        List<CommonPo.Image> largeImageList;
        @JSONField(name = "MiddleImage")
        List<CommonPo.Image> middleImage;
        @JSONField(name = "Author")
        String author;
        @JSONField(name = "CellType")
        int cellType;
        @JSONField(name = "GroupSource")
        int groupSource;
        @JSONField(name = "HomePage")
        String homePage;
        @JSONField(name = "MediaId")
        long mediaId;
        @JSONField(name = "Timestamp")
        long timestamp;
        @JSONField(name = "UserId")
        long userId;
        @JSONField(name = "Video")
        String video;
    }
}
