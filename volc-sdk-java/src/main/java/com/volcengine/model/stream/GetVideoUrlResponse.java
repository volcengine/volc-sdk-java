package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetVideoUrlResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPo.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "status")
        int status;
        @JSONField(name = "video_duration")
        double videoDuration;
        @JSONField(name = "poster_url")
        String posterUrl;
        @JSONField(name = "video_id")
        String videoId;
        @JSONField(name = "video_list")
        List<VideoList> videoList;
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
