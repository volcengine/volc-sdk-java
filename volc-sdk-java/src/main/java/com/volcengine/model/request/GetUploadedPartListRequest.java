package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetUploadedPartListRequest {
    @JSONField(name = "app_id")
    private Long appId;
    @JSONField(name = "upload_id")
    private String uploadId;
}
