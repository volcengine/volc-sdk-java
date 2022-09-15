package com.volcengine.model.tls.request;

import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.BatchLog;

import static com.volcengine.model.tls.Const.LZ4;

public class RequestBuilder {
    private RequestBuilder() {
    }

    public static PutLogsRequest buildFromBatch(BatchLog batchLog) {
        PutLogRequest.LogGroupList logGroupList = PutLogRequest.LogGroupList.newBuilder().
                mergeFrom(batchLog.getLogGroupList()).build();
        BatchLog.BatchKey batchKey = batchLog.getBatchKey();
        return new PutLogsRequest(logGroupList, batchKey.getTopicId(), batchKey.getShardHash(), LZ4);
    }
}
