package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class ListHostAcceleratePackOrderResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListHostAcceleratePackOrderResponseBody result;

    @Data
    public static class ListHostAcceleratePackOrderResponseBody {
        @JSONField(name = "OrderInfos")
        List<AcceleratePackOrderInfo> OrderInfos;
        @JSONField(name = "PageNumber")
        Integer PageNumber;
        @JSONField(name = "PageSize")
        Integer PageSize;
        @JSONField(name = "TotalCount")
        Integer TotalCount;
    }

    @Data
    public static class AcceleratePackOrderInfo {
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
       @JSONField(name = "Status")
       Integer Status;
       @JSONField(name = "Province")
       String Province;
       @JSONField(name = "Source")
       String Source;
    }
}