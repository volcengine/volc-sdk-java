package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetImageDuplicateDetectionSyncRequest {
    @JSONField(name = "ServiceId")
    private String serviceId;

    @JSONField(name = "Urls")
    private List<String> urls;

    @JSONField(name = "Async")
    final private Boolean async = false;
}
