package com.volcengine.model.request;

import lombok.Data;

@Data
public class PushTrafficRiskDataRequest {

    private String scene;
    private String businessType;
    private String dataType;
    private Long appId;
    private String filePath;
}
