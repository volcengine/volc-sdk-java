package com.volcengine.model.livesaas.request;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateActivityPosterRequest {
    @JSONField(name = "PosterConfig")
    UpdateActivityPosterRequest.PosterConfig PosterConfig;

    @Data
    public static class PosterConfig {
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "CoverImage")
        String CoverImage;
        @JSONField(name = "Title")
        String Title;
        @JSONField(name = "ActivityDesc")
        String ActivityDesc;
        @JSONField(name = "CustomTitle")
        String CustomTitle;
        @JSONField(name = "CustomDesc")
        String CustomDesc;
        @JSONField(name = "CustomImage")
        String CustomImage;
        @JSONField(name = "IsForceLogin")
        Integer IsForceLogin;
        @JSONField(name = "CanShare")
        Integer CanShare;
        @JSONField(name = "CanInvite")
        Integer CanInvite;
        @JSONField(name = "Sponsor")
        String Sponsor;
        @JSONField(name = "ActivityAddress")
        String ActivityAddress;
        @JSONField(name = "LiveType")
        Integer LiveType;
        @JSONField(name = "CustomAddress")
        String CustomAddress;
        @JSONField(name = "InviteListEnable")
        Integer InviteListEnable;
        @JSONField(name = "InviteContent")
        String InviteContent;
        @JSONField(name = "InviteShowPeople")
        Integer InviteShowPeople;
    }
}
