package com.volcengine.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Builder
@Getter
@Setter
public class SignRequest {
    private String xDate;
    private String xNotSignBody;
    private String xCredential;
    private String xAlgorithm;
    private String xSignedHeaders;
    private String xSignedQueries;
    private String xSignature;
    private String xSecurityToken;

    private String host;
    private String contentType;
    private String xContentSha256;
    private String authorization;
}
