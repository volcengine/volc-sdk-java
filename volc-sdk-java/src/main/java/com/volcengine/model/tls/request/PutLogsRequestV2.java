package com.volcengine.model.tls.request;

import com.volcengine.model.tls.LogItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PutLogsRequestV2 {
    private List<LogItem> logs;
    private String topicId;
    private String hashKey;
    private String compressType;
    private String path;
    private String source;

    /**
     * @param logs    日志列表
     * @param topicId 日志主题 ID
     */
    public PutLogsRequestV2(List<LogItem> logs, String topicId) {
        this.logs = logs;
        this.topicId = topicId;
    }

    /**
     * @param logs         日志列表
     * @param topicId      日志主题 ID
     * @param hashKey      路由 Shard 的key
     * @param compressType 压缩格式，支持lz4、zlib
     */
    public PutLogsRequestV2(List<LogItem> logs, String topicId, String hashKey, String compressType) {
        this.logs = logs;
        this.topicId = topicId;
        this.hashKey = hashKey;
        this.compressType = compressType;
    }

    /**
     * @return 日志主题 ID
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * @param topicId 日志主题 ID
     */
    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * @return 路由 Shard 的key
     */
    public String getHashKey() {
        return hashKey;
    }

    /**
     * @param hashKey 路由 Shard 的key
     */
    public void setHashKey(String hashKey) {
        this.hashKey = hashKey;
    }

    /**
     * @return 压缩格式，支持lz4、zlib
     */
    public String getCompressType() {
        return compressType;
    }

    /**
     * @param compressType 压缩格式，支持lz4、zlib
     */
    public void setCompressType(String compressType) {
        this.compressType = compressType;
    }

    /**
     * @return 日志列表
     */
    public List<LogItem> getLogs() {
        return logs;
    }

    /**
     * @param logs 日志列表
     */
    public void setLogs(List<LogItem> logs) {
        this.logs = logs;
    }

    /**
     * @return 日志路径
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path 日志路径
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return 日志来源，一般使用机器 IP 作为标识
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source 日志来源，一般使用机器 IP 作为标识
     */
    public void setSource(String source) {
        this.source = source;
    }
}
