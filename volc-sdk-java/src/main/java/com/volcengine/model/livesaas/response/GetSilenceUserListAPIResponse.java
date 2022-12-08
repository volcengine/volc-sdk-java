package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class GetSilenceUserListAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetSilenceUserListAPIResponseBody result;

    @Data
    public static class GetSilenceUserListAPIResponseBody {
        @JSONField(name = "UserList")
        List<PollingChatAPIUser> UserList;
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