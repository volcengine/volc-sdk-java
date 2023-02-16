package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

@Data
public class GetUserBehaviorListResponseAPIV2 {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetUserBehaviorListResponseBodyAPIV2 result;

    @Data
    public static class GetUserBehaviorListResponseBodyAPIV2 {
        @JSONField(name = "Data")
        List<UserBehaviorV2> Data;
        @JSONField(name = "TotalItemCount")
        Long TotalItemCount;
    }

    @Data
    public static class UserBehaviorV2 {
        @JSONField(name = "Region")
        String Region;
        @JSONField(name = "UserTel")
        String UserTel;
        @JSONField(name = "InviteCode")
        String InviteCode;
        @JSONField(name = "IP")
        String IP;
        @JSONField(name = "JoinAt")
        List<Long> JoinAt;
        @JSONField(name = "WatchTime")
        Long WatchTime;
        @JSONField(name = "Extra")
        String Extra;
        @JSONField(name = "AccessTime")
        String AccessTime;
        @JSONField(name = "UserDevice")
        List<String> UserDevice;
        @JSONField(name = "ExternalUserId")
        String ExternalUserId;
        @JSONField(name = "UserName")
        String UserName;
        @JSONField(name = "Department")
        String Department;
        @JSONField(name = "LeaveAt")
        List<Long> leaveAt;
        @JSONField(name = "UserId")
        Long UserId;
        @JSONField(name = "SilenceStatus")
        Integer SilenceStatus;
    }
}