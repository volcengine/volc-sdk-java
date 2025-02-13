package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class CreateHostAcceleratePackOrderResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CreateHostAcceleratePackOrderResponseBody result;

    @Data
    public static class CreateHostAcceleratePackOrderResponseBody {
        @JSONField(name = "CreateResult")
        List<CreatePackOrderResult> CreateResult;
    }

    @Data
    public static class CreatePackOrderResult {
       @JSONField(name = "OrderId")
       String OrderId;
       @JSONField(name = "Uid")
       String Uid;
       @JSONField(name = "DouyinUid")
       String DouyinUid;
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
