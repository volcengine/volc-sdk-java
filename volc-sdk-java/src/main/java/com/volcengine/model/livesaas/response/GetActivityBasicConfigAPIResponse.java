package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetActivityBasicConfigAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityBasicConfigAPIResultBean result;

    @Data
    public static class GetActivityBasicConfigAPIResultBean {
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "LiveTime")
        Long liveTime;
        @JSONField(name = "IsCoverImageEnable")
        Integer IsCoverImageEnable;
        @JSONField(name = "CoverImageUrl")
        String CoverImageUrl;
        @JSONField(name = "CoverImageUrlDefault")
        String CoverImageUrlDefault;
        @JSONField(name = "IsPcBackImageEnable")
        Integer IsPcBackImageEnable;
        @JSONField(name = "PcBackImageUrl")
        String PcBackImageUrl;
        @JSONField(name = "PcBackImageUrlDefault")
        String PcBackImageUrlDefault;
        @JSONField(name = "IsMobileBackImageEnable")
        Integer IsMobileBackImageEnable;
        @JSONField(name = "MobileBackImageUrl")
        String MobileBackImageUrl;
        @JSONField(name = "MobileBackImageUrlDefault")
        String MobileBackImageUrlDefault;
        @JSONField(name = "IsPreviewVideoEnable")
        Integer IsPreviewVideoEnable;
        @JSONField(name = "PreviewVideoUrl")
        String PreviewVideoUrl;
        @JSONField(name = "PreviewVideoVid")
        String PreviewVideoVid;
        @JSONField(name = "PreviewVideoVidDefault")
        String PreviewVideoVidDefault;
        @JSONField(name = "IsPeopleCountEnable")
        Integer IsPeopleCountEnable;
        @JSONField(name = "IsHeaderImageEnable")
        Integer IsHeaderImageEnable;
        @JSONField(name = "HeaderImageUrl")
        String HeaderImageUrl;
        @JSONField(name = "IsWatermarkImageEnable")
        Integer IsWatermarkImageEnable;
        @JSONField(name = "WatermarkImageUrl")
        String WatermarkImageUrl;
        @JSONField(name = "IsThumbUpEnable")
        Integer IsThumbUpEnable;
        @JSONField(name = "ThumbUpUrl")
        String ThumbUpUrl;
        @JSONField(name = "ThumbUpUrlDefault")
        String ThumbUpUrlDefault;
        @JSONField(name = "IsShareIconEnable")
        Integer IsShareIconEnable;
        @JSONField(name = "ShareIconUrl")
        String ShareIconUrl;
        @JSONField(name = "ShareIconUrlDefault")
        String ShareIconUrlDefault;
        @JSONField(name = "IsCommentTranslateEnable")
        Integer IsCommentTranslateEnable;
        @JSONField(name = "Announcement")
        String Announcement;
        @JSONField(name = "BackgroundColor")
        String BackgroundColor;
        @JSONField(name = "InteractionColor")
        String InteractionColor;
        @JSONField(name = "FontColor")
        String FontColor;
        @JSONField(name = "ColorThemeIndex")
        String ColorThemeIndex;
        @JSONField(name = "IsCountdownEnable")
        Integer IsCountdownEnable;
        @JSONField(name = "IsAutoStartEnable")
        Integer IsAutoStartEnable;
        @JSONField(name = "IsPageLimitEnable")
        Integer IsPageLimitEnable;
        @JSONField(name = "PageLimitType")
        String PageLimitType;
        @JSONField(name = "IsLanguageEnable")
        Integer IsLanguageEnable;
        @JSONField(name = "PlayerTopType")
        List<Long> PlayerTopType;
    }
}