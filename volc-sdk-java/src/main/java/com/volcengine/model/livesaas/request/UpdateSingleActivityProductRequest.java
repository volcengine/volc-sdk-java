package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ProductCardMsg;
import lombok.Data;

@Data
public class UpdateSingleActivityProductRequest {
    @JSONField(name = "ActivityId")
    private Long ActivityId;
    @JSONField(name = "ProductConfigId")
    private Long ProductConfigId;
    @JSONField(name = "Action")
    private Integer Action;
    @JSONField(name = "ReorderIndex")
    private Boolean ReorderIndex;
    @JSONField(name = "Product")
    private ProductCardMsg Product;
}
