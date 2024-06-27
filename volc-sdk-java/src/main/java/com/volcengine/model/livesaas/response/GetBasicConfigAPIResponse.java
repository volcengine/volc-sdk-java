package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;


import java.util.List;

@Data
public class GetBasicConfigAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    BasicConfig result;

    @Data
    public static class BasicConfig {
        @JSONField(name = "IsCoverImageEnable")
        Integer IsCoverImageEnable;
        @JSONField(name = "IsPcBackImageEnable")
        Integer IsPcBackImageEnable;
        @JSONField(name = "PreviewVideoVid")
        String PreviewVideoVid;
        @JSONField(name = "ShareIconUrl")
        String ShareIconUrl;
        @JSONField(name = "IsCommentTranslateEnable")
        Integer IsCommentTranslateEnable;
        @JSONField(name = "FontColor")
        String FontColor;
        @JSONField(name = "CoverImageUrl")
        String CoverImageUrl;
        @JSONField(name = "MobileBackImageUrl")
        String MobileBackImageUrl;
        @JSONField(name = "IsPreviewVideoEnable")
        Integer IsPreviewVideoEnable;
        @JSONField(name = "IsHeaderImageEnable")
        Integer IsHeaderImageEnable;
        @JSONField(name = "PCHeaderImageUrl")
        String PCHeaderImageUrl;
        @JSONField(name = "IsMobileBackImageEnable")
        Integer IsMobileBackImageEnable;
        @JSONField(name = "IsPeopleCountEnable")
        Integer IsPeopleCountEnable;
        @JSONField(name = "HeaderImageUrl")
        String HeaderImageUrl;
        @JSONField(name = "IsThumbUpEnable")
        Integer IsThumbUpEnable;
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "LiveTime")
        Long LiveTime;
        @JSONField(name = "ColorThemeIndex")
        String ColorThemeIndex;
        @JSONField(name = "IsCountdownEnable")
        Integer IsCountdownEnable;
        @JSONField(name = "IsAutoStartEnable")
        Integer IsAutoStartEnable;
        @JSONField(name = "IsReservationSmsEnable")
        Integer IsReservationSmsEnable;
        @JSONField(name = "AutoReservationWindowEnable")
        Integer AutoReservationWindowEnable;
        @JSONField(name = "TextSiteTags")
        List<SiteActivityTag> TextSiteTags;
        @JSONField(name = "Announcement")
        String Announcement;
        @JSONField(name = "PlayerTopType")
        List<Long> PlayerTopType;
        @JSONField(name = "IsShareIconEnable")
        Integer IsShareIconEnable;
        @JSONField(name = "InteractionColor")
        String InteractionColor;
        @JSONField(name = "IsPCHeaderImageEnable")
        Integer IsPCHeaderImageEnable;
        @JSONField(name = "PageLimitType")
        String PageLimitType;
        @JSONField(name = "IsLanguageEnable")
        Integer IsLanguageEnable;
        @JSONField(name = "IsWatermarkImageEnable")
        Integer IsWatermarkImageEnable;
        @JSONField(name = "WatermarkImageUrl")
        String WatermarkImageUrl;
        @JSONField(name = "SiteTags")
        List<SiteActivityTag> SiteTags;
        @JSONField(name = "Name")
        String Name;
        @JSONField(name = "PcBackImageUrl")
        String PcBackImageUrl;
        @JSONField(name = "ThumbUpUrl")
        String ThumbUpUrl;
        @JSONField(name = "BackgroundColor")
        String BackgroundColor;
        @JSONField(name = "IsPageLimitEnable")
        Integer IsPageLimitEnable;
        @JSONField(name = "IsReplayAutoOnlineEnable")
        Integer IsReplayAutoOnlineEnable;
        @JSONField(name = "LiveZone")
        Integer LiveZone;
        @JSONField(name = "IsColorSync")
        Integer IsColorSync;
        @JSONField(name = "IsPlayerTopEnable")
        Integer IsPlayerTopEnable;
        @JSONField(name = "PreviewVideoId")
        Long PreviewVideoId;
        @JSONField(name = "MobileChatBackgroundColor")
        String MobileChatBackgroundColor;
        @JSONField(name = "LanguageType")
        List<Integer> LanguageType;
        @JSONField(name = "PresenterChatColor")
        String PresenterChatColor;
        @JSONField(name = "MobileBackgroundColor")
        String MobileBackgroundColor;
        @JSONField(name = "IsTimeShift")
        Integer IsTimeShift;
        @JSONField(name = "IsPreviewPromptEnable")
        Integer IsPreviewPromptEnable;
        @JSONField(name = "PreviewPrompt")
        String PreviewPrompt;
        @JSONField(name = "IsReservationEnable")
        Integer IsReservationEnable;
        @JSONField(name = "SmsLanguage")
        Integer SmsLanguage;
        @JSONField(name = "PreviewVideoMediaName")
        String PreviewVideoMediaName;
        @JSONField(name = "AutoStartType")
        Integer AutoStartType;
        @JSONField(name = "IsBackgroundBlur")
        Integer IsBackgroundBlur;
        @JSONField(name = "PreviewVideoCoverImage")
        String PreviewVideoCoverImage;
        @JSONField(name = "IsThumbUpNumberEnable")
        Integer IsThumbUpNumberEnable;
        @JSONField(name = "WatermarkPosition")
        Integer WatermarkPosition;
        @JSONField(name = "ReservationTime")
        Long ReservationTime;
        @JSONField(name = "IsAnnouncementEnable")
        Integer IsAnnouncementEnable;
        @JSONField(name = "RiskWarningSetting")
        RiskWarningSetting RiskWarningSetting;
        @JSONField(name = "PcBackImageUrlDefault")
        String PcBackImageUrlDefault;
        @JSONField(name = "MobileBackImageUrlDefault")
        String MobileBackImageUrlDefault;
        @JSONField(name = "ThumbUpUrlDefault")
        String ThumbUpUrlDefault;
        @JSONField(name = "CoverImageUrlDefault")
        String CoverImageUrlDefault;
        @JSONField(name = "ShareIconUrlDefault")
        String ShareIconUrlDefault;
        @JSONField(name = "ConfigVersion")
        Integer ConfigVersion;
        @JSONField(name = "VerticalCoverImageUrl")
        String VerticalCoverImageUrl;
        @JSONField(name = "MobileLoginBackgroundImageUrl")
        String MobileLoginBackgroundImageUrl;
        @JSONField(name = "PcLoginBackgroundImageUrl")
        String PcLoginBackgroundImageUrl;
         @JSONField(name = "ThumbUpEffectUrls")
        List<String> ThumbUpEffectUrls;
        @JSONField(name = "UseDefaultThumbUpEffect")
        Integer UseDefaultThumbUpEffect;
        @JSONField(name = "EndTime")
        Long EndTime;
        @JSONField(name = "IsAutoEndEnable")
        Integer IsAutoEndEnable;
    }

    @Data
    public static class SiteActivityTag {
        @JSONField(name = "Index")
        Integer Index;
        @JSONField(name = "Value")
        String Value;
    }

    @Data
    public static class RiskWarningSetting {
        @JSONField(name = "IsRiskWarningEnable")
        Integer IsRiskWarningEnable;
        @JSONField(name = "RiskWarningTitle")
        String RiskWarningTitle;
        @JSONField(name = "RiskWarningContent")
        String RiskWarningContent;
        @JSONField(name = "RiskWarningButtonText")
        String RiskWarningButtonText;
    }
}