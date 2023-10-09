package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;


@Data
public class UpdateGraphicIntroductionResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    UpdateGraphicIntroductionResponseBody result;

    @Data
    public static class UpdateGraphicIntroductionResponseBody {
        @JSONField(name = "GraphicIntroduction")
        GraphicIntroduction GraphicIntroduction;
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