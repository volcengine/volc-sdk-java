package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class UpdateActivityBasicConfigAPIRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "Name")
    String name;
    @JSONField(name = "LiveTime")
    Long liveTime;
    @JSONField(name = "IsCoverImageEnable")
    Integer IsCoverImageEnable;
    @JSONField(name = "CoverImageUrl")
    String CoverImageUrl;
    @JSONField(name = "IsPcBackImageEnable")
    Integer IsPcBackImageEnable;
    @JSONField(name = "PcBackImageUrl")
    String PcBackImageUrl;
    @JSONField(name = "IsMobileBackImageEnable")
    Integer IsMobileBackImageEnable;
    @JSONField(name = "MobileBackImageUrl")
    String MobileBackImageUrl;
    @JSONField(name = "IsPreviewVideoEnable")
    Integer IsPreviewVideoEnable;
    @JSONField(name = "PreviewVideoVid")
    String PreviewVideoVid;
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
    @JSONField(name = "IsShareIconEnable")
    Integer IsShareIconEnable;
    @JSONField(name = "ShareIconUrl")
    String ShareIconUrl;
    @JSONField(name = "IsCommentTranslateEnable")
    Integer IsCommentTranslateEnable;
    @JSONField(name = "Announcement")
    String Announcement;
    @JSONField(name = "BackgroundColor")
    String BackgroundColor;
    @JSONField(name = "FontColor")
    String FontColor;
    @JSONField(name = "InteractionColor")
    String InteractionColor;
    @JSONField(name = "ColorThemeIndex")
    String ColorThemeIndex;
    @JSONField(name = "IsCountdownEnable")
    Integer IsCountdownEnable;
    @JSONField(name = "IsAutoStartEnable")
    Integer IsAutoStartEnable;
    @JSONField(name = "IsPCHeaderImageEnable")
    Integer IsPCHeaderImageEnable;
    @JSONField(name = "PCHeaderImageUrl")
    String PCHeaderImageUrl;
    @JSONField(name = "IsPageLimitEnable")
    Integer IsPageLimitEnable;
    @JSONField(name = "PageLimitType")
    String PageLimitType;
    @JSONField(name = "IsLanguageEnable")
    Integer IsLanguageEnable;
    @JSONField(name = "PlayerTopType")
    List<Long> PlayerTopType;
}
