package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class ModifyHostAcceleratePackOrderResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ModifyHostAcceleratePackOrderResponseBody result;

    @Data
    public static class ModifyHostAcceleratePackOrderResponseBody {
        @JSONField(name = "ModifyResult")
        List<ModifyPackOrderResult> ModifyResult;
    }

    @Data
    public static class ModifyPackOrderResult {
       @JSONField(name = "OrderId")
       String OrderId;
       @JSONField(name = "OldUid")
       String OldUid;
       @JSONField(name = "NewUid")
       String NewUid;
       @JSONField(name = "NewDouyinId")
       String NewDouyinId;
       @JSONField(name = "ExecuteTime")
       String ExecuteTime;
       @JSONField(name = "IsRenew")
       Boolean IsRenew;
       @JSONField(name = "Status")
       Integer Status;
    }
}