package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.GetImageDuplicateDetectionResult;
import lombok.Data;

@Data
public class GetImageDuplicateDetectionSyncResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private GetImageDuplicateDetectionResult result;
}
