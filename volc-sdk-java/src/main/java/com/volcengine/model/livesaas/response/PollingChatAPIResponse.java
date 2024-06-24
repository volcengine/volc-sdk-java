package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class PollingChatAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    PollingChatAPIResponseBody result;

    @Data
    public static class PollingChatAPIResponseBody {
        @JSONField(name = "Data")
        List<PollingChatAPIData> Data;
    }

    @Data
    public static class PollingChatAPIData {
        @JSONField(name = "IsPresenter")
        Boolean IsPresenter;
        @JSONField(name = "ReviewStatus")
        Integer reviewStatus;
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
        @JSONField(name = "AudienceGroupId")
        Long AudienceGroupId;
    }

    @Data
    public static class PollingChatAPIUser {
        @JSONField(name = "Nickname")
        String Nickname;
        @JSONField(name = "UserId")
        Long UserId;
        @JSONField(name = "Extra")
        String Extra;
        @JSONField(name = "ExternalId")
        String ExternalId;
    }
}