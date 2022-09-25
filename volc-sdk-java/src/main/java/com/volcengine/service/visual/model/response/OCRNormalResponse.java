package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import lombok.Data;

@Data
public class OCRNormalResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    OCRNormalData data;

    @Data
    public static class OCRNormalData {
        
        @JSONField(name = "line_texts")
        List<String> lineTexts;

        @JSONField(name = "line_rects")
        List<Rect> lineRects;

        @JSONField(name = "chars")
        List<List<CharInfo>> chars;

        @JSONField(name = "polygons")
        List<List<List<Integer>>> polygons;
    }

    @Data
    public static class Rect {
        @JSONField(name = "x")
        Integer x;

        @JSONField(name = "y")
        Integer y;

        @JSONField(name = "width")
        Integer width;

        @JSONField(name = "height")
        Integer height;
    }

    @Data
    public static class CharInfo {
        @JSONField(name = "x")
        Integer x;

        @JSONField(name = "y")
        Integer y;

        @JSONField(name = "width")
        Integer width;

        @JSONField(name = "height")
        Integer height;

        @JSONField(name = "score")
        Float score;

        @JSONField(name = "char")
        String ch;
    }
}