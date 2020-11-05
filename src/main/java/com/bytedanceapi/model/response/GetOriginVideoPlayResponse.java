package com.bytedanceapi.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetOriginVideoPlayResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    OriginPlayData originPlayData;

    @Data
    public static class OriginPlayData {
        @JSONField(name = "MediaType")
        private String mediaType;
        @JSONField(name = "Duration")
        private double duration;
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
        @JSONField(name = "Bitrate")
        private int bitrate;
        @JSONField(name = "FileHash")
        private String fileHash;
        @JSONField(name = "MainPlayUrl")
        private String mainPlayUrl;
        @JSONField(name = "BackupPlayUrl")
        private String backupPlayUrl;
    }
}
