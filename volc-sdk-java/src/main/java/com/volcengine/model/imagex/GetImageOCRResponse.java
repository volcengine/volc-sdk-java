package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class GetImageOCRResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    GetImageOCRResponseBean result;

    @Data
    public static class GetImageOCRResponseBean {
        @JSONField(name = "Scene")
        String scene;

        @JSONField(name = "GeneralResult")
        List<GetImageOCRGeneralTextInfo> generalResult;

        @JSONField(name = "LicenseResult")
        Map<String, GetImageOCRLicenseTextInfo> licenseResult;
    }

    @Data
    public static class GetImageOCRGeneralTextInfo {
        @JSONField(name = "Content")
        String content;
        @JSONField(name = "Location")
        List<List<Integer>> location;
        @JSONField(name = "Confidence")
        String confidence;
    }

    @Data
    public static class GetImageOCRLicenseTextInfo {
        @JSONField(name = "Content")
        String content;
        @JSONField(name = "Location")
        List<Integer> location;
    }
}
