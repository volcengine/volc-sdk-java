package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageEraseResultRequest {
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "StoreUri")
    String storeUri;
    @JSONField(name = "Model")
    String model;
    @JSONField(name = "BBox")
    GetImageEraseResultRequest.BBox[] bbox;

    @Data
    public static class BBox{
        @JSONField(name = "X1")
        Float X1;
        @JSONField(name = "Y1")
        Float Y1;
        @JSONField(name = "X2")
        Float X2;
        @JSONField(name = "Y2")
        Float Y2;
    }
}
