package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;
import java.util.Map;

@Data
public class DeleteHostAcceleratePackOrderResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteHostAcceleratePackOrderResponseBody result;

    @Data
    public static class DeleteHostAcceleratePackOrderResponseBody {
       @JSONField(name = "DeleteResult")
       List<DeletePackOrderResult> DeleteResult;
    }

    @Data
    public static class DeletePackOrderResult {
       @JSONField(name = "OrderId")
       String OrderId;
       @JSONField(name = "Uid")
       String Uid;
       @JSONField(name = "Status")
       Integer Status;
    }
}