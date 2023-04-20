package com.volcengine.model.tls.request;

import com.volcengine.model.tls.LogBody;
import lombok.Data;

import java.util.List;

@Data
public class PutLogsOriginRequest {
    String topicId;
    String hashKey;
    List<LogBody> logBody;
    String compressType;

    public boolean CheckValidation() {
        if (this.topicId == null || this.logBody == null) {
            return false;
        }
        return true;
    }
}
