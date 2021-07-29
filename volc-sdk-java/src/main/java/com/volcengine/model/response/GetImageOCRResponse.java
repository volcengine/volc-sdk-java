package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class GetImageOCRResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetImageOCRResultBean result;

    @Data
    public static class GetImageOCRResultBean {
        @JSONField(name = "Scene")
        String scene;
        @JSONField(name = "OCR_result")
        Map<String, GetImageOCRTextInfo> ocr_result;
    }

    @Data
    public static class GetImageOCRTextInfo {
        @JSONField(name = "Content")
        String content;
        @JSONField(name = "Location")
        List<Integer> location;
    }
}