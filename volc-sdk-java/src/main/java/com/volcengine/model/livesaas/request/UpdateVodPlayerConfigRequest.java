package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class UpdateVodPlayerConfigRequest {
    @Data
    public static class VodPlayerConfig {
        @JSONField(name = "VodPlayerConfigId")
        String VodPlayerConfigId;
        @JSONField(name = "IsDefaultVodPlayerConfig")
        Integer IsDefaultVodPlayerConfig;
        @JSONField(name = "BasicConfig")
        BasicConfig BasicConfig;
        @JSONField(name = "ZoomConfig")
        ZoomConfig ZoomConfig;
        @JSONField(name = "SpeedConfig")
        SpeedConfig SpeedConfig;
        @JSONField(name = "TickerConfig")
        TickerConfig TickerConfig;
        @JSONField(name = "WatermarkConfig")
        WatermarkConfig WatermarkConfig;
        @JSONField(name = "LogoConfig")
        LogoConfig LogoConfig;
    }

    @Data
    public static class BasicConfig {
        @JSONField(name = "VodPlayerName")
        String VodPlayerName;
        @JSONField(name = "BtnColor")
        String BtnColor;
    }

    @Data
    public static class ZoomConfig {
        @JSONField(name = "ZoomMode")
        Integer ZoomMode;
    }

    @Data
    public static class SpeedConfig {
        @JSONField(name = "SpeedOption")
        String SpeedOption;
    }

    @Data
    public static class TickerConfig {
        @JSONField(name = "Opacity")
        Integer Opacity;
        @JSONField(name = "TickerSpeed")
        String TickerSpeed;
        @JSONField(name = "IsPlayPageTickerEnable")
        Integer IsPlayPageTickerEnable;
        @JSONField(name = "Content")
        String Content;
        @JSONField(name = "DisplayType")
        Integer DisplayType;
        @JSONField(name = "FontColor")
        String FontColor;
        @JSONField(name = "FontSize")
        Integer FontSize;
    }

    @Data
    public static class WatermarkConfig {
        @JSONField(name = "Angle")
        Integer Angle;
        @JSONField(name = "Content")
        String Content;
        @JSONField(name = "FontColor")
        String FontColor;
        @JSONField(name = "FontSize")
        Integer FontSize;
        @JSONField(name = "Opacity")
        Integer Opacity;
        @JSONField(name = "IsPlayPageWatermarkEnable")
        Integer IsPlayPageWatermarkEnable;
    }

    @Data
    public static class LogoConfig {
        @JSONField(name = "LogoPosition")
        Integer LogoPosition;
        @JSONField(name = "LogoUrl")
        String LogoUrl;
        @JSONField(name = "IsLogoEnable")
        Integer IsLogoEnable;
    }
    @JSONField(name = "VodPlayerConfig")
    VodPlayerConfig VodPlayerConfig;
}