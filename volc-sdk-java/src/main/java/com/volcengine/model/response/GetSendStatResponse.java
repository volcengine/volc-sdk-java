package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetSendStatResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    SmsSendStatInfo result;
    @JSONField(name = "Code")
    String code;
    @JSONField(name = "Message")
    String message;

    @Data
    static public class SmsSendStatInfo {
        @JSONField(name = "dataPoints")
        List<DataPoint> dataPoints;
        @JSONField(name = "totalSendSuccessCount")
        Long totalSendSuccessCount;
        @JSONField(name = "totalAllSendCount")
        Long totalAllSendCount;
        @JSONField(name = "totalReceiptSuccessCount")
        Long totalReceiptSuccessCount;
        @JSONField(name = "totalReceiptFailureCount")
        Long totalReceiptFailureCount;
        @JSONField(name = "totalNoReceipt72HourCount")
        Long totalNoReceipt72HourCount;
        @JSONField(name = "totalSendSuccessRate")
        Double totalSendSuccessRate;
        @JSONField(name = "totalReceiptSuccessRate")
        Double totalReceiptSuccessRate;
    }
    @Data
    static public class DataPoint {
        @JSONField(name = "allSendCount")
        Long allSendCount;
        @JSONField(name = "sendSuccessCount")
        Long sendSuccessCount;
        @JSONField(name = "receiptSuccessCount")
        Long receiptSuccessCount;
        @JSONField(name = "receiptFailureCount")
        Long receiptFailureCount;
        @JSONField(name = "noReceipt72HourCount")
        Long noReceipt72HourCount;
        @JSONField(name = "date")
        String date;
        @JSONField(name = "sendSuccessRate")
        double sendSuccessRate;
        @JSONField(name = "receiptSuccessRate")
        double receiptSuccessRate;
    }

    public GetSendStatResponse(){
    }
    public GetSendStatResponse(String code,String message){
        this.code = code;
        this.message = message;
    }

}
