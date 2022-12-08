package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.ProductAPIs;
import lombok.Data;

import java.util.Map;

@Data
public class UpdateActivityProductV2Request {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "Products")
    Map<String, ProductAPIs> Products;
}