package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ProductCard;
import lombok.Data;


@Data
public class UpdateProductCardRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "ProductConfig")
    ProductCard ProductConfig;
    @JSONField(name = "VerticalIconUrl")
    String VerticalIconUrl;
    @JSONField(name = "EnableViewCart")
    Integer EnableViewCart;
    @JSONField(name = "ViewCartUrl")
    String ViewCartUrl;
    @JSONField(name = "EnableViewOrder")
    Integer EnableViewOrder;
    @JSONField(name = "ViewOrderUrl")
    String ViewOrderUrl;
}
