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
        @JSONField(name = "main_url")
        String mainUrl;
        @JSONField(name = "main_http_url")
        String mainHttpUrl;
        @JSONField(name = "backup_url_1")
        String backupUrl1;
        @JSONField(name = "backup_http_url")
        String backupHttpUrl;
        @JSONField(name = "url_expire")
        long urlExpire;
        @JSONField(name = "file_id")
        String fileId;
        @JSONField(name = "bitrate")
        int bitrate;
        @JSONField(name = "codec_type")
        String codecType;
        @JSONField(name = "logo_type")
        String logoType;
        @JSONField(name = "size")
        int size;
        @JSONField(name = "FPS")
        int fps;
        @JSONField(name = "quality")
        String quality;
        @JSONField(name = "encrypt")
        boolean encrypt;
        @JSONField(name = "file_hash")
        String fileHash;
        @JSONField(name = "vheight")
        int vHeight;
        @JSONField(name = "vwidth")
        int vWidth;
        @JSONField(name = "vtype")
        String vType;
        @JSONField(name = "definition")
        String definition;
        @JSONField(name = "redirect")
        boolean redirect;
    }
}
