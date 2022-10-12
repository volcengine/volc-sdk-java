package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class MultilangOCRResponse extends VisualBaseResponse {
    
    @JSONField(name = "data")
    MultilangOCRData data;

    @Data
    public static class MultilangOCRData {
        
        @JSONField(name = "ocr_infos")
        List<MultilangTextResult> ocrInfos;
    }

    @Data
    public static class MultilangTextResult {
        @JSONField(name = "lang")
        String lang;

        @JSONField(name = "prob")
        Float prob;

        @JSONField(name = "text")
        String text;

        @JSONField(name = "rect")
        List<List<Integer>> rect;
    }

}