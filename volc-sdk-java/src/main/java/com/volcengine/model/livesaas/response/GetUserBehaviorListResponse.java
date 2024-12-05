package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetUserBehaviorListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetUserBehaviorListResponseBodyV2 result;

    @Data
    public static class GetUserBehaviorListResponseBodyV2 {
        @JSONField(name = "TotalItemCount")
        Long TotalItemCount;
        @JSONField(name = "Data")
        List<UserBehaviorV2> Data;
        @JSONField(name = "ScrollId")
        String ScrollId;
    }

    @Data
    public static class UserBehaviorV2 {
        @JSONField(name = "InviteCode")
        String InviteCode;
        @JSONField(name = "UserDevice")
        List<String> UserDevice;
        @JSONField(name = "ExternalUserId")
        String ExternalUserId;
        @JSONField(name = "Department")
        String Department;
        @JSONField(name = "IP")
        String IP;
        @JSONField(name = "JoinAt")
        List<Long> JoinAt;
        @JSONField(name = "AccessTimeArr")
        List<String> AccessTimeArr;
        @JSONField(name = "UserName")
        String UserName;
        @JSONField(name = "UserTel")
        String UserTel;
        @JSONField(name = "WatchTime")
        Long WatchTime;
        @JSONField(name = "Extra")
        String Extra;
        @JSONField(name = "Region")
        String Region;
        @JSONField(name = "LeaveAt")
        List<Long> leaveAt;
        @JSONField(name = "UserId")
        Long UserId;
        @JSONField(name = "AccessTime")
        String AccessTime;
        @JSONField(name = "SilenceStatus")
        Integer SilenceStatus;
        @JSONField(name = "ThumbUpNumber")
        Long ThumbUpNumber;
    }
}