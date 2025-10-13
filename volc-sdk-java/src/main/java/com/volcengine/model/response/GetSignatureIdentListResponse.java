package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetSignatureIdentListResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "list")
        List<SignatureIdentificationListForSDKResp> list;
        @JSONField(name = "total")
        int total;
    }

    @Data
    public static class SignatureIdentificationListForSDKResp {

        @JSONField(name = "id")
        long id;

        @JSONField(name = "purpose")
        int purpose;

        @JSONField(name = "materialName")
        String materialName;

        @JSONField(name = "businessCertificateName")
        String businessCertificateName;

        @JSONField(name = "operatorPersonName")
        String operatorPersonName;

        @JSONField(name = "legalPersonName")
        String legalPersonName;

        @JSONField(name = "responsiblePersonName")
        String responsiblePersonName;

        @JSONField(name = "effectSignatures")
        List<String> effectSignatures;

    }
}
