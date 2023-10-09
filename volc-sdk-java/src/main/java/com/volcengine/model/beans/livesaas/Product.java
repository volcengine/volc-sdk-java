package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class Product {
    @JSONField(name = "Products")
    List<ProductCardMsg> Products;
}
