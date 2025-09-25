package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

@Data
public class ListRedPacketRecordAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListRedPacketRecordAPIResponseBody result;

    @Data
    public static class ListRedPacketRecordAPIResponseBody {
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
        @JSONField(name = "TotalCount")
        Integer TotalCount;
        @JSONField(name = "JoinRedPacketList")
        List<JoinRedPacketDataAPI> JoinRedPacketList;
    }

    @Data
    public static class JoinRedPacketDataAPI {
        @JSONField(name = "WechatOpenID")
        String WechatOpenID;
        @JSONField(name = "Extra")
        String Extra;
        @JSONField(name = "Ip")
        String Ip;
        @JSONField(name = "ExternalId")
        String ExternalId;
        @JSONField(name = "UserName")
        String UserName;
        @JSONField(name = "Status")
        Integer Status;
        @JSONField(name = "Amount")
        Long Amount;
        @JSONField(name = "WechatName")
        String WechatName;
        @JSONField(name = "UserAgent")
        String UserAgent;
        @JSONField(name = "UserID")
        Long UserID;
        @JSONField(name = "PhoneNumber")
        String PhoneNumber;
        @JSONField(name = "WithdrawalStatus")
        Integer WithdrawalStatus;
        @JSONField(name = "Email")
        String Email;
        @JSONField(name = "UserTel")
        String UserTel;
        @JSONField(name = "IsPriorityUser")
        Integer IsPriorityUser;
    }
}