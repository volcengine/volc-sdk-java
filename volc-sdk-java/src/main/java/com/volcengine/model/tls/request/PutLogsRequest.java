package com.volcengine.model.tls.request;

import com.volcengine.model.tls.pb.PutLogRequest;
import lombok.Data;

@Data
public class PutLogsRequest {
    private PutLogRequest.LogGroupList logGroupList;
    private String topicId;
    private String hashKey;
    private String compressType;

    /**
     *
     */
    public PutLogsRequest(PutLogRequest.LogGroupList logGroupList, String topicId) {
        this.logGroupList = logGroupList;
        this.topicId = topicId;
    }

    public PutLogsRequest(PutLogRequest.LogGroupList logGroupList, String topicId, String hashKey, String compressType) {
        this.logGroupList = logGroupList;
        this.topicId = topicId;
        this.hashKey = hashKey;
        this.compressType = compressType;
    }
}
