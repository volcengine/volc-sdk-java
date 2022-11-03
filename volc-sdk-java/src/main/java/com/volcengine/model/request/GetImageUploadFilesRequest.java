package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageUploadFilesRequest {
    @JSONField(name = "ServiceId")
    private String serviceId;

    @JSONField(name = "Limit")
    private Integer limit;

    @JSONField(name = "Marker")
    private Long marker;
}
