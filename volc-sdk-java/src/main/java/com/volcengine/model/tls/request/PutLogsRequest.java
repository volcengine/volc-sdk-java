package com.volcengine.model.tls.request;

import com.volcengine.model.tls.pb.PutLogRequest;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PutLogsRequest {
    private PutLogRequest.LogGroupList logGroupList;
    private String topicId;
    private String hashKey;
    private String compressType;

    /**
     * @param logGroupList 日志列表
     * @param topicId      日志主题 ID
     */
    public PutLogsRequest(PutLogRequest.LogGroupList logGroupList, String topicId) {
        this.logGroupList = logGroupList;
        this.topicId = topicId;
    }

    /**
     * @param logGroupList 日志列表
     * @param topicId      日志主题 ID
     * @param hashKey      路由 Shard 的key
     * @param compressType 压缩格式，支持lz4、zlib
     */
    public PutLogsRequest(PutLogRequest.LogGroupList logGroupList, String topicId, String hashKey, String compressType) {
        this.logGroupList = logGroupList;
        this.topicId = topicId;
        this.hashKey = hashKey;
        this.compressType = compressType;
    }

    /**
     * @return 日志列表
     */
    public PutLogRequest.LogGroupList getLogGroupList() {
        return logGroupList;
    }

    /**
     * @param logGroupList 日志列表
     */
    public void setLogGroupList(PutLogRequest.LogGroupList logGroupList) {
        this.logGroupList = logGroupList;
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
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.topicId == null || this.logGroupList == null) {
            return false;
        }
        return true;
    }
}
