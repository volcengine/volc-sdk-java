package com.bytedanceapi.model.response;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetPlayInfoResponse {

    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    private PlayResult result;

    @Data
    public static class PlayResult {
        @JSONField(name = "Data")
        private PlayData data;
    }

    @Data
    public static class PlayData {
        @JSONField(name = "Status")
        private int status;
        @JSONField(name = "VideoID")
        private String videoID;
        @JSONField(name = "CoverUrl")
        private String coverUrl;
        @JSONField(name = "Duration")
        private int duration;
        @JSONField(name = "MediaType")
        private String mediaType;
        @JSONField(name = "TotalCount")
        private int totalCount;
        @JSONField(name = "PlayInfoList")
        private List<PlayInfoList> playInfoList;
    }

    @Data
    public static class PlayInfoList {
        @JSONField(name = "Bitrate")
        private int bitrate;
        @JSONField(name = "Encrypt")
        private boolean encrypt;
        @JSONField(name = "FileHash")
        private String fileHash;
        @JSONField(name = "Size")
        private int size;
        @JSONField(name = "Height")
        private int height;
        @JSONField(name = "Width")
        private int width;
        @JSONField(name = "Format")
        private String format;
        @JSONField(name = "Codec")
        private String codec;
        @JSONField(name = "Logo")
        private String logo;
        @JSONField(name = "Definition")
        private String definition;
        @JSONField(name = "Quality")
        private String quality;
        @JSONField(name = "PlayAuth")
        private String playAuth;
        @JSONField(name = "MainPlayUrl")
        private String mainPlayUrl;
        @JSONField(name = "BackupPlayUrl")
        private String backupPlayUrl;
        @JSONField(name = "FileID")
        private String fileID;
        @JSONField(name = "P2pVerifyURL")
        private String p2pVerifyURL;
        @JSONField(name = "PreloadInterval")
        private int preloadInterval;
        @JSONField(name = "PreloadMaxStep")
        private int preloadMaxStep;
        @JSONField(name = "PreloadMinStep")
        private int preloadMinStep;
        @JSONField(name = "PreloadSize")
        private int preloadSize;
    }
}
