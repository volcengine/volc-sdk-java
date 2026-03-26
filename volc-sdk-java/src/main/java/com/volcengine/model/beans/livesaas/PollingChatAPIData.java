package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class PollingChatAPIData {
    @JSONField(name = "ChatId")
    Long ChatId;
    @JSONField(name = "CreateTime")
    Long CreateTime;
    @JSONField(name = "TextContent")
    String TextContent;
    @JSONField(name = "User")
    PollingChatAPIUser User;
    @JSONField(name = "IsDelete")
    Boolean IsDelete;
    @JSONField(name = "LikeCount")
    Integer LikeCount;
    @JSONField(name = "IsPresenter")
    Boolean IsPresenter;
    @JSONField(name = "ReviewStatus")
    Integer ReviewStatus;
    @JSONField(name = "IsTipOff")
    Integer IsTipOff;
    @JSONField(name = "AudienceGroupId")
    Long AudienceGroupId;
    @JSONField(name = "LLMAnalyzeResult")
    String LLMAnalyzeResult;
}
