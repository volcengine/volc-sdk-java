package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;


@Data
public class ListActivityUsersResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListActivityUsersResponse.ListActivityUsersResponseBody result;

    @Data
    public static class ListActivityUsersResponseBody {
        @JSONField(name = "PageNumber")
        Integer PageNumber;
        @JSONField(name = "PageSize")
        Integer PageSize;
        @JSONField(name = "TotalCount")
        Integer TotalCount;
        @JSONField(name = "OnlineUserCount")
        Integer OnlineUserCount;
        @JSONField(name = "TotalUserCount")
        Integer TotalUserCount;
        @JSONField(name = "UserMsgs")
        List<UserMessage> UserMsgs;
    }
    @Data
    public static class UserMessage {
        @JSONField(name = "UserId")
        Long UserId;
        @JSONField(name = "UserName")
        String UserName;
        @JSONField(name = "SilenceStatus")
        Integer SilenceStatus;
        @JSONField(name = "OnlineStatus")
        Integer OnlineStatus;
        @JSONField(name = "IsPresenter")
        Integer IsPresenter;
        @JSONField(name = "UserCookie")
        Long UserCookie;
        @JSONField(name = "ExternalUserId")
        String ExternalUserId;
        @JSONField(name = "IsBannedUser")
        Integer IsBannedUser;
        @JSONField(name = "IsBannedIP")
        Integer IsBannedIP;
        @JSONField(name = "IP")
        String IP;
        @JSONField(name = "ShiftScreenNumber")
        Integer ShiftScreenNumber;
        @JSONField(name = "MuteNumber")
        Integer MuteNumber;
        @JSONField(name = "NoInteractNumber")
        Integer NoInteractNumber;
        @JSONField(name = "UserCredit")
        Integer UserCredit;;
        @JSONField(name = "AudienceGroupId")
        Long AudienceGroupId;
    }
}

