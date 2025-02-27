package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CommentConfig  {
    @JSONField(name = "IsHotListEnable")
    Integer IsHotListEnable;
    @JSONField(name = "HotListName")
    java.lang.String HotListName;
    @JSONField(name = "HotListCount")
    Integer HotListCount;
    @JSONField(name = "VoiceInterval")
    Integer VoiceInterval;
    @JSONField(name = "InputBoxPrompt")
    java.lang.String InputBoxPrompt;
    @JSONField(name = "PresenterName")
    java.lang.String PresenterName;
    @JSONField(name = "IsBulletScreenEnable")
    Integer IsBulletScreenEnable;
    @JSONField(name = "IsCommentTranslateEnable")
    Integer IsCommentTranslateEnable;
    @JSONField(name = "IsManualHotListEnable")
    Integer IsManualHotListEnable;
    @JSONField(name = "IsLikeNumberShowEnable")
    Integer IsLikeNumberShowEnable;
    @JSONField(name = "IsWelcomeMessageEnable")
    Integer IsWelcomeMessageEnable;
    @JSONField(name = "WelcomeMessageTitle")
    java.lang.String WelcomeMessageTitle;
    @JSONField(name = "WelcomeMessageContent")
    java.lang.String WelcomeMessageContent;
    @JSONField(name = "IsAutoSilenceAllEnable")
    Integer IsAutoSilenceAllEnable;
    @JSONField(name = "IsImageCommentEnable")
    Integer IsImageCommentEnable;
    @JSONField(name = "MenuName")
    java.lang.String MenuName;
    @JSONField(name = "IsViewerDeleteCommentsEnable")
    Integer IsViewerDeleteCommentsEnable;
    @JSONField(name = "IsSendCommentEnable")
    Integer IsSendCommentEnable;
    @JSONField(name = "IsViewInPurchaseEnable")
    Integer IsViewInPurchaseEnable;
    @JSONField(name = "IsViewOrderEnable")
    Integer IsViewOrderEnable;
    @JSONField(name = "IsCommentLLMAnalyzeEnable")
    Integer IsCommentLLMAnalyzeEnable;
}