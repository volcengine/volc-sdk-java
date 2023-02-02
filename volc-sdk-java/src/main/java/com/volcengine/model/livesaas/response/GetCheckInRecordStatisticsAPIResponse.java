package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

@Data
public class GetCheckInRecordStatisticsAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetCheckInRecordStatisticsAPIResponseBody result;

    @Data
    public static class GetCheckInRecordStatisticsAPIResponseBody {
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
        @JSONField(name = "PageTotalCount")
        Integer PageTotalCount;
        @JSONField(name = "CheckInStatisticsList")
        List<CheckInStatisticAPI> CheckInStatisticsList;
    }

    @Data
    public static class CheckInStatisticAPI {
        @JSONField(name = "PersonInfo")
        String PersonInfo;
        @JSONField(name = "Extra")
        String Extra;
        @JSONField(name = "Ip")
        String Ip;
        @JSONField(name = "CheckInID")
        String CheckInID;
        @JSONField(name = "UserID")
        Long UserID;
        @JSONField(name = "LoginTel")
        String LoginTel;
        @JSONField(name = "Email")
        String Email;
        @JSONField(name = "CheckInTime")
        Long CheckInTime;
        @JSONField(name = "UserAgent")
        String UserAgent;
        @JSONField(name = "ExternalId")
        String ExternalId;
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "UserName")
        String UserName;
    }
}