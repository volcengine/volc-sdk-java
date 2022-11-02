package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class GetImageOCRGeneralResponse extends GetImageOCRResponse<GetImageOCRGeneralResponse.GetImageOCRResponseBean> {
    @JSONField(name = "Result")
    GetImageOCRResponseBean result;

    @Data
    public static class GetImageOCRResponseBean {
        @JSONField(name = "Scene")
        String scene;
        @JSONField(name = "OCR_result")
        List<GetImageOCRTextInfo> ocr_result;
    }

    @Data
    public static class GetImageOCRTextInfo {
        @JSONField(name = "Content")
        String content;
        @JSONField(name = "Location")
        List<List<Integer>> location;
        @JSONField(name = "Confidence")
        String confidence;
    }
}
