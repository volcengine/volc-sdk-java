package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ProductCardMsg;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class UpdateSingleActivityProductResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateSingleActivityProductResponseBody result;

    @Data
    public static class UpdateSingleActivityProductResponseBody {
        @JSONField(name = "Product")
        private ProductCardMsg Product;
        @JSONField(name = "ConfigProducts")
        private List<ProductCardMsg> ConfigProducts;
    }
}