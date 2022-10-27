package com.volcengine.example.rtc.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
public class StartRecordRequest {
    @JSONField(name = "AppId")
    String appId;
    @JSONField(name = "BusinessId")
    String businessId;
    @JSONField(name = "RoomId")
    String RoomId;
    @JSONField(name = "TaskId")
    String TaskId;
    @JSONField(name = "RecordMode")
    int RecordMode;
    @JSONField(name = "Encode")
    Encode Encode;
    @JSONField(name = "Layout")
    Layout Layout;
    @JSONField(name = "Control")
    Control Control;
    @JSONField(name = "FileFormatConfig")
    FileFormatConfig FileFormatConfig;
    @JSONField(name = "StorageConfig")
    StorageConfig StorageConfig;

    @Data
    @AllArgsConstructor
    public class Encode {
        @JSONField(name = "VideoWidth")
        int VideoWidth;
        @JSONField(name = "VideoHeight")
        int VideoHeight;
        @JSONField(name = "VideoFps")
        int VideoFps;
        @JSONField(name = "VideoBitrate")
        int VideoBitrate;
        @JSONField(name = "VideoCodec")
        int VideoCodec;
        @JSONField(name = "VideoGop")
        int VideoGop;
        @JSONField(name = "AudioCodec")
        int AudioCodec;
        @JSONField(name = "AudioProfile")
        int AudioProfile;
        @JSONField(name = "AudioBitrate")
        int AudioBitrate;
        @JSONField(name = "AudioSampleRate")
        int AudioSampleRate;
        @JSONField(name = "AudioChannels")
        int AudioChannels;
    }


    @Data
    @AllArgsConstructor
    public class Layout {
        @JSONField(name = "LayoutMode")
        int LayoutMode;
    }

    @Data
    @AllArgsConstructor
    public class Control {
        @JSONField(name = "MediaType")
        int MediaType;
        @JSONField(name = "FrameInterpolationMode")
        int FrameInterpolationMode;
        @JSONField(name = "MaxIdleTime")
        int MaxIdleTime;
        @JSONField(name = "MaxRecordTime")
        int MaxRecordTime;
    }

    @Data
    @AllArgsConstructor
    public class FileFormatConfig {
        @JSONField(name = "FileFormat")
        String[] FileFormat;
    }

    @Data
    @AllArgsConstructor
    public class StorageConfig {
        @JSONField(name = "Type")
        int Type;
        @JSONField(name = "TosConfig")
        TosConfig TosConfig;
    }

    @Data
    @AllArgsConstructor
    public class TosConfig {
        @JSONField(name = "AccountId")
        String AccountId;
        @JSONField(name = "Region")
        int Region;
        @JSONField(name = "Bucket")
        String Bucket;
    }
}

