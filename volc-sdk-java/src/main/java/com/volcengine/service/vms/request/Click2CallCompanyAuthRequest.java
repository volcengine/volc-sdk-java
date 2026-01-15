package com.volcengine.service.vms.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Click2CallCompanyAuthRequest {
    private String companyName;

    private String companyCreditCode;

    private String businessLicensePicUrl;

    private String businessLicensePicFilename;

    private String proprietorIdcardPicUrl;

    private String proprietorIdcardPicFilename;

    private String operatorIdcardPicUrl;

    private String operatorIdcardPicFilename;

    private String operatorIdcardInhandPicUrl;

    private String operatorIdcardInhandPicFilename;

    private String networkaccessCommitmentletterPicUrl;

    private String networkaccessCommitmentletterPicFilename;

    private String numberapplicationOfficialletterPicUrl;

    private String numberapplicationOfficialletterPicFilename;

    private String calleeSource;

    private String businessCarrier;

    private List<Script> scriptList;


    @Data
    public static class Script {
        private String scriptContent;

        private String scriptScene;
    }
}
