package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ProductAPIs  {
    @JSONField(name = "EnableFloating")
    Boolean EnableFloating;
    @JSONField(name = "Product")
    List<ProductMsgAPI> Product;
    @JSONField(name = "EnableUA")
    Boolean EnableUA;
    @JSONField(name = "UAAddress")
    java.lang.String UAAddress;
}