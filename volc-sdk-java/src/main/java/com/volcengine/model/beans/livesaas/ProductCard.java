package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ProductCard {
    @JSONField(name = "EnableUA")
    Boolean EnableUA;
    @JSONField(name = "Product")
    Product Product;
    @JSONField(name = "UAAddress")
    String UAAddress;
    @JSONField(name = "EnableMiniApp")
    Boolean EnableMiniApp;
    @JSONField(name = "MiniAppId")
    String MiniAppId;
    @JSONField(name = "ProductsPosition")
    Integer ProductsPosition;
    @JSONField(name = "DefaultRedirectImage")
    String DefaultRedirectImage;
    @JSONField(name = "DisplayEnable")
    Integer DisplayEnable;
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "EnableFloating")
    Boolean EnableFloating;
    @JSONField(name = "UAInfo")
    UAInfo UAInfo;
    @JSONField(name = "MenuName")
    String MenuName;
}
