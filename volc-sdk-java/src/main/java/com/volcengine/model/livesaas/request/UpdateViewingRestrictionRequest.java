package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.livesaas.response.GetViewingRestrictionInfoResponse;
import lombok.Data;

@Data
public class UpdateViewingRestrictionRequest {
    @JSONField(name="ActivityId")
    Long ActivityId;
    @JSONField(name="IsSubViewingRestrictionEnable")
    Boolean IsSubViewingRestrictionEnable;
    @JSONField(name="ViewingRestriction")
    ViewingRestriction ViewingRestriction;
    @JSONField(name="SubViewingRestriction")
    ViewingRestriction SubViewingRestriction;

    @Data
    public static class ViewingRestriction {
        @JSONField(name="ViewingAccountType")
        Integer ViewingAccountType;
        @JSONField(name="ViewingRestrictionButtonTitle")
        String ViewingRestrictionButtonTitle;
        @JSONField(name="CommentRestriction")
        CommentRestriction CommentRestriction;
        @JSONField(name="PasswordViewingRestriction")
        PasswordViewingRestriction PasswordViewingRestriction;
        @JSONField(name="WhiteListViewingRestriction")
        WhiteListViewingRestriction WhiteListViewingRestriction;
        @JSONField(name="CustomViewingRestriction")
        CustomViewingRestriction CustomViewingRestriction;
        @JSONField(name="PhoneViewingRestriction")
        PhoneViewingRestriction PhoneViewingRestriction;
    }

    @Data
    public static class CommentRestriction {
        @JSONField(name="IsAllowPublic")
        Boolean IsAllowPublic;
        @JSONField(name="IsAllowWechat")
        Boolean IsAllowWechat;
        @JSONField(name="IsAllowCustom")
        Boolean IsAllowCustom;
    }
    @Data
    public static class PasswordViewingRestriction {
        @JSONField(name="Password")
        String Password;
        @JSONField(name="Prompt")
        String Prompt;
    }
    @Data
    public static class WhiteListViewingRestriction {
        @JSONField(name="WelcomeTitle")
        String WelcomeTitle;
        @JSONField(name="InputPrompt")
        String InputPrompt;
        @JSONField(name="EnableTrial")
        Boolean EnableTrial;
        @JSONField(name="TrialTime")
        Integer TrialTime;
    }
    @Data
    public static class CustomViewingRestriction {
        @JSONField(name="CustomApp")
        String CustomApp;
        @JSONField(name="CustomUrl")
        String CustomUrl;
        @JSONField(name="ErrorRedirectUrl")
        String ErrorRedirectUrl;
    }
    @Data
    public static class PhoneViewingRestriction {
        @JSONField(name="Prompt")
        String prompt;
        @JSONField(name="EnableTrial")
        Boolean EnableTrial;
        @JSONField(name="TrialTime")
        Integer TrialTime;
        @JSONField(name="EnableSMS")
        Boolean EnableSMS;
        @JSONField(name="IsPhoneListMode")
        Boolean IsPhoneListMode;
    }
}
