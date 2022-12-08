package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

import java.util.Map;

@Data
public class GetActivityProductAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Map<String, ProductAPIs> result;

    @Data
    public static class ProductAPIs {
        @JSONField(name = "EnableFloating")
        Boolean EnableFloating;
        @JSONField(name = "Product")
        List<ProductMsgAPI> Product;
        @JSONField(name = "EnableUA")
        Boolean EnableUA;
        @JSONField(name = "UAAddress")
        String UAAddress;
    }

    @Data
    public static class ProductMsgAPI {
        @JSONField(name = "EnableStatus")
        Integer EnableStatus;
        @JSONField(name = "Strikethrough")
        String Strikethrough;
        @JSONField(name = "Title")
        String Title;
        @JSONField(name = "Highlight")
        String Highlight;
        @JSONField(name = "IntroduceImage")
        String IntroduceImage;
        @JSONField(name = "RedirectImage")
        String RedirectImage;
        @JSONField(name = "RedirectUrl")
        String RedirectUrl;
        @JSONField(name = "Index")
        Integer Index;
        @JSONField(name = "Id")
        Long Id;
        @JSONField(name = "DirectUrl")
        String DirectUrl;
        @JSONField(name = "ExplainTime")
        Long ExplainTime;
        @JSONField(name = "FloatingStatus")
        Integer FloatingStatus;
        @JSONField(name = "ExplainStatus")
        Integer ExplainStatus;
        @JSONField(name = "Remark")
        String Remark;
    }
}