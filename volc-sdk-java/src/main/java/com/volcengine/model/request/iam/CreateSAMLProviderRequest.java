package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateSAMLProviderRequest {
    @JSONField(name = "EncodedSAMLMetadataDocument")
    String encodedSAMLMetadataDocument;
    @JSONField(name = "SAMLProviderName")
    String SAMLProviderName;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "SSOType")
    Integer SSOType;
    @JSONField(name = "Status")
    Integer status;
}
