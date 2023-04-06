package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

@Data
public class GetTaskAwardItemListAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetTaskAwardItemListAPIResponseBody result;

    @Data
    public static class GetTaskAwardItemListAPIResponseBody {
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
        @JSONField(name = "PageTotalCount")
        Integer PageTotalCount;
        @JSONField(name = "TaskAwardItemList")
        List<TaskAwardItemAPI> TaskAwardItemList;
        @JSONField(name = "PageNo")
        Integer PageNo;
    }

    @Data
    public static class TaskAwardItemAPI {
        @JSONField(name = "AwardItemName")
        String AwardItemName;
        @JSONField(name = "AwardLotteryTicketAddr")
        String AwardLotteryTicketAddr;
        @JSONField(name = "TaskAwardItemId")
        String TaskAwardItemId;
        @JSONField(name = "AwardItemType")
        Integer AwardItemType;
        @JSONField(name = "PeopleCount")
        Integer PeopleCount;
        @JSONField(name = "AwardCount")
        Integer AwardCount;
        @JSONField(name = "AwardItemAmounts")
        Long AwardItemAmounts;
        @JSONField(name = "TaskAwardIcon")
        String TaskAwardIcon;
        @JSONField(name = "AwardItemNum")
        String AwardItemNum;
    }
}