package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class LocalMediaDownloadRequest {
    @JSONField(name = "SpaceID")
    String spaceID;
    @JSONField(name = "DeviceID")
    String deviceID;
    @JSONField(name = "ChannelID")
    String channelID;
    @JSONField(name = "StartTime")
    Integer startTime;
    @JSONField(name = "EndTime")
    Integer endTime;
    @JSONField(name = "Version")
    String version;
    @JSONField(name = "DownloadSpeedSingle")
    Integer downloadSpeedSingle;
    @JSONField(name = "MediaProcess")
    Mps mediaProcess;

    @Data
    public static class Mps {
        @JSONField(name = "M3U8Option")
        M3U8Option m3U8Option;
        @JSONField(name = "Subtitle")
        Subtitle subtitle;
    }

    @Data
    public static class M3U8Option {
        @JSONField(name = "ToMp4")
        Boolean toMp4;
    }

    @Data
    public static class Subtitle {
        @JSONField(name = "SubtitleSrc")
        String subtitleSrc;
        @JSONField(name = "SubtitleList")
        List<SubtitleItem> subtitleList;
        @JSONField(name = "Font")
        Font font;
    }

    @Data
    public static class Font {
        @JSONField(name = "FontSize")
        Integer fontSize;
        @JSONField(name = "PrimaryColor")
        String primaryColor;
        @JSONField(name = "Alignment")
        String alignment;
    }

    @Data
    public static class SubtitleItem {
        @JSONField(name = "Start")
        Integer start;
        @JSONField(name = "End")
        Integer end;
        @JSONField(name = "Content")
        String content;
    }

}
