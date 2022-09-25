package com.volcengine.service.tls;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.CallBack;
import com.volcengine.model.tls.producer.ProducerConfig;

public interface Producer {

    void sendLog(String hashKey, String topicId, String source, String filename, PutLogRequest.Log log,
                 CallBack callBack) throws InterruptedException, LogException;

    void sendLogGroup(String hashKey, String topicId, String source, String filename,
                      PutLogRequest.LogGroup logGroup, CallBack callBack) throws InterruptedException, LogException;

    void resetAccessKeyToken(String accessKey, String secretKey, String securityToken) throws LogException;

    void start() throws LogException;

    void close() throws InterruptedException, LogException;

    void closeNow() throws InterruptedException, LogException;

    void config(ProducerConfig producerConfig) throws LogException;
}
