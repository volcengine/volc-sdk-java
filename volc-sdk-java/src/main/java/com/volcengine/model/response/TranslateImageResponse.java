package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import java.util.Map;

@Data
public class TranslateImageResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "TranslateImage")
    String translateImage;

    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "Text")
        String text;
        @JSONField(name = "TranslateText")
        String translateText;
        @JSONField(name = "X")
        Integer x;
        @JSONField(name = "Y")
        Integer y;
        @JSONField(name = "Width")
        Integer width;
        @JSONField(name = "Height")
        Integer height;
        @JSONField(name = "Row")
        Integer row;
        @JSONField(name = "Extra")
        Map<String, String> extra;
    }
}
