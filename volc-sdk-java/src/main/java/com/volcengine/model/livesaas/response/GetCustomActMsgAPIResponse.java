package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetCustomActMsgAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetCustomActMsgAPIResponseBody result;

    @Data
    public static class GetCustomActMsgAPIResponseBody {
        @JSONField(name = "ActMsg")
        ActMsgAPI ActMsg;
        @JSONField(name = "ActBasicMsg")
        ActBasicConfigAPI ActBasicMsg;
        @JSONField(name = "ActStreamMsg")
        ActStreamMsgAPI ActStreamMsg;
        @JSONField(name = "RealTimeOnlineNumber")
        RealTimeOnlineNumberAPI RealTimeOnlineNumber;
    }

    @Data
    public static class ActMsgAPI {
        @JSONField(name = "Id")
        Long Id;
        @JSONField(name = "Name")
        String Name;
        @JSONField(name = "LiveTime")
        Long LiveTime;
        @JSONField(name = "CoverImage")
        String CoverImage;
        @JSONField(name = "Status")
        Integer Status;
        @JSONField(name = "ViewUrl")
        String ViewUrl;
        @JSONField(name = "IsLockPreview")
        Integer IsLockPreview;
        @JSONField(name = "OwnerSubAccount")
        String OwnerSubAccount;
    }

    @Data
    public static class ActBasicConfigAPI {
        @JSONField(name = "PcBackImageUrl")
        String PcBackImageUrl;
        @JSONField(name = "BackgroundColor")
        String BackgroundColor;
        @JSONField(name = "IsPCHeaderImageEnable")
        Integer IsPCHeaderImageEnable;
        @JSONField(name = "IsLanguageEnable")
        Integer IsLanguageEnable;
        @JSONField(name = "IsCoverImageEnable")
        Integer IsCoverImageEnable;
        @JSONField(name = "CoverImageUrl")
        String CoverImageUrl;
        @JSONField(name = "IsMobileBackImageEnable")
        Integer IsMobileBackImageEnable;
        @JSONField(name = "HeaderImageUrl")
        String HeaderImageUrl;
        @JSONField(name = "IsWatermarkImageEnable")
        Integer IsWatermarkImageEnable;
        @JSONField(name = "IsShareIconEnable")
        Integer IsShareIconEnable;
        @JSONField(name = "PreviewVideoVid")
        String PreviewVideoVid;
        @JSONField(name = "IsPeopleCountEnable")
        Integer IsPeopleCountEnable;
        @JSONField(name = "ThumbUpUrl")
        String ThumbUpUrl;
        @JSONField(name = "Announcement")
        String Announcement;
        @JSONField(name = "PageLimitType")
        String PageLimitType;
        @JSONField(name = "Name")
        String Name;
        @JSONField(name = "LiveTime")
        Long LiveTime;
        @JSONField(name = "MobileBackImageUrl")
        String MobileBackImageUrl;
        @JSONField(name = "IsHeaderImageEnable")
        Integer IsHeaderImageEnable;
        @JSONField(name = "WatermarkImageUrl")
        String WatermarkImageUrl;
        @JSONField(name = "IsCommentTranslateEnable")
        Integer IsCommentTranslateEnable;
        @JSONField(name = "ColorThemeIndex")
        String ColorThemeIndex;
        @JSONField(name = "IsPreviewVideoEnable")
        Integer IsPreviewVideoEnable;
        @JSONField(name = "PCHeaderImageUrl")
        String PCHeaderImageUrl;
        @JSONField(name = "PlayerTopType")
        List<Long> PlayerTopType;
        @JSONField(name = "SiteTags")
        List<ActTagAPI> SiteTags;
        @JSONField(name = "TextSiteTags")
        List<TextActTagAPI> TextSiteTags;
        @JSONField(name = "IsThumbUpEnable")
        Integer IsThumbUpEnable;
        @JSONField(name = "IsPageLimitEnable")
        Integer IsPageLimitEnable;
        @JSONField(name = "IsReplayAutoOnlineEnable")
        Integer IsReplayAutoOnlineEnable;
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "FontColor")
        String FontColor;
        @JSONField(name = "IsAutoStartEnable")
        Integer IsAutoStartEnable;
        @JSONField(name = "IsPcBackImageEnable")
        Integer IsPcBackImageEnable;
        @JSONField(name = "ShareIconUrl")
        String ShareIconUrl;
        @JSONField(name = "InteractionColor")
        String InteractionColor;
        @JSONField(name = "IsCountDownEnable")
        Integer IsCountDownEnable;
    }

    @Data
    public static class ActStreamMsgAPI {
        @JSONField(name = "LineDetails")
        List<LineDetailsAPI> LineDetails;
    }

    @Data
    public static class RealTimeOnlineNumberAPI {
        @JSONField(name = "RealPopularity")
        Long RealPopularity;
        @JSONField(name = "FakePopularity")
        Long FakePopularity;
    }

    @Data
    public static class ActTagAPI {
        @JSONField(name = "Value")
        String Value;
        @JSONField(name = "Index")
        Integer Index;
        @JSONField(name = "Name")
        String Name;
    }

    @Data
    public static class TextActTagAPI {
        @JSONField(name = "Value")
        String Value;
        @JSONField(name = "Index")
        Integer Index;
        @JSONField(name = "Name")
        String Name;
    }

    @Data
    public static class LineDetailsAPI {
        @JSONField(name = "LineId")
        Long LineId;
        @JSONField(name = "LineName")
        String LineName;
        @JSONField(name = "MainPushInfo")
        List<PushInfoAPI> MainPushInfo;
        @JSONField(name = "BackPushInfo")
        List<PushInfoAPI> BackPushInfo;
        @JSONField(name = "ForwardInfo")
        List<ForwardInfoAPI> ForwardInfo;
        @JSONField(name = "BackupForwardInfo")
        List<ForwardInfoAPI> BackupForwardInfo;
        @JSONField(name = "ExpireTime")
        Long ExpireTime;
    }

    @Data
    public static class PushInfoAPI {
        @JSONField(name = "PushPath")
        String PushPath;
        @JSONField(name = "PushUrl")
        String PushUrl;
        @JSONField(name = "StreamingCode")
        String StreamingCode;
    }

    @Data
    public static class ForwardInfoAPI {
        @JSONField(name = "PullStreamStatus")
        String PullStreamStatus;
        @JSONField(name = "PullStreamCheckStatus")
        String PullStreamCheckStatus;
        @JSONField(name = "PullStreamUrl")
        String PullStreamUrl;
    }
}