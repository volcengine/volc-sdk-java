package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class ListRedPacketDataAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListRedPacketDataAPIResponseBody result;

    @Data
    public static class ListRedPacketDataAPIResponseBody {
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
        @JSONField(name = "TotalCount")
        Integer TotalCount;
        @JSONField(name = "RedPacketList")
        List<RedPacketDataAPI> RedPacketList;
    }

    @Data
    public static class RedPacketDataAPI {
        @JSONField(name = "RedPacketId")
        Long RedPacketId;
        @JSONField(name = "SendTime")
        Long SendTime;
        @JSONField(name = "TotalAmount")
        Long TotalAmount;
        @JSONField(name = "ReceivedAmount")
        Long ReceivedAmount;
        @JSONField(name = "JoinUserNumber")
        Long JoinUserNumber;
        @JSONField(name = "WinUserNumber")
        Long WinUserNumber;
        @JSONField(name = "WithdrawalAmount")
        Long WithdrawalAmount;
        @JSONField(name = "RedPacketNumber")
        Long RedPacketNumber;
        @JSONField(name = "Name")
        String Name;
    }
}