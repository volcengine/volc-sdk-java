package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class UnsubscribeHostAcceleratePackOrderResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UnsubscribeHostAcceleratePackOrderResponseBody result;

    @Data
    public static class UnsubscribeHostAcceleratePackOrderResponseBody {
        @JSONField(name = "TDResult")
        List<TDPackOrderResult> TDResult;
    }

    @Data
    public static class TDPackOrderResult {
       @JSONField(name = "OrderId")
       String OrderId;
       @JSONField(name = "Uid")
       String Uid;
       @JSONField(name = "EndTime")
       String EndTime;
       @JSONField(name = "Status")
       Integer Status;
    }
}