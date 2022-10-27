package com.volcengine.model.stream.consumer;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.stream.CommonPo;
import lombok.Data;

import java.util.List;

@Data
public class SingleArticleResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPo.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "GroupId")
        String groupId;
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
        @JSONField(name = "ShareCount")
        long shareCount;
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
        @JSONField(name = "BanComment")
        long banComment;
        @JSONField(name = "DetailSource")
        String detailSource;
        @JSONField(name = "DiggCount")
        long diggCount;
        @JSONField(name = "DiggStatus")
        boolean diggStatus;
        @JSONField(name = "ImageList")
        List<CommonPo.Image> imageList;
        @JSONField(name = "ItemIdStr")
        String itemIdStr;
        @JSONField(name = "MiddleImage")
        CommonPo.Image middleImage;
        @JSONField(name = "LargeImageList")
        List<CommonPo.Image> largeImageList;
        @JSONField(name = "NewVersionVideoPage")
        boolean newVersionVideoPage;
        @JSONField(name = "Author")
        String author;
        @JSONField(name = "HomePage")
        String homePage;
        @JSONField(name = "ArticleReadCount")
        String articleReadCount;
        @JSONField(alternateNames = {"VideoDetail", "Video"})
        VideoDetail videoDetail;
    }

    @Data
    public static class VideoDetail {
        @JSONField(name = "Status")
        int status;
        @JSONField(name = "VideoDuration")
        int videoDuration;
        @JSONField(name = "PosterUrl")
        String posterUrl;
        @JSONField(name = "VideoId")
        String videoId;
        @JSONField(name = "VideoList")
        List<VideoList> videoList;
        @JSONField(name = "ArticleClass")
        String articleClass;
    }


    @Data
    public static class VideoList {
        @JSONField(name = "MainUrl")
        String mainUrl;
        @JSONField(name = "MainHttpUrl")
        String mainHttpUrl;
        @JSONField(name = "BackupUrl1")
        String backupUrl1;
        @JSONField(name = "BackupHttpUrl")
        String backupHttpUrl;
        @JSONField(name = "UrlExpire")
        long urlExpire;
        @JSONField(name = "FileId")
        String fileId;
        @JSONField(name = "Bitrate")
        long bitrate;
        @JSONField(name = "CodecType")
        String codecType;
        @JSONField(name = "LogoType")
        String logoType;
        @JSONField(name = "Size")
        long size;
        @JSONField(name = "FPS")
        int fps;
        @JSONField(name = "Quality")
        String quality;
        @JSONField(name = "Encrypt")
        boolean encrypt;
        @JSONField(name = "FileHash")
        String fileHash;
        @JSONField(name = "Vheight")
        int vHeight;
        @JSONField(name = "Vwidth")
        int vWidth;
        @JSONField(name = "Vtype")
        String vType;
        @JSONField(name = "Definition")
        String definition;
        @JSONField(name = "Redirect")
        boolean redirect;
    }
}
