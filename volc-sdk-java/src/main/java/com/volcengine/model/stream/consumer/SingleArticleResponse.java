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
        @JSONField(name = "Abstract")
        String abstracts;
        @JSONField(name = "GroupId")
        String groupId;
        @JSONField(name = "Title")
        String title;
        @JSONField(name = "DetailSource")
        String detailSource;
        @JSONField(name = "PublishTime")
        long publishTime;
        @JSONField(name = "ShareUrl")
        String shareUrl;
        @JSONField(name = "ShareCount")
        long shareCount;
        @JSONField(name = "HasVideo")
        boolean hasVideo;
        @JSONField(name = "WatchCount")
        long watchCount;
        @JSONField(name = "Duration")
        long duration;
        @JSONField(name = "DiggCount")
        long diggCount;
        @JSONField(name = "CommentUrl")
        String commentUrl;
        @JSONField(name = "CommentCount")
        long commentCount;
        @JSONField(name = "DiggStatus")
        boolean diggStatus;
        @JSONField(name = "ArticleClass")
        String articleClass;
        @JSONField(name = "ArticleUrl")
        String articleUrl;
        @JSONField(name = "CoverMode")
        long coverMode;
        @JSONField(name = "CoverImageList")
        List<CommonPo.Image> coverImageList;
        @JSONField(alternateNames = {"VideoDetail", "Video"})
        VideoDetail videoDetail;
        @JSONField(name = "UserInfo")
        CommonPo.UserInfo userInfo;
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
    }


    @Data
    public static class VideoList {
        @JSONField(name = "MainUrl")
        String mainUrl;
        @JSONField(name = "BackupUrl1")
        String backupUrl1;
        @JSONField(name = "UrlExpire")
        long urlExpire;
        @JSONField(name = "Bitrate")
        long bitrate;
        @JSONField(name = "CodecType")
        String codecType;
        @JSONField(name = "Size")
        long size;
        @JSONField(name = "FPS")
        int fps;
        @JSONField(name = "Vheight")
        int vHeight;
        @JSONField(name = "Vwidth")
        int vWidth;
        @JSONField(name = "Vtype")
        String vType;
        @JSONField(name = "Definition")
        String definition;
    }
}
