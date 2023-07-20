package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

@Data
public class GetAwardConfigListAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetAwardConfigListAPIResponseBody result;

    @Data
    public static class GetAwardConfigListAPIResponseBody {
        @JSONField(name = "Body")
        List<ActivityAwardConfigAPI> Body;
    }

    @Data
    public static class ActivityAwardConfigAPI {
        @JSONField(name = "TotalCount")
        Long TotalCount;
        @JSONField(name = "SendTime")
        Long SendTime;
        @JSONField(name = "OpenAwardTime")
        Long OpenAwardTime;
        @JSONField(name = "ConditionType")
        Byte ConditionType;
        @JSONField(name = "ConditionVariable")
        Integer ConditionVariable;
        @JSONField(name = "DeadLine")
        Long DeadLine;
        @JSONField(name = "BarragePwd")
        String BarragePwd;
        @JSONField(name = "WinnerInfoType")
        String WinnerInfoType;
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "AwardCount")
        Long AwardCount;
        @JSONField(name = "RangeStatus")
        Byte RangeStatus;
        @JSONField(name = "MsgIds")
        String MsgIds;
        @JSONField(name = "ID")
        Long ID;
        @JSONField(name = "ShowWinnerComment")
        Byte ShowWinnerComment;
        @JSONField(name = "Status")
        Byte Status;
        @JSONField(name = "AwardType")
        Byte AwardType;
        @JSONField(name = "AwardNum")
        Long AwardNum;
        @JSONField(name = "VIPUserList")
        String VIPUserList;
        @JSONField(name = "ShowPeopleNumber")
        Byte ShowPeopleNumber;
        @JSONField(name = "Name")
        String Name;
        @JSONField(name = "AwardItemType")
        Integer AwardItemType;
        @JSONField(name = "AwardItemIcon")
        String AwardItemIcon;
        @JSONField(name = "AwardItemNum")
        String AwardItemNum;
        @JSONField(name = "AwardCondition")
        AwardCondition AwardCondition;
        @JSONField(name = "AwardItemAmounts")
        Long AwardItemAmounts;
        @JSONField(name = "AwardLotteryTicketAddr")
        String AwardLotteryTicketAddr;
        @JSONField(name = "AwardTheme")
        String AwardTheme;
    }

    @Data
    public static class AwardCondition {
        @JSONField(name = "CheckIn")
        String CheckIn;
        @JSONField(name = "Vote")
        String Vote;
        @JSONField(name = "RightQuiz")
        String RightQuiz;
        @JSONField(name = "Quiz")
        String Quiz;
        @JSONField(name = "Questionnaire")
        String Questionnaire;
    }
}