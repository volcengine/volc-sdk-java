package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetActivityLinksResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityLinksResponse.GetActivityLinksBody result;

    @Data
    public static class GetActivityLinksBody {
        @JSONField(name = "WebPushHostLink")
        GetActivityLinksResponse.WebPushHostLink WebPushHostLink;
        @JSONField(name = "LiveClientLink")
        GetActivityLinksResponse.LiveClientLink LiveClientLink;
        @JSONField(name = "TeachAssistantLoginLinks")
        List<GetActivityLinksResponse.TeachAssistantLoginLink> TeachAssistantLoginLinks;
        @JSONField(name = "WebPushGuestLoginLink")
        GetActivityLinksResponse.WebPushGuestLoginLink WebPushGuestLoginLink;
        @JSONField(name = "AudienceLink")
        GetActivityLinksResponse.AudienceLink AudienceLink;
    }

    @Data
    public static class WebPushHostLink {
        @JSONField(name = "Url")
        String Url;
        @JSONField(name="TmpUrl")
        String TmpUrl;
        @JSONField(name="ExpireTime")
        Long ExpireTime;
    }

    @Data
    public static class LiveClientLink {
        @JSONField(name = "Url")
        String Url;
        @JSONField(name="TmpUrl")
        String TmpUrl;
        @JSONField(name="ExpireTime")
        Long ExpireTime;
    }

    @Data
    public static class TeachAssistantLoginLink {
        @JSONField(name = "LoginUrl")
        String LoginUrl;

        @JSONField(name = "Password")
        String Password;
    }

    @Data
    public static class WebPushGuestLoginLink {
        @JSONField(name = "LoginUrl")
        String LoginUrl;

        @JSONField(name = "LinkKey")
        String LinkKey;

        @JSONField(name = "EnableKey")
        Integer EnableKey;
    }

    @Data
    public static class AudienceLink {
        @JSONField(name = "LandscapeModeUrl")
        String LandscapeModeUrl;

        @JSONField(name = "PortraitModeUrl")
        String PortraitModeUrl;
    }

}
