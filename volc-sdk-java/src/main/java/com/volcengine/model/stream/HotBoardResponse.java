package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class HotBoardResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPo.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    List<Result> result;

    @Data
    public static class Result {
        @JSONField(name = "HotBoard")
        HotBoard hotBoard;
        @JSONField(name = "HotArticles")
        List<HotArticle> hotArticles;
    }

    @Data
    public static class HotBoard {
        @JSONField(name = "Title")
        String title;
        @JSONField(name = "GroupId")
        String GroupId;
        @JSONField(name = "Category")
        String category;
        @JSONField(name = "ArticleUrl")
        String articleUrl;
        @JSONField(name = "CoverImgUrl")
        String coverImgUrl;
        @JSONField(name = "CoverImageList")
        List<CommonPo.Image> coverImageList;
        @JSONField(name = "EffectiveEndTime")
        long effectiveEndTime;
    }

    @Data
    public static class HotArticle {
        @JSONField(name = "Abstract")
        String abstracts;
        @JSONField(name = "ArticleType")
        int articleType;
        @JSONField(name = "ArticleUrl")
        String articleUrl;
        @JSONField(name = "BanComment")
        long banComment;
        @JSONField(name = "BeHotTime")
        long beHotTime;
        @JSONField(name = "BuryCount")
        long buryCount;
        @JSONField(name = "CellType")
        int cellType;
        @JSONField(name = "CommentCount")
        long commentCount;
        @JSONField(name = "CommentUrl")
        String commentUrl;
        @JSONField(name = "CoverImageList")
        List<CommonPo.Image> coverImageList;
        @JSONField(name = "CoverMode")
        long coverMode;
        @JSONField(name = "DiggCount")
        long diggCount;
        @JSONField(name = "FilterWords")
        List<FilterWords> filterWords;
        @JSONField(name = "GroupId")
        String groupId;
        @JSONField(name = "GroupIdStr")
        String groupIdStr;
        @JSONField(name = "GroupSource")
        int groupSource;
        @JSONField(name = "HasGallery")
        boolean hasGallery;
        @JSONField(name = "GallaryImageCount")
        int gallaryImageCount;
        @JSONField(name = "HasVideo")
        boolean hasVideo;
        @JSONField(name = "ImageList")
        List<CommonPo.Image> imageList;
        @JSONField(name = "IsStick")
        boolean isStick;
        @JSONField(name = "ItemId")
        String itemId;
        @JSONField(name = "LargeImageList")
        List<CommonPo.Image> largeImageList;
        @JSONField(name = "MiddleImage")
        CommonPo.Image middleImage;
        @JSONField(name = "PublishTime")
        long publishTime;
        @JSONField(name = "ShareCount")
        long shareCount;
        @JSONField(name = "ShareUrl")
        String shareUrl;
        @JSONField(name = "Source")
        String source;
        @JSONField(name = "Tag")
        String tag;
        @JSONField(name = "Tip")
        int tip;
        @JSONField(name = "Title")
        String title;
        @JSONField(name = "Label")
        String label;
        @JSONField(name = "Url")
        String Url;
        @JSONField(name = "UserInfo")
        CommonPo.UserInfo userInfo;
        @JSONField(name = "VideoDuration")
        long videoDuration;
        @JSONField(name = "VideoId")
        String videoId;
        @JSONField(name = "VideoWatchCount")
        long videoWatchCount;
        @JSONField(name = "ArticleClass")
        String articleClass;
        @JSONField(name = "DetailPreLoad")
        List<String> detailPreLoad;
        @JSONField(name = "Rank")
        int rank;
        @JSONField(name = "ArticleReadCount")
        int articleReadCount;

    }

    @Data
    public static class FilterWords {
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "Id")
        String id;
        @JSONField(name = "IsSelected")
        boolean isSelected;
    }
}

