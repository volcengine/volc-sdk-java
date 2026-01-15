package com.volcengine.service.vms.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Click2CallNumberAuthRequest {
    private String companyName;

    private String companyCreditCode;

    private String action;

    private String aNumbers;

    private String businessUsageCommitmentletterPicUrl;

    private String businessUsageCommitmentletterPicFilename;

    private String script;

    private String scriptScene;
}
