package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetUnionProductResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPo.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    List<Result> result;

    @Data
    public static class Result {
        @JSONField(name = "ProductId")
        String productId;
        @JSONField(name = "ProductType")
        String productType;
        @JSONField(name = "UnionReason")
        String unionReason;
        @JSONField(name = "ProductExtra")
        String productExtra;
    }
}
