package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ArticleGetVideoResponse {
    @JSONField(name = "ResponseMetaData")
    ResponseMetadata responseMetadata;
    @JSONField(name = "BaseResp")
    BaseResp baseResp;
    @JSONField(name = "Data")
    VideoData data;

    @Data
    public static class BaseResp {
        @JSONField(name = "StatusMessage")
        String statusMessage;
        @JSONField(name = "StatusCode")
        int statusCode;
    }

    @Data
    public static class VideoData {
        @JSONField(name = "RequestId")
        String requestId;
        @JSONField(name = "VideoId")
        String videoId;
        @JSONField(name = "PosterUrl")
        String posterUrl;
        @JSONField(name = "VideoDuration")
        Double videoDuration;
        @JSONField(name = "VideoList")
        List<VideoInfo> videoList;
        @JSONField(name = "VideoStatus")
        String videoStatus;
    }

    @Data
    public static class VideoInfo {
        @JSONField(name = "Definition")
        String definition;
        @JSONField(name = "MainUrl")
        String mainUrl;
        @JSONField(name = "Size")
        Long size;
        @JSONField(name = "Height")
        Integer height;
        @JSONField(name = "Width")
        Integer width;
    }
}
