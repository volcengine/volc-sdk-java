package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;
import org.checkerframework.checker.units.qual.A;

@Data
public class UpdateViewingRestrictionResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateViewingRestrictionResponseBody result;

    @Data
    public static class UpdateViewingRestrictionResponseBody {
        @JSONField(name="ActivityId")
        Long ActivityId;
        @JSONField(name="ViewingRestriction")
        ViewingRestriction ViewingRestriction;
        @JSONField(name="SubViewingRestriction")
        ViewingRestriction SubViewingRestriction;
    }

    @Data
    public static class ViewingRestriction {
        @JSONField(name="ViewingAccountType")
        Integer ViewingAccountType;
        @JSONField(name="ViewingRestrictionButtonTitle")
        String ViewingRestrictionButtonTitle;
        @JSONField(name="CommentRestriction")
        GetViewingRestrictionInfoResponse.CommentRestriction CommentRestriction;
        @JSONField(name="PasswordViewingRestriction")
        GetViewingRestrictionInfoResponse.PasswordViewingRestriction PasswordViewingRestriction;
        @JSONField(name="WhitelistViewingRestriction")
        GetViewingRestrictionInfoResponse.WhitelistViewingRestriction WhitelistViewingRestriction;
        @JSONField(name="CustomViewingRestriction")
        GetViewingRestrictionInfoResponse.CustomViewingRestriction CustomViewingRestriction;
        @JSONField(name="PhoneViewingRestriction")
        GetViewingRestrictionInfoResponse.PhoneViewingRestriction PhoneViewingRestriction;
    }

//    @Data
//    public static class CommentRestriction {
//        @JSONField(name="IsAllowPublic")
//        Boolean IsAllowPublic;
//        @JSONField(name="IsAllowWechat")
//        Boolean IsAllowWechat;
//        @JSONField(name="IsAllowCustom")
//        Boolean IsAllowCustom;
//    }
//    @Data
//    public static class PasswordViewingRestriction {
//        @JSONField(name="Password")
//        String Password;
//        @JSONField(name="Prompt")
//        String Prompt;
//    }
//    @Data
//    public static class WhitelistViewingRestriction {
//        @JSONField(name="WelcomeTitle")
//        String WelcomeTitle;
//        @JSONField(name="InputPrompt")
//        String InputPrompt;
//        @JSONField(name="EnableTrial")
//        Boolean EnableTrial;
//        @JSONField(name="TrialTime")
//        Integer TrialTime;
//    }
//    @Data
//    public static class CustomViewingRestriction {
//        @JSONField(name="CustomApp")
//        String CustomApp;
//        @JSONField(name="CustomUrl")
//        String CustomUrl;
//        @JSONField(name="ErrorRedirectUrl")
//        String ErrorRedirectUrl;
//        @JSONField(name="SecretKey")
//        String SecretKey;
//    }
//    @Data
//    public static class PhoneViewingRestriction {
//        @JSONField(name="Prompt")
//        String prompt;
//        @JSONField(name="EnableTrial")
//        Boolean EnableTrial;
//        @JSONField(name="TrialTime")
//        Integer TrialTime;
//        @JSONField(name="EnableSMS")
//        Boolean EnableSMS;
//        @JSONField(name="IsPhoneListMode")
//        Boolean IsPhoneListMode;
//    }
}
