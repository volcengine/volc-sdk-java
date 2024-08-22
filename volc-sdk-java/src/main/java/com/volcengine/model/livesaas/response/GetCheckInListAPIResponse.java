package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

@Data
public class GetCheckInListAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetCheckInListAPIResponseBody result;

    @Data
    public static class GetCheckInListAPIResponseBody {
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageCount")
        Integer PageCount;
        @JSONField(name = "CheckInList")
        List<CheckInConfigAPI> CheckInList;
    }

    @Data
    public static class CheckInConfigAPI {
        @JSONField(name = "CheckInName")
        String CheckInName;
        @JSONField(name = "CheckInCount")
        Long CheckInCount;
        @JSONField(name = "Deadline")
        Long Deadline;
        @JSONField(name = "Status")
        String Status;
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "NeedPersonInfo")
        Integer NeedPersonInfo;
        @JSONField(name = "OpenCheckTime")
        Long OpenCheckTime;
        @JSONField(name = "CheckInInfo")
        String CheckInInfo;
        @JSONField(name = "CheckInId")
        String CheckInId;
        @JSONField(name = "StartTime")
        Long StartTime;
        @JSONField(name = "IsSendComment")
        Integer IsSendComment;
        @JSONField(name = "CommentContent")
        String CommentContent;
        @JSONField(name = "DeadlineSecond")
        Integer DeadlineSecond;
        @JSONField(name = "CannotWatchLiveWhenNotCheckIn")
        Integer CannotWatchLiveWhenNotCheckIn;
        @JSONField(name = "SendType")
        Integer SendType;
        @JSONField(name = "AutoSendTime")
        Long AutoSendTime;
    }
}