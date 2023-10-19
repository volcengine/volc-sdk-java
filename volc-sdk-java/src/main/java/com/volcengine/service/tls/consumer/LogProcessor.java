package com.volcengine.service.tls.consumer;

import com.volcengine.model.tls.pb.PutLogRequest;

public interface LogProcessor {
    void process(String topicID, int shardID, PutLogRequest.LogGroupList logGroupList);
}
