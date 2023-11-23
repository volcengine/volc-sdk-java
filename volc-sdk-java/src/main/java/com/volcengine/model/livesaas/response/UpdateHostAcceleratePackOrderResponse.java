package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class UpdateHostAcceleratePackOrderResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateHostAcceleratePackOrderResponseBody result;

    @Data
    public static class UpdateHostAcceleratePackOrderResponseBody {
        @JSONField(name = "UpdateResult")
        List<UpdatePackOrderResult> UpdateResult;
    }

    @Data
    public static class UpdatePackOrderResult {
       @JSONField(name = "OrderId")
       String OrderId;
       @JSONField(name = "Uid")
       String Uid;
       @JSONField(name = "StartTime")
       String StartTime;
       @JSONField(name = "EndTime")
       String EndTime;
       @JSONField(name = "IsRenew")
       Boolean IsRenew;
       @JSONField(name = "Province")
       String Province;
       @JSONField(name = "Source")
       String Source;
       @JSONField(name = "Status")
       Integer Status;
    }
}