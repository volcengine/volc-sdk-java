package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

@Data
public class GetTaskAwardRecordStatisticsAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetTaskAwardRecordStatisticsAPIResponseBody result;

    @Data
    public static class GetTaskAwardRecordStatisticsAPIResponseBody {
        @JSONField(name = "PageTotalCount")
        Integer PageTotalCount;
        @JSONField(name = "TaskAwardRecordList")
        List<TaskAwardRecordAPI> TaskAwardRecordList;
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
    }

    @Data
    public static class TaskAwardRecordAPI {
        @JSONField(name = "ExternalId")
        String ExternalId;
        @JSONField(name = "WinTime")
        Long WinTime;
        @JSONField(name = "Nickname")
        String Nickname;
        @JSONField(name = "Address")
        String Address;
        @JSONField(name = "UserId")
        Long UserId;
        @JSONField(name = "Extra")
        String Extra;
        @JSONField(name = "TaskAwardName")
        String TaskAwardName;
        @JSONField(name = "UserAgent")
        String UserAgent;
        @JSONField(name = "Email")
        String Email;
        @JSONField(name = "LoginTel")
        String LoginTel;
        @JSONField(name = "ReceiverName")
        String ReceiverName;
        @JSONField(name = "Ip")
        String Ip;
        @JSONField(name = "Phone")
        String Phone;
        @JSONField(name = "Status")
        Integer Status;
        @JSONField(name = "AwardEmail")
        String AwardEmail;
    }
}