package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;


@Data
public class UpdateProductCardResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateProductCardResponseBody result;

    @Data
    public static class UpdateProductCardResponseBody {
        @JSONField(name = "ProductConfig")
        ProductCard ProductConfig;
        @JSONField(name = "VerticalIconUrl")
        String VerticalIconUrl;
    }

    @Data
    public static class ProductCard {
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
        @JSONField(name = "IsEnable")
        Boolean IsEnable;
        @JSONField(name = "MenuName")
        String MenuName;
    }

    @Data
    public static class UAInfo {
        @JSONField(name = "UAInfos")
        List<UAInfoMsg> UAInfos;
    }

    @Data
    public static class UAInfoMsg {
        @JSONField(name = "UAName")
        String UAName;
        @JSONField(name = "UAAddress")
        String UAAddress;
    }

    @Data
    public static class Product {
        @JSONField(name = "Products")
        List<ProductCardMsg> Products;
    }

    @Data
    public static class ProductCardMsg {
        @JSONField(name = "Highlight")
        String Highlight;
        @JSONField(name = "ExplainStatus")
        Integer ExplainStatus;
        @JSONField(name = "FloatingStatus")
        Integer FloatingStatus;
        @JSONField(name = "IntroduceImage")
        String IntroduceImage;
        @JSONField(name = "RedirectUrl")
        String RedirectUrl;
        @JSONField(name = "Index")
        Integer Index;
        @JSONField(name = "Id")
        Long Id;
        @JSONField(name = "Remark")
        String Remark;
        @JSONField(name = "PageAdvertisementType")
        Integer PageAdvertisementType;
        @JSONField(name = "EnableStatus")
        Integer EnableStatus;
        @JSONField(name = "Strikethrough")
        String Strikethrough;
        @JSONField(name = "MiniAppDirectUrl")
        String MiniAppDirectUrl;
        @JSONField(name = "DirectUrls")
        List<String> DirectUrls;
        @JSONField(name = "Title")
        String Title;
        @JSONField(name = "RedirectImage")
        String RedirectImage;
        @JSONField(name = "ExplainTime")
        Long ExplainTime;
    }
}