package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.SiteActivityTag;
import lombok.Data;

import java.util.List;

@Data
public class UpdateBasicConfigAPIRequest {
    @JSONField(name = "BackgroundColor")
    String BackgroundColor;
    @JSONField(name = "IsPageLimitEnable")
    Integer IsPageLimitEnable;
    @JSONField(name = "IsReplayAutoOnlineEnable")
    Integer IsReplayAutoOnlineEnable;
    @JSONField(name = "Name")
    String Name;
    @JSONField(name = "PcBackImageUrl")
    String PcBackImageUrl;
    @JSONField(name = "ThumbUpUrl")
    String ThumbUpUrl;
    @JSONField(name = "ShareIconUrl")
    String ShareIconUrl;
    @JSONField(name = "IsCommentTranslateEnable")
    Integer IsCommentTranslateEnable;
    @JSONField(name = "FontColor")
    String FontColor;
    @JSONField(name = "IsCoverImageEnable")
    Integer IsCoverImageEnable;
    @JSONField(name = "IsPcBackImageEnable")
    Integer IsPcBackImageEnable;
    @JSONField(name = "PreviewVideoVid")
    String PreviewVideoVid;
    @JSONField(name = "IsHeaderImageEnable")
    Integer IsHeaderImageEnable;
    @JSONField(name = "PCHeaderImageUrl")
    String PCHeaderImageUrl;
    @JSONField(name = "CoverImageUrl")
    String CoverImageUrl;
    @JSONField(name = "MobileBackImageUrl")
    String MobileBackImageUrl;
    @JSONField(name = "IsPreviewVideoEnable")
    Integer IsPreviewVideoEnable;
    @JSONField(name = "IsThumbUpEnable")
    Integer IsThumbUpEnable;
    @JSONField(name = "IsMobileBackImageEnable")
    Integer IsMobileBackImageEnable;
    @JSONField(name = "IsPeopleCountEnable")
    Integer IsPeopleCountEnable;
    @JSONField(name = "HeaderImageUrl")
    String HeaderImageUrl;
    @JSONField(name = "IsCountdownEnable")
    Integer IsCountdownEnable;
    @JSONField(name = "IsAutoStartEnable")
    Integer IsAutoStartEnable;
    @JSONField(name = "TextSiteTags")
    List<SiteActivityTag> TextSiteTags;
    @JSONField(name = "IsReservationSmsEnable")
    Integer IsReservationSmsEnable;
    @JSONField(name = "AutoReservationWindowEnable")
    Integer AutoReservationWindowEnable;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "LiveTime")
    Long LiveTime;
    @JSONField(name = "ColorThemeIndex")
    String ColorThemeIndex;
    @JSONField(name = "Announcement")
    String Announcement;
    @JSONField(name = "PlayerTopType")
    List<Long> PlayerTopType;
    @JSONField(name = "PageLimitType")
    String PageLimitType;
    @JSONField(name = "IsLanguageEnable")
    Integer IsLanguageEnable;
    @JSONField(name = "IsShareIconEnable")
    Integer IsShareIconEnable;
    @JSONField(name = "InteractionColor")
    String InteractionColor;
    @JSONField(name = "IsPCHeaderImageEnable")
    Integer IsPCHeaderImageEnable;
    @JSONField(name = "IsWatermarkImageEnable")
    Integer IsWatermarkImageEnable;
    @JSONField(name = "WatermarkImageUrl")
    String WatermarkImageUrl;
    @JSONField(name = "SiteTags")
    List<SiteActivityTag> SiteTags;
    @JSONField(name = "PcBackImageUrlDefault")
    String PcBackImageUrlDefault;
    @JSONField(name = "IsAnnouncementEnable")
    Integer IsAnnouncementEnable;
    @JSONField(name = "AutoStartType")
    Integer AutoStartType;
    @JSONField(name = "IsColorSync")
    Integer IsColorSync;
    @JSONField(name = "ShareIconUrlDefault")
    String ShareIconUrlDefault;
    @JSONField(name = "LanguageType")
    List<Integer> LanguageType;
    @JSONField(name = "PreviewVideoId")
    Long PreviewVideoId;
    @JSONField(name = "IsTimeShift")
    Integer IsTimeShift;
    @JSONField(name = "PreviewVideoMediaName")
    String PreviewVideoMediaName;
    @JSONField(name = "IsBackgroundBlur")
    Integer IsBackgroundBlur;
    @JSONField(name = "LiveZone")
    Integer LiveZone;
    @JSONField(name = "ReservationTime")
    Long ReservationTime;
    @JSONField(name = "SmsLanguage")
    Integer SmsLanguage;
    @JSONField(name = "MobileBackgroundColor")
    String MobileBackgroundColor;
    @JSONField(name = "ThumbUpUrlDefault")
    String ThumbUpUrlDefault;
    @JSONField(name = "IsPlayerTopEnable")
    Integer IsPlayerTopEnable;
    @JSONField(name = "IsPreviewPromptEnable")
    Integer IsPreviewPromptEnable;
    @JSONField(name = "IsReservationEnable")
    Integer IsReservationEnable;
    @JSONField(name = "MobileChatBackgroundColor")
    String MobileChatBackgroundColor;
    @JSONField(name = "ConfigVersion")
    Integer ConfigVersion;
    @JSONField(name = "WatermarkPosition")
    Integer WatermarkPosition;
    @JSONField(name = "PresenterChatColor")
    String PresenterChatColor;
    @JSONField(name = "IsThumbUpNumberEnable")
    Integer IsThumbUpNumberEnable;
    @JSONField(name = "PreviewPrompt")
    String PreviewPrompt;
    @JSONField(name = "MobileBackImageUrlDefault")
    String MobileBackImageUrlDefault;
    @JSONField(name = "PreviewVideoCoverImage")
    String PreviewVideoCoverImage;
    @JSONField(name = "RiskWarningSetting")
    RiskWarningSetting RiskWarningSetting;
    @JSONField(name = "VerticalCoverImageUrl")
    String VerticalCoverImageUrl;
    @JSONField(name = "PcLoginBackgroundImageUrl")
    String PcLoginBackgroundImageUrl;
    @JSONField(name = "MobileLoginBackgroundImageUrl")
    String MobileLoginBackgroundImageUrl;
    @JSONField(name = "ThumbUpEffectUrls")
    List<String> ThumbUpEffectUrls;
    @JSONField(name = "UseDefaultThumbUpEffect")
    Integer UseDefaultThumbUpEffect;
    @JSONField(name = "EndTime")
    Long EndTime;
    @JSONField(name = "IsAutoEndEnable")
    Integer IsAutoEndEnable;
    @JSONField(name = "IsAvatarShowEnable")
    Integer IsAvatarShowEnable;
    @JSONField(name = "IsViewerLevelShowEnable")
    Integer IsViewerLevelShowEnable;
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