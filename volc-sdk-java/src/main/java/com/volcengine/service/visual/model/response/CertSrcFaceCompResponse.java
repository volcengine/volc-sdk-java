package com.volcengine.service.visual.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CertSrcFaceCompResponse extends VisualBaseResponse{
    @JSONField(name = "data")
    CertSrcFaceComp data;
    @Data
    public static class CertSrcFaceComp {
        @JSONField(name = "byted_token")
        String bytedToken;
        @JSONField(name = "result")
        String result;
        @JSONField(name = "source_comp_details")
        String sourceCompDetails;
        @JSONField(name = "verify_algorithm_base_resp")
        String verifyAlgorithmBaseResp;
        @JSONField(name = "verify_req_measure_info")
        String verifyReqMeasureInfo;
    }
}
