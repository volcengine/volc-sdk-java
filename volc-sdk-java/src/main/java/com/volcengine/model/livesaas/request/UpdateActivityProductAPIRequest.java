package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.Products;
import lombok.Data;

import java.util.Map;

@Data
public class UpdateActivityProductAPIRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "Products")
    Map<String, Products> Products;
}
