package com.volcengine.service.tls;

import com.volcengine.model.tls.LogItem;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.CallBack;
import com.volcengine.model.tls.producer.ProducerConfig;

import java.util.List;

public interface Producer {

    @Deprecated
    /*
        use sendLogV2 instead
     */
    void sendLog(String hashKey, String topicId, String source, String filename, PutLogRequest.Log log,
                 CallBack callBack) throws InterruptedException, LogException;
    @Deprecated
    /*
        use sendLogsV2 instead
     */
    void sendLogGroup(String hashKey, String topicId, String source, String filename,
                      PutLogRequest.LogGroup logGroup, CallBack callBack) throws InterruptedException, LogException;


    void sendLogV2(String hashKey, String topicId, String source, String filename, LogItem log,
                   CallBack callBack) throws InterruptedException, LogException;

    void sendLogsV2(String hashKey, String topicId, String source, String filename,
                    List<LogItem> logs, CallBack callBack) throws InterruptedException, LogException;

    void resetAccessKeyToken(String accessKey, String secretKey, String securityToken) throws LogException;

    void start() throws LogException;

    void close() throws InterruptedException, LogException;

    void closeNow() throws InterruptedException, LogException;

    void config(ProducerConfig producerConfig) throws LogException;
}