package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

@Data
public class GetAwardRecordStatisticsAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetAwardRecordStatisticsAPIResponseBody result;

    @Data
    public static class GetAwardRecordStatisticsAPIResponseBody {
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
        @JSONField(name = "PageTotalCount")
        Integer PageTotalCount;
        @JSONField(name = "AwardStatisticsList")
        List<AwardStatisticAPI> AwardStatisticsList;
    }

    @Data
    public static class AwardStatisticAPI {
        @JSONField(name = "Ip")
        String Ip;
        @JSONField(name = "UserID")
        String UserID;
        @JSONField(name = "LoginTel")
        String LoginTel;
        @JSONField(name = "ExternalId")
        String ExternalId;
        @JSONField(name = "Extra")
        String Extra;
        @JSONField(name = "UserAgent")
        String UserAgent;
        @JSONField(name = "AwardID")
        Long AwardID;
        @JSONField(name = "AwardAddress")
        String AwardAddress;
        @JSONField(name = "NotifyResult")
        Byte NotifyResult;
        @JSONField(name = "OpenAwardTime")
        Long OpenAwardTime;
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "AwardResult")
        Long AwardResult;
        @JSONField(name = "AwardName")
        String AwardName;
        @JSONField(name = "Email")
        String Email;
        @JSONField(name = "UserName")
        String UserName;
        @JSONField(name = "ReceiverName")
        String ReceiverName;
        @JSONField(name = "ReceiverTel")
        String ReceiverTel;
        @JSONField(name = "IsPriorityUser")
        Integer IsPriorityUser;
    }
}