package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeDownloadUrlRequest {
    @JSONField(serialize = false)
    String taskId;

    public boolean CheckValidation() {
        if (this.taskId == null) {
            return false;
        }
        return true;
    }
}
