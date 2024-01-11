package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CompleteUploadFileRequest {
    @JSONField(name = "app_id")
    private Long appId;
    @JSONField(name = "upload_id")
    private String uploadId;
    @JSONField(name = "scene")
    private String scene;
    @JSONField(name = "business_type")
    private String businessType;
    @JSONField(name = "data_type")
    private String dataType;
}
