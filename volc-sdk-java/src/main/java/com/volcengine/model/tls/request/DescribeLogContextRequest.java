package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class DescribeLogContextRequest {
    @JSONField(name = TOPIC_ID)
    String topicId;

    @JSONField(name = CONTEXT_FLOW)
    String contextFlow;

    @JSONField(name = PACKAGE_OFFSET)
    Integer packageOffset;

    @JSONField(name = SOURCE)
    String source;

    @JSONField(name = PREV_LOGS)
    Integer prevLogs;

    @JSONField(name = NEXT_LOGS)
    Integer nextLogs;

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
     * @return 日志所在的 LogGroup 的 ID
     */
    public String getContextFlow() {
        return contextFlow;
    }

    /**
     * @param contextFlow 日志所在的 LogGroup 的 ID
     */
    public void setContextFlow(String contextFlow) {
        this.contextFlow = contextFlow;
    }

    /**
     * @return 日志在 LogGroup 的序号
     */
    public Integer getPackageOffset() {
        return packageOffset;
    }

    /**
     * @param packageOffset 日志在 LogGroup 的序号
     */
    public void setPackageOffset(Integer packageOffset) {
        this.packageOffset = packageOffset;
    }

    /**
     * @return 日志来源主机 IP
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source 日志来源主机 IP
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return 日志的上文日志条数
     */
    public Integer getPrevLogs() {
        return prevLogs;
    }

    /**
     * @param prevLogs 日志的上文日志条数
     */
    public void setPrevLogs(Integer prevLogs) {
        this.prevLogs = prevLogs;
    }

    /**
     * @return 日志的下文日志条数
     */
    public Integer getNextLogs() {
        return nextLogs;
    }

    /**
     * @param nextLogs 日志的下文日志条数
     */
    public void setNextLogs(Integer nextLogs) {
        this.nextLogs = nextLogs;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.topicId == null || this.contextFlow == null || this.packageOffset == null || this.source == null) {
            return false;
        }
        return true;
    }
}
