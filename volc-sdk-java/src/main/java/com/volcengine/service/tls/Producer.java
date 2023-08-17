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

    /**
     * @param hashKey
     * @param topicId  日志主题id
     * @param source   路由 Shard 的key
     * @param filename 日志路径
     * @param log      待写入日志
     * @param callBack 回调函数
     * @throws InterruptedException
     * @throws LogException
     */
    void sendLogV2(String hashKey, String topicId, String source, String filename, LogItem log,
                   CallBack callBack) throws InterruptedException, LogException;

    /**
     * @param hashKey
     * @param topicId  日志主题id
     * @param source   路由 Shard 的key
     * @param filename 日志路径
     * @param logs     待写入日志
     * @param callBack 回调函数
     * @throws InterruptedException
     * @throws LogException
     */
    void sendLogsV2(String hashKey, String topicId, String source, String filename,
                    List<LogItem> logs, CallBack callBack) throws InterruptedException, LogException;

    /**
     * @param accessKey     访问api的key
     * @param secretKey     访问api的secret
     * @param securityToken 临时访问凭证token
     * @throws LogException
     */
    void resetAccessKeyToken(String accessKey, String secretKey, String securityToken) throws LogException;

    /**
     * 启动producer
     *
     * @throws LogException
     */
    void start() throws LogException;

    /**
     * 暂停produver
     *
     * @throws InterruptedException
     * @throws LogException
     */
    void close() throws InterruptedException, LogException;

    /**
     * 立刻暂停producer
     *
     * @throws InterruptedException
     * @throws LogException
     */
    void closeNow() throws InterruptedException, LogException;

    /**
     * 初始化producer配置
     *
     * @param producerConfig
     * @throws LogException
     */
    void config(ProducerConfig producerConfig) throws LogException;
}