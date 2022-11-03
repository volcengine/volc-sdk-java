package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Map;

@Data
@EqualsAndHashCode(callSuper = true)
public class GetImageOCRLicenseResponse extends GetImageOCRResponse<GetImageOCRLicenseResponse.GetImageOCRResponseBean> {
    @JSONField(name = "Result")
    GetImageOCRResponseBean result;

    @Data
    public static class GetImageOCRResponseBean {
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
