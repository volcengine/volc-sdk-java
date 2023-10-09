package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

@Data
public class GetGraphicIntroductionsResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetGraphicIntroductionsResponseBody result;

    @Data
    public static class GetGraphicIntroductionsResponseBody {
        @JSONField(name = "GraphicIntroductions")
        List<GraphicIntroduction> GraphicIntroductions;
        @JSONField(name = "VerticalIconUrl")
        String VerticalIconUrl;
    }

    @Data
    public static class GraphicIntroduction {
        @JSONField(name = "Id")
        Long Id;
        @JSONField(name = "Text")
        String Text;
        @JSONField(name = "MenuName")
        String MenuName;
        @JSONField(name = "IsEnable")
        Boolean IsEnable;
    }
}