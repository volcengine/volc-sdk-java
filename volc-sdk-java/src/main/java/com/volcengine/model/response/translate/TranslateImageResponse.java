package com.volcengine.model.response.translate;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class TranslateImageResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Image")
    String image;

    @JSONField(name = "TextBlocks")
    List<TextBlock> result;

    @Data
    public static class TextBlock {
        @JSONField(name = "Points")
        List<Point> points;
        @JSONField(name = "DetectedLanguage")
        String detectedLanguage;
        @JSONField(name = "Text")
        String text;
        @JSONField(name = "Translation")
        String translation;
        @JSONField(name = "ForeColor")
        List<Integer> foreColor;
        @JSONField(name = "BackColor")
        List<Integer> backColor;
    }

    @Data
    public static class Point {
        @JSONField(name = "X")
        Integer x;
        @JSONField(name = "Y")
        Integer y;
    }
}
