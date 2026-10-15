package com.volcengine.service.tls;

import com.volcengine.model.tls.LogItem;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.CallBack;
import com.volcengine.model.tls.producer.ProducerConfig;
import com.volcengine.model.tls.stats.ProducerStatsSnapshot;
import com.volcengine.model.tls.stats.StatsOptions;

import java.util.List;

public interface Producer {
    /** Changes collection only while running; the requested snapshot view remains independent. */
    void setMetricsLevel(com.volcengine.model.tls.stats.MetricsLevel level);

    /** Returns an immutable local snapshot projected to the explicitly requested view. */
    ProducerStatsSnapshot getStats(StatsOptions options);
    @Deprecated
    /*
     * Please use sendLogV2 instead.
     */
    void sendLog(String hashKey, String topicId, String source, String filename, PutLogRequest.Log log, CallBack callBack)
            throws InterruptedException, LogException;

    @Deprecated
    /*
     * Please use sendLogsV2 instead.
     */
    void sendLogGroup(String hashKey, String topicId, String source, String filename, PutLogRequest.LogGroup logGroup, CallBack callBack)
            throws InterruptedException, LogException;

    /**
     * @param hashKey  路由Shard的key
     * @param topicId  日志主题ID
     * @param source   日志来源
     * @param filename 日志路径
     * @param log      待写入日志
     * @param callBack 回调函数
     * @throws InterruptedException
     * @throws LogException
     */
    void sendLogV2(String hashKey, String topicId, String source, String filename, LogItem log, CallBack callBack)
            throws InterruptedException, LogException;

    /**
     * @param hashKey  路由Shard的key
     * @param topicId  日志主题id
     * @param source   日志来源
     * @param filename 日志路径
     * @param logs     待写入日志
     * @param callBack 回调函数
     * @throws InterruptedException
     * @throws LogException
     */
    void sendLogsV2(String hashKey, String topicId, String source, String filename, List<LogItem> logs, CallBack callBack)
            throws InterruptedException, LogException;

    /**
     * @param accessKey     访问api的key
     * @param secretKey     访问api的secret
     * @param securityToken 临时访问凭证token
     * @throws LogException
     */
    void resetAccessKeyToken(String accessKey, String secretKey, String securityToken) throws LogException;

    void setApiKey(String apiKey) throws LogException;

    /**
     * 启动Producer
     *
     * @throws LogException
     */
    void start() throws LogException;

    /**
     * Gracefully closes the Producer using a default 30-second shutdown budget.
     *
     * <p>This is a terminal shutdown, not a pause; a closed Producer cannot be restarted. If an
     * already-admitted send does not finish within the budget, this method reports the timeout,
     * keeps the resources needed by that old operation, and rejects all new sends. Retry close
     * after the admitted operation finishes, or use {@link #closeNow()} when cancellation is the
     * intended semantics. A timeout does not promise that every resource has been released.</p>
     *
     * @throws InterruptedException if the shutdown wait is interrupted
     * @throws LogException if shutdown cannot complete within the budget
     */
    void close() throws InterruptedException, LogException;

    /**
     * Gracefully closes the Producer with a caller-supplied shutdown budget.
     *
     * <p>This is a terminal shutdown, not a pause; a closed Producer cannot be restarted. The
     * admission gate closes immediately, so new sends are rejected. If a send admitted before the
     * gate closed does not finish within {@code timeoutMs}, this method reports the timeout while
     * retaining the resources required by that old operation; retry close after it finishes, or
     * use {@link #closeNow()} to request cancellation. A timeout does not promise that every
     * resource has been released.</p>
     *
     * @param timeoutMs graceful wait budget in milliseconds; failed stages may require further cleanup waits
     * @throws InterruptedException if the shutdown wait is interrupted
     * @throws LogException if shutdown cannot complete within the budget
     */
    void close(long timeoutMs) throws InterruptedException, LogException;

    /**
     * Force-closes the Producer with bounded waits and cancellation semantics.
     *
     * <p>This is a terminal shutdown, not a pause; a closed Producer cannot be restarted. Pending
     * or in-flight logs may be dropped, callback/reporting state may be incomplete, and the method
     * may still report a bounded-wait failure if workers do not stop in time.</p>
     *
     * @throws InterruptedException if the caller's interruption is reported after bounded cleanup
     * @throws LogException if forced shutdown reports an incomplete or timed-out cleanup
     */
    void closeNow() throws InterruptedException, LogException;

    /**
     * 初始化Producer配置
     *
     * @param producerConfig
     * @throws LogException
     */
    void config(ProducerConfig producerConfig) throws LogException;
}
