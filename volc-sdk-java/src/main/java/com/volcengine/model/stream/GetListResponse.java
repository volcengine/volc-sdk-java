package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetListResponse {
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
        CommonPo.UserInfo userInfo;
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
        @JSONField(name = "VideoDetail")
        VideoDetail videoDetail;
        @JSONField(name = "ArticleClassification")
        List<List<String>> articleClassification;
        @JSONField(name = "BizLog")
        String bizLog;
    }

    @Data
    public static class FilterWords {
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "Id")
        String id;
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
        int bitrate;
        @JSONField(name = "CodecType")
        String codecType;
        @JSONField(name = "LogoType")
        String logoType;
        @JSONField(name = "Size")
        int size;
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
